package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.bfp.Entity.RenewalbpApprovedApplicationEntity;



@Repository
public interface RenewalbpApprovedApplicationRepository extends JpaRepository<RenewalbpApprovedApplicationEntity, Integer>{

	//define query
}
