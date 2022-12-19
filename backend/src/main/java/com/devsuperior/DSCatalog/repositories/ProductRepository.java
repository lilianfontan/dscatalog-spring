package com.devsuperior.DSCatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.DSCatalog.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
