package com.sample.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sample.domain.User;

@Repository
public class UserDaoInMemoryImpl implements UserDao {

	@Override
	public List<String> getCountries() {
		return Arrays.asList("United States", "Canada", "Mexico");
	}

	@Override
	public boolean insert(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User find(String fName, String lName) {
		// TODO Auto-generated method stub
		return null;
	}

}
