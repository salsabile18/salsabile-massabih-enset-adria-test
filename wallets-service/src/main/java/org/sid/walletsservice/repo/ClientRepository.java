package org.sid.walletsservice.repo;

import org.sid.walletsservice.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<Client, Long> {
    // des méthodes personnalisées ici si nécessaire
}




