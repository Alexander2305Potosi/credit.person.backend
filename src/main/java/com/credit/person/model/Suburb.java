package com.credit.person.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("suburb")
public class Suburb {
	
	@Id
	@Column("id_suburb")
	private long idSuburb;
	
	@Column("name")
	private String name;
	
	@Column("id_city")
	private long idCity;

	public long getIdSuburb() {
		return idSuburb;
	}

	public void setIdSuburb(long idSuburb) {
		this.idSuburb = idSuburb;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getIdCity() {
		return idCity;
	}

	public void setIdCity(long idCity) {
		this.idCity = idCity;
	}

}
