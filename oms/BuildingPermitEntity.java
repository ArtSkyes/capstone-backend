package com.cituccs.bfp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_buildingpermit")
public class BuildingPermitEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bp_id;
	
	private int control_no;
	private int bldgpermit_no;
	private String date_received;
	private String applicants_name;
	private String address;
	private String type_occupancy;
	private String received_by;
	
	//constructor
	public BuildingPermitEntity() {}

	public BuildingPermitEntity(int bp_id, int control_no, int bldgpermit_no, String date_received,
			String applicants_name, String address, String type_occupancy, String received_by) {
		super();
		this.bp_id = bp_id;
		this.control_no = control_no;
		this.bldgpermit_no = bldgpermit_no;
		this.date_received = date_received;
		this.applicants_name = applicants_name;
		this.address = address;
		this.type_occupancy = type_occupancy;
		this.received_by = received_by;
	}

	//setters and getters
	public int getBp_id() {
		return bp_id;
	}

	//public void setBp_id(int bp_id) {
		//this.bp_id = bp_id;
	//}

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

	public String getReceived_by() {
		return received_by;
	}

	public void setReceived_by(String received_by) {
		this.received_by = received_by;
	}
	
	

}
