package com.bfp.oms.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfp.oms.Entity.RenewalbpNoticeCorrectViolationEntity;


@Repository
public interface RenewalbpNoticeCorrectViolationRepository extends JpaRepository<RenewalbpNoticeCorrectViolationEntity, Integer>{

	//define query
}
