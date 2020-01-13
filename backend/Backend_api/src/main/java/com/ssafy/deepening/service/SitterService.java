package com.ssafy.deepening.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.deepening.dao.SitterMapper;
import com.ssafy.deepening.dto.SitterDto;

@Service
public class SitterService {
	
	@Autowired
	private SitterMapper sitterMapper;

	public int insertSitter(SitterDto Sitter) {
		return sitterMapper.insertSitter(Sitter);
	}
	public List<SitterDto> findAllSitter(){
		return sitterMapper.findAllSitter();
	}
}
