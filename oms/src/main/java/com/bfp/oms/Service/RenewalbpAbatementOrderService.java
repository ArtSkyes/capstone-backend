package com.bfp.oms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bfp.oms.Entity.RenewalbpAbatementOrderEntity;
import com.bfp.oms.Repository.RenewalbpAbatementOrderRepository;


@Service
public class RenewalbpAbatementOrderService {
	
	@Autowired
	RenewalbpAbatementOrderRepository renewaorepo;
	
	
	//read all records
	public List<RenewalbpAbatementOrderEntity> getAllRenewalbpAbatementOrder(){
		return renewaorepo.findAll();
	}
	
	//update records
	public RenewalbpAbatementOrderEntity putRenewalbpAbatementOrder(int id, RenewalbpAbatementOrderEntity newRenewalbpAbatementOrderDetails) throws Exception{
		
		RenewalbpAbatementOrderEntity newRenewalbpAbatementOrder = new RenewalbpAbatementOrderEntity(); 
		
		try {
			//search
			newRenewalbpAbatementOrder = renewaorepo.findById(id).get();
			
			//update
			newRenewalbpAbatementOrder.setRemarks(newRenewalbpAbatementOrderDetails.getRemarks());
			
			//save
			return renewaorepo.save(newRenewalbpAbatementOrder);
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + id + "Does not Exist!");
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
			newRenewalbpAbatementOrder.setDate_inspected(newRenewalbpAbatementOrderDetails.getDate_inspected());
			newRenewalbpAbatementOrder.setInspection_no(newRenewalbpAbatementOrderDetails.getInspection_no());
			newRenewalbpAbatementOrder.setNtc_no(newRenewalbpAbatementOrderDetails.getNtc_no());
			newRenewalbpAbatementOrder.setNtc_date(newRenewalbpAbatementOrderDetails.getNtc_date());
			newRenewalbpAbatementOrder.setNtcv_no(newRenewalbpAbatementOrderDetails.getNtcv_no());
			newRenewalbpAbatementOrder.setNtcv_date(newRenewalbpAbatementOrderDetails.getNtcv_date());
			newRenewalbpAbatementOrder.setAbatement_no(newRenewalbpAbatementOrderDetails.getAbatement_no());
			newRenewalbpAbatementOrder.setAbatement_date(newRenewalbpAbatementOrderDetails.getAbatement_date());
			newRenewalbpAbatementOrder.setTeam_leader(newRenewalbpAbatementOrderDetails.getTeam_leader());
			newRenewalbpAbatementOrder.setFire_inspector(newRenewalbpAbatementOrderDetails.getFire_inspector());
			newRenewalbpAbatementOrder.setDefects(newRenewalbpAbatementOrderDetails.getDefects());
			newRenewalbpAbatementOrder.setName(newRenewalbpAbatementOrderDetails.getName());
			newRenewalbpAbatementOrder.setDate(newRenewalbpAbatementOrderDetails.getDate());
			newRenewalbpAbatementOrder.setAdministrative_fine(newRenewalbpAbatementOrderDetails.getAdministrative_fine());
			
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