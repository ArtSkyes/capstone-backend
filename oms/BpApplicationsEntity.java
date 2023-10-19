package com.cituccs.bfp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_bpapplications")
public class BpApplicationsEntity {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int bpa_id;
	
	private int control_no;
	private int bldgpermit_no;
	private String date_received;
	private String applicants_name;
	private String address;
	private String nc_r;
	private int total_payment;
	private int or_number;
	private String status;
	private String remarks;
	private int fsec_no;
	private int nod_no;
	private String evaluator;
	
	//constructor
	public BpApplicationsEntity() {}

	public BpApplicationsEntity(int bpa_id, int control_no, int bldgpermit_no, String date_received,
			String applicants_name, String address, String nc_r, int total_payment, int or_number, String status,
			String remarks, int fsec_no, int nod_no, String evaluator) {
		super();
		this.bpa_id = bpa_id;
		this.control_no = control_no;
		this.bldgpermit_no = bldgpermit_no;
		this.date_received = date_received;
		this.applicants_name = applicants_name;
		this.address = address;
		this.nc_r = nc_r;
		this.total_payment = total_payment;
		this.or_number = or_number;
		this.status = status;
		this.remarks = remarks;
		this.fsec_no = fsec_no;
		this.nod_no = nod_no;
		this.evaluator = evaluator;
	}

	//setters and getters
	public int getBpa_id() {
		return bpa_id;
	}

	public void setBpa_id(int bpa_id) {
		this.bpa_id = bpa_id;
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

	public String getNc_r() {
		return nc_r;
	}

	public void setNc_r(String nc_r) {
		this.nc_r = nc_r;
	}

	public int getTotal_payment() {
		return total_payment;
	}

	public void setTotal_payment(int total_payment) {
		this.total_payment = total_payment;
	}

	public int getOr_number() {
		return or_number;
	}

	public void setOr_number(int or_number) {
		this.or_number = or_number;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getFsec_no() {
		return fsec_no;
	}

	public void setFsec_no(int fsec_no) {
		this.fsec_no = fsec_no;
	}

	public int getNod_no() {
		return nod_no;
	}

	public void setNod_no(int nod_no) {
		this.nod_no = nod_no;
	}

	public String getEvaluator() {
		return evaluator;
	}

	public void setEvaluator(String evaluator) {
		this.evaluator = evaluator;
	}
	
	
}
