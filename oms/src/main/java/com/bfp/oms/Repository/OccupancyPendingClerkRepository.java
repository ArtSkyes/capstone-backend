package com.bfp.oms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfp.oms.Entity.OccupancyPendingClerkEntity;

@Repository
public interface OccupancyPendingClerkRepository extends JpaRepository<OccupancyPendingClerkEntity, Integer>{

	//define query
	
}
