package com.martscompany.restapi.interfaces;


import org.springframework.data.jpa.repository.JpaRepository;

import com.martscompany.restapi.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {


	
}
