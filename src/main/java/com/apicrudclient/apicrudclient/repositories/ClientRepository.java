package com.apicrudclient.apicrudclient.repositories;

import com.apicrudclient.apicrudclient.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
