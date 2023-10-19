package com.cituccs.bfp.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cituccs.bfp.Entity.RenewalbpNoticeComplyEntity;
import com.cituccs.bfp.Repository.RenewalbpNoticeComplyRepository;


@Service
public class RenewalbpNoticeComplyService {

	@Autowired
	RenewalbpNoticeComplyRepository renewncrepo;
	
	//read all records
	public List<RenewalbpNoticeComplyEntity> getAllRenewalbpNoticeComply(){
		return renewncrepo.findAll();
	}
	
	//update records
	public RenewalbpNoticeComplyEntity putRenewalbpNoticeComply(int renewnc_id, RenewalbpNoticeComplyEntity newRenewalbpNoticeComplyDetails) throws Exception{
		
		RenewalbpNoticeComplyEntity newRenewalbpNoticeComply = new RenewalbpNoticeComplyEntity();
		
		try {
			//search
			newRenewalbpNoticeComply = renewncrepo.findById(renewnc_id).get();
			
			//update
			newRenewalbpNoticeComply.setStatus(newRenewalbpNoticeComplyDetails.getStatus());
			
			//save
			return renewncrepo.save(newRenewalbpNoticeComply);
		}catch(NoResultException nex) {
			throw new Exception("ID Number" +renewnc_id+ "Does not Exist!");
		}
	}
	
	//update records
	public RenewalbpNoticeComplyEntity updateRenewalbpNoticeComply(int id, RenewalbpNoticeComplyEntity newRenewalbpNoticeComplyDetails) throws Exception{
		
		RenewalbpNoticeComplyEntity newRenewalbpNoticeComply = new RenewalbpNoticeComplyEntity();
		
		try {
			//search
			newRenewalbpNoticeComply = renewncrepo.findById(id).get();
			
			//update
			newRenewalbpNoticeComply.setBspermit_no(newRenewalbpNoticeComplyDetails.getBspermit_no());
			newRenewalbpNoticeComply.setPermittee(newRenewalbpNoticeComplyDetails.getPermittee());
			newRenewalbpNoticeComply.setBusiness_name(newRenewalbpNoticeComplyDetails.getBusiness_name());
			newRenewalbpNoticeComply.setAddress(newRenewalbpNoticeComplyDetails.getAddress());
			newRenewalbpNoticeComply.setNature_business(newRenewalbpNoticeComplyDetails.getNature_business());
			newRenewalbpNoticeComply.setType_occupancy(newRenewalbpNoticeComplyDetails.getType_occupancy());
			newRenewalbpNoticeComply.setContact_no(newRenewalbpNoticeComplyDetails.getContact_no());
			newRenewalbpNoticeComply.setEmail(newRenewalbpNoticeComplyDetails.getEmail());
			newRenewalbpNoticeComply.setDate_received(newRenewalbpNoticeComplyDetails.getDate_received());
			newRenewalbpNoticeComply.setDate_inspection(newRenewalbpNoticeComplyDetails.getDate_inspection());
			newRenewalbpNoticeComply.setInspection_no(newRenewalbpNoticeComplyDetails.getInspection_no());
			newRenewalbpNoticeComply.setRemarks(newRenewalbpNoticeComplyDetails.getRemarks());
			newRenewalbpNoticeComply.setDate_inspection(newRenewalbpNoticeComplyDetails.getDate_inspection());
			newRenewalbpNoticeComply.setInspection_no(newRenewalbpNoticeComplyDetails.getInspection_no());
			newRenewalbpNoticeComply.setNtc_no(newRenewalbpNoticeComplyDetails.getNtc_no());
			newRenewalbpNoticeComply.setNtc_date(newRenewalbpNoticeComplyDetails.getNtc_date());
			newRenewalbpNoticeComply.setTeam_leader(newRenewalbpNoticeComplyDetails.getTeam_leader());
			newRenewalbpNoticeComply.setFireInspectors(newRenewalbpNoticeComplyDetails.getFireInspectors());
			newRenewalbpNoticeComply.setDefects(newRenewalbpNoticeComplyDetails.getDefects());
			newRenewalbpNoticeComply.setReceived_name(newRenewalbpNoticeComplyDetails.getReceived_name());
			newRenewalbpNoticeComply.setReceivedntc_date(newRenewalbpNoticeComplyDetails.getReceivedntc_date());
			newRenewalbpNoticeComply.setStatus(newRenewalbpNoticeComplyDetails.getStatus());
			
			//save
			return renewncrepo.save(newRenewalbpNoticeComply);
		}catch(NoResultException nex) {
			throw new Exception("ID Number" +id+ "Does not Exist!");
		}
	}
	
	
	//Add new Application
		 public RenewalbpNoticeComplyEntity insertNTCPermit(RenewalbpNoticeComplyEntity permit) {
		        return renewncrepo.save(permit);
		    }
	//D - Delete a record
		 public String deleteItem(int id) {
		      String msg;
		      if(renewncrepo.findById(id) != null) {
		    	  renewncrepo.deleteById(id); //find the id number of the student to be deleted
		        msg = "Permit ID Number: " + id + " was successfully deleted!";
		      } else {
		            msg = "Permit ID Number: " + id + " was NOT found!";
		      }
		       
		      return msg;
		    }
		 
}
