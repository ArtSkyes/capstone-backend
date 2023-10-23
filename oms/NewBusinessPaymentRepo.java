package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cituccs.bfp.Entity.NewBusinessPaymentEntity;

@Repository
public interface NewBusinessPaymentRepo extends JpaRepository<NewBusinessPaymentEntity, Integer> {

}
