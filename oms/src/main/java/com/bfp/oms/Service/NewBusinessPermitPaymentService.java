package com.bfp.oms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfp.oms.Entity.NewBusinessPaymentEntity;
import com.bfp.oms.Repository.NewBusinessPaymentRepository;

@Service
public class NewBusinessPermitPaymentService {

	@Autowired
	NewBusinessPaymentRepository brepo;
	
	
	//Read all records
	public List<NewBusinessPaymentEntity> getAllNewBusinessPayment(){
		return brepo.findAll();
		
	}
	
	//update records
	public NewBusinessPaymentEntity evaluateBusinessPayment(int id, NewBusinessPaymentEntity newNewbpApprovedApplicationDetails) throws Exception{
		
		NewBusinessPaymentEntity newNewBusissPayment = new NewBusinessPaymentEntity();
		
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
		 public NewBusinessPaymentEntity insertNewBusinessPayment(NewBusinessPaymentEntity permit) {
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