package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cituccs.bfp.Entity.CorrectViolationEntity;



@Repository
public interface CorrectViolationRepository extends JpaRepository<CorrectViolationEntity, Integer>{

}