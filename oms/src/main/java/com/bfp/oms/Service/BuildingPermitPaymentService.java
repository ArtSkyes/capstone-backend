package com.bfp.oms.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfp.oms.Entity.BuildingPermitPaymentEntity;
import com.bfp.oms.Repository.BuildingPermitPaymentRepository;

@Service
public class BuildingPermitPaymentService {

	@Autowired
	BuildingPermitPaymentRepository brepo;
	
	
	//Read all records
	public List<BuildingPermitPaymentEntity> getAllBuildingPayment(){
		return brepo.findAll();
		
	}
	
	//update records
	public BuildingPermitPaymentEntity evaluateBuildingPayment(int id, BuildingPermitPaymentEntity newNewbpApprovedApplicationDetails) throws Exception{
		
		BuildingPermitPaymentEntity newBuildingPayment = new BuildingPermitPaymentEntity();
		
		try {
			//search
			newBuildingPayment = brepo.findById(id).get();
			
			//update
			newBuildingPayment.setPayor(newNewbpApprovedApplicationDetails.getPayor());
			newBuildingPayment.setBusiness_permitno(newNewbpApprovedApplicationDetails.getBusiness_permitno());
			newBuildingPayment.setOr_no(newNewbpApprovedApplicationDetails.getOr_no());
			newBuildingPayment.setOps_no(newNewbpApprovedApplicationDetails.getOps_no());
			newBuildingPayment.setPayment(newNewbpApprovedApplicationDetails.getPayment());
			newBuildingPayment.setAgency(newNewbpApprovedApplicationDetails.getAgency());
			newBuildingPayment.setPayment_date(newNewbpApprovedApplicationDetails.getPayment_date());
			newBuildingPayment.setPayment(newNewbpApprovedApplicationDetails.getPayment());
			
			
			//save
			return brepo.save(newBuildingPayment);
			
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + id + "Does not Exist!");
		}
	}
	
	//Add new Application
		 public BuildingPermitPaymentEntity insertNewBuildingPayment(BuildingPermitPaymentEntity permit) {
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