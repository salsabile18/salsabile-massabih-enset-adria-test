package org.sid.transfertsservice.entities;


import jakarta.persistence.*;
import org.sid.transfertsservice.enums.TransferStatus;
import org.sid.walletsservice.entities.Wallet;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.List;

@Entity
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;

    @ManyToOne
    private List<Wallet> sourceWallet;

    @ManyToOne
    private List<Wallet> destinationWallet;

    private double amount;

    @Enumerated(EnumType.STRING)
    private TransferStatus status;

    // Getters and setters
}


