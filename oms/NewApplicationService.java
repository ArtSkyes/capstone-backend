package com.cituccs.bfp.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cituccs.bfp.Entity.NewApplicationEntity;
import com.cituccs.bfp.Repository.NewApplicationRepository;

@Service
public class NewApplicationService {
	
	
	@Autowired
	NewApplicationRepository nrepo;
	
	//Read all New Applications
    public List<NewApplicationEntity> getAllNewApplication() {
        return nrepo.findAll();
    }
	
    //Update New Applications
	public NewApplicationEntity putNewApplication(int new_id, NewApplicationEntity newNewApplicationDetails) throws Exception{
		
		NewApplicationEntity newApplication = new NewApplicationEntity();
		
		try {
			//Steps in updating
			//Step1 - search the id number of the student
			newApplication = nrepo.findById(new_id).get();
			
			//Step2 - update the record
			newApplication.setApplication_no(newNewApplicationDetails.getApplication_no());
			//newApplication.setBldgpermit_no(newNewApplicationDetails.getBldgpermit_no());
			//newApplication.setdate_received(newNewApplicationDetails.getDate_received());
			newApplication.setApplicants_name(newNewApplicationDetails.getApplicants_name());
			//newApplication.setProject_name(newNewApplicationDetails.getProject_name());
			//newApplication.setLocation(newNewApplicationDetails.getLocation());
			//newApplication.setContact_no(newNewApplicationDetails.getContact_no());
			//newApplication.setFees(newNewApplicationDetails.getFees());
			//newApplication.setInspection_no(newNewApplicationDetails.getInspection_no());
			newApplication.setStatus(newNewApplicationDetails.getStatus());

			
			//Step3 - save the information and return the value
			return nrepo.save(newApplication);
			
		}catch(NoSuchElementException nex) {
			throw new Exception("ID Number " + new_id + "Does not exist!");
		}
	}
	
	//Add new Application
	 public NewApplicationEntity insertOccupancyPermit(NewApplicationEntity permit) {
	        return nrepo.save(permit);
	    }
	
		
	
	
}

