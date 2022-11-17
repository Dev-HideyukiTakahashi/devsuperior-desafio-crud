package com.devsuperior.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.crud.dto.ClientDTO;
import com.devsuperior.crud.entities.Client;
import com.devsuperior.crud.repositories.ClientRepository;

@Service
public class ClientServices {

	@Autowired
	private ClientRepository repository;

	public Page<ClientDTO> findAll(PageRequest pageRequest) {
		Page<Client>    clients    = repository.findAll(pageRequest);
		Page<ClientDTO> clientsDTO = clients.map(client -> new ClientDTO(client));
		
		return clientsDTO;
	}
}
