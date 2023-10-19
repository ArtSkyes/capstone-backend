package com.cituccs.bfp.Service;

import java.util.List;

import org.aspectj.bridge.AbortException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cituccs.bfp.Entity.BPPendingApplications;
import com.cituccs.bfp.Repository.BPPendingApplicationsRepository;

@Service
public class BPPendingService {

	@Autowired
	BPPendingApplicationsRepository brepo;
	
	//read all records
		public List<BPPendingApplications> getAllPendingApplications(){
			 return brepo.findAll();
		}
		
		//Add new Application
		public BPPendingApplications insertBPPendingPermit(BPPendingApplications permit) {
			 return brepo.save(permit);
		 }
		
		//update Application
		public BPPendingApplications updatePendingApplication(int id, BPPendingApplications newDetails) throws Exception {
			
			BPPendingApplications newBPPendingApplications = new BPPendingApplications();
			
			try {
				//search
				newBPPendingApplications = brepo.findById(id).get();
				
				//update
				newBPPendingApplications.setBspermit_no(newDetails.getBspermit_no());
				newBPPendingApplications.setPermittee(newDetails.getPermittee());
				newBPPendingApplications.setBusiness_name(newDetails.getBusiness_name());
				newBPPendingApplications.setAddress(newDetails.getAddress());
				newBPPendingApplications.setNature_business(newDetails.getNature_business());
				newBPPendingApplications.setType_occupancy(newDetails.getType_occupancy());
				newBPPendingApplications.setContact_no(newDetails.getContact_no());
				newBPPendingApplications.setEmail(newDetails.getEmail());
				newBPPendingApplications.setDate_received(newDetails.getDate_received());
				
				
				System.out.println(newDetails.getBspermit_no());
				System.out.println(newDetails.getPermittee());
				System.out.println(newDetails.getBusiness_name());
				System.out.println(newDetails.getAddress());
				System.out.println(newDetails.getNature_business());
				System.out.println(newDetails.getType_occupancy());
				System.out.println(newDetails.getContact_no());
				System.out.println(newDetails.getEmail());
				System.out.println(newDetails.getDate_received());
				
				//save
				return brepo.save(newBPPendingApplications);
			
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
