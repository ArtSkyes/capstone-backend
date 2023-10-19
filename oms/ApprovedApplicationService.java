package com.cituccs.bfp.Service;



import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cituccs.bfp.Entity.ApprovedApplicationEntity;
import com.cituccs.bfp.Repository.ApprovedApplicationRepository;




@Service
public class ApprovedApplicationService {
	
	@Autowired
	ApprovedApplicationRepository arepo;
	
	//read all records}
	public List<ApprovedApplicationEntity> getAllApprovedApplication(){
		return arepo.findAll();
		
	}
	
	//Update New Applications		
		public ApprovedApplicationEntity putApprovedApplication(int approved_id, ApprovedApplicationEntity newApprovedApplicationDetails) throws Exception{
			ApprovedApplicationEntity newApprovedApplication = new ApprovedApplicationEntity();
			
			try {
				//search
				newApprovedApplication = arepo.findById(approved_id).get();
				
				//update
				//newApprovedApplication.setApplication_no(newApprovedApplicationDetails.getApplication_no());
				//newApprovedApplication.setBldgpermit_no(newApprovedApplicationDetails.getBldgpermit_no());
				//newApprovedApplication.setDate_received(newApprovedApplicationDetails.getDate_received());
				//newApprovedApplication.setApplicants_name(newApprovedApplicationDetails.getApplicants_name());
				//newApprovedApplication.setProject_name(newApprovedApplicationDetails.getProject_name());
				//newApprovedApplication.setLocation(newApprovedApplicationDetails.getLocation());
				//newApprovedApplication.setContact_no(newApprovedApplicationDetails.getContact_no());
				//newApprovedApplication.setFees(newApprovedApplicationDetails.getFees());
				//newApprovedApplication.setInspection_no(newApprovedApplicationDetails.getInspection_no());
				//newApprovedApplication.setDate_fsic(newApprovedApplicationDetails.getDate_fsic());
				newApprovedApplication.setStatus(newApprovedApplicationDetails.getStatus());
				
				//save
				return arepo.save(newApprovedApplication);
				
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + approved_id + "Does not exist!");
		}
		}
			
		
	

}

