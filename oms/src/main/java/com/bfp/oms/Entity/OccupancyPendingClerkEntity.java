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
	
	//Basic Information
	private int control_no;
	private String bldgpermit_no;
	private String applicants_name;
	private String project_name;
	private String location;
	private String contact_no;
	private ArrayList<String[]> fees;
	private Date date_received;
	
	//Update Information
	private String team_leader;
	private String[] fireInspectors;
	private int inspection_no;
	private Date date_inspection;
	private String received_name;
	private Date receivedoccu_date;
	
	private String remarks;
	
	
	
	
	public OccupancyPendingClerkEntity() {}




	public OccupancyPendingClerkEntity(int id, int control_no, String bldgpermit_no, String applicants_name,
			String project_name, String location, String contact_no, ArrayList<String[]> fees, Date date_received,
			String team_leader, String[] fireInspectors, int inspection_no, Date date_inspection, String received_name,
			Date receivedoccu_date, String remarks) {
		super();
		this.id = id;
		this.control_no = control_no;
		this.bldgpermit_no = bldgpermit_no;
		this.applicants_name = applicants_name;
		this.project_name = project_name;
		this.location = location;
		this.contact_no = contact_no;
		this.fees = fees;
		this.date_received = date_received;
		this.team_leader = team_leader;
		this.fireInspectors = fireInspectors;
		this.inspection_no = inspection_no;
		this.date_inspection = date_inspection;
		this.received_name = received_name;
		this.receivedoccu_date = receivedoccu_date;
		this.remarks = remarks;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public int getControl_no() {
		return control_no;
	}




	public void setControl_no(int control_no) {
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




	public ArrayList<String[]> getFees() {
		return fees;
	}




	public void setFees(ArrayList<String[]> fees) {
		this.fees = fees;
	}




	public Date getDate_received() {
		return date_received;
	}




	public void setDate_received(Date date_received) {
		this.date_received = date_received;
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




	public int getInspection_no() {
		return inspection_no;
	}




	public void setInspection_no(int inspection_no) {
		this.inspection_no = inspection_no;
	}




	public Date getDate_inspection() {
		return date_inspection;
	}




	public void setDate_inspection(Date date_inspection) {
		this.date_inspection = date_inspection;
	}




	public String getReceived_name() {
		return received_name;
	}




	public void setReceived_name(String received_name) {
		this.received_name = received_name;
	}




	public Date getReceivedoccu_date() {
		return receivedoccu_date;
	}




	public void setReceivedoccu_date(Date receivedoccu_date) {
		this.receivedoccu_date = receivedoccu_date;
	}




	public String getRemarks() {
		return remarks;
	}




	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	
}