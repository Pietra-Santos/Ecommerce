package com.ecommerce.pedritastore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.pedritastore.model.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store,Long> {
	
}
