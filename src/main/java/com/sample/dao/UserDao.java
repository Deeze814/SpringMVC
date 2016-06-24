package com.sample.dao;

import java.util.List;

import com.sample.domain.User;

public interface UserDao {
	public List<String> getCountries();
	public boolean insert(User user);
	public boolean update(User user);
	public boolean delete(User user);
	public User find(String fName, String lName);
	public List<User> findAll();
}
