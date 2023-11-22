package com.bfp.oms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfp.oms.Entity.RenewalbpNoticeComplyEntity;



@Repository
public interface RenewalbpNoticeComplyRepository extends JpaRepository<RenewalbpNoticeComplyEntity, Integer> {

	//define query
}
