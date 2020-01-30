package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.User;
import java.util.List;
public interface UserRepo extends JpaRepository<User,Integer>{
	List<User> findByUsername(String username);
}
