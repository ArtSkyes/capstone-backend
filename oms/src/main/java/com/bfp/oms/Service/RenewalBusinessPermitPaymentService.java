package com.bfp.oms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bfp.oms.Entity.RenewalBusinessPaymentEntity;
import com.bfp.oms.Repository.RenewalBusinessPaymentRepository;

@Service
public class RenewalBusinessPermitPaymentService {

	@Autowired
	RenewalBusinessPaymentRepository brepo;
	
	
	//Read all records
	public List<RenewalBusinessPaymentEntity> getAllRenewalPayment(){
		return brepo.findAll();
		
	}
	
	//update records
	public RenewalBusinessPaymentEntity evaluateRenewalBusinessPayment(int id, RenewalBusinessPaymentEntity newNewbpApprovedApplicationDetails) throws Exception{
		
		RenewalBusinessPaymentEntity newNewBusissPayment = new RenewalBusinessPaymentEntity();
		
		try {
			//search
			newNewBusissPayment = brepo.findById(id).get();
			
			//update
			newNewBusissPayment.setPayor(newNewbpApprovedApplicationDetails.getPayor());
			newNewBusissPayment.setBusiness_permitno(newNewbpApprovedApplicationDetails.getBusiness_permitno());
			newNewBusissPayment.setOr_no(newNewbpApprovedApplicationDetails.getOr_no());
			newNewBusissPayment.setOps_no(newNewbpApprovedApplicationDetails.getOps_no());
			newNewBusissPayment.setPayment(newNewbpApprovedApplicationDetails.getPayment());
			newNewBusissPayment.setAgency(newNewbpApprovedApplicationDetails.getAgency());
			newNewBusissPayment.setPayment_date(newNewbpApprovedApplicationDetails.getPayment_date());
			newNewBusissPayment.setPayment(newNewbpApprovedApplicationDetails.getPayment());
			
			
			//save
			return brepo.save(newNewBusissPayment);
			
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + id + "Does not Exist!");
		}
	}
	
	//Add new Application
		 public RenewalBusinessPaymentEntity insertRenewalBusinessPayment(RenewalBusinessPaymentEntity permit) {
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