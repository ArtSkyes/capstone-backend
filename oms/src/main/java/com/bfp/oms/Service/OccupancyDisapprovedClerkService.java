package com.bfp.oms.Service;

import java.util.List;
import org.aspectj.bridge.AbortException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bfp.oms.Entity.OccupancyDisapprovedClerkEntity;
import com.bfp.oms.Repository.OccupancyDisapprovedClerkRepository;


@Service
public class OccupancyDisapprovedClerkService {
	
	@Autowired
	OccupancyDisapprovedClerkRepository drepo;

	//read all records
	public List<OccupancyDisapprovedClerkEntity> getAllOccupancyDisapprovedClerk(){
		return drepo.findAll();
	}
	
	//update records
	public OccupancyDisapprovedClerkEntity putOccupancyDisapprovedClerkEntity(int id, OccupancyDisapprovedClerkEntity OccupancyDisapprovedClerkDetails) throws Exception {
		
		OccupancyDisapprovedClerkEntity OccupancyDisapprovedClerk = new OccupancyDisapprovedClerkEntity();
		
		try {
			//search
			OccupancyDisapprovedClerk = drepo.findById(id).get();
			
			//update
			OccupancyDisapprovedClerk.setRemarks(OccupancyDisapprovedClerkDetails.getRemarks());
			
			//save
			return drepo.save(OccupancyDisapprovedClerk);
		
		}catch(AbortException nex) {
			throw new Exception("ID Number" +id+ "Does not Exist!");
		}
	}
	
public OccupancyDisapprovedClerkEntity updateOccupancyDisapprovedClerk(int id, OccupancyDisapprovedClerkEntity OccupancyDisapprovedClerkDetails) throws Exception {
		
	OccupancyDisapprovedClerkEntity OccupancyDisapprovedClerk = new OccupancyDisapprovedClerkEntity();
		
		try {
			//search
			OccupancyDisapprovedClerk = drepo.findById(id).get();
			
			//update
			OccupancyDisapprovedClerk.setControl_no(OccupancyDisapprovedClerkDetails.getControl_no());
			OccupancyDisapprovedClerk.setApplicants_name(OccupancyDisapprovedClerkDetails.getApplicants_name());
			OccupancyDisapprovedClerk.setBldgpermit_no(OccupancyDisapprovedClerkDetails.getBldgpermit_no());
			OccupancyDisapprovedClerk.setLocation(OccupancyDisapprovedClerkDetails.getLocation());
			OccupancyDisapprovedClerk.setContact_no(OccupancyDisapprovedClerkDetails.getContact_no());
			OccupancyDisapprovedClerk.setProject_name(OccupancyDisapprovedClerkDetails.getProject_name());
			OccupancyDisapprovedClerk.setDate_received(OccupancyDisapprovedClerkDetails.getDate_received());
			OccupancyDisapprovedClerk.setInspection_no(OccupancyDisapprovedClerkDetails.getInspection_no());
			
			OccupancyDisapprovedClerk.setNod_date(OccupancyDisapprovedClerkDetails.getNod_date());
			OccupancyDisapprovedClerk.setNod_no(OccupancyDisapprovedClerkDetails.getNod_no());
			
			OccupancyDisapprovedClerk.setDefects(OccupancyDisapprovedClerkDetails.getDefects());
			
			OccupancyDisapprovedClerk.setName(OccupancyDisapprovedClerkDetails.getName());
			OccupancyDisapprovedClerk.setDate(OccupancyDisapprovedClerkDetails.getDate());
			OccupancyDisapprovedClerk.setRemarks(OccupancyDisapprovedClerkDetails.getRemarks());
			
		
			//save
			return drepo.save(OccupancyDisapprovedClerk);
		
		}catch(AbortException nex) {
			throw new Exception("ID Number" +id+ "Does not Exist!");
		}
	}
	

	//Add new Application
		 public OccupancyDisapprovedClerkEntity insertNodPermit(OccupancyDisapprovedClerkEntity permit) {
		        return drepo.save(permit);
		    }
		 
	//D - Delete a record
		 public String deleteItem(int id) {
		      String msg;
		      if(drepo.findById(id) != null) {
		    	  drepo.deleteById(id); //find the id number of the student to be deleted
		        msg = "Permit ID Number: " + id + " was successfully deleted!";
		      } else {
		            msg = "Permit ID Number: " + id + " was NOT found!";
		      }
		       
		      return msg;
		    }
	
	
}