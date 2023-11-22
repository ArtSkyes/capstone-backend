package com.bfp.oms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfp.oms.Entity.OccupancyApprovedClerkEntity;
import com.bfp.oms.Repository.OccupancyApprovedClerkRepository;


@Service
public class OccupancyApprovedClerkService {
	
	@Autowired
	OccupancyApprovedClerkRepository arepo;
	
	//read all records}
	public List<OccupancyApprovedClerkEntity> getAllApprovedApplication(){
		return arepo.findAll();
		
	}
	
	//Update New Applications		
		public OccupancyApprovedClerkEntity putApprovedApplication(int id, OccupancyApprovedClerkEntity newApprovedApplicationDetails) throws Exception{
			OccupancyApprovedClerkEntity newApprovedApplication = new OccupancyApprovedClerkEntity();
			
			try {
				//search
				newApprovedApplication = arepo.findById(id).get();
				
				//update
				newApprovedApplication.setControl_no(newApprovedApplicationDetails.getControl_no());
				newApprovedApplication.setApplicants_name(newApprovedApplicationDetails.getApplicants_name());
				newApprovedApplication.setBldgpermit_no(newApprovedApplicationDetails.getBldgpermit_no());
				newApprovedApplication.setLocation(newApprovedApplicationDetails.getLocation());
				newApprovedApplication.setProject_name(newApprovedApplicationDetails.getProject_name());
				newApprovedApplication.setContact_no(newApprovedApplicationDetails.getContact_no());
				newApprovedApplication.setDate_received(newApprovedApplicationDetails.getDate_received());
				newApprovedApplication.setFees(newApprovedApplicationDetails.getFees());
				
				newApprovedApplication.setFsic_date(newApprovedApplicationDetails.getFsic_date());
				newApprovedApplication.setFsic_no(newApprovedApplicationDetails.getFsic_no());
				
				newApprovedApplication.setAmount(newApprovedApplicationDetails.getAmount());
				newApprovedApplication.setOr_no(newApprovedApplicationDetails.getOr_no());
				newApprovedApplication.setPayment_date(newApprovedApplicationDetails.getPayment_date());
				
				newApprovedApplication.setAdditional_fees(newApprovedApplicationDetails.getAdditional_fees());
				newApprovedApplication.setAmount_additional(newApprovedApplicationDetails.getAmount_additional());
				newApprovedApplication.setOr_no_additional(newApprovedApplicationDetails.getOr_no_additional());
				newApprovedApplication.setPayment_date_additional(newApprovedApplicationDetails.getPayment_date_additional());
				
				
				newApprovedApplication.setRecommendations(newApprovedApplicationDetails.getRecommendations());
				
				newApprovedApplication.setInspection_no(newApprovedApplicationDetails.getInspection_no());
				newApprovedApplication.setRemarks(newApprovedApplicationDetails.getRemarks());
				
				//save
				return arepo.save(newApprovedApplication);
				
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + id + "Does not exist!");
		}
	}
		//Add new Application
		 public OccupancyApprovedClerkEntity insertNodPermit(OccupancyApprovedClerkEntity permit) {
		        return arepo.save(permit);
		    }
		 
	//D - Delete a record
		 public String deleteItem(int id) {
		      String msg;
		      if(arepo.findById(id) != null) {
		    	  arepo.deleteById(id); //find the id number of the student to be deleted
		        msg = "Permit ID Number: " + id + " was successfully deleted!";
		      } else {
		            msg = "Permit ID Number: " + id + " was NOT found!";
		      }
		       
		      return msg;
		    }
			

}