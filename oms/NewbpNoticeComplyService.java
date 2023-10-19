package com.cituccs.bfp.Service;

import java.util.List;

import org.aspectj.bridge.AbortException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cituccs.bfp.Entity.NewbpNoticeComplyEntity;
import com.cituccs.bfp.Repository.NewbpNoticeComplyRepository;


@Service
public class NewbpNoticeComplyService {
	
	@Autowired
	NewbpNoticeComplyRepository newncrepo;
	
	//read all records
	public List<NewbpNoticeComplyEntity> getAllNewbpNoticeComply(){
		return newncrepo.findAll();
	}
	
	//update records
	public NewbpNoticeComplyEntity putNewbpNoticeComply(int newnoticecomply_id, NewbpNoticeComplyEntity newNewbpNoticeComplyDetails) throws Exception {
		
		NewbpNoticeComplyEntity newNewbpNoticeComply = new NewbpNoticeComplyEntity();
		
		try {
			//search
			newNewbpNoticeComply = newncrepo.findById(newnoticecomply_id).get();
			
			//update
			newNewbpNoticeComply.setRemarks(newNewbpNoticeComplyDetails.getRemarks());
			
			//save
			return newncrepo.save(newNewbpNoticeComply);
		
		}catch(AbortException nex) {
			throw new Exception("ID Number" +newnoticecomply_id+ "Does not Exist!");
		}
	}
	
public NewbpNoticeComplyEntity updateNewbpNoticeComply(int id, NewbpNoticeComplyEntity newNewbpNoticeComplyDetails) throws Exception {
		
		NewbpNoticeComplyEntity newNewbpNoticeComply = new NewbpNoticeComplyEntity();
		
		try {
			//search
			newNewbpNoticeComply = newncrepo.findById(id).get();
			
			//update
			newNewbpNoticeComply.setBspermit_no(newNewbpNoticeComplyDetails.getBspermit_no());
			newNewbpNoticeComply.setPermittee(newNewbpNoticeComplyDetails.getPermittee());
			newNewbpNoticeComply.setBusiness_name(newNewbpNoticeComplyDetails.getBusiness_name());
			newNewbpNoticeComply.setAddress(newNewbpNoticeComplyDetails.getAddress());
			newNewbpNoticeComply.setNature_business(newNewbpNoticeComplyDetails.getNature_business());
			newNewbpNoticeComply.setType_occupancy(newNewbpNoticeComplyDetails.getType_occupancy());
			newNewbpNoticeComply.setContact_no(newNewbpNoticeComplyDetails.getContact_no());
			newNewbpNoticeComply.setEmail(newNewbpNoticeComplyDetails.getEmail());
			newNewbpNoticeComply.setDate_received(newNewbpNoticeComplyDetails.getDate_received());
			newNewbpNoticeComply.setDate_inspection(newNewbpNoticeComplyDetails.getDate_inspection());
			newNewbpNoticeComply.setInspection_no(newNewbpNoticeComplyDetails.getInspection_no());
			newNewbpNoticeComply.setRemarks(newNewbpNoticeComplyDetails.getRemarks());
			newNewbpNoticeComply.setDate_inspection(newNewbpNoticeComplyDetails.getDate_inspection());
			newNewbpNoticeComply.setInspection_no(newNewbpNoticeComplyDetails.getInspection_no());
			newNewbpNoticeComply.setNtc_no(newNewbpNoticeComplyDetails.getNtc_no());
			newNewbpNoticeComply.setNtc_date(newNewbpNoticeComplyDetails.getNtc_date());
			newNewbpNoticeComply.setTeam_leader(newNewbpNoticeComplyDetails.getTeam_leader());
			newNewbpNoticeComply.setFireInspectors(newNewbpNoticeComplyDetails.getFireInspectors());
			newNewbpNoticeComply.setDefects(newNewbpNoticeComplyDetails.getDefects());
			newNewbpNoticeComply.setReceived_name(newNewbpNoticeComplyDetails.getReceived_name());
			newNewbpNoticeComply.setReceivedntc_date(newNewbpNoticeComplyDetails.getReceivedntc_date());
			newNewbpNoticeComply.setStatus(newNewbpNoticeComplyDetails.getStatus());
		
			//save
			return newncrepo.save(newNewbpNoticeComply);
		
		}catch(AbortException nex) {
			throw new Exception("ID Number" +id+ "Does not Exist!");
		}
	}
	

	//Add new Application
		 public NewbpNoticeComplyEntity insertNTCPermit(NewbpNoticeComplyEntity permit) {
		        return newncrepo.save(permit);
		    }
		 
	//D - Delete a record
		 public String deleteItem(int id) {
		      String msg;
		      if(newncrepo.findById(id) != null) {
		    	  newncrepo.deleteById(id); //find the id number of the student to be deleted
		        msg = "Permit ID Number: " + id + " was successfully deleted!";
		      } else {
		            msg = "Permit ID Number: " + id + " was NOT found!";
		      }
		       
		      return msg;
		    }
	
	

}
