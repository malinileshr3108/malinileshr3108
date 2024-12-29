package com.infy.moviebooking.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.moviebooking.dto.MovieBookingDTO;
import com.infy.moviebooking.repository.MovieBookingRepository;
@Service(value = "movieBookingService")
@Transactional
public class MovieBookingServiceImpl implements MovieBookingService{
   
	@Autowired
	private MovieBookingRepository movieBookingRepository;
	
	@Override
	public Double calculateBookingAmount(Integer noOfSeats, String screenName) {
		// TODO Auto-generated method stub
		Double amount=0.0;
		if(screenName.equals("Rhombus"))
		{
			amount=100.0*noOfSeats;
		}
		else
			if(screenName.equals("Sapphire"))
			{
				amount=200.0*noOfSeats;
			}
			else
				if(screenName.equals("Turquoise"))
				{
					amount=300.0*noOfSeats;
				}
		return amount;
	}

	@Override
	public MovieBookingDTO bookMovie(MovieBookingDTO movieBookingDTO) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<MovieBookingDTO> getBookingByScreenName(String screenName) {
		// TODO Auto-generated method stub
		return null;
	}

}
