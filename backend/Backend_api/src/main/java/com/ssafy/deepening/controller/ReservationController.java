package com.ssafy.deepening.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.deepening.dto.ReservationDto;
import com.ssafy.deepening.service.ReservationService;


@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api")
public class ReservationController {
	@Autowired
	private ReservationService reservationService;
	 
	@RequestMapping(value = "/reservationinsert", method = RequestMethod.POST)
	public HashMap<String, Object> insertReservation(@RequestBody ReservationDto reservation) throws Exception {
		int res = reservationService.insertReservation(reservation);
		System.out.println(1);
		int res2 = 0;
		HashMap<String, Object> result = new HashMap<>();
		result.put("state","-1");
//		String date = reservation.getStart();
//		System.out.println(date);
//		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:'mm':ss");
//		Date to = transFormat.parse(date);
//		System.out.println(to.toString());
		
		if(res>0) {
			List<ReservationDto> reserve  = reservationService.searchOnceReservation(reservation.getUser_email());
			ReservationDto reserv = reserve.get(reserve.size()-1);
			System.out.println(2);
			if(reserv==null) {
//				reservationService.deleteReservation(id)
				return result;
			}
			reservation.setId(reserv.getId());
			System.out.println(3);
			
			res2 = reservationService.insertMachingWating(reservation);
		}
		if (res > 0&& res2>0) {
			result.put("state", "1");
		} else {
			result.put("state", "-1");
		}
		System.out.println(reservation);
		return result;
		
	}
	@RequestMapping(value ="/searchoncereservation", method = RequestMethod.GET)
	public List<ReservationDto> searchoncereservation(@RequestParam String user_email){
		List<ReservationDto> reservation = reservationService.searchOnceReservation(user_email);
		return reservation;
	}
	
	@RequestMapping(value ="/searchoncereservationM", method = RequestMethod.GET)
	public List<ReservationDto> searchoncereservationM(@RequestParam String user_email){
		List<ReservationDto> reservation = reservationService.searchOnceReservationM(user_email);
		return reservation;
	}
	@RequestMapping(value ="/reservationAllSearch", method = RequestMethod.GET)
	public List<ReservationDto> reservationSearchAll(){
		List<ReservationDto> reservation = reservationService.findAllReservation();
		return reservation;
	}
}
