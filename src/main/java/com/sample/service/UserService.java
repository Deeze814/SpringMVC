package com.sample.service;

import java.util.List;

import com.sample.domain.User;

public interface UserService {
	public List<String> getCountries();
	public List<User> getAllUsers();
}
