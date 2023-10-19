package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.bfp.Entity.AbatementOrderEntity;


@Repository
public interface AbatementOrderRepository extends JpaRepository<AbatementOrderEntity, Integer> {

}
