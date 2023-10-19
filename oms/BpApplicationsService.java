package com.cituccs.bfp.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cituccs.bfp.Entity.BpApplicationsEntity;
import com.cituccs.bfp.Repository.BpApplicationsRepository;


@Service
public class BpApplicationsService {

	@Autowired
	BpApplicationsRepository bparepo;
	
	//read all records
	public List<BpApplicationsEntity> getAllBpApplications(){
		return bparepo.findAll();
	}
	
	//update records
	public BpApplicationsEntity putBpApplications(int bpa_id, BpApplicationsEntity newBpApplicationsDetails) throws Exception {
		
		BpApplicationsEntity newBpApplications = new BpApplicationsEntity();
		
		try {
			//search
			newBpApplications = bparepo.findById(bpa_id).get();
			
			//update
			newBpApplications.setStatus(newBpApplicationsDetails.getStatus());
			
			//save
			return bparepo.save(newBpApplications);
		}catch(NoResultException nex) {
			throw new Exception("ID Number" +bpa_id+ "Does not Exist!");
		}
	}
	
}
