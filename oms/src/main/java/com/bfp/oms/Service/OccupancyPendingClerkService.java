package com.bfp.oms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfp.oms.Entity.OccupancyPendingClerkEntity;
import com.bfp.oms.Repository.OccupancyPendingClerkRepository;

@Service
public class OccupancyPendingClerkService {

	@Autowired
	OccupancyPendingClerkRepository orepo;
	
	//read all records
	public List<OccupancyPendingClerkEntity> getAllPendingOccupancy(){
		return orepo.findAll();
	}
	

	//update records
	public OccupancyPendingClerkEntity updateOccupancyPending(int id, OccupancyPendingClerkEntity newOccupancyDetails) throws Exception{
		
		OccupancyPendingClerkEntity newOccupancy = new OccupancyPendingClerkEntity(); 
		
		try {
			//search
			newOccupancy = orepo.findById(id).get();
			
			//update
			newOccupancy.setControl_no(newOccupancyDetails.getControl_no());
			newOccupancy.setBldgpermit_no(newOccupancyDetails.getBldgpermit_no());
			newOccupancy.setApplicants_name(newOccupancyDetails.getApplicants_name());
			newOccupancy.setProject_name(newOccupancyDetails.getProject_name());
			newOccupancy.setLocation(newOccupancyDetails.getLocation());
			newOccupancy.setContact_no(newOccupancyDetails.getContact_no());
			newOccupancy.setFees(newOccupancyDetails.getFees());
			newOccupancy.setDate_received(newOccupancyDetails.getDate_received());
			
			newOccupancy.setTeam_leader(newOccupancyDetails.getTeam_leader());
			newOccupancy.setFireInspectors(newOccupancyDetails.getFireInspectors());
			newOccupancy.setInspection_no(newOccupancyDetails.getInspection_no());
			newOccupancy.setDate_inspection(newOccupancyDetails.getDate_inspection());
			newOccupancy.setReceived_name(newOccupancyDetails.getReceived_name());
			newOccupancy.setReceivedoccu_date(newOccupancyDetails.getReceivedoccu_date());
			
			newOccupancy.setRemarks(newOccupancyDetails.getRemarks());
			
			
			
			//save
			return orepo.save(newOccupancy);
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + id + "Does not Exist!");
		}
	}
	
	
	//Add new Application
		 public OccupancyPendingClerkEntity insertOccupancyPending(OccupancyPendingClerkEntity permit) {
		        return orepo.save(permit);
		    }
		 
	//D - Delete a record
		 public String deleteItem(int id) {
		      String msg;
		      if(orepo.findById(id) != null) {
		    	  orepo.deleteById(id); //find the id number of the student to be deleted
		        msg = "Permit ID Number: " + id + " was successfully deleted!";
		      } else {
		            msg = "Permit ID Number: " + id + " was NOT found!";
		      }
		       
		      return msg;
		    }
}