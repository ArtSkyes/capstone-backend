package com.bfp.oms.Entity;

import java.sql.Date;
import java.util.ArrayList;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "Approved_Occupancy")
public class OccupancyApprovedClerkEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String control_no;
	private String bldgpermit_no;
	private String applicants_name;
	private String project_name;
	private String location;
	private String contact_no;
	private Date date_received;
	private ArrayList<String[]> fees;
	
	//FSIC date and number
	private Date fsic_date;
	private int fsic_no;
	
	//payment
	private double amount;
	private String or_no;
	private Date payment_date;
	
	//payment and additional fees
	private ArrayList<String[]> additional_fees;
	private double amount_additional;
	private String or_no_additional;
	private Date payment_date_additional;
	
	//recommendations
	private String[] recommendations;
	
	private int inspection_no;
	private String remarks;
	
	//@OneToMany(cascade = CascadeType.MERGE)
	
	
	
	
	//constructor
	public OccupancyApprovedClerkEntity() {}

	public OccupancyApprovedClerkEntity(int id, String control_no, String bldgpermit_no, String applicants_name,
			String project_name, String location, String contact_no, Date date_received, ArrayList<String[]> fees,
			Date fsic_date, int fsic_no, double amount, String or_no, Date payment_date,
			ArrayList<String[]> additional_fees, double amount_additional, String or_no_additional,
			Date payment_date_additional, String[] recommendations, int inspection_no, String remarks) {
		super();
		this.id = id;
		this.control_no = control_no;
		this.bldgpermit_no = bldgpermit_no;
		this.applicants_name = applicants_name;
		this.project_name = project_name;
		this.location = location;
		this.contact_no = contact_no;
		this.date_received = date_received;
		this.fees = fees;
		this.fsic_date = fsic_date;
		this.fsic_no = fsic_no;
		this.amount = amount;
		this.or_no = or_no;
		this.payment_date = payment_date;
		this.additional_fees = additional_fees;
		this.amount_additional = amount_additional;
		this.or_no_additional = or_no_additional;
		this.payment_date_additional = payment_date_additional;
		this.recommendations = recommendations;
		this.inspection_no = inspection_no;
		this.remarks = remarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getControl_no() {
		return control_no;
	}

	public void setControl_no(String control_no) {
		this.control_no = control_no;
	}

	public String getBldgpermit_no() {
		return bldgpermit_no;
	}

	public void setBldgpermit_no(String bldgpermit_no) {
		this.bldgpermit_no = bldgpermit_no;
	}

	public String getApplicants_name() {
		return applicants_name;
	}

	public void setApplicants_name(String applicants_name) {
		this.applicants_name = applicants_name;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public Date getDate_received() {
		return date_received;
	}

	public void setDate_received(Date date_received) {
		this.date_received = date_received;
	}

	public ArrayList<String[]> getFees() {
		return fees;
	}

	public void setFees(ArrayList<String[]> fees) {
		this.fees = fees;
	}

	public Date getFsic_date() {
		return fsic_date;
	}

	public void setFsic_date(Date fsic_date) {
		this.fsic_date = fsic_date;
	}

	public int getFsic_no() {
		return fsic_no;
	}

	public void setFsic_no(int fsic_no) {
		this.fsic_no = fsic_no;
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

	public Date getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}

	public ArrayList<String[]> getAdditional_fees() {
		return additional_fees;
	}

	public void setAdditional_fees(ArrayList<String[]> additional_fees) {
		this.additional_fees = additional_fees;
	}

	public double getAmount_additional() {
		return amount_additional;
	}

	public void setAmount_additional(double amount_additional) {
		this.amount_additional = amount_additional;
	}

	public String getOr_no_additional() {
		return or_no_additional;
	}

	public void setOr_no_additional(String or_no_additional) {
		this.or_no_additional = or_no_additional;
	}

	public Date getPayment_date_additional() {
		return payment_date_additional;
	}

	public void setPayment_date_additional(Date payment_date_additional) {
		this.payment_date_additional = payment_date_additional;
	}

	public String[] getRecommendations() {
		return recommendations;
	}

	public void setRecommendations(String[] recommendations) {
		this.recommendations = recommendations;
	}

	public int getInspection_no() {
		return inspection_no;
	}

	public void setInspection_no(int inspection_no) {
		this.inspection_no = inspection_no;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
