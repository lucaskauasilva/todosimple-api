package com.lucaskaua.todosimple.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucaskaua.todosimple.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}