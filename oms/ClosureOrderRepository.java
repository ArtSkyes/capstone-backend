package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.bfp.Entity.ClosureOrderEntity;


@Repository
public interface ClosureOrderRepository extends JpaRepository<ClosureOrderEntity, Integer> {

}
