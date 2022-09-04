package com.activity.service;

import java.util.HashMap;
import java.util.List;

import com.activity.domain.ReservationInfoDTO;

public interface ReservationService {

	
	//예약정보 리스트 조회 (테스트용) 
	public List<ReservationInfoDTO> getReservationInfoList() throws Exception;
	
}