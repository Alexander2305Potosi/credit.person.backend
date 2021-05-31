package com.credit.person.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("type_identification")
public class TypeIdentification {
	
	@Id
	@Column("id_type_identification")
	private long idTypeIdentification;
	
	
	@Column("name")
	private String name;


	public long getIdTypeIdentification() {
		return idTypeIdentification;
	}


	public void setIdTypeIdentification(long idTypeIdentification) {
		this.idTypeIdentification = idTypeIdentification;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
