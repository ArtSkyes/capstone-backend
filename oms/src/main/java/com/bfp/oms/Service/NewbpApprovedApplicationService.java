package com.bfp.oms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bfp.oms.Entity.NewbpApprovedApplicationEntity;
import com.bfp.oms.Repository.NewbpApprovedApplicationRepository;



@Service
public class NewbpApprovedApplicationService {

	@Autowired
	NewbpApprovedApplicationRepository newbprepo;
	
	//Read all records
	public List<NewbpApprovedApplicationEntity> getAllNewbpApprovedApplication(){
		return newbprepo.findAll();
		
	}
	
	//update records
	public NewbpApprovedApplicationEntity putNewbpApprovedApplication(int newbp_id, NewbpApprovedApplicationEntity newNewbpApprovedApplicationDetails) throws Exception{
		
		NewbpApprovedApplicationEntity newNewbpApprovedApplication = new NewbpApprovedApplicationEntity();
		
		try {
			//search
			newNewbpApprovedApplication = newbprepo.findById(newbp_id).get();
			
			//update
			newNewbpApprovedApplication.setRemarks(newNewbpApprovedApplicationDetails.getRemarks());
			
			//save
			return newbprepo.save(newNewbpApprovedApplication);
			
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + newbp_id + "Does not Exist!");
		}
	}
	
	//update records
		public NewbpApprovedApplicationEntity evaluateApprovedBp(int id, NewbpApprovedApplicationEntity newNewbpApprovedApplicationDetails) throws Exception{
			
			NewbpApprovedApplicationEntity newNewbpApprovedApplication = new NewbpApprovedApplicationEntity();
			
			try {
				//search
				newNewbpApprovedApplication = newbprepo.findById(id).get();
				
				//update
				newNewbpApprovedApplication.setBspermit_no(newNewbpApprovedApplicationDetails.getBspermit_no());
				newNewbpApprovedApplication.setPermittee(newNewbpApprovedApplicationDetails.getPermittee());
				newNewbpApprovedApplication.setBusiness_name(newNewbpApprovedApplicationDetails.getBusiness_name());
				newNewbpApprovedApplication.setAddress(newNewbpApprovedApplicationDetails.getAddress());
				newNewbpApprovedApplication.setNature_business(newNewbpApprovedApplicationDetails.getNature_business());
				newNewbpApprovedApplication.setType_occupancy(newNewbpApprovedApplicationDetails.getType_occupancy());
				newNewbpApprovedApplication.setContact_no(newNewbpApprovedApplicationDetails.getContact_no());
				newNewbpApprovedApplication.setEmail(newNewbpApprovedApplicationDetails.getEmail());
				newNewbpApprovedApplication.setDate_received(newNewbpApprovedApplicationDetails.getDate_received());
				newNewbpApprovedApplication.setDate_inspection(newNewbpApprovedApplicationDetails.getDate_inspection());
				newNewbpApprovedApplication.setInspection_no(newNewbpApprovedApplicationDetails.getInspection_no());
				newNewbpApprovedApplication.setFsic_no(newNewbpApprovedApplicationDetails.getFsic_no());
				newNewbpApprovedApplication.setFsic_date(newNewbpApprovedApplicationDetails.getFsic_date());
				newNewbpApprovedApplication.setAmount(newNewbpApprovedApplicationDetails.getAmount());
				newNewbpApprovedApplication.setOr_no(newNewbpApprovedApplicationDetails.getOr_no());
				newNewbpApprovedApplication.setDate(newNewbpApprovedApplicationDetails.getDate());
				newNewbpApprovedApplication.setRemarks(newNewbpApprovedApplicationDetails.getRemarks());
				newNewbpApprovedApplication.setTeam_leader(newNewbpApprovedApplicationDetails.getTeam_leader());
				newNewbpApprovedApplication.setFireInspectors(newNewbpApprovedApplicationDetails.getFireInspectors());
				newNewbpApprovedApplication.setRecommendation(newNewbpApprovedApplicationDetails.getRecommendation());
				
				//save
				return newbprepo.save(newNewbpApprovedApplication);
				
			}catch(NoResultException nex) {
				throw new Exception("ID Number" + id + "Does not Exist!");
			}
		}
	
	//Add new Application
		 public NewbpApprovedApplicationEntity insertApprovedPermit(NewbpApprovedApplicationEntity permit) {
		        return newbprepo.save(permit);
		    }
		 
	//D - Delete a record
		  public String deleteItem(int id) {
		      String msg;
		      if(newbprepo.findById(id) != null) {
		    	  newbprepo.deleteById(id); //find the id number of the student to be deleted
		        msg = "Permit ID Number: " + id + " was successfully deleted!";
		      } else {
		            msg = "Permit ID Number: " + id + " was NOT found!";
		      }
		       
		      return msg;
		    }
	
}