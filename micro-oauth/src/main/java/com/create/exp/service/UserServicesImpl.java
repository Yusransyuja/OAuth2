package com.create.exp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.create.exp.message.UserMessage;

@Service(value = "userService")
public class UserServicesImpl implements UserDetailsService, UserService {
	
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		UserMessage user = new UserMessage();
		
		user.setUsername("yusran");
		user.setPassword("yusran");
		
		if(user == null){
			throw new UsernameNotFoundException("Invalid username or password.");
		}
	
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthority());
	}

	private List getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}
	
	public List findAll() {
		List dataList = new ArrayList();
		
		UserMessage user = new UserMessage();
		user.setUsername("yusran");
		user.setPassword("yusran");
		dataList.add(user);
		
		return dataList;
	}
}
