package com.project.apirestfull.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.apirestfull.models.User;

public interface UserRepo extends JpaRepository<User , Integer>{
	

}
