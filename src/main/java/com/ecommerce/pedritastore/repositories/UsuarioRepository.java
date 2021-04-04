package com.ecommerce.pedritastore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.pedritastore.model.Usuario;

@Repository
public interface UsuarioRepository {
	
	public interface StoreRepository extends JpaRepository<Long,Usuario> {
		
	}

}
