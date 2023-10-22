package com.bfp.oms.Service;

import java.util.List;

import org.aspectj.bridge.AbortException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfp.oms.Entity.OccupancyPendingClerkEntity;
import com.bfp.oms.Repository.OccupancyPendingClerkRepository;


@Service
public class OccupancyPendingClerkService {
	@Autowired
	OccupancyPendingClerkRepository opcrepo;
	
	//read all records
	public List<OccupancyPendingClerkEntity> getAllOccupancyPendingClerk(){
		return opcrepo.findAll();
	}
	
	//update records
	public OccupancyPendingClerkEntity putOccupancyPendingClerkEntity(int occupancyPendingclerk_id, OccupancyPendingClerkEntity OccupancyPendingClerkDetails) throws Exception {
		
		OccupancyPendingClerkEntity OccupancyPendingClerk = new OccupancyPendingClerkEntity();
		
		try {
			//search
			OccupancyPendingClerk = opcrepo.findById(occupancyPendingclerk_id).get();
			
			//update
			OccupancyPendingClerk.setapplication_no(OccupancyPendingClerkDetails.getapplication_no());
			
			//save
			return opcrepo.save(OccupancyPendingClerk);
		
		}catch(AbortException nex) {
			throw new Exception("ID Number" +occupancyPendingclerk_id+ "Does not Exist!");
		}
	}
	
public OccupancyPendingClerkEntity updateOccupancyPendingClerk(int id, OccupancyPendingClerkEntity OccupancyPendingClerkDetails) throws Exception {
		
		OccupancyPendingClerkEntity OccupancyPendingClerk = new OccupancyPendingClerkEntity();
		
		try {
			//search
			OccupancyPendingClerk = opcrepo.findById(id).get();
			
			//update
			OccupancyPendingClerk.setapplication_no(OccupancyPendingClerkDetails.getapplication_no());
			OccupancyPendingClerk.setApplicant_name(OccupancyPendingClerkDetails.getApplicant_name());
			OccupancyPendingClerk.setBuilding_no(OccupancyPendingClerkDetails.getBuilding_no());
			OccupancyPendingClerk.setProject_name(OccupancyPendingClerkDetails.getProject_name());
			OccupancyPendingClerk.setDate_received(OccupancyPendingClerkDetails.getDate_received());
			OccupancyPendingClerk.setAssessment_fees(OccupancyPendingClerkDetails.getAssessment_fees());
			OccupancyPendingClerk.setLocation(OccupancyPendingClerkDetails.getLocation());
			OccupancyPendingClerk.setContact_no(OccupancyPendingClerkDetails.getContact_no());
		
			//save
			return opcrepo.save(OccupancyPendingClerk);
		
		}catch(AbortException nex) {
			throw new Exception("ID Number" +id+ "Does not Exist!");
		}
	}
	

	//Add new Application
		 public OccupancyPendingClerkEntity insertNodPermit(OccupancyPendingClerkEntity permit) {
		        return opcrepo.save(permit);
		    }
		 
	//D - Delete a record
		 public String deleteItem(int id) {
		      String msg;
		      if(opcrepo.findById(id) != null) {
		    	  opcrepo.deleteById(id); //find the id number of the student to be deleted
		        msg = "Permit ID Number: " + id + " was successfully deleted!";
		      } else {
		            msg = "Permit ID Number: " + id + " was NOT found!";
		      }
		       
		      return msg;
		    }
	
}
