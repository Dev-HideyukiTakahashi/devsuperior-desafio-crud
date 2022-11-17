package com.devsuperior.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.crud.dto.ClientDTO;
import com.devsuperior.crud.services.ClientServices;

@RestController
@RequestMapping(path = "/clients")
public class ClientController {

	@Autowired
	private ClientServices services;
	
	@GetMapping
	public ResponseEntity<Page<ClientDTO>> findAll(
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "size", defaultValue = "5") Integer size,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction,
			@RequestParam(value = "properties", defaultValue = "name") String properties){
		
		PageRequest pageRequest = PageRequest.of(page, size, Direction.valueOf(direction), properties);
		Page<ClientDTO> clientsDTO = services.findAll(pageRequest);
		
		return ResponseEntity.ok(clientsDTO);
	}

}
