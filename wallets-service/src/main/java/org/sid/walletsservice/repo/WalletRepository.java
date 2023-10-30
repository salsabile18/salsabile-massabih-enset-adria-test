package org.sid.walletsservice.repo;

import org.sid.walletsservice.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WalletRepository extends JpaRepository<Wallet, UUID> {
    //  des méthodes personnalisées ici si nécessaire
}
