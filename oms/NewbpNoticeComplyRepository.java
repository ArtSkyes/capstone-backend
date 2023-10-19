package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.bfp.Entity.NewbpNoticeComplyEntity;




@Repository
public interface NewbpNoticeComplyRepository extends JpaRepository<NewbpNoticeComplyEntity, Integer>{

	//define query
	
}
