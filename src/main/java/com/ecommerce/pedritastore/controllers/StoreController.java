package com.ecommerce.pedritastore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.pedritastore.model.Store;
import com.ecommerce.pedritastore.repositories.StoreRepository;

@RestController
@RequestMapping("/store")
@CrossOrigin("*")
public class StoreController {
	
	@Autowired
	private StoreRepository repository;
	
	@GetMapping
    public ResponseEntity <List<Store>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Store>getById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	@PostMapping
    public ResponseEntity<Store>post(@RequestBody Store store){
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(store));
	}
	@PutMapping
    public ResponseEntity<Store>put(@RequestBody Store store){
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(store));
	}
	@DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
	}
}
