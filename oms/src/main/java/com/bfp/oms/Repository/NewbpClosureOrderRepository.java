package com.bfp.oms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bfp.oms.Entity.NewbpClosureOrderEntity;


@Repository
public interface NewbpClosureOrderRepository extends JpaRepository<NewbpClosureOrderEntity, Integer> {

	//define query
}
