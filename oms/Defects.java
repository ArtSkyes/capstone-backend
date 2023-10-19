package com.cituccs.bfp.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Defects{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String defects;
	private Date grace_period;
	
	//Constructor
	
	public Defects(){}

	public Defects(int id, String defects, Date grace_period) {
		super();
		this.id = id;
		this.defects = defects;
		this.grace_period = grace_period;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDefects() {
		return defects;
	}

	public void setDefects(String defects) {
		this.defects = defects;
	}

	public Date getGrace_period() {
		return grace_period;
	}

	public void setGrace_period(Date grace_period) {
		this.grace_period = grace_period;
	}
	
	
	
	
}
