package com.infy.infytvseries.api;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.infytvseries.dto.UserDTO;
import com.infy.infytvseries.exception.SeriesBookingException;
import com.infy.infytvseries.service.SeriesBookingService;
@RestController
@RequestMapping("/api")
@Validated
public class SeriesBookingAPI {

	@Autowired
	private SeriesBookingService seriesBookingService;
	@PostMapping(value = "user")
	public ResponseEntity<UserDTO> registerUser(@RequestBody @Valid 
			UserDTO userDTO) throws SeriesBookingException
	{
		UserDTO userDTO2=seriesBookingService.registerUser(userDTO);
		return new ResponseEntity<>(userDTO2,HttpStatus.CREATED);
		
	}
	@GetMapping("user/{email}")
	public ResponseEntity<UserDTO>getDetailsByUserEmail(@PathVariable @Valid 
			@Pattern(regexp = "[A-Za-z]+[0-9]+[@][gmail|infy][.](com)",message = "{user.email.invalid}")	String email) throws SeriesBookingException 
	{
	    UserDTO dto= seriesBookingService.getDetailsByUserEmail(email);	
		return new ResponseEntity<UserDTO>(dto,HttpStatus.OK);
		
	}
}
