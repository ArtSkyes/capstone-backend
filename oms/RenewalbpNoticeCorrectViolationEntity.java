package com.cituccs.bfp.Entity;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RenewalbpNoticeCorrectViolationEntity {

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
	private Date date_received;
	private Date date_inspection;
	private int inspection_no;
	private int ntc_no;
	private Date ntc_date;
	private int ntcv_no;
	private Date ntcv_date;
	private String remarks;
	private String team_leader;
	private String[] fireInspectors;
	private ArrayList<String[]> defects;
	private String received_name;
	private Date receivedntcv_date;
	private String status;
	
	//constructor
	public RenewalbpNoticeCorrectViolationEntity() {}

	public RenewalbpNoticeCorrectViolationEntity(int id, String bspermit_no, String permittee, String business_name,
			String address, String nature_business, String type_occupancy, String contact_no, String email,
			Date date_received, Date date_inspection, int inspection_no, int ntc_no, Date ntc_date, int ntcv_no,
			Date ntcv_date, String remarks, String team_leader, String[] fireInspectors, ArrayList<String[]> defects,
			String received_name, Date receivedntcv_date, String status) {
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
		this.ntc_no = ntc_no;
		this.ntc_date = ntc_date;
		this.ntcv_no = ntcv_no;
		this.ntcv_date = ntcv_date;
		this.remarks = remarks;
		this.team_leader = team_leader;
		this.fireInspectors = fireInspectors;
		this.defects = defects;
		this.received_name = received_name;
		this.receivedntcv_date = receivedntcv_date;
		this.status = status;
	}

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

	public Date getDate_received() {
		return date_received;
	}

	public void setDate_received(Date date_received) {
		this.date_received = date_received;
	}

	public Date getDate_inspection() {
		return date_inspection;
	}

	public void setDate_inspection(Date date_inspection) {
		this.date_inspection = date_inspection;
	}

	public int getInspection_no() {
		return inspection_no;
	}

	public void setInspection_no(int inspection_no) {
		this.inspection_no = inspection_no;
	}

	public int getNtc_no() {
		return ntc_no;
	}

	public void setNtc_no(int ntc_no) {
		this.ntc_no = ntc_no;
	}

	public Date getNtc_date() {
		return ntc_date;
	}

	public void setNtc_date(Date ntc_date) {
		this.ntc_date = ntc_date;
	}

	public int getNtcv_no() {
		return ntcv_no;
	}

	public void setNtcv_no(int ntcv_no) {
		this.ntcv_no = ntcv_no;
	}

	public Date getNtcv_date() {
		return ntcv_date;
	}

	public void setNtcv_date(Date ntcv_date) {
		this.ntcv_date = ntcv_date;
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

	public ArrayList<String[]> getDefects() {
		return defects;
	}

	public void setDefects(ArrayList<String[]> defects) {
		this.defects = defects;
	}

	public String getReceived_name() {
		return received_name;
	}

	public void setReceived_name(String received_name) {
		this.received_name = received_name;
	}

	public Date getReceivedntcv_date() {
		return receivedntcv_date;
	}

	public void setReceivedntcv_date(Date receivedntcv_date) {
		this.receivedntcv_date = receivedntcv_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
