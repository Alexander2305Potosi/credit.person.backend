package com.credit.person.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("person")
public class Person {
	
	@Id
	@Column("id_person")
	private long idPerson;
	
	@Column("name")
	private String name;

	@Column("last_name")
	private String lastName;
	
	@Column("number_phone")
	private String numberPhone;
	
	@Column("email")
	private String email;
	
	@Column("number_identification")
	private String numberIdentification;
	
	@Column("id_type_identification")
	private long idTypeIdentification;
	
	@Column("address")
	private String address;

	@Column("id_city_location")
	private long idCityLocation;
	
	@Column("id_suburb_location")
	private long idSuburbLocation;
	

	public long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(long idPerson) {
		this.idPerson = idPerson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumberIdentification() {
		return numberIdentification;
	}

	public void setNumberIdentification(String numberIdentification) {
		this.numberIdentification = numberIdentification;
	}

	public long getIdTypeIdentification() {
		return idTypeIdentification;
	}

	public void setIdTypeIdentification(long idTypeIdentification) {
		this.idTypeIdentification = idTypeIdentification;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getIdCityLocation() {
		return idCityLocation;
	}

	public void setIdCityLocation(long idCityLocation) {
		this.idCityLocation = idCityLocation;
	}

}
