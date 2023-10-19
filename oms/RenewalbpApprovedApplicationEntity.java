package com.cituccs.bfp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RenewalbpApprovedApplicationEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String bspermit_no;
	private String permittee;
	private String business_name;
	private String address;
	private String nature_business;
	private String type_occupancy;
	private String contact_no;
	private String email;
	private String date_received;
	private String date_inspection;
	private int inspection_no;
	private int fsic_no;
	private String fsic_date;
	private double amount;
	private String or_no;
	private String payment_date;
	private String remarks;
	private String team_leader;
	private String[] fireInspectors;
	private String [] recommendation;
	
	//constructor
	public RenewalbpApprovedApplicationEntity() {}

	public RenewalbpApprovedApplicationEntity(int id, String bspermit_no, String permittee, String business_name,
			String address, String nature_business, String type_occupancy, String contact_no, String email,
			String date_received, String date_inspection, int inspection_no, int fsic_no, String fsic_date,
			double amount, String or_no, String payment_date, String remarks, String team_leader,
			String[] fireInspectors, String[] recommendation) {
		super();
		this.id = id;
		this.bspermit_no = bspermit_no;
		this.permittee = permittee;
		this.business_name = business_name;
		this.address = address;
		this.nature_business = nature_business;
		this.type_occupancy = type_occupancy;
		this.contact_no = contact_no;
		this.email = email;
		this.date_received = date_received;
		this.date_inspection = date_inspection;
		this.inspection_no = inspection_no;
		this.fsic_no = fsic_no;
		this.fsic_date = fsic_date;
		this.amount = amount;
		this.or_no = or_no;
		this.payment_date = payment_date;
		this.remarks = remarks;
		this.team_leader = team_leader;
		this.fireInspectors = fireInspectors;
		this.recommendation = recommendation;
	}
	//getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBspermit_no() {
		return bspermit_no;
	}

	public void setBspermit_no(String bspermit_no) {
		this.bspermit_no = bspermit_no;
	}

	public String getPermittee() {
		return permittee;
	}

	public void setPermittee(String permittee) {
		this.permittee = permittee;
	}

	public String getBusiness_name() {
		return business_name;
	}

	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNature_business() {
		return nature_business;
	}

	public void setNature_business(String nature_business) {
		this.nature_business = nature_business;
	}

	public String getType_occupancy() {
		return type_occupancy;
	}

	public void setType_occupancy(String type_occupancy) {
		this.type_occupancy = type_occupancy;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate_received() {
		return date_received;
	}

	public void setDate_received(String date_received) {
		this.date_received = date_received;
	}

	public String getDate_inspection() {
		return date_inspection;
	}

	public void setDate_inspection(String date_inspection) {
		this.date_inspection = date_inspection;
	}

	public int getInspection_no() {
		return inspection_no;
	}

	public void setInspection_no(int inspection_no) {
		this.inspection_no = inspection_no;
	}

	public int getFsic_no() {
		return fsic_no;
	}

	public void setFsic_no(int fsic_no) {
		this.fsic_no = fsic_no;
	}

	public String getFsic_date() {
		return fsic_date;
	}

	public void setFsic_date(String fsic_date) {
		this.fsic_date = fsic_date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getOr_no() {
		return or_no;
	}

	public void setOr_no(String or_no) {
		this.or_no = or_no;
	}

	public String getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(String payment_date) {
		this.payment_date = payment_date;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getTeam_leader() {
		return team_leader;
	}

	public void setTeam_leader(String team_leader) {
		this.team_leader = team_leader;
	}

	public String[] getFireInspectors() {
		return fireInspectors;
	}

	public void setFireInspectors(String[] fireInspectors) {
		this.fireInspectors = fireInspectors;
	}

	public String[] getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String[] recommendation) {
		this.recommendation = recommendation;
	}
	
	

	
	
	

}