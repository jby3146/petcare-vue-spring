package com.ssafy.deepening.dto;

import java.util.Date;

public class UserDto implements Comparable<UserDto>{
	String type;
	String pass;
	String name;
	int birth;
	String email;
	String nickname;
	String address;
	String timestamp;
	int user_type_id;
	int id;
	String gender;
	double x;
	double y;
	double Distance;
	String phone;
	
	public UserDto() {
	}
	
	public UserDto(String type, String pass, String name, int birth, String email, String nickname, String address,
			String timestamp, int user_type_id, int id, String gender, double x, double y, double distance,
			String phone) {
		super();
		this.type = type;
		this.pass = pass;
		this.name = name;
		this.birth = birth;
		this.email = email;
		this.nickname = nickname;
		this.address = address;
		this.timestamp = timestamp;
		this.user_type_id = user_type_id;
		this.id = id;
		this.gender = gender;
		this.x = x;
		this.y = y;
		Distance = distance;
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public double getDistance() {
		return Distance;
	}

	public void setDistance(double distance) {
		Distance = distance;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirth() {
		return this.birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String gettimestamp() {
		return this.timestamp;
	}

	public void settimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public int getUser_type_id() {
		return this.user_type_id;
	}

	public void setUser_type_id(int user_type_id) {
		this.user_type_id = user_type_id;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public UserDto type(String type) {
		this.type = type;
		return this;
	}

	public UserDto pass(String pass) {
		this.pass = pass;
		return this;
	}

	public UserDto name(String name) {
		this.name = name;
		return this;
	}

	public UserDto birth(int birth) {
		this.birth = birth;
		return this;
	}

	public UserDto email(String email) {
		this.email = email;
		return this;
	}

	public UserDto nickname(String nickname) {
		this.nickname = nickname;
		return this;
	}

	public UserDto address(String address) {
		this.address = address;
		return this;
	}

	public UserDto timestamp(String timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	public UserDto user_type_id(int user_type_id) {
		this.user_type_id = user_type_id;
		return this;
	}

	public UserDto id(int id) {
		this.id = id;
		return this;
	}

	public UserDto gender(String gender) {
		this.gender = gender;
		return this;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}


	@Override
	public String toString() {
		return "UserDto [type=" + type + ", pass=" + pass + ", name=" + name + ", birth=" + birth + ", email=" + email
				+ ", nickname=" + nickname + ", address=" + address + ", timestamp=" + timestamp + ", user_type_id="
				+ user_type_id + ", id=" + id + ", gender=" + gender + ", x=" + x + ", y=" + y + ", Distance="
				+ Distance + ", phone=" + phone + "]";
	}

	@Override
	public int compareTo(UserDto ud) {
		// TODO Auto-generated method stub
		if(this.Distance < ud.Distance)
			return -1;
		else if(this.Distance>ud.Distance)
			return 1;
		return 0;
	}
	

}
