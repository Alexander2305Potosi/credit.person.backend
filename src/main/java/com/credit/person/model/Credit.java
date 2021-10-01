package com.credit.person.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;


@Table("credit")
public class Credit implements Persistable<Long> {
	
	@Id
	@Column("id_credit")
	private Long idCredit;
	
	@Column("total_cost")
	private int totalCost;

	@Column("total_fee")
	private int totalFee;

	@Column("id_person")
	private long idPerson;
	
	@Transient
    private boolean newCredit;
	
	public Credit() {
	}

	public Credit(long idCredit, int totalCost, int totalFee, long idPerson) {
		this.idCredit = idCredit;
		this.totalCost = totalCost;
		this.totalFee = totalFee;
		this.idPerson = idPerson;
	}

	public Long getIdCredit() {
		return idCredit;
	}

	public void setIdCredit(Long idCredit) {
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

	public long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(long idPerson) {
		this.idPerson = idPerson;
	}

	@Override
	public Long getId() {
		return idCredit;
	}

	@Override
	public boolean isNew() {
		return this.newCredit || idCredit == null;
	}
	
	public Credit setAsNew(){
        this.newCredit = true;
        return this;
    }

}
