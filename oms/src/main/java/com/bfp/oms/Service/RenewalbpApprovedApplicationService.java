package com.bfp.oms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bfp.oms.Entity.RenewalbpApprovedApplicationEntity;
import com.bfp.oms.Repository.RenewalbpApprovedApplicationRepository;



@Service
public class RenewalbpApprovedApplicationService {

	@Autowired
	RenewalbpApprovedApplicationRepository renewaprepo;
	
	//read all records
	public List<RenewalbpApprovedApplicationEntity> getAllRenewabpApprovedApplication(){
		return renewaprepo.findAll();
	}
	
	//update
	public RenewalbpApprovedApplicationEntity putAllRenewalbpApprovedApplication(int renewbp_id, RenewalbpApprovedApplicationEntity newRenewalbpApprovedApplicationDetails) throws Exception{
		
		RenewalbpApprovedApplicationEntity newRenewalbpApprovedApplication = new RenewalbpApprovedApplicationEntity();
		
		try {
			//search
			newRenewalbpApprovedApplication = renewaprepo.findById(renewbp_id).get();
			
			//update
			newRenewalbpApprovedApplication.setRemarks(newRenewalbpApprovedApplicationDetails.getRemarks());
			
			//save
			return renewaprepo.save(newRenewalbpApprovedApplication);
		}catch(NoResultException nex) {
			throw new Exception("Id Number" + renewbp_id + "Does not Exist!");
		}
	}
	
	//update records
			public RenewalbpApprovedApplicationEntity evaluateApprovedBp(int id, RenewalbpApprovedApplicationEntity newNewbpApprovedApplicationDetails) throws Exception{
				
				RenewalbpApprovedApplicationEntity newRenewalApprovedApplication = new RenewalbpApprovedApplicationEntity();
				
				try {
					//search
					newRenewalApprovedApplication = renewaprepo.findById(id).get();
					
					//update
					newRenewalApprovedApplication.setBspermit_no(newNewbpApprovedApplicationDetails.getBspermit_no());
					newRenewalApprovedApplication.setPermittee(newNewbpApprovedApplicationDetails.getPermittee());
					newRenewalApprovedApplication.setBusiness_name(newNewbpApprovedApplicationDetails.getBusiness_name());
					newRenewalApprovedApplication.setAddress(newNewbpApprovedApplicationDetails.getAddress());
					newRenewalApprovedApplication.setNature_business(newNewbpApprovedApplicationDetails.getNature_business());
					newRenewalApprovedApplication.setType_occupancy(newNewbpApprovedApplicationDetails.getType_occupancy());
					newRenewalApprovedApplication.setContact_no(newNewbpApprovedApplicationDetails.getContact_no());
					newRenewalApprovedApplication.setEmail(newNewbpApprovedApplicationDetails.getEmail());
					newRenewalApprovedApplication.setDate_received(newNewbpApprovedApplicationDetails.getDate_received());
					newRenewalApprovedApplication.setDate_inspection(newNewbpApprovedApplicationDetails.getDate_inspection());
					newRenewalApprovedApplication.setInspection_no(newNewbpApprovedApplicationDetails.getInspection_no());
					newRenewalApprovedApplication.setFsic_no(newNewbpApprovedApplicationDetails.getFsic_no());
					newRenewalApprovedApplication.setFsic_date(newNewbpApprovedApplicationDetails.getFsic_date());
					newRenewalApprovedApplication.setAmount(newNewbpApprovedApplicationDetails.getAmount());
					newRenewalApprovedApplication.setOr_no(newNewbpApprovedApplicationDetails.getOr_no());
					newRenewalApprovedApplication.setDate(newNewbpApprovedApplicationDetails.getDate());
					newRenewalApprovedApplication.setRemarks(newNewbpApprovedApplicationDetails.getRemarks());
					newRenewalApprovedApplication.setTeam_leader(newNewbpApprovedApplicationDetails.getTeam_leader());
					newRenewalApprovedApplication.setFire_inspectors(newNewbpApprovedApplicationDetails.getFire_inspectors());
					newRenewalApprovedApplication.setRecommendation(newNewbpApprovedApplicationDetails.getRecommendation());
					
					//save
					return renewaprepo.save(newRenewalApprovedApplication);
					
				}catch(NoResultException nex) {
					throw new Exception("ID Number" + id + "Does not Exist!");
				}
			}
		
		//Add new Application
			 public RenewalbpApprovedApplicationEntity insertApprovedPermit(RenewalbpApprovedApplicationEntity permit) {
			        return renewaprepo.save(permit);
			    }
			 
		//D - Delete a record
			 public String deleteItem(int id) {
			      String msg;
			      if(renewaprepo.findById(id) != null) {
			    	  renewaprepo.deleteById(id); //find the id number of the student to be deleted
			        msg = "Permit ID Number: " + id + " was successfully deleted!";
			      } else {
			            msg = "Permit ID Number: " + id + " was NOT found!";
			      }
			       
			      return msg;
			    }
}