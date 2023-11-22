package com.bfp.oms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfp.oms.Entity.RenewalbpClosureOrderEntity;



@Repository
public interface RenewalbpClosureOrderRepository extends JpaRepository<RenewalbpClosureOrderEntity, Integer> {

	//define query
}
