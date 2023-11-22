package com.bfp.oms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.bfp.oms.Entity.RenewalBusinessPaymentEntity;

@Repository
public interface RenewalBusinessPaymentRepository extends JpaRepository<RenewalBusinessPaymentEntity, Integer>{

}