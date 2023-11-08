package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cituccs.bfp.Entity.RenewalBusinessPaymentEntity;

@Repository
public interface RenewalBusinessPaymentRepo extends JpaRepository<RenewalBusinessPaymentEntity, Integer>{

}
