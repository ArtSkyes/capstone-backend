package com.bfp.oms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bfp.oms.Entity.NewbpNoticeCorrectViolationEntity;
import com.bfp.oms.Repository.NewbpNoticeCorrecViolationRepository;

@Service
public class NewbpNoticeCorrectViolationService {
	
	@Autowired
	NewbpNoticeCorrecViolationRepository newncvrepo;
	
	//read all records
	public List<NewbpNoticeCorrectViolationEntity> getAllNewbpNoticeCorrectViolation(){
		return newncvrepo.findAll();
	}
	
	//update records
	public NewbpNoticeCorrectViolationEntity putNewbpNoticeCorrectViolation(int newncv_id, NewbpNoticeCorrectViolationEntity newNewbpNoticeCorrectViolationDetails) throws Exception{
		
		NewbpNoticeCorrectViolationEntity newNewbpNoticeCorrectViolation = new NewbpNoticeCorrectViolationEntity();
		
		try {
			//search
			newNewbpNoticeCorrectViolation = newncvrepo.findById(newncv_id).get();
			
			//update
			newNewbpNoticeCorrectViolation.setRemarks(newNewbpNoticeCorrectViolationDetails.getRemarks());
			
			//save
			return newncvrepo.saveAndFlush(newNewbpNoticeCorrectViolation);
			
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + newncv_id + "Doest not Exist!");
		}
		
	}
	
	//update records
		public NewbpNoticeCorrectViolationEntity updateNewbpNoticeCorrectViolation(int id, NewbpNoticeCorrectViolationEntity newNewbpNoticeCorrectViolationDetails) throws Exception{
			
			NewbpNoticeCorrectViolationEntity newNewbpNoticeCorrectViolation = new NewbpNoticeCorrectViolationEntity();
			
			try {
				//search
				newNewbpNoticeCorrectViolation = newncvrepo.findById(id).get();
				
				//update
				newNewbpNoticeCorrectViolation.setBspermit_no(newNewbpNoticeCorrectViolationDetails.getBspermit_no());
				newNewbpNoticeCorrectViolation.setPermittee(newNewbpNoticeCorrectViolationDetails.getPermittee());
				newNewbpNoticeCorrectViolation.setBusiness_name(newNewbpNoticeCorrectViolationDetails.getBusiness_name());
				newNewbpNoticeCorrectViolation.setAddress(newNewbpNoticeCorrectViolationDetails.getAddress());
				newNewbpNoticeCorrectViolation.setNature_business(newNewbpNoticeCorrectViolationDetails.getNature_business());
				newNewbpNoticeCorrectViolation.setType_occupancy(newNewbpNoticeCorrectViolationDetails.getType_occupancy());
				newNewbpNoticeCorrectViolation.setContact_no(newNewbpNoticeCorrectViolationDetails.getContact_no());
				newNewbpNoticeCorrectViolation.setEmail(newNewbpNoticeCorrectViolationDetails.getEmail());
				newNewbpNoticeCorrectViolation.setDate_received(newNewbpNoticeCorrectViolationDetails.getDate_received());
				newNewbpNoticeCorrectViolation.setDate_inspected(newNewbpNoticeCorrectViolationDetails.getDate_inspected());
				newNewbpNoticeCorrectViolation.setInspection_no(newNewbpNoticeCorrectViolationDetails.getInspection_no());
				newNewbpNoticeCorrectViolation.setNtc_no(newNewbpNoticeCorrectViolationDetails.getNtc_no());
				newNewbpNoticeCorrectViolation.setNtc_date(newNewbpNoticeCorrectViolationDetails.getNtc_date());
				newNewbpNoticeCorrectViolation.setNtcv_no(newNewbpNoticeCorrectViolationDetails.getNtcv_no());
				newNewbpNoticeCorrectViolation.setNtcv_date(newNewbpNoticeCorrectViolationDetails.getNtcv_date());
				newNewbpNoticeCorrectViolation.setTeam_leader(newNewbpNoticeCorrectViolationDetails.getTeam_leader());
				newNewbpNoticeCorrectViolation.setFire_inspectors(newNewbpNoticeCorrectViolationDetails.getFire_inspectors());
				newNewbpNoticeCorrectViolation.setDefects(newNewbpNoticeCorrectViolationDetails.getDefects());
				newNewbpNoticeCorrectViolation.setName(newNewbpNoticeCorrectViolationDetails.getName());
				newNewbpNoticeCorrectViolation.setDate(newNewbpNoticeCorrectViolationDetails.getDate());
				newNewbpNoticeCorrectViolation.setAdministrative_fine(newNewbpNoticeCorrectViolationDetails.getAdministrative_fine());
				newNewbpNoticeCorrectViolation.setRemarks(newNewbpNoticeCorrectViolationDetails.getRemarks());
				
				//save
				return newncvrepo.saveAndFlush(newNewbpNoticeCorrectViolation);
				
			}catch(NoResultException nex) {
				throw new Exception("ID Number" + id + "Doest not Exist!");
			}
			
		}
		
		//Insert Record
		 public NewbpNoticeCorrectViolationEntity insertNTCVPermit(NewbpNoticeCorrectViolationEntity permit) {
		        return newncvrepo.save(permit);
		    }
		 
		//D - Delete a record
		  public String deleteItem(int id) {
		      String msg;
		      if(newncvrepo.findById(id) != null) {
		    	  newncvrepo.deleteById(id); //find the id number of the student to be deleted
		        msg = "Permit ID Number: " + id + " was successfully deleted!";
		      } else {
		            msg = "Permit ID Number: " + id + " was NOT found!";
		      }
		       
		      return msg;
		    }
		 

}