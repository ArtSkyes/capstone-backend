package com.bfp.oms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfp.oms.Entity.BuildingListEntity;

@Repository
public interface BuildingListRepository extends JpaRepository<BuildingListEntity, Integer>{
	BuildingListEntity findByBuildingpermitno(String buildingpermitno);
}
