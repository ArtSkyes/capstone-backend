package com.bfp.oms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfp.oms.Entity.RenewalbpApprovedApplicationEntity;



@Repository
public interface RenewalbpApprovedApplicationRepository extends JpaRepository<RenewalbpApprovedApplicationEntity, Integer>{

	//define query
}
