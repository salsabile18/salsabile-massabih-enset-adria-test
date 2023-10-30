package org.sid.walletsservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.UUID;
import java.math.BigDecimal;
import java.util.Date;


//Une Wallet est définie par son id
//(String de type UUID), son solde, sa date de création, sa devise.


@Entity
public class Wallet {
    @Id
    private UUID id; // ID de la Wallet (UUID)
    private BigDecimal balance; // Solde de la Wallet
    private Date creationDate; // Date de création de la Wallet
    private String currency; // Devise de la Wallet

    // Relation Many-to-One avec l'entité Client
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public void setId(UUID id) {
        this.id = id;
    }

    // Getters and setters
}






