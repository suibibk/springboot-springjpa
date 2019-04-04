package cn.forever.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.forever.model.User;

public interface UserDao extends JpaRepository<User, Long> {
	
}