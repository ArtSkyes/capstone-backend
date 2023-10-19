package com.cituccs.bfp.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.bfp.Entity.RenewalbpNoticeCorrectViolationEntity;


@Repository
public interface RenewalbpNoticeCorrectViolationRepository extends JpaRepository<RenewalbpNoticeCorrectViolationEntity, Integer>{

	//define query
}
