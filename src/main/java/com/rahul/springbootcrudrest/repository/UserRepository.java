package com.rahul.springbootcrudrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.springbootcrudrest.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
