package com.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	@Autowired
	private void setUserDao(UserDao userDao){
		this.userDao = userDao;
	}
	
	@Override
	public List<String> getCountries() {
		return userDao.getCountries();
	}

}
