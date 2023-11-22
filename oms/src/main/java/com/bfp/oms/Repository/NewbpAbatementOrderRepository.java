package com.bfp.oms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfp.oms.Entity.NewbpAbatementOrderEntity;



@Repository
public interface NewbpAbatementOrderRepository extends JpaRepository<NewbpAbatementOrderEntity, Integer>{
	

	//define query
}
