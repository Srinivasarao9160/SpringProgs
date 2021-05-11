package com.ojas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.model.User;


@Repository
public interface UserRepo extends JpaRepository<User, Long> {

	public User findByUsername(String username);

}
