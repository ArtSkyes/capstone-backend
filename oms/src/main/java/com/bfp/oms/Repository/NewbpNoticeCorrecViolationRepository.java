package com.bfp.oms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfp.oms.Entity.NewbpNoticeCorrectViolationEntity;



@Repository
public interface NewbpNoticeCorrecViolationRepository extends JpaRepository<NewbpNoticeCorrectViolationEntity, Integer> {
	

	//define query
}
