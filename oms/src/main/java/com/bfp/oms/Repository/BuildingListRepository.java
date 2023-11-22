package com.bfp.oms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bfp.oms.Entity.BuildingListEntity;

public interface BuildingListRepository extends JpaRepository<BuildingListEntity,Integer> {
	BuildingListEntity findByBuildingpermitno(String Buildingpermitno);
	
}
