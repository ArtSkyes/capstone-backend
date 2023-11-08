package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.bfp.Entity.NewbpAbatementOrderEntity;



@Repository
public interface NewbpAbatementOrderRepository extends JpaRepository<NewbpAbatementOrderEntity, Integer>{
	

	//define query
}
