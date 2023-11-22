package com.bfp.oms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfp.oms.Entity.RenewalbpAbatementOrderEntity;



@Repository
public interface RenewalbpAbatementOrderRepository extends JpaRepository<RenewalbpAbatementOrderEntity, Integer> {

	//define query
}
