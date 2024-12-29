package com.infy.franchiseallocation.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.infy.franchiseallocation.entity.Franchise;

public class FranchiseDTO {
	
	private Integer franchiseId;
	@NotNull(message = "{franchise.name.absent}")
	@Pattern(regexp = "[A-Za-z]+",message = "{franchise.name.invalid}")
	private String franchiseName;
	@NotNull(message = "{franchise.location.absent}")
	@Pattern(regexp = "[A-Za-z]+",message = "{franchise.location.invalid}")
	private String location;
	@NotNull(message = "{franchise.quotedprice.absent}")
	private Double quotedPrice;
	@NotNull(message = "{franchise.registrationdate.absent}")
	private LocalDate registrationDate;
	@NotNull(message = "{franchise.startup.absent}")
	private LocalDate startUpdate;
	@NotNull(message = "{franchise.taxnumber.absent}")
	private String taxNumber;
	private Double tenure;
	public Integer getFranchiseId() {
		return franchiseId;
	}
	public void setFranchiseId(Integer franchiseId) {
		this.franchiseId = franchiseId;
	}
	public String getFranchiseName() {
		return franchiseName;
	}
	public void setFranchiseName(String franchiseName) {
		this.franchiseName = franchiseName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Double getQuotedPrice() {
		return quotedPrice;
	}
	public void setQuotedPrice(Double quotedPrice) {
		this.quotedPrice = quotedPrice;
	}
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	public LocalDate getStartUpdate() {
		return startUpdate;
	}
	public void setStartUpdate(LocalDate startUpdate) {
		this.startUpdate = startUpdate;
	}
	public String getTaxNumber() {
		return taxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	public Double getTenure() {
		return tenure;
	}
	public void setTenure(Double tenure) {
		this.tenure = tenure;
	}
	public static FranchiseDTO PrepareDTO(Iterable<Franchise> franchiseDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
