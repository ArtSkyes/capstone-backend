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

import com.bfp.oms.Entity.OccupancyPendingClerkEntity;
import com.bfp.oms.Service.OccupancyPendingClerkService;


@RestController
@RequestMapping("/occupancyPendingclerk")
@CrossOrigin
public class OccupancyPendingClerkController {
	
	@Autowired
	OccupancyPendingClerkService opcserv;
	
	//get all records
	@GetMapping("/getAllOccupancyPendingClerk")
	public List<OccupancyPendingClerkEntity> getAllOccupancyPendingClerk(){
		return opcserv.getAllOccupancyPendingClerk();
		
	}
	
	//update records
	@PutMapping("/putOccupancyPendingClerk")
	public OccupancyPendingClerkEntity putOccupancyPendingClerk(int occupancypendingclerk_id, OccupancyPendingClerkEntity newOccupancyPendingClerkDetails) throws Exception {
		return opcserv.putOccupancyPendingClerkEntity(occupancypendingclerk_id, newOccupancyPendingClerkDetails);
	}
	
	@PutMapping("/updateOccupancyPendingClerk")
	public OccupancyPendingClerkEntity updateOccupancyPendingClerk(@RequestParam int id, @RequestBody OccupancyPendingClerkEntity newOccupancyPendingClerkDetails) throws Exception {
		return opcserv.updateOccupancyPendingClerk(id, newOccupancyPendingClerkDetails);
	}
	
	
	//adding records
	@PostMapping("/insertNODPermit")
    public OccupancyPendingClerkEntity insertPermit(@RequestBody OccupancyPendingClerkEntity permit) {
        return opcserv.insertNodPermit(permit);
    }
	
	@GetMapping("/printApp")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	
	@DeleteMapping("deletePermit/{id}")
    public String deletePermit(@PathVariable int id) {
        return opcserv.deleteItem(id);
    }
}
	
	
	

