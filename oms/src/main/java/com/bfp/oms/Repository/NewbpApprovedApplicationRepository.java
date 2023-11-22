package com.bfp.oms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfp.oms.Entity.NewbpApprovedApplicationEntity;



@Repository
public interface NewbpApprovedApplicationRepository extends JpaRepository<NewbpApprovedApplicationEntity, Integer>{
	
	//define query

}
