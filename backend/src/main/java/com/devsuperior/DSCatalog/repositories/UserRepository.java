package com.devsuperior.DSCatalog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.DSCatalog.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
	
	List<User> findByFirstName(String firstName);
}
