package com.ssafy.deepening.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.deepening.dao.ReservationMapper;
import com.ssafy.deepening.dto.ReservationDto;

@Service
public class ReservationService {
	
	@Autowired
	ReservationMapper reservationMapper;
	
	public List<ReservationDto> findAllReservation() {
		return reservationMapper.findAllReservation();
	}

	public List<ReservationDto> searchOnceReservation(String eamil) {
		return reservationMapper.searchOnceReservation(eamil);
	}

	public int deleteReservation(int id) {
		return reservationMapper.deleteReservation(id);
	}

	public int updateReservation(ReservationDto reservation) {
		return reservationMapper.updateReservation(reservation);
	}

	public int insertReservation(ReservationDto reservation) {
		return reservationMapper.insertReservation(reservation);
	}
	public int insertMachingWating(ReservationDto reservation) {
		return reservationMapper.insertMachingWating(reservation);
	}
	public List<ReservationDto> searchOnceReservationM(String email) {
		return reservationMapper.searchOnceReservationM(email); 
	}
}
