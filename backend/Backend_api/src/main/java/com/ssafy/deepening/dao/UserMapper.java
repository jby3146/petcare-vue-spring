package com.ssafy.deepening.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.deepening.dto.UserDto;

@Mapper
public interface UserMapper {
	public List<UserDto> findAllUser();
	public UserDto searchOnceUser(String eamil);
	public int deleteUser(String email);
	public int updateUser(UserDto user);
	public int insertUser(UserDto user);
	public int countUserAdmin();
	public List<UserDto> searchFetSitter();
}
