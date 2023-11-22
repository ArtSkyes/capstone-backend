package com.bfp.oms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfp.oms.Entity.OccupancyPermitPaymentEntity;

@Repository
public interface OccupancyPermitPaymentRepository extends JpaRepository<OccupancyPermitPaymentEntity, Integer> {

}