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
	OccupancyDisapprovedClerkRepository odcrepo;
	
	//read all records
	public List<OccupancyDisapprovedClerkEntity> getAllOccupancyDisapprovedClerk(){
		return odcrepo.findAll();
	}
	
	//update records
	public OccupancyDisapprovedClerkEntity putOccupancyDisapprovedClerkEntity(int occupancydisapprovedclerk_id, OccupancyDisapprovedClerkEntity OccupancyDisapprovedClerkDetails) throws Exception {
		
		OccupancyDisapprovedClerkEntity OccupancyDisapprovedClerk = new OccupancyDisapprovedClerkEntity();
		
		try {
			//search
			OccupancyDisapprovedClerk = odcrepo.findById(occupancydisapprovedclerk_id).get();
			
			//update
			OccupancyDisapprovedClerk.setDeficiencies(OccupancyDisapprovedClerkDetails.getDeficiencies());
			
			//save
			return odcrepo.save(OccupancyDisapprovedClerk);
		
		}catch(AbortException nex) {
			throw new Exception("ID Number" +occupancydisapprovedclerk_id+ "Does not Exist!");
		}
	}
	
public OccupancyDisapprovedClerkEntity updateOccupancyDisapprovedClerk(int id, OccupancyDisapprovedClerkEntity OccupancyDisapprovedClerkDetails) throws Exception {
		
		OccupancyDisapprovedClerkEntity OccupancyDisapprovedClerk = new OccupancyDisapprovedClerkEntity();
		
		try {
			//search
			OccupancyDisapprovedClerk = odcrepo.findById(id).get();
			
			//update
			OccupancyDisapprovedClerk.setControl_no(OccupancyDisapprovedClerkDetails.getControl_no());
			OccupancyDisapprovedClerk.setApplicant_name(OccupancyDisapprovedClerkDetails.getApplicant_name());
			OccupancyDisapprovedClerk.setBuilding_no(OccupancyDisapprovedClerkDetails.getBuilding_no());
			OccupancyDisapprovedClerk.setAddress(OccupancyDisapprovedClerkDetails.getAddress());
			OccupancyDisapprovedClerk.setProject_name(OccupancyDisapprovedClerkDetails.getProject_name());
			OccupancyDisapprovedClerk.setDate_received(OccupancyDisapprovedClerkDetails.getDate_received());
			OccupancyDisapprovedClerk.setNod_date(OccupancyDisapprovedClerkDetails.getNod_date());
			OccupancyDisapprovedClerk.setInspection_no(OccupancyDisapprovedClerkDetails.getInspection_no());
			OccupancyDisapprovedClerk.setNod_no(OccupancyDisapprovedClerkDetails.getNod_no());
			OccupancyDisapprovedClerk.setAssessment_fees(OccupancyDisapprovedClerkDetails.getAssessment_fees());
			OccupancyDisapprovedClerk.setDeficiencies(OccupancyDisapprovedClerkDetails.getDeficiencies());
			OccupancyDisapprovedClerk.setReceived_name(OccupancyDisapprovedClerkDetails.getReceived_name());
			OccupancyDisapprovedClerk.setReceivednod_date(OccupancyDisapprovedClerkDetails.getReceivednod_date());
		
			//save
			return odcrepo.save(OccupancyDisapprovedClerk);
		
		}catch(AbortException nex) {
			throw new Exception("ID Number" +id+ "Does not Exist!");
		}
	}
	

	//Add new Application
		 public OccupancyDisapprovedClerkEntity insertNodPermit(OccupancyDisapprovedClerkEntity permit) {
		        return odcrepo.save(permit);
		    }
		 
	//D - Delete a record
		 public String deleteItem(int id) {
		      String msg;
		      if(odcrepo.findById(id) != null) {
		    	  odcrepo.deleteById(id); //find the id number of the student to be deleted
		        msg = "Permit ID Number: " + id + " was successfully deleted!";
		      } else {
		            msg = "Permit ID Number: " + id + " was NOT found!";
		      }
		       
		      return msg;
		    }
	
}
