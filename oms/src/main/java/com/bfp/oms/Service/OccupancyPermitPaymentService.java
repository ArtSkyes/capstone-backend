package com.bfp.oms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfp.oms.Entity.OccupancyPermitPaymentEntity;
import com.bfp.oms.Repository.OccupancyPermitPaymentRepository;

@Service
public class OccupancyPermitPaymentService {

	@Autowired
	OccupancyPermitPaymentRepository brepo;
	
	
	//Read all records
	public List<OccupancyPermitPaymentEntity> getAllOccupancyPayment(){
		return brepo.findAll();
		
	}
	
	//update records
	public OccupancyPermitPaymentEntity evaluatOccupancyPayment(int id, OccupancyPermitPaymentEntity newNewbpApprovedApplicationDetails) throws Exception{
		
		OccupancyPermitPaymentEntity newOccuPayment = new OccupancyPermitPaymentEntity();
		
		try {
			//search
			newOccuPayment = brepo.findById(id).get();
			
			//update
			newOccuPayment.setPayor(newNewbpApprovedApplicationDetails.getPayor());
			newOccuPayment.setBusiness_permitno(newNewbpApprovedApplicationDetails.getBusiness_permitno());
			newOccuPayment.setOr_no(newNewbpApprovedApplicationDetails.getOr_no());
			newOccuPayment.setOps_no(newNewbpApprovedApplicationDetails.getOps_no());
			newOccuPayment.setPayment(newNewbpApprovedApplicationDetails.getPayment());
			newOccuPayment.setAgency(newNewbpApprovedApplicationDetails.getAgency());
			newOccuPayment.setPayment_date(newNewbpApprovedApplicationDetails.getPayment_date());
			newOccuPayment.setPayment(newNewbpApprovedApplicationDetails.getPayment());
			
			
			//save
			return brepo.save(newOccuPayment);
			
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + id + "Does not Exist!");
		}
	}
	
	//Add new Application
		 public OccupancyPermitPaymentEntity insertOccupancyPayment(OccupancyPermitPaymentEntity permit) {
		        return brepo.save(permit);
		    }
		 
	//D - Delete a record
		  public String deleteItem(int id) {
		      String msg;
		      if(brepo.findById(id) != null) {
		    	  brepo.deleteById(id); //find the id number of the student to be deleted
		        msg = "Permit ID Number: " + id + " was successfully deleted!";
		      } else {
		            msg = "Permit ID Number: " + id + " was NOT found!";
		      }
		       
		      return msg;
		    }
	
}