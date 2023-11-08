package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cituccs.bfp.Entity.BuildingListEntity;

public interface BuildingListRepository extends JpaRepository<BuildingListEntity,Integer> {
	BuildingListEntity findByBuildingpermitno(String Buildingpermitno);
	
}
