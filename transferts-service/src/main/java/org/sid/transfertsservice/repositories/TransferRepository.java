package org.sid.transfertsservice.repositories;


import org.sid.transfertsservice.entities.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface TransferRepository extends JpaRepository<Transfer, Long> {

    List<Transfer> findByCustomerId(@Param("customerId") Long customerId);
}
