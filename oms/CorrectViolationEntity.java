package com.cituccs.bfp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tbl_cvapplication")
public class CorrectViolationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cv_id;
	
	private int application_no;
	private int bldgpermit_no;
	private String applicants_name;
	private String project_name;
	private String address;
	private String type_occupancy;
	private int contact_no;
	private String administrative_fine;
	private String status;
	
	//constructor
	public CorrectViolationEntity() {}

	public CorrectViolationEntity(int cv_id, int application_no, int bldgpermit_no, String applicants_name,
			String project_name, String address, String type_occupancy, int contact_no, String administrative_fine,
			String status) {
		super();
		this.cv_id = cv_id;
		this.application_no = application_no;
		this.bldgpermit_no = bldgpermit_no;
		this.applicants_name = applicants_name;
		this.project_name = project_name;
		this.address = address;
		this.type_occupancy = type_occupancy;
		this.contact_no = contact_no;
		this.administrative_fine = administrative_fine;
		this.status = status;
	}

	//setters and getters
	public int getCv_id() {
		return cv_id;
	}

	public void setCv_id(int cv_id) {
		this.cv_id = cv_id;
	}

	public int getApplication_no() {
		return application_no;
	}

	public void setApplication_no(int application_no) {
		this.application_no = application_no;
	}

	public int getBldgpermit_no() {
		return bldgpermit_no;
	}

	public void setBldgpermit_no(int bldgpermit_no) {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType_occupancy() {
		return type_occupancy;
	}

	public void setType_occupancy(String type_occupancy) {
		this.type_occupancy = type_occupancy;
	}

	public int getContact_no() {
		return contact_no;
	}

	public void setContact_no(int contact_no) {
		this.contact_no = contact_no;
	}

	public String getAdministrative_fine() {
		return administrative_fine;
	}

	public void setAdministrative_fine(String administrative_fine) {
		this.administrative_fine = administrative_fine;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
