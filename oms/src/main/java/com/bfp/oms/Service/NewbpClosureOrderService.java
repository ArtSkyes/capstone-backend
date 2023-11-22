package com.bfp.oms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfp.oms.Entity.NewbpClosureOrderEntity;
import com.bfp.oms.Repository.NewbpClosureOrderRepository;



@Service
public class NewbpClosureOrderService {
	
	@Autowired
	NewbpClosureOrderRepository newcorepo;

	
	//read all records
	public List<NewbpClosureOrderEntity> getAllNewbpClosureOrder(){
		return newcorepo.findAll();
		
	}
	
	//update records
	public NewbpClosureOrderEntity putNewbpClosureOrder(int id, NewbpClosureOrderEntity newNewbpClosureOrderDetails) throws Exception{
		
		NewbpClosureOrderEntity newNewbpClosureOrder = new NewbpClosureOrderEntity();
		
		try {
			//search
			newNewbpClosureOrder = newcorepo.findById(id).get();
			
			//update
			newNewbpClosureOrder.setRemarks(newNewbpClosureOrderDetails.getRemarks());
			
			//save
			return newcorepo.save(newNewbpClosureOrder);
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + id + "Does not Exist!");
		}
		
	}
	//update records
	public NewbpClosureOrderEntity updateNewbpClosureOrder(int id, NewbpClosureOrderEntity newNewbpClosureOrderDetails) throws Exception{
		
		NewbpClosureOrderEntity newNewbpClosureOrder = new NewbpClosureOrderEntity();
		
		try {
			//search
			newNewbpClosureOrder = newcorepo.findById(id).get();
			
			//update
			newNewbpClosureOrder.setBspermit_no(newNewbpClosureOrderDetails.getBspermit_no());
			newNewbpClosureOrder.setPermittee(newNewbpClosureOrderDetails.getPermittee());
			newNewbpClosureOrder.setBusiness_name(newNewbpClosureOrderDetails.getBusiness_name());
			newNewbpClosureOrder.setAddress(newNewbpClosureOrderDetails.getAddress());
			newNewbpClosureOrder.setNature_business(newNewbpClosureOrderDetails.getNature_business());
			newNewbpClosureOrder.setType_occupancy(newNewbpClosureOrderDetails.getType_occupancy());
			newNewbpClosureOrder.setContact_no(newNewbpClosureOrderDetails.getContact_no());
			newNewbpClosureOrder.setEmail(newNewbpClosureOrderDetails.getEmail());
			newNewbpClosureOrder.setDate_received(newNewbpClosureOrderDetails.getDate_received());
			newNewbpClosureOrder.setDate_inspected(newNewbpClosureOrderDetails.getDate_inspected());
			newNewbpClosureOrder.setInspection_no(newNewbpClosureOrderDetails.getInspection_no());
			newNewbpClosureOrder.setNtc_no(newNewbpClosureOrderDetails.getNtc_no());
			newNewbpClosureOrder.setNtc_date(newNewbpClosureOrderDetails.getNtc_date());
			newNewbpClosureOrder.setNtcv_no(newNewbpClosureOrderDetails.getNtcv_no());
			newNewbpClosureOrder.setNtcv_date(newNewbpClosureOrderDetails.getNtcv_date());
			newNewbpClosureOrder.setAbatement_no(newNewbpClosureOrderDetails.getAbatement_no());
			newNewbpClosureOrder.setAbatement_date(newNewbpClosureOrderDetails.getAbatement_date());
			newNewbpClosureOrder.setClosure_no(newNewbpClosureOrderDetails.getClosure_no());
			newNewbpClosureOrder.setClosure_date(newNewbpClosureOrderDetails.getClosure_date());
			newNewbpClosureOrder.setTeam_leader(newNewbpClosureOrderDetails.getTeam_leader());
			newNewbpClosureOrder.setFire_inspectors(newNewbpClosureOrderDetails.getFire_inspectors());
			newNewbpClosureOrder.setDefects(newNewbpClosureOrderDetails.getDefects());
			newNewbpClosureOrder.setName(newNewbpClosureOrderDetails.getName());
			newNewbpClosureOrder.setDate(newNewbpClosureOrderDetails.getDate());
			newNewbpClosureOrder.setRemarks(newNewbpClosureOrderDetails.getRemarks());
			newNewbpClosureOrder.setAdministrative_fine(newNewbpClosureOrderDetails.getAdministrative_fine());
			//save
			return newcorepo.save(newNewbpClosureOrder);
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + id + "Does not Exist!");
		}
		
	}
	
	//Insert Record
	 public NewbpClosureOrderEntity insertClosurePermit(NewbpClosureOrderEntity permit) {
	        return newcorepo.save(permit);
	    }
	 
	 
//D - Delete a record
	  public String deleteItem(int id) {
	      String msg;
	      if(newcorepo.findById(id) != null) {
	    	  newcorepo.deleteById(id); //find the id number of the student to be deleted
	        msg = "Permit ID Number: " + id + " was successfully deleted!";
	      } else {
	            msg = "Permit ID Number: " + id + " was NOT found!";
	      }
	       
	      return msg;
	    }
	
}