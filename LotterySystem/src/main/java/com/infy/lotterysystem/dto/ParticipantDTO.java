package com.infy.lotterysystem.dto;

import com.infy.lotterysystem.entity.Participant;

public class ParticipantDTO {

	private Integer participantId;
	private String name;
	private Integer age;
	private String mailId;
	private Long contactNo;
	private String couponNumber;
	private Integer winningAmount;
	public Integer getParticipantId() {
		return participantId;
	}
	public void setParticipantId(Integer participantId) {
		this.participantId = participantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	public String getCouponNumber() {
		return couponNumber;
	}
	public void setCouponNumber(String couponNumber) {
		this.couponNumber = couponNumber;
	}
	public Integer getWinningAmount() {
		return winningAmount;
	}
	public void setWinningAmount(Integer winningAmount) {
		this.winningAmount = winningAmount;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public static ParticipantDTO prepareDTO(Participant participant)
	{
		ParticipantDTO participantDTO=new ParticipantDTO();
		participantDTO.setParticipantId(participant.getParticipantId());
		participantDTO.setName(participant.getName());
		participantDTO.setMailId(participant.getMailId());
		participantDTO.setContactNo(participant.getContactNo());
		participantDTO.setCouponNumber(participant.getCouponNumber());
		participantDTO.setWinningAmount(participant.getWinningAmount());
		return participantDTO;
		
	}
	public static Participant prepareEntity(ParticipantDTO participantDTO){
		Participant participant =new Participant();
		participant.setName(participantDTO.getName());
		participant.setMailId(participantDTO.getMailId());
		participant.setContactNo(participantDTO.getContactNo());
		participant.setCouponNumber(participantDTO.getCouponNumber());
		participant.setWinningAmount(participantDTO.getWinningAmount());
		return participant;
	}
	
}
