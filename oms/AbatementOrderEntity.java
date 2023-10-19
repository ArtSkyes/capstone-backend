package com.cituccs.bfp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "tble_abatementorder")
public class AbatementOrderEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ao_id;
	
	private int control_no;
	private int bldgpermit_no;
	private String applicants_name;
	private String project_name;
	private String address;
	private String type_occupancy;
	private String contact_no;
	private String administrative_fine;
	private String status;
	
	//Constructor
	public AbatementOrderEntity() {}

	public AbatementOrderEntity(int ao_id, int control_no, int bldgpermit_no, String applicants_name,
			String project_name, String address, String type_occupancy, String contact_no, String administrative_fine,
			String status) {
		super();
		this.ao_id = ao_id;
		this.control_no = control_no;
		this.bldgpermit_no = bldgpermit_no;
		this.applicants_name = applicants_name;
		this.project_name = project_name;
		this.address = address;
		this.type_occupancy = type_occupancy;
		this.contact_no = contact_no;
		this.administrative_fine = administrative_fine;
		this.status = status;
	}

	public int getAo_id() {
		return ao_id;
	}

	public void setAo_id(int ao_id) {
		this.ao_id = ao_id;
	}

	public int getControl_no() {
		return control_no;
	}

	public void setControl_no(int control_no) {
		this.control_no = control_no;
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

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
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
