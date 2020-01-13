package com.ssafy.deepening.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.deepening.dto.SitterDto;

@Mapper
public interface SitterMapper {
	public int insertSitter(SitterDto sitter);

	public List<SitterDto> findAllSitter();
}
