package com.darkcommit.learn_spring_security;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<UserModel, String>{
  Optional<UserModel> findByUsername(String username);
}
