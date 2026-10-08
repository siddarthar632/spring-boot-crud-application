package com.kodnest.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.crud.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
