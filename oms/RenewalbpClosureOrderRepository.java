package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.bfp.Entity.RenewalbpClosureOrderEntity;



@Repository
public interface RenewalbpClosureOrderRepository extends JpaRepository<RenewalbpClosureOrderEntity, Integer> {

	//define query
}
