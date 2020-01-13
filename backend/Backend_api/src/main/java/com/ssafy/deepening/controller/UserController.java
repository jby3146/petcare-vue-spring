package com.ssafy.deepening.controller;

import java.text.SimpleDateFormat;
import java.util.*;
import com.ssafy.deepening.dto.UserDto;
import com.ssafy.deepening.function.distance_function;
import com.ssafy.deepening.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;
	
	private distance_function distance_functions;
	@RequestMapping(value = "/userAll", method = RequestMethod.GET)
	public List<UserDto> userAll() throws Exception {
		return userService.findAllUser();
	}

	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public int signUp(@RequestBody UserDto user) throws Exception {
		System.out.println(user);
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
				
		Date time = new Date();
		String time1 = format1.format(time);
		System.out.println(time1);
		user.settimestamp(time1);
		return userService.insertUser(user);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public UserDto login(@RequestBody UserDto user){
		System.out.println(user);
		UserDto user1 = userService.searchOnceUser(user.getEmail());
		if(user1.getPass()!=null&&user.getPass().equals(user1.getPass())){
			return user1;
		}
		else {
			user1 = new UserDto();
			return user1;
			
		}
	}

	@RequestMapping(value = "/userSelect", method = RequestMethod.POST)
	public UserDto userSelect(@RequestBody UserDto users) throws Exception {
		
		UserDto user = userService.searchOnceUser(users.getEmail());
//		user.set
//		return 
		user.setPass(" ");		
		return user;
	}

	@RequestMapping(value = "/userUpdate", method = RequestMethod.PUT)
	public HashMap<String, Object> userDelect(@RequestBody UserDto user) throws Exception {
		int res = userService.updateUser(user);
		HashMap<String, Object> result = new HashMap<>();
		if (res > 0) {
			result.put("state", "1");
		} else {
			result.put("state", "-1");
		}
		return result;
	}
	
	@RequestMapping(value = "/userDelete", method = RequestMethod.DELETE)
	public HashMap<String, Object> userDelect(@RequestParam String email) throws Exception {
		int res = userService.deleteUser(email);
		HashMap<String, Object> result = new HashMap<>();
		if (res > 0) {
			result.put("state", "1");
		} else {
			result.put("state", "-1");
		}
		return result;
	}
	@RequestMapping(value = "/searchsitter", method = RequestMethod.GET)
	public List<UserDto> searchsitter(@RequestParam double x, @RequestParam double y) throws Exception {
		List<UserDto> sitterlist = locationSearch(x, y);
		System.out.println(sitterlist.toString());
		return sitterlist;
	}
	public List<UserDto> locationSearch(double x, double y){
		
		List<UserDto> userlist = userService.searchFetSitter();
		for(int i  = 0 ; i < userlist.size() ; i++) {
			double distanceMeter = distance_functions.distance(userlist.get(i).getX(),userlist.get(i).getY(),x,y,"meter");
			System.out.println(distanceMeter);
			userlist.get(i).setDistance(distanceMeter);
		}
		Collections.sort(userlist);
		System.out.println(" data set :  " + userlist);
		return userlist;
	}
	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	public HashMap<String, Object> updateUser(@RequestBody UserDto user) throws Exception {
		int res = userService.updateUser(user);
		HashMap<String, Object> result = new HashMap<>();
		if (res > 0) {
			result.put("state", "1");
		} else {
			result.put("state", "-1");
		}
		return result;
	}
	
}

