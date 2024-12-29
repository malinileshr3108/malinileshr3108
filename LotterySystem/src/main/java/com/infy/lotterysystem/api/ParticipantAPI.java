package com.infy.lotterysystem.api;

import org.springframework.http.ResponseEntity;

import com.infy.lotterysystem.dto.ParticipantDTO;
import com.infy.lotterysystem.exception.LotteryBookingException;
import com.infy.lotterysystem.service.ParticipantService;

public class ParticipantAPI {
	
	private ParticipantService participantService;
	
	public ResponseEntity<ParticipantDTO> getLotteryWinner(String couponNumber) throws LotteryBookingException
	{
		
		return null;
		
	}
 
	public ResponseEntity<ParticipantDTO> addParticipant(ParticipantDTO participantDTO) throws LotteryBookingException{
		
		return null;
		
	}

}
