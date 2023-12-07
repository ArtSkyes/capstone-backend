package com.bfp.oms.Entity;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BuildingPermitPaymentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String projectname;
	private String location;
	private String name;
	private String fsc;
	private String business_permitno;
	private String or_no;
	private String ops_no;
	private Date ops_date;
	private Date payment_date;
	private double amount_paid;
	private double total_amount;
	private String assessor_name;
	private ArrayList<String[]> payment;
	
	
	public BuildingPermitPaymentEntity() {}


	public BuildingPermitPaymentEntity(int id, String projectname, String location, String name, String fsc,
			String business_permitno, String or_no, String ops_no, Date ops_date, Date payment_date, double amount_paid,
			double total_amount, String assessor_name, ArrayList<String[]> payment) {
		super();
		this.id = id;
		this.projectname = projectname;
		this.location = location;
		this.name = name;
		this.fsc = fsc;
		this.business_permitno = business_permitno;
		this.or_no = or_no;
		this.ops_no = ops_no;
		this.ops_date = ops_date;
		this.payment_date = payment_date;
		this.amount_paid = amount_paid;
		this.total_amount = total_amount;
		this.assessor_name = assessor_name;
		this.payment = payment;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getProjectname() {
		return projectname;
	}


	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFsc() {
		return fsc;
	}


	public void setFsc(String fsc) {
		this.fsc = fsc;
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


	public Date getOps_date() {
		return ops_date;
	}


	public void setOps_date(Date ops_date) {
		this.ops_date = ops_date;
	}


	public Date getPayment_date() {
		return payment_date;
	}


	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}


	public double getAmount_paid() {
		return amount_paid;
	}


	public void setAmount_paid(double amount_paid) {
		this.amount_paid = amount_paid;
	}


	public double getTotal_amount() {
		return total_amount;
	}


	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}


	public String getAssessor_name() {
		return assessor_name;
	}


	public void setAssessor_name(String assessor_name) {
		this.assessor_name = assessor_name;
	}


	public ArrayList<String[]> getPayment() {
		return payment;
	}


	public void setPayment(ArrayList<String[]> payment) {
		this.payment = payment;
	}


}
