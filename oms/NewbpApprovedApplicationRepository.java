package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.bfp.Entity.NewbpApprovedApplicationEntity;



@Repository
public interface NewbpApprovedApplicationRepository extends JpaRepository<NewbpApprovedApplicationEntity, Integer>{
	
	//define query

}
