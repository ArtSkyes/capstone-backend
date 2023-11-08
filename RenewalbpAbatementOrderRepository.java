package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.bfp.Entity.RenewalbpAbatementOrderEntity;



@Repository
public interface RenewalbpAbatementOrderRepository extends JpaRepository<RenewalbpAbatementOrderEntity, Integer> {

	//define query
}
