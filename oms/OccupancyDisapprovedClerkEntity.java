package com.bfp.oms.Entity;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OccupancyDisapprovedClerkEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String control_no;
	private String applicant_name;
	private String building_no;
	private String address;
	private String project_name;
	private Date date_received;
	private Date nod_date;
	private int inspection_no;
	private int nod_no;
	private ArrayList<String[]> assessment_fees;
	private String[] deficiencies;
	private String received_name;
	private Date receivednod_date;
 
	public OccupancyDisapprovedClerkEntity() {}

	public OccupancyDisapprovedClerkEntity(int id, String control_no, String applicant_name, String building_no,
			String address, String project_name, Date date_received, Date nod_date, int inspection_no, int nod_no,
			ArrayList<String[]> assessment_fees, String[] deficiencies, String received_name, Date receivednod_date) {
		
		super();
		this.id = id;
		this.control_no = control_no;
		this.applicant_name = applicant_name;
		this.building_no = building_no;
		this.address = address;
		this.project_name = project_name;
		this.date_received = date_received;
		this.nod_date = nod_date;
		this.inspection_no = inspection_no;
		this.nod_no = nod_no;
		this.assessment_fees = assessment_fees;
		this.deficiencies = deficiencies;
		this.received_name = received_name;
		this.receivednod_date = receivednod_date;
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getProject_name() {
		return project_name;
	}


	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}


	public Date getDate_received() {
		return date_received;
	}


	public void setDate_received(Date date_received) {
		this.date_received = date_received;
	}


	public Date getNod_date() {
		return nod_date;
	}


	public void setNod_date(Date nod_date) {
		this.nod_date = nod_date;
	}


	public int getInspection_no() {
		return inspection_no;
	}
	

	public void setInspection_no(int inspection_no) {
		this.inspection_no = inspection_no;
	}


	public int getNod_no() {
		return nod_no;
	}

	public void setNod_no(int nod_no) {
		this.nod_no = nod_no;
	}


	public ArrayList<String[]> getAssessment_fees() {
		return assessment_fees;
	}


	public void setAssessment_fees(ArrayList<String[]> assessment_fees) {
		this.assessment_fees = assessment_fees;
	}


	public String[] getDeficiencies() {
		return deficiencies;
	}


	public void setDeficiencies(String[] deficiencies) {
		this.deficiencies = deficiencies;
	}


	public String getReceived_name() {
		return received_name;
	}


	public void setReceived_name(String received_name) {
		this.received_name = received_name;
	}


	public Date getReceivednod_date() {
		return receivednod_date;
	}


	public void setReceivednod_date(Date receivednod_date) {
		this.receivednod_date = receivednod_date;
	}

}
