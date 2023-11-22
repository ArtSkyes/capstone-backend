package com.bfp.oms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bfp.oms.Entity.RenewalbpNoticeCorrectViolationEntity;
import com.bfp.oms.Repository.RenewalbpNoticeCorrectViolationRepository;


@Service
public class RenewalbpNoticeCorrectViolationService {

	@Autowired
	RenewalbpNoticeCorrectViolationRepository renewcvrepo;
	
	
	//read all records
	public List<RenewalbpNoticeCorrectViolationEntity> getAllRenewalbpNoticeCorrectViolation(){
		return renewcvrepo.findAll();
	}
	
	public RenewalbpNoticeCorrectViolationEntity putRenewalbpNoticeCorrectViolation(int renewao_id, RenewalbpNoticeCorrectViolationEntity newRenewalbpNoticeCorrectViolationDetials) throws Exception{
		
		RenewalbpNoticeCorrectViolationEntity newRenewalbpNoticeCorrectViolation = new RenewalbpNoticeCorrectViolationEntity();
		
		try {
			//search
			newRenewalbpNoticeCorrectViolation = renewcvrepo.findById(renewao_id).get();
			
			//update
			newRenewalbpNoticeCorrectViolation.setRemarks(newRenewalbpNoticeCorrectViolationDetials.getRemarks());
		
			//save
			return renewcvrepo.save(newRenewalbpNoticeCorrectViolation);
		}catch(NoResultException nex) {
			throw new Exception("ID Number" +renewao_id+ "Does not Exsit!");
		}
	}
	

	
	
	public RenewalbpNoticeCorrectViolationEntity updateRenewalbpNoticeCorrectViolation(int id, RenewalbpNoticeCorrectViolationEntity newRenewalbpNoticeCorrectViolationDetials) throws Exception{
		
		RenewalbpNoticeCorrectViolationEntity newRenewalbpNoticeCorrectViolation = new RenewalbpNoticeCorrectViolationEntity();
		
		try {
			//search
			newRenewalbpNoticeCorrectViolation = renewcvrepo.findById(id).get();
			
			//update
			newRenewalbpNoticeCorrectViolation.setBspermit_no(newRenewalbpNoticeCorrectViolationDetials.getBspermit_no());
			newRenewalbpNoticeCorrectViolation.setPermittee(newRenewalbpNoticeCorrectViolationDetials.getPermittee());
			newRenewalbpNoticeCorrectViolation.setBusiness_name(newRenewalbpNoticeCorrectViolationDetials.getBusiness_name());
			newRenewalbpNoticeCorrectViolation.setAddress(newRenewalbpNoticeCorrectViolationDetials.getAddress());
			newRenewalbpNoticeCorrectViolation.setNature_business(newRenewalbpNoticeCorrectViolationDetials.getNature_business());
			newRenewalbpNoticeCorrectViolation.setType_occupancy(newRenewalbpNoticeCorrectViolationDetials.getType_occupancy());
			newRenewalbpNoticeCorrectViolation.setContact_no(newRenewalbpNoticeCorrectViolationDetials.getContact_no());
			newRenewalbpNoticeCorrectViolation.setEmail(newRenewalbpNoticeCorrectViolationDetials.getEmail());
			newRenewalbpNoticeCorrectViolation.setDate_received(newRenewalbpNoticeCorrectViolationDetials.getDate_received());
			newRenewalbpNoticeCorrectViolation.setDate_inspected(newRenewalbpNoticeCorrectViolationDetials.getDate_inspected());
			newRenewalbpNoticeCorrectViolation.setInspection_no(newRenewalbpNoticeCorrectViolationDetials.getInspection_no());
			newRenewalbpNoticeCorrectViolation.setNtc_no(newRenewalbpNoticeCorrectViolationDetials.getNtc_no());
			newRenewalbpNoticeCorrectViolation.setNtc_date(newRenewalbpNoticeCorrectViolationDetials.getNtc_date());
			newRenewalbpNoticeCorrectViolation.setNtcv_no(newRenewalbpNoticeCorrectViolationDetials.getNtcv_no());
			newRenewalbpNoticeCorrectViolation.setNtcv_date(newRenewalbpNoticeCorrectViolationDetials.getNtcv_date());
			newRenewalbpNoticeCorrectViolation.setTeam_leader(newRenewalbpNoticeCorrectViolationDetials.getTeam_leader());
			newRenewalbpNoticeCorrectViolation.setFire_inspector(newRenewalbpNoticeCorrectViolationDetials.getFire_inspector());
			newRenewalbpNoticeCorrectViolation.setDefects(newRenewalbpNoticeCorrectViolationDetials.getDefects());
			newRenewalbpNoticeCorrectViolation.setName(newRenewalbpNoticeCorrectViolationDetials.getName());
			newRenewalbpNoticeCorrectViolation.setDate(newRenewalbpNoticeCorrectViolationDetials.getDate());
			newRenewalbpNoticeCorrectViolation.setRemarks(newRenewalbpNoticeCorrectViolationDetials.getRemarks());
			newRenewalbpNoticeCorrectViolation.setAdministrative_fine(newRenewalbpNoticeCorrectViolationDetials.getAdministrative_fine());
			
			
			//save
			return renewcvrepo.save(newRenewalbpNoticeCorrectViolation);
		}catch(NoResultException nex) {
			throw new Exception("ID Number" +id+ "Does not Exsit!");
		}
	}
	
	
	//Add new Application
		 public RenewalbpNoticeCorrectViolationEntity insertNTCVPermit(RenewalbpNoticeCorrectViolationEntity permit) {
		        return renewcvrepo.save(permit);
		    }
		 
	//D - Delete a record
		 public String deleteItem(int id) {
		      String msg;
		      if(renewcvrepo.findById(id) != null) {
		    	  renewcvrepo.deleteById(id); //find the id number of the student to be deleted
		        msg = "Permit ID Number: " + id + " was successfully deleted!";
		      } else {
		            msg = "Permit ID Number: " + id + " was NOT found!";
		      }
		       
		      return msg;
		    }
	
	
}