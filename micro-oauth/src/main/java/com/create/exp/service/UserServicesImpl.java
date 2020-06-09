package com.create.exp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.create.exp.message.UserMessage;

@Service
public class UserServicesImpl implements UserService {
	
	
	public List findAll() {
		List dataList = new ArrayList();
		
		UserMessage user = new UserMessage();
		user.setUsername("Aucans");
		user.setPassword("test");
		dataList.add(user);
		
		return dataList;
	}
}
