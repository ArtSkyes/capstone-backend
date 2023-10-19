package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.bfp.Entity.ComplyApplicationEntity;


@Repository
public interface ComplyApplicationRepository extends JpaRepository<ComplyApplicationEntity, Integer>{


}
