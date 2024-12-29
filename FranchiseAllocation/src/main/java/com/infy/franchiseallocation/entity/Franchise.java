package com.infy.franchiseallocation.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Franchise {
	@Id
	private Integer franchiseId;
	private String franchiseName;
	private String location;
	private Double quotedPrice;
	private LocalDate registrationDate;
	private LocalDate startUpdate;
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

}
