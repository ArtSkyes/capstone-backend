package com.cituccs.bfp.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cituccs.bfp.Entity.NewbpAbatementOrderEntity;
import com.cituccs.bfp.Repository.NewbpAbatementOrderRepository;



@Service
public class NewbpAbatementOrderService {

	@Autowired
	NewbpAbatementOrderRepository newaorepo;
	
	//read all records
	public List<NewbpAbatementOrderEntity> getAllNewbpAbatementOrder(){
		return newaorepo.findAll();
	}
	
	//update records
	public NewbpAbatementOrderEntity putNewbpAbatementOrder(int newao_id, NewbpAbatementOrderEntity newNewbpAbatementOrderDetails) throws Exception {
		
		NewbpAbatementOrderEntity newNewbpAbatementOrder = new NewbpAbatementOrderEntity();
		
		try {
			//search
			newNewbpAbatementOrder = newaorepo.findById(newao_id).get();
			
			//update
			newNewbpAbatementOrder.setStatus(newNewbpAbatementOrderDetails.getStatus());
			
			//save
			return newaorepo.save(newNewbpAbatementOrder);
		
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + newao_id + "Does not Exist!");
		}
	}
	
	//update records
	public NewbpAbatementOrderEntity updateNewbpAbatementOrder(int id, NewbpAbatementOrderEntity newNewbpAbatementOrderDetails) throws Exception {
		
		NewbpAbatementOrderEntity newNewbpAbatementOrder = new NewbpAbatementOrderEntity();
		
		try {
			//search
			newNewbpAbatementOrder = newaorepo.findById(id).get();
			
			//update
			newNewbpAbatementOrder.setBspermit_no(newNewbpAbatementOrderDetails.getBspermit_no());
			newNewbpAbatementOrder.setPermittee(newNewbpAbatementOrderDetails.getPermittee());
			newNewbpAbatementOrder.setBusiness_name(newNewbpAbatementOrderDetails.getBusiness_name());
			newNewbpAbatementOrder.setAddress(newNewbpAbatementOrderDetails.getAddress());
			newNewbpAbatementOrder.setNature_business(newNewbpAbatementOrderDetails.getNature_business());
			newNewbpAbatementOrder.setType_occupancy(newNewbpAbatementOrderDetails.getType_occupancy());
			newNewbpAbatementOrder.setContact_no(newNewbpAbatementOrderDetails.getContact_no());
			newNewbpAbatementOrder.setEmail(newNewbpAbatementOrderDetails.getEmail());
			newNewbpAbatementOrder.setDate_received(newNewbpAbatementOrderDetails.getDate_received());
			newNewbpAbatementOrder.setDate_inspection(newNewbpAbatementOrderDetails.getDate_inspection());
			newNewbpAbatementOrder.setInspection_no(newNewbpAbatementOrderDetails.getInspection_no());
			newNewbpAbatementOrder.setRemarks(newNewbpAbatementOrderDetails.getRemarks());
			newNewbpAbatementOrder.setDate_inspection(newNewbpAbatementOrderDetails.getDate_inspection());
			newNewbpAbatementOrder.setInspection_no(newNewbpAbatementOrderDetails.getInspection_no());
			newNewbpAbatementOrder.setNtc_no(newNewbpAbatementOrderDetails.getNtc_no());
			newNewbpAbatementOrder.setNtc_date(newNewbpAbatementOrderDetails.getNtc_date());
			newNewbpAbatementOrder.setNtcv_no(newNewbpAbatementOrderDetails.getNtcv_no());
			newNewbpAbatementOrder.setNtcv_date(newNewbpAbatementOrderDetails.getNtcv_date());
			newNewbpAbatementOrder.setAbatement_no(newNewbpAbatementOrderDetails.getAbatement_no());
			newNewbpAbatementOrder.setAbatement_date(newNewbpAbatementOrderDetails.getAbatement_date());
			newNewbpAbatementOrder.setTeam_leader(newNewbpAbatementOrderDetails.getTeam_leader());
			newNewbpAbatementOrder.setFireInspectors(newNewbpAbatementOrderDetails.getFireInspectors());
			newNewbpAbatementOrder.setDefects(newNewbpAbatementOrderDetails.getDefects());
			newNewbpAbatementOrder.setReceived_name(newNewbpAbatementOrderDetails.getReceived_name());
			newNewbpAbatementOrder.setReceivedabatement_date(newNewbpAbatementOrderDetails.getReceivedabatement_date());
			newNewbpAbatementOrder.setStatus(newNewbpAbatementOrderDetails.getStatus());
			
			
			//save
			return newaorepo.save(newNewbpAbatementOrder);
		
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + id + "Does not Exist!");
		}
	}
	
	//Insert Record
	 public NewbpAbatementOrderEntity insertAbatementPermit(NewbpAbatementOrderEntity permit) {
	        return newaorepo.save(permit);
}
	 
	//D - Delete a record
	 public String deleteItem(int id) {
	      String msg;
	      if(newaorepo.findById(id) != null) {
	    	  newaorepo.deleteById(id); //find the id number of the student to be deleted
	        msg = "Permit ID Number: " + id + " was successfully deleted!";
	      } else {
	            msg = "Permit ID Number: " + id + " was NOT found!";
	      }
	       
	      return msg;
	    }
	
}
