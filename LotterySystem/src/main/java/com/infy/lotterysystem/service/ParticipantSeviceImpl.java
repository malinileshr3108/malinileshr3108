package com.infy.lotterysystem.service;

import com.infy.lotterysystem.dto.ParticipantDTO;
import com.infy.lotterysystem.exception.LotteryBookingException;
import com.infy.lotterysystem.repository.ParticipantRepository;

public class ParticipantSeviceImpl  implements ParticipantService{

	private ParticipantRepository participantRepository;
	@Override
	public ParticipantDTO addParticipant(ParticipantDTO participantDTO) throws LotteryBookingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParticipantDTO getLotteryWinner(String couponNumber) throws LotteryBookingException {
		// TODO Auto-generated method stub
		return null;
	}

}
