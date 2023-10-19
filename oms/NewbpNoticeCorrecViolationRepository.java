package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.bfp.Entity.NewbpNoticeCorrectViolationEntity;



@Repository
public interface NewbpNoticeCorrecViolationRepository extends JpaRepository<NewbpNoticeCorrectViolationEntity, Integer> {
	

	//define query
}
