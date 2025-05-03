package com.darkcommit.learn_spring_security;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Table("USERS")
@Data
public class UserModel {

  @Id
  private String username;
  private String password;
}
