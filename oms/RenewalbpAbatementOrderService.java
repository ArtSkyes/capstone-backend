package com.cituccs.bfp.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cituccs.bfp.Entity.RenewalbpAbatementOrderEntity;
import com.cituccs.bfp.Repository.RenewalbpAbatementOrderRepository;


@Service
public class RenewalbpAbatementOrderService {
	
	@Autowired
	RenewalbpAbatementOrderRepository renewaorepo;
	
	
	//read all records
	public List<RenewalbpAbatementOrderEntity> getAllRenewalbpAbatementOrder(){
		return renewaorepo.findAll();
	}
	
	//update records
	public RenewalbpAbatementOrderEntity putRenewalbpAbatementOrder(int renewao_id, RenewalbpAbatementOrderEntity newRenewalbpAbatementOrderDetails) throws Exception{
		
		RenewalbpAbatementOrderEntity newRenewalbpAbatementOrder = new RenewalbpAbatementOrderEntity(); 
		
		try {
			//search
			newRenewalbpAbatementOrder = renewaorepo.findById(renewao_id).get();
			
			//update
			newRenewalbpAbatementOrder.setStatus(newRenewalbpAbatementOrderDetails.getStatus());
			
			//save
			return renewaorepo.save(newRenewalbpAbatementOrder);
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + renewao_id + "Does not Exist!");
		}
	}
	
	//update records
	public RenewalbpAbatementOrderEntity updateRenewalbpAbatementOrder(int id, RenewalbpAbatementOrderEntity newRenewalbpAbatementOrderDetails) throws Exception{
		
		RenewalbpAbatementOrderEntity newRenewalbpAbatementOrder = new RenewalbpAbatementOrderEntity(); 
		
		try {
			//search
			newRenewalbpAbatementOrder = renewaorepo.findById(id).get();
			
			//update
			newRenewalbpAbatementOrder.setBspermit_no(newRenewalbpAbatementOrderDetails.getBspermit_no());
			newRenewalbpAbatementOrder.setPermittee(newRenewalbpAbatementOrderDetails.getPermittee());
			newRenewalbpAbatementOrder.setBusiness_name(newRenewalbpAbatementOrderDetails.getBusiness_name());
			newRenewalbpAbatementOrder.setAddress(newRenewalbpAbatementOrderDetails.getAddress());
			newRenewalbpAbatementOrder.setNature_business(newRenewalbpAbatementOrderDetails.getNature_business());
			newRenewalbpAbatementOrder.setType_occupancy(newRenewalbpAbatementOrderDetails.getType_occupancy());
			newRenewalbpAbatementOrder.setContact_no(newRenewalbpAbatementOrderDetails.getContact_no());
			newRenewalbpAbatementOrder.setEmail(newRenewalbpAbatementOrderDetails.getEmail());
			newRenewalbpAbatementOrder.setDate_received(newRenewalbpAbatementOrderDetails.getDate_received());
			newRenewalbpAbatementOrder.setDate_inspection(newRenewalbpAbatementOrderDetails.getDate_inspection());
			newRenewalbpAbatementOrder.setInspection_no(newRenewalbpAbatementOrderDetails.getInspection_no());
			newRenewalbpAbatementOrder.setRemarks(newRenewalbpAbatementOrderDetails.getRemarks());
			newRenewalbpAbatementOrder.setDate_inspection(newRenewalbpAbatementOrderDetails.getDate_inspection());
			newRenewalbpAbatementOrder.setInspection_no(newRenewalbpAbatementOrderDetails.getInspection_no());
			newRenewalbpAbatementOrder.setNtc_no(newRenewalbpAbatementOrderDetails.getNtc_no());
			newRenewalbpAbatementOrder.setNtc_date(newRenewalbpAbatementOrderDetails.getNtc_date());
			newRenewalbpAbatementOrder.setNtcv_no(newRenewalbpAbatementOrderDetails.getNtcv_no());
			newRenewalbpAbatementOrder.setNtcv_date(newRenewalbpAbatementOrderDetails.getNtcv_date());
			newRenewalbpAbatementOrder.setAbatement_no(newRenewalbpAbatementOrderDetails.getAbatement_no());
			newRenewalbpAbatementOrder.setAbatement_date(newRenewalbpAbatementOrderDetails.getAbatement_date());
			newRenewalbpAbatementOrder.setTeam_leader(newRenewalbpAbatementOrderDetails.getTeam_leader());
			newRenewalbpAbatementOrder.setFireInspectors(newRenewalbpAbatementOrderDetails.getFireInspectors());
			newRenewalbpAbatementOrder.setDefects(newRenewalbpAbatementOrderDetails.getDefects());
			newRenewalbpAbatementOrder.setReceived_name(newRenewalbpAbatementOrderDetails.getReceived_name());
			newRenewalbpAbatementOrder.setReceivedabatement_date(newRenewalbpAbatementOrderDetails.getReceivedabatement_date());
			newRenewalbpAbatementOrder.setStatus(newRenewalbpAbatementOrderDetails.getStatus());
			
			//save
			return renewaorepo.save(newRenewalbpAbatementOrder);
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + id + "Does not Exist!");
		}
	}
	
	
	//Add new Application
		 public RenewalbpAbatementOrderEntity insertAbatementPermit(RenewalbpAbatementOrderEntity permit) {
		        return renewaorepo.save(permit);
		    }
	//D - Delete a record
		 public String deleteItem(int id) {
		      String msg;
		      if(renewaorepo.findById(id) != null) {
		    	  renewaorepo.deleteById(id); //find the id number of the student to be deleted
		        msg = "Permit ID Number: " + id + " was successfully deleted!";
		      } else {
		            msg = "Permit ID Number: " + id + " was NOT found!";
		      }
		       
		      return msg;
		    }

}
