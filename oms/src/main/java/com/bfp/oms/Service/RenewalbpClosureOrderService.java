package com.bfp.oms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bfp.oms.Entity.RenewalbpClosureOrderEntity;
import com.bfp.oms.Repository.RenewalbpClosureOrderRepository;


@Service
public class RenewalbpClosureOrderService {

	@Autowired
	RenewalbpClosureOrderRepository renewcorepo;
	
	//read all records
	public List<RenewalbpClosureOrderEntity> getAllRenewalbpClosureOrder(){
		return renewcorepo.findAll();
	}
	
	//update records
	public RenewalbpClosureOrderEntity putRenewalbpClosureOrder(int id, RenewalbpClosureOrderEntity newRenewalbpClosureOrderDetails) throws Exception{
		
		RenewalbpClosureOrderEntity newRenewalbpClosureOrder = new RenewalbpClosureOrderEntity();
		
		try {
			//search 
			newRenewalbpClosureOrder = renewcorepo.findById(id).get();
			
			//update
			newRenewalbpClosureOrder.setRemarks(newRenewalbpClosureOrderDetails.getRemarks());
			
			//save
			return renewcorepo.save(newRenewalbpClosureOrder);
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + id + "Does not Exist!");
		}
	}
	
	
	//update records
	public RenewalbpClosureOrderEntity updateRenewalbpClosureOrder(int id, RenewalbpClosureOrderEntity newRenewalbpClosureOrderDetails) throws Exception{
		
		RenewalbpClosureOrderEntity newRenewalbpClosureOrder = new RenewalbpClosureOrderEntity();
		
		try {
			//search 
			newRenewalbpClosureOrder = renewcorepo.findById(id).get();
			
			//update
			newRenewalbpClosureOrder.setBspermit_no(newRenewalbpClosureOrderDetails.getBspermit_no());
			newRenewalbpClosureOrder.setPermittee(newRenewalbpClosureOrderDetails.getPermittee());
			newRenewalbpClosureOrder.setBusiness_name(newRenewalbpClosureOrderDetails.getBusiness_name());
			newRenewalbpClosureOrder.setAddress(newRenewalbpClosureOrderDetails.getAddress());
			newRenewalbpClosureOrder.setNature_business(newRenewalbpClosureOrderDetails.getNature_business());
			newRenewalbpClosureOrder.setType_occupancy(newRenewalbpClosureOrderDetails.getType_occupancy());
			newRenewalbpClosureOrder.setContact_no(newRenewalbpClosureOrderDetails.getContact_no());
			newRenewalbpClosureOrder.setEmail(newRenewalbpClosureOrderDetails.getEmail());
			newRenewalbpClosureOrder.setDate_received(newRenewalbpClosureOrderDetails.getDate_received());
			newRenewalbpClosureOrder.setDate_inspected(newRenewalbpClosureOrderDetails.getDate_inspected());
			newRenewalbpClosureOrder.setInspection_no(newRenewalbpClosureOrderDetails.getInspection_no());
			newRenewalbpClosureOrder.setNtc_no(newRenewalbpClosureOrderDetails.getNtc_no());
			newRenewalbpClosureOrder.setNtc_date(newRenewalbpClosureOrderDetails.getNtc_date());
			newRenewalbpClosureOrder.setNtcv_no(newRenewalbpClosureOrderDetails.getNtcv_no());
			newRenewalbpClosureOrder.setNtcv_date(newRenewalbpClosureOrderDetails.getNtcv_date());
			newRenewalbpClosureOrder.setAbatement_no(newRenewalbpClosureOrderDetails.getAbatement_no());
			newRenewalbpClosureOrder.setAbatement_date(newRenewalbpClosureOrderDetails.getAbatement_date());
			newRenewalbpClosureOrder.setClosure_no(newRenewalbpClosureOrderDetails.getClosure_no());
			newRenewalbpClosureOrder.setClosure_date(newRenewalbpClosureOrderDetails.getClosure_date());
			newRenewalbpClosureOrder.setTeam_leader(newRenewalbpClosureOrderDetails.getTeam_leader());
			newRenewalbpClosureOrder.setFire_inspector(newRenewalbpClosureOrderDetails.getFire_inspector());
			newRenewalbpClosureOrder.setDefects(newRenewalbpClosureOrderDetails.getDefects());
			newRenewalbpClosureOrder.setName(newRenewalbpClosureOrderDetails.getName());
			newRenewalbpClosureOrder.setDate(newRenewalbpClosureOrderDetails.getDate());
			newRenewalbpClosureOrder.setAdministrative_fine(newRenewalbpClosureOrderDetails.getAdministrative_fine());
			newRenewalbpClosureOrder.setRemarks(newRenewalbpClosureOrderDetails.getRemarks());
			
			//save
			return renewcorepo.save(newRenewalbpClosureOrder);
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + id + "Does not Exist!");
		}
	}
	
	
	//Add new Application
		 public RenewalbpClosureOrderEntity insertClosurePermit(RenewalbpClosureOrderEntity permit) {
		        return renewcorepo.save(permit);
		    }
		 
	//D - Delete a record
		 public String deleteItem(int id) {
		      String msg;
		      if(renewcorepo.findById(id) != null) {
		    	  renewcorepo.deleteById(id); //find the id number of the student to be deleted
		        msg = "Permit ID Number: " + id + " was successfully deleted!";
		      } else {
		            msg = "Permit ID Number: " + id + " was NOT found!";
		      }
		       
		      return msg;
		    }
}