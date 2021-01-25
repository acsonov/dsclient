package com.acsonov.dsclient.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acsonov.dsclient.entities.Client;

@RestController
@RequestMapping (value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll(){

		List <Client> list = new ArrayList<>();
		list.add(new Client(1L, "BOOKS", null, null, null, null ));
		list.add(new Client(2L, "ELECTRONICS", null, null, null, null));
		return ResponseEntity.ok().body(list); 
	}
	
}
