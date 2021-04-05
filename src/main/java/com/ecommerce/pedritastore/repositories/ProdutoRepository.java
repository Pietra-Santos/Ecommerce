package com.ecommerce.pedritastore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.pedritastore.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {
		
}
