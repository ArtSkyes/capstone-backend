package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.bfp.Entity.BuildingPermitPaymentEntity;


@Repository
public interface BuildingPermitPaymentRepo extends JpaRepository<BuildingPermitPaymentEntity, Integer>{

}
