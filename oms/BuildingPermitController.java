package com.cituccs.bfp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cituccs.bfp.Entity.BuildingPermitEntity;
import com.cituccs.bfp.Service.BuildingPermitService;


@RestController
@CrossOrigin
@RequestMapping("/buildingpermit")
public class BuildingPermitController {
	
	@Autowired
	BuildingPermitService bpserv;
	
	@GetMapping("/print")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	
	@GetMapping("/getAllBuildingPermit")
	public List<BuildingPermitEntity> getAllBuildingPermit(){
		return bpserv.getAllBuildingPermit();
	}
	
	@PutMapping("/putBuildngPermit")
	public BuildingPermitEntity putBuildingPermit(int bp_id, BuildingPermitEntity newBuildingPermitDetails) throws Exception{
		return bpserv.putBuildingPermit(bp_id, newBuildingPermitDetails);
	}
	

}
