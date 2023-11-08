package com.cituccs.bfp.Controller;

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

import com.cituccs.bfp.Entity.OccupancyDisapprovedClerkEntity;
import com.cituccs.bfp.Service.OccupancyDisapprovedClerkService;

@RestController
@CrossOrigin
@RequestMapping("/occupancyDisapprovedClerk")
public class OccupancyDisapprovedClerkController {
	
	@Autowired
	OccupancyDisapprovedClerkService odcserv;
	
	//get all records
	@GetMapping("/getAllOccupancyDisapprovedClerk")
	public List<OccupancyDisapprovedClerkEntity> getAllOccupancyDisapprovedClerk(){
		return odcserv.getAllOccupancyDisapprovedClerk();
		
	}
	
	//update records
	@PutMapping("/putOccupancyDisapprovedClerk")
	public OccupancyDisapprovedClerkEntity putOccupancyDisapprovedClerk(@RequestParam int id,@RequestBody OccupancyDisapprovedClerkEntity newOccupancyDisapprovedClerkDetails) throws Exception {
		return odcserv.putOccupancyDisapprovedClerkEntity(id, newOccupancyDisapprovedClerkDetails);
	}
	
	@PutMapping("/updateOccupancyDisapprovedClerk")
	public OccupancyDisapprovedClerkEntity updateOccupancyDisapprovedClerk(@RequestParam int id, @RequestBody OccupancyDisapprovedClerkEntity newOccupancyDisapprovedClerkDetails) throws Exception {
		return odcserv.updateOccupancyDisapprovedClerk(id, newOccupancyDisapprovedClerkDetails);
	}
	
	
	//adding records
	@PostMapping("/insertNODPermit")
    public OccupancyDisapprovedClerkEntity insertPermit(@RequestBody OccupancyDisapprovedClerkEntity permit) {
        return odcserv.insertNodPermit(permit);
    }
	
	@GetMapping("/printApp")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	
	@DeleteMapping("deletePermit/{id}")
    public String deletePermit(@PathVariable int id) {
        return odcserv.deleteItem(id);
    }
}
