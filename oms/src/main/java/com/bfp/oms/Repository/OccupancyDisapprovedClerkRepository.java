package com.bfp.oms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfp.oms.Entity.OccupancyDisapprovedClerkEntity;

@Repository
public interface OccupancyDisapprovedClerkRepository extends JpaRepository<OccupancyDisapprovedClerkEntity, Integer>{

	//define query
	
}
