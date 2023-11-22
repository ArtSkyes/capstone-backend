package com.bfp.oms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bfp.oms.Entity.BuildingListEntity;
import com.bfp.oms.Service.BuildingListService;

@CrossOrigin
@RestController
@RequestMapping("/BFP")
public class BuildingListController {
	@Autowired
	BuildingListService bfpserv;
	
	//Read
    @GetMapping("/displayAllPermits")
    public List<BuildingListEntity> getallPermits(){
        return bfpserv.getallPermits();
    }
    //Create or insert a Form
    @PostMapping("/insertPermit")
    public BuildingListEntity insertPermit(@RequestBody BuildingListEntity permit) {
        return bfpserv.insertPermit(permit);
    }
    
    //Read a record by BuildingPermitno
    @GetMapping("/getByBuildingPermitno")
    public BuildingListEntity findByBuildingPermitno(@RequestParam String buildingpermitno) {
        return bfpserv.findByBuildingPermitNo(buildingpermitno);
    }
    

    @PutMapping("/updatePermit")
    public BuildingListEntity updatePermit(@RequestParam int id,    @RequestBody BuildingListEntity newItemDetails) throws Exception {
        return bfpserv.updatePermit(id, newItemDetails);
    }
    
    @PutMapping("/addEval")
    public BuildingListEntity update(@RequestParam int id,    @RequestBody BuildingListEntity newItemDetails) throws Exception {
        return bfpserv.updatePermit(id, newItemDetails);
    }
  
    @DeleteMapping("deletePermit/{controlno}")
    public String deletePermit(@PathVariable int controlno) {
        return bfpserv.deletePermit(controlno);
    }
}
