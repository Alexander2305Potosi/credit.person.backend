package com.credit.person.dto;

import java.io.Serializable;

import lombok.Value;

@Value
public class CreditPersonDTO implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6686487861496207110L;
	private long idPerson;
	private String namePerson;
	private String lastNamePerson;
	private String numberIdentificationPerson;
	private long idTypeIdentification;
	private String nameIdTypeIdentification;
	private long idCredit;
	private int totalCost;
	private int totalFee;
	private long idCity;
	private String nameCity;
	private long idSuburb;
	private String nameSuburb;
	
	public CreditPersonDTO() {
	
	}

	public long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(long idPerson) {
		this.idPerson = idPerson;
	}

	public String getNamePerson() {
		return namePerson;
	}

	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}

	public String getLastNamePerson() {
		return lastNamePerson;
	}

	public void setLastNamePerson(String lastNamePerson) {
		this.lastNamePerson = lastNamePerson;
	}

	public String getNumberIdentificationPerson() {
		return numberIdentificationPerson;
	}

	public void setNumberIdentificationPerson(String numberIdentificationPerson) {
		this.numberIdentificationPerson = numberIdentificationPerson;
	}

	public long getIdTypeIdentification() {
		return idTypeIdentification;
	}

	public void setIdTypeIdentification(long idTypeIdentification) {
		this.idTypeIdentification = idTypeIdentification;
	}

	public String getNameIdTypeIdentification() {
		return nameIdTypeIdentification;
	}

	public void setNameIdTypeIdentification(String nameIdTypeIdentification) {
		this.nameIdTypeIdentification = nameIdTypeIdentification;
	}

	public long getIdCredit() {
		return idCredit;
	}

	public void setIdCredit(long idCredit) {
		this.idCredit = idCredit;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	public int getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}

	public long getIdCity() {
		return idCity;
	}

	public void setIdCity(long idCity) {
		this.idCity = idCity;
	}

	public String getNameCity() {
		return nameCity;
	}

	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}

	public long getIdSuburb() {
		return idSuburb;
	}

	public void setIdSuburb(long idSuburb) {
		this.idSuburb = idSuburb;
	}

	public String getNameSuburb() {
		return nameSuburb;
	}

	public void setNameSuburb(String nameSuburb) {
		this.nameSuburb = nameSuburb;
	}
	
	

}
