package com.teknoglobal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teknoglobal.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{
	
	Users findByEmailAndPassword(String email, String password);
}
