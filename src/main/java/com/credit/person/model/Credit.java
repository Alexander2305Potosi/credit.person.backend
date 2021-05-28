package com.credit.person.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;


@Table("credit")
public class Credit {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column("id_credit")
	private long idCredit;
	
	@Column("total_cost")
	private String totalCost;

	@Column("total_fee")
	private String totalFee;

	@Column("id_person")
	private long idPerson;
	

	public long getIdCredit() {
		return idCredit;
	}

	public void setIdCredit(long idCredit) {
		this.idCredit = idCredit;
	}

	public String getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(String totalCost) {
		this.totalCost = totalCost;
	}

	public String getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(long idPerson) {
		this.idPerson = idPerson;
	}

}
