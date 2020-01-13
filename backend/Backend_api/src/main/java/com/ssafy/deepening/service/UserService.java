package com.ssafy.deepening.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.deepening.dao.UserMapper;
import com.ssafy.deepening.dto.UserDto;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	 
	//CRUD
	public List<UserDto> findAllUser(){
		return userMapper.findAllUser();
	}
	
	public UserDto searchOnceUser(String eamil) {
		return userMapper.searchOnceUser(eamil);
	}
	
	public int deleteUser(String email) {
		return userMapper.deleteUser(email);
	}
	
	public int updateUser(UserDto user) {
		return userMapper.updateUser(user);
	}
	
	public int insertUser(UserDto user) {
		return userMapper.insertUser(user);
	}
	public int countUserAdmin() {
		return userMapper.countUserAdmin();
	}
	public List<UserDto> searchFetSitter(){
		return userMapper.searchFetSitter();
	}

}
