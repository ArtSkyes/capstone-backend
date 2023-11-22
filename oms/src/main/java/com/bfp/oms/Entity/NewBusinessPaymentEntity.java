package com.bfp.oms.Entity;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NewBusinessPaymentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String payor;
	private String business_permitno;
	private String or_no;
	private String ops_no;
	private Date payment_date;
	private String agency;
	private ArrayList<String[]> payment;
	
	
	public NewBusinessPaymentEntity() {}


	public NewBusinessPaymentEntity(int id, String payor, String business_permitno, String or_no, String ops_no,
			Date payment_date, String agency, ArrayList<String[]> payment) {
		super();
		this.id = id;
		this.payor = payor;
		this.business_permitno = business_permitno;
		this.or_no = or_no;
		this.ops_no = ops_no;
		this.payment_date = payment_date;
		this.agency = agency;
		this.payment = payment;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPayor() {
		return payor;
	}


	public void setPayor(String payor) {
		this.payor = payor;
	}


	public String getBusiness_permitno() {
		return business_permitno;
	}


	public void setBusiness_permitno(String business_permitno) {
		this.business_permitno = business_permitno;
	}


	public String getOr_no() {
		return or_no;
	}


	public void setOr_no(String or_no) {
		this.or_no = or_no;
	}


	public String getOps_no() {
		return ops_no;
	}


	public void setOps_no(String ops_no) {
		this.ops_no = ops_no;
	}


	public Date getPayment_date() {
		return payment_date;
	}


	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}


	public String getAgency() {
		return agency;
	}


	public void setAgency(String agency) {
		this.agency = agency;
	}


	public ArrayList<String[]> getPayment() {
		return payment;
	}


	public void setPayment(ArrayList<String[]> payment) {
		this.payment = payment;
	}

}