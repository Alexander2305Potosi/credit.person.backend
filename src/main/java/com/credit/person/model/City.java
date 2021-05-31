package com.credit.person.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("city")
public class City {
	
	@Id
	@Column("id_city")
	private long idCity;
	
	@Column("name")
	private String name;

	public long getIdCity() {
		return idCity;
	}

	public void setIdCity(long idCity) {
		this.idCity = idCity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
