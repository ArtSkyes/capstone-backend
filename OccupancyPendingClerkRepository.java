package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.bfp.Entity.OccupancyPendingClerkEntity;

@Repository
public interface OccupancyPendingClerkRepository extends JpaRepository<OccupancyPendingClerkEntity, Integer> {

}
