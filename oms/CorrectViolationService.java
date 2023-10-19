package com.cituccs.bfp.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cituccs.bfp.Entity.CorrectViolationEntity;
import com.cituccs.bfp.Repository.CorrectViolationRepository;


@Service
public class CorrectViolationService {
	
	@Autowired
	CorrectViolationRepository cvrepo;

	
	//read all records
	public List<CorrectViolationEntity> getAllCorrectViolation(){
		return cvrepo.findAll();
	}
	
	//update
	public CorrectViolationEntity putCorrectViolation(int cv_id, CorrectViolationEntity newCorrectViolationDetails) throws Exception{
		
		CorrectViolationEntity newCorrectViolation = new CorrectViolationEntity();
				
		try {
			//search
			newCorrectViolation = cvrepo.findById(cv_id).get();
			
			//update
			newCorrectViolation.setStatus(newCorrectViolationDetails.getStatus());
			
			//save
			return cvrepo.save(newCorrectViolation);
			
		}catch(NoResultException nex) {
			throw new Exception("ID Number" +cv_id+ "Does not Exist!");
		}
	}
}
