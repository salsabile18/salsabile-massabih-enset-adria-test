package org.sid.walletsservice.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // ID du client (auto-incrémenté)
    private String name; // Nom du client
    private String email; // Adresse e-mail du client

    public void setId(Long id) {
        this.id = id;
    }

// Getters and setters
}



