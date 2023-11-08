package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cituccs.bfp.Entity.NewbpClosureOrderEntity;


@Repository
public interface NewbpClosureOrderRepository extends JpaRepository<NewbpClosureOrderEntity, Integer> {

	//define query
}
