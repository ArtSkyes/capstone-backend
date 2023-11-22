package com.bfp.oms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bfp.oms.Entity.NewBusinessPaymentEntity;

@Repository
public interface NewBusinessPaymentRepository extends JpaRepository<NewBusinessPaymentEntity, Integer> {

}