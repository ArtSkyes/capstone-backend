package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.bfp.Entity.NewApplicationEntity;



@Repository
public interface NewApplicationRepository extends JpaRepository<NewApplicationEntity, Integer> {

}


