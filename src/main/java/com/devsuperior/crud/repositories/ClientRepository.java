package com.devsuperior.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.crud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
