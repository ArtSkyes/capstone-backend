package com.bfp.oms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bfp.oms.Entity.RenewalbpNoticeComplyEntity;
import com.bfp.oms.Repository.RenewalbpNoticeComplyRepository;


@Service
public class RenewalbpNoticeComplyService {

	@Autowired
	RenewalbpNoticeComplyRepository renewncrepo;
	
	//read all records
	public List<RenewalbpNoticeComplyEntity> getAllRenewalbpNoticeComply(){
		return renewncrepo.findAll();
	}
	
	//update records
	public RenewalbpNoticeComplyEntity putRenewalbpNoticeComply(int id, RenewalbpNoticeComplyEntity newRenewalbpNoticeComplyDetails) throws Exception{
		
		RenewalbpNoticeComplyEntity newRenewalbpNoticeComply = new RenewalbpNoticeComplyEntity();
		
		try {
			//search
			newRenewalbpNoticeComply = renewncrepo.findById(id).get();
			
			//update
			newRenewalbpNoticeComply.setRemarks(newRenewalbpNoticeComplyDetails.getRemarks());
			
			//save
			return renewncrepo.save(newRenewalbpNoticeComply);
		}catch(NoResultException nex) {
			throw new Exception("ID Number" +id+ "Does not Exist!");
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
			newRenewalbpNoticeComply.setDate_inspected(newRenewalbpNoticeComplyDetails.getDate_inspected());
			newRenewalbpNoticeComply.setInspection_no(newRenewalbpNoticeComplyDetails.getInspection_no());
			newRenewalbpNoticeComply.setNtc_no(newRenewalbpNoticeComplyDetails.getNtc_no());
			newRenewalbpNoticeComply.setNtc_date(newRenewalbpNoticeComplyDetails.getNtc_date());
			newRenewalbpNoticeComply.setTeam_leader(newRenewalbpNoticeComplyDetails.getTeam_leader());
			newRenewalbpNoticeComply.setFire_inspector(newRenewalbpNoticeComplyDetails.getFire_inspector());
			newRenewalbpNoticeComply.setDefects(newRenewalbpNoticeComplyDetails.getDefects());
			newRenewalbpNoticeComply.setName(newRenewalbpNoticeComplyDetails.getName());
			newRenewalbpNoticeComply.setDate(newRenewalbpNoticeComplyDetails.getDate());
			newRenewalbpNoticeComply.setAdministrative_fine(newRenewalbpNoticeComplyDetails.getAdministrative_fine());
			newRenewalbpNoticeComply.setRemarks(newRenewalbpNoticeComplyDetails.getRemarks());
			
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