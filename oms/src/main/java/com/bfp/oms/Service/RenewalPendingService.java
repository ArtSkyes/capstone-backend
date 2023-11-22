package com.bfp.oms.Service;

import java.util.List;

import org.aspectj.bridge.AbortException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bfp.oms.Entity.RenewalPendingApplications;
import com.bfp.oms.Repository.RenewalPendingApplicationsRepository;

@Service
public class RenewalPendingService {

	@Autowired
	RenewalPendingApplicationsRepository brepo;
	
	//read all records
		public List<RenewalPendingApplications> getAllPendingApplications(){
			 return brepo.findAll();
		}
		
		//Add new Application
		public RenewalPendingApplications insertRenewalPendingPermit(RenewalPendingApplications permit) {
			 return brepo.save(permit);
		 }
		
		//update Application
		public RenewalPendingApplications updatePendingApplication(int id, RenewalPendingApplications newRenewalPendingApplications) throws Exception {
			
			RenewalPendingApplications RenewalPendingApplication = new RenewalPendingApplications();
			
			try {
				//search
				RenewalPendingApplication = brepo.findById(id).get();
				
				//update
			
				RenewalPendingApplication.setBspermit_no(newRenewalPendingApplications.getBspermit_no());
				RenewalPendingApplication.setPermittee(newRenewalPendingApplications.getPermittee());
				RenewalPendingApplication.setBusiness_name(newRenewalPendingApplications.getBusiness_name());
				RenewalPendingApplication.setAddress(newRenewalPendingApplications.getAddress());
				RenewalPendingApplication.setNature_business(newRenewalPendingApplications.getNature_business());
				RenewalPendingApplication.setType_occupancy(newRenewalPendingApplications.getType_occupancy());
				RenewalPendingApplication.setContact_no(newRenewalPendingApplications.getContact_no());
				RenewalPendingApplication.setEmail(newRenewalPendingApplications.getEmail());
				RenewalPendingApplication.setDate_received(newRenewalPendingApplications.getDate_received());
				
				
				//save
				return brepo.save(RenewalPendingApplication);
			
			}catch(AbortException nex) {
				throw new Exception("ID Number" +id+ "Does not Exist!");
			}
		}
		 //D - Delete a course permit
	    public String deletePermit(int controlno) {
	        String msg;
	        if(brepo.findById(controlno) != null) {
	        	brepo.deleteById(controlno); //find the id number of the student to be deleted
	            msg = "Item ID Number: " + controlno + " was successfully deleted!";
	        } else {
	            msg = "Item ID Number: " + controlno + " was NOT found!";
	        }
	        
	        return msg;
	    }
		
}
