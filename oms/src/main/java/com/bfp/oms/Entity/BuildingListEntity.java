package com.bfp.oms.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_building")
public class BuildingListEntity {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int controlno;
		
		private String buildingpermitno;
		private String namepermitee;
		private String businessname;
		private String address;
		private String typeofoccupancy;
		private String contactno;
		private Date datereceived;
		private String receivedby;
		private String status;
		private String evaluator;
		private int nostorey;
		private String constructrenovate;
		private boolean structureconstructed;
		private String remarks;
		private String defects;
		public BuildingListEntity(int controlno, String buildingpermitno, String namepermitee, String businessname,
				String address, String typeofoccupancy, String contactno, Date datereceived, String receivedby,
				String status, String evaluator, int nostorey, String constructrenovate, boolean structureconstructed,
				String remarks, String defects) {
			super();
			this.controlno = controlno;
			this.buildingpermitno = buildingpermitno;
			this.namepermitee = namepermitee;
			this.businessname = businessname;
			this.address = address;
			this.typeofoccupancy = typeofoccupancy;
			this.contactno = contactno;
			this.datereceived = datereceived;
			this.receivedby = receivedby;
			this.status = status;
			this.evaluator = evaluator;
			this.nostorey = nostorey;
			this.constructrenovate = constructrenovate;
			this.structureconstructed = structureconstructed;
			this.remarks = remarks;
			this.defects = defects;
		}
		public BuildingListEntity() {}
		public int getControlno() {
			return controlno;
		}
		public void setControlno(int controlno) {
			this.controlno = controlno;
		}
		public String getBuildingpermitno() {
			return buildingpermitno;
		}
		public void setBuildingpermitno(String buildingpermitno) {
			this.buildingpermitno = buildingpermitno;
		}
		public String getNamepermitee() {
			return namepermitee;
		}
		public void setNamepermitee(String namepermitee) {
			this.namepermitee = namepermitee;
		}
		public String getBusinessname() {
			return businessname;
		}
		public void setBusinessname(String businessname) {
			this.businessname = businessname;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getTypeofoccupancy() {
			return typeofoccupancy;
		}
		public void setTypeofoccupancy(String typeofoccupancy) {
			this.typeofoccupancy = typeofoccupancy;
		}
		public String getContactno() {
			return contactno;
		}
		public void setContactno(String contactno) {
			this.contactno = contactno;
		}
		public Date getDatereceived() {
			return datereceived;
		}
		public void setDatereceived(Date datereceived) {
			this.datereceived = datereceived;
		}
		public String getReceivedby() {
			return receivedby;
		}
		public void setReceivedby(String receivedby) {
			this.receivedby = receivedby;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getEvaluator() {
			return evaluator;
		}
		public void setEvaluator(String evaluator) {
			this.evaluator = evaluator;
		}
		public int getNostorey() {
			return nostorey;
		}
		public void setNostorey(int nostorey) {
			this.nostorey = nostorey;
		}
		public String getConstructrenovate() {
			return constructrenovate;
		}
		public void setConstructrenovate(String constructrenovate) {
			this.constructrenovate = constructrenovate;
		}
		public boolean isStructureconstructed() {
			return structureconstructed;
		}
		public void setStructureConstructed(boolean structureconstructed) {
			this.structureconstructed = structureconstructed;
		}
		public String getRemarks() {
			return remarks;
		}
		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}
		public String getDefects() {
			return defects;
		}
		public void setDefects(String defects) {
			this.defects = defects;
		}
		
}
