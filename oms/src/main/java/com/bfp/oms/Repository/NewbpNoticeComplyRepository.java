package com.bfp.oms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfp.oms.Entity.NewbpNoticeComplyEntity;


@Repository
public interface NewbpNoticeComplyRepository extends JpaRepository<NewbpNoticeComplyEntity, Integer>{

	//define query
	
}
