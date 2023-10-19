package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cituccs.bfp.Entity.BuildingPermitEntity;



@Repository
public interface BuildingPermitRepository extends JpaRepository<BuildingPermitEntity, Integer> {

}
