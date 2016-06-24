package com.sample.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.sample.domain.User;

public class UserDaoApiImpl implements UserDao {

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

	@Override
	public List<User> findAll() {
		
		RestTemplate template = new RestTemplate();
		List<User> users = new ArrayList<User>();	
		
		template.getForObject("http://localhost:8081/SpringREST/rest/users", User.class);
		/*try {
	
			URL url = new URL("http://localhost:8081/SpringREST/rest/users");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
	
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}
	
			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));
	
			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
	
			conn.disconnect();
	
		  } catch (MalformedURLException e) {	
			e.printStackTrace();	
		  } catch (IOException e){
			  e.printStackTrace();
		  }*/
		
		return users;
	}

}
