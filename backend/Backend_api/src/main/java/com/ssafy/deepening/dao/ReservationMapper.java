package com.ssafy.deepening.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.deepening.dto.ReservationDto;
@Mapper
public interface ReservationMapper {
	public List<ReservationDto> findAllReservation(); 
	public List<ReservationDto> searchOnceReservation(String eamil);
	public int deleteReservation(int id);
	public int updateReservation(ReservationDto reservation);
	public int insertReservation(ReservationDto reservation);
	public int insertMachingWating(ReservationDto reservation);
	public List<ReservationDto> searchOnceReservationM(String email);
}
