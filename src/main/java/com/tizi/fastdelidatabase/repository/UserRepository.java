package com.tizi.fastdelidatabase.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.tizi.fastdelidatabase.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	
	boolean existsByFirstNameAndLastName(String firstName, String lastName);
	
	boolean existsById(int id);
}
