package com.ssafy.deepening.dto;

import java.util.Date;

public class ReservationDto {
	String useraddress;
	String petsize;
	String pettype;
	String petname;
	String petage;
	int id;
	String user_email;
	String detail_address;
	String reservation_type;
	String start; 
	String end;
	
	public String getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}

	public String getPetsize() {
		return petsize;
	}

	public void setPetsize(String petsize) {
		this.petsize = petsize;
	}

	public String getPettype() {
		return pettype;
	}

	public void setPettype(String pettype) {
		this.pettype = pettype;
	}

	public String getPetname() {
		return petname;
	}

	public void setPetname(String petname) {
		this.petname = petname;
	}

	public String getPetage() {
		return petage;
	}

	public void setPetage(String petage) {
		this.petage = petage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getAddress_detail() {
		return detail_address;
	}

	public void setAddress_detail(String detail_address) {
		this.detail_address = detail_address;
	}

	public String getReservation_type() {
		return reservation_type;
	}

	public void setReservation_type(String reservation_type) {
		this.reservation_type = reservation_type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "ReservationDto [useraddress=" + useraddress + ", petsize=" + petsize + ", pettype=" + pettype
				+ ", petname=" + petname + ", petage=" + petage + ", id=" + id + ", user_email=" + user_email
				+ ", address_detail=" + detail_address + ", reservation_type=" + reservation_type + ", start=" + start
				+ ", end=" + end + "]";
	}

	public ReservationDto(String useraddress, String petsize, String pettype, String petname, String petage, int id,
			String user_email, String detail_address, String reservation_type, String start, String end) {
		super();
		this.useraddress = useraddress;
		this.petsize = petsize;
		this.pettype = pettype;
		this.petname = petname;
		this.petage = petage;
		this.id = id;
		this.user_email = user_email;
		this.detail_address = detail_address;
		this.reservation_type = reservation_type;
		this.start = start;
		this.end = end;
	}

	public ReservationDto(){};
}
