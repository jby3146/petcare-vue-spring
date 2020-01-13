package com.ssafy.deepening.controller;

import java.text.SimpleDateFormat;
import java.util.*;
import com.ssafy.deepening.dto.SitterDto;
import com.ssafy.deepening.service.SitterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api")
public class SitterController {

	@Autowired
	private SitterService sitterService;
	
	@RequestMapping(value = "/sitterApply", method = RequestMethod.POST)
	public int sitterApply(@RequestBody SitterDto sitter) throws Exception {
        System.out.println(sitter);
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
				
		Date time = new Date();
		String time1 = format1.format(time);
		System.out.println(time1);
		sitter.setCreated_at(time1); 
		return sitterService.insertSitter(sitter);
	}

	@RequestMapping(value = "/findAllSitter", method = RequestMethod.GET)
	public List<SitterDto> findAllSitter() throws Exception {
		List<SitterDto> list = sitterService.findAllSitter();

		return list;
	}
	

}

