package com.bfp.oms.Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "disapproved_Occupancy")
public class OccupancyDisapprovedClerkEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String control_no;
	private String bldgpermit_no;
	private Date date_received;
	private String applicants_name;
	private String project_name;
	private String location;
	private int contact_no;
	private int inspection_no;
	
	private Date nod_date;
	private int nod_no;
	
	private String[] defects;
	
	private String name;
	private Date date;
	
	private String remarks;

	
	//Constructor
	public OccupancyDisapprovedClerkEntity() {}


	public OccupancyDisapprovedClerkEntity(int id, String control_no, String bldgpermit_no, Date date_received,
			String applicants_name, String project_name, String location, int contact_no, int inspection_no,
			Date nod_date, int nod_no, String[] defects, String name, Date date, String remarks) {
		super();
		this.id = id;
		this.control_no = control_no;
		this.bldgpermit_no = bldgpermit_no;
		this.date_received = date_received;
		this.applicants_name = applicants_name;
		this.project_name = project_name;
		this.location = location;
		this.contact_no = contact_no;
		this.inspection_no = inspection_no;
		this.nod_date = nod_date;
		this.nod_no = nod_no;
		this.defects = defects;
		this.name = name;
		this.date = date;
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


	public Date getDate_received() {
		return date_received;
	}


	public void setDate_received(Date date_received) {
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


	public int getContact_no() {
		return contact_no;
	}


	public void setContact_no(int contact_no) {
		this.contact_no = contact_no;
	}


	public int getInspection_no() {
		return inspection_no;
	}


	public void setInspection_no(int inspection_no) {
		this.inspection_no = inspection_no;
	}


	public Date getNod_date() {
		return nod_date;
	}


	public void setNod_date(Date nod_date) {
		this.nod_date = nod_date;
	}


	public int getNod_no() {
		return nod_no;
	}


	public void setNod_no(int nod_no) {
		this.nod_no = nod_no;
	}


	public String[] getDefects() {
		return defects;
	}


	public void setDefects(String[] defects) {
		this.defects = defects;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}