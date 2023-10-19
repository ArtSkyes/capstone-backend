package com.cituccs.bfp.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cituccs.bfp.Entity.DisaprovalApplicationEntity;
import com.cituccs.bfp.Repository.DisaprovalApplicationRepository;


@Service
public class DisaprovalApplicationService {
	
	@Autowired
	DisaprovalApplicationRepository drepo;

	//Read all have notice of disapproval Application
	public List<DisaprovalApplicationEntity> getAllDisaprovalApplication(){
		return drepo.findAll();
	}
	//update disapproval applications
	public DisaprovalApplicationEntity putDisaprovalApplication(int disapproval_id, DisaprovalApplicationEntity newDisaprovalApplicationDetails) throws Exception{
		
		DisaprovalApplicationEntity newDisaprovalApplication = new DisaprovalApplicationEntity();
		
		
		try {
			//Step1 - search
			newDisaprovalApplication = drepo.findById(disapproval_id).get();
			
			//Step2 - update the record
			//newDisaprovalApplication.setApplication_no(newDisaprovalApplicationDetails.getApplication_no());
			newDisaprovalApplication.setStatus(newDisaprovalApplicationDetails.getStatus());
			
			return drepo.save(newDisaprovalApplication);
		
		}catch(NoSuchElementException nex) {
			throw new Exception("ID Number " + disapproval_id + "Does not exist!");
		}
		
	}

	
	
}
