package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cituccs.bfp.Entity.BpApplicationsEntity;



@Repository
public interface BpApplicationsRepository extends JpaRepository<BpApplicationsEntity, Integer>{

}
