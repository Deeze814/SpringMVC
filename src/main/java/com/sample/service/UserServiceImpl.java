package com.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.UserDao;
import com.sample.domain.User;

@Service
public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	@Autowired
	private void setUserDao(UserDao userDao){
		this.userDao = userDao;
	}
	
	public List<String> getCountries() {
		return userDao.getCountries();
	}
	
	public List<User> getAllUsers() {
		return userDao.findAll();
	}

}
