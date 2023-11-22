package com.bfp.oms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfp.oms.Entity.BuildingPermitPaymentEntity;


@Repository
public interface BuildingPermitPaymentRepository extends JpaRepository<BuildingPermitPaymentEntity, Integer>{

}