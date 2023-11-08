package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.bfp.Entity.OccupancyApprovedClerkEntity;



@Repository
public interface OccupancyApprovedClerkRepository extends JpaRepository<OccupancyApprovedClerkEntity, Integer> {

	
	//define query
	//ApprovedApplicationEntity findByApplication_no(int application_no);
	
}
