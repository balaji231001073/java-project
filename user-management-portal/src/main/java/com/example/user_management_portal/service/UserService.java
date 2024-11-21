package com.example.user_management_portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user_management_portal.dao.UserDao;
import com.example.user_management_portal.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public User getUserById(Long id){
		return userDao.findById(id).orElse(null);
	}
	
	public List<User> getAllUsers() {
		return userDao.findAll();
	}
	
	public User saveOrUpdateUser(User user) {
		return userDao.save(user);
	}
	
	
	
	public void deleteUser(Long id) {
		userDao.deleteById(id);
	}
}
