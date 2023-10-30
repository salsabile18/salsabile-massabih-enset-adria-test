package org.sid.walletsservice.web;

import org.sid.walletsservice.entities.Client;
import org.sid.walletsservice.entities.Wallet;
import org.sid.walletsservice.repo.ClientRepository;
import org.sid.walletsservice.repo.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api")
public class WalletRestController {

    @Autowired
    private WalletRepository walletRepository;
    @Autowired
    private ClientRepository clientRepository;

    // Opérations CRUD pour les Wallets

    @GetMapping("/wallets")
    public Iterable<Wallet> getAllWallets() {
        return walletRepository.findAll();
    }

    @GetMapping("/wallets/{id}")
    public Wallet getWalletById(@PathVariable UUID id) {
        return walletRepository.findById(id).orElse(null);
    }

    @PostMapping("/wallets")
    public Wallet createWallet(@RequestBody Wallet wallet) {
        return walletRepository.save(wallet);
    }

    @PutMapping("/wallets/{id}")
    public Wallet updateWallet(@PathVariable UUID id, @RequestBody Wallet wallet) {
        if (walletRepository.existsById(id)) {
            wallet.setId(id);
            return walletRepository.save(wallet);
        }
        return null;
    }

    @DeleteMapping("/wallets/{id}")
    public void deleteWallet(@PathVariable UUID id) {
        walletRepository.deleteById(id);
    }

    // Opérations CRUD pour les Clients

    @GetMapping("/clients")
    public Iterable<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @GetMapping("/clients/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @PostMapping("/clients")
    public Client createClient(@RequestBody Client client) {
        return clientRepository.save(client);
    }

    @PutMapping("/clients/{id}")
    public Client updateClient(@PathVariable Long id, @RequestBody Client client) {
        if (clientRepository.existsById(id)) {
            client.setId(id);
            return clientRepository.save(client);
        }
        return null;
    }

    @DeleteMapping("/clients/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientRepository.deleteById(id);
    }
}

