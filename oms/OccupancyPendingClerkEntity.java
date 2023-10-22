package com.bfp.oms.Entity;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OccupancyPendingClerkEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String application_no;
	private String applicant_name;
	private String building_no;
	private String project_name;
	private String location;
	private String contact_no;
	private String assessment_fees;
	private Date date_received;
	private String remarks;
	
	public OccupancyPendingClerkEntity() {}

	public OccupancyPendingClerkEntity(int id, String application_no, String applicant_name, String building_no,
			String project_name, String location, String contact_no, String assessment_fees, Date date_received,
			String remarks) {
		super();
		this.id = id;
		this.application_no = application_no;
		this.applicant_name = applicant_name;
		this.building_no = building_no;
		this.project_name = project_name;
		this.location = location;
		this.contact_no = contact_no;
		this.assessment_fees = assessment_fees;
		this.date_received = date_received;
		this.remarks = remarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getapplication_no() {
		return application_no;
	}

	public void setapplication_no(String application_no) {
		this.application_no = application_no;
	}

	public String getApplicant_name() {
		return applicant_name;
	}

	public void setApplicant_name(String applicant_name) {
		this.applicant_name = applicant_name;
	}

	public String getBuilding_no() {
		return building_no;
	}

	public void setBuilding_no(String building_no) {
		this.building_no = building_no;
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

	public String getAssessment_fees() {
		return assessment_fees;
	}

	public void setAssessment_fees(String assessment_fees) {
		this.assessment_fees = assessment_fees;
	}

	public Date getDate_received() {
		return date_received;
	}

	public void setDate_received(Date date_received) {
		this.date_received = date_received;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
}