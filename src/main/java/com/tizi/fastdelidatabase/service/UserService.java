package com.tizi.fastdelidatabase.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tizi.fastdelidatabase.repository.UserRepository;
import com.tizi.fastdelidatabase.entity.UserEntity;
import com.tizi.fastdelidatabase.model.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUsers(){
		try{
			List<UserEntity> users = userRepository.findAll();
			List<User> customUser = new ArrayList<>();
			users.stream().forEach(e -> {
				User user = new User();
				customUser.add(user);
			});
			return customUser;
		}catch(Exception e) {
			throw e;
		}
	}
	
	public String addUser(UserEntity user) {
		try {
			if(!userRepository.existsByFirstNameAndLastName(user.getFirstName(), user.getLastName())) {
				userRepository.save(user);
				return "Inscription avec succés!!!";
			}else {
				return "Cet utilisateur existe déjà!!!";
			}	
		}catch(Exception e){
			throw e;
		}
	}
	
	public String removeUser(UserEntity user) {
		try {
			if(!userRepository.existsByFirstNameAndLastName(user.getFirstName(), user.getLastName())) {
				userRepository.delete(user);
				return "Supprimé avec succés";
			}else {
				return "Cet utilisateur n'existe pas!!!";
			}
		}catch(Exception e){
			throw e;
		}
	}
	
	public String updateUser(UserEntity user) {
		try {
			if(!userRepository.existsById(user.getId())) {
				userRepository.save(user);
				return "Mis à jour avec succés";
			}else {
				return "Cet utilisateur n'existe pas!!!";
			}
		}catch(Exception e){
			throw e;
		}
	}
	
}	

