package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.bfp.Entity.OccupancyPermitPaymentEntity;

@Repository
public interface OccupancyPermitPaymentRepo extends JpaRepository<OccupancyPermitPaymentEntity, Integer> {

}
