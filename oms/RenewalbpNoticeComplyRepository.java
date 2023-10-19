package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.bfp.Entity.RenewalbpNoticeComplyEntity;



@Repository
public interface RenewalbpNoticeComplyRepository extends JpaRepository<RenewalbpNoticeComplyEntity, Integer> {

	//define query
}
