package com.infy.meetingscheduler.api;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.infy.meetingscheduler.dto.MeetingDTO;
import com.infy.meetingscheduler.exception.MeetingSchedulerException;
import com.infy.meetingscheduler.service.MeetingService;

public class MeetingAPI {

	private MeetingService meetingService;
	 
	public ResponseEntity<List<MeetingDTO>> getAllMeetingOfScheduler(String schedulerName) throws MeetingSchedulerException
	{
		return null;
		
	}
	
	public ResponseEntity<MeetingDTO> scheduleMeeting(MeetingDTO meetingDTO) throws MeetingSchedulerException
	{
		return null;
		
	}
}
