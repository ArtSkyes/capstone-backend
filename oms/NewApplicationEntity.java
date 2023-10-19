package com.cituccs.bfp.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "db_newapplcation")
public class NewApplicationEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int new_id;
	private int application_no;
	private String bldgpermit_no;
	private String date_received;
	private String applicants_name;
	private String project_name;
	private String location;
	private String contact_no;
	private int fees;
	private int inspection_no;
	private String status;
	
	//Constructor
	
	public NewApplicationEntity() {}


	
	
	public NewApplicationEntity(int new_id, int application_no, String bldgpermit_no, String date_received,
			String applicants_name, String project_name, String location, String contact_no, int fees, int inspection_no,
			String status) {
		super();
		this.new_id = new_id;
		this.application_no = application_no;
		this.bldgpermit_no = bldgpermit_no;
		this.date_received = date_received;
		this.applicants_name = applicants_name;
		this.project_name = project_name;
		this.location = location;
		this.contact_no = contact_no;
		this.fees = fees;
		this.inspection_no = inspection_no;
		this.status = status;
	}



	
	//getters and setters
	public int getNew_id() {
		return new_id;
	}

	//public void setNew_id(int new_id) {
		//this.new_id = new_id;
	//}


	public int getApplication_no() {
		return application_no;
	}

	public void setApplication_no(int application_no) {
		this.application_no = application_no;
	}

	public String getBldgpermit_no() {
		return bldgpermit_no;
	}

	public void setBldgpermit_no(String bldgpermit_no) {
		this.bldgpermit_no = bldgpermit_no;
	}

	public String getDate_received() {
		return date_received;
	}

	public void setDate_received(String date_received) {
		this.date_received = date_received;
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

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public int getInspection_no() {
		return inspection_no;
	}

	public void setInspection_no(int inspection_no) {
		this.inspection_no = inspection_no;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

