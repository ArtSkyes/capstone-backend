package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.bfp.Entity.OccupancyDisapprovedClerkEntity;



@Repository
public interface OccupancyDisapprovedClerkRepository extends JpaRepository<OccupancyDisapprovedClerkEntity, Integer> {
	
	//define query
	//DisaprovalApplicationEntity findByApplication_no();

}
