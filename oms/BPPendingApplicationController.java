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

import com.cituccs.bfp.Entity.BPPendingApplications;
import com.cituccs.bfp.Service.BPPendingService;

@RestController
@CrossOrigin
@RequestMapping("/BPPending")
public class BPPendingApplicationController {

	@Autowired
	BPPendingService bppserv;
	
	@GetMapping("/print")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	
	@GetMapping("/getAllBPPermit")
	public List<BPPendingApplications> getAllBuildingPermit(){
		return bppserv.getAllPendingApplications();
	}
	
	@PutMapping("/putBPPermit")
	public BPPendingApplications putBPPendingApplications(@RequestParam int id, @RequestBody BPPendingApplications newBPPendingApplications) throws Exception{
		return bppserv.updatePendingApplication(id, newBPPendingApplications);
	}
	
	@PostMapping("/insertBPPermit")
    public BPPendingApplications insertPermit(@RequestBody BPPendingApplications permit) {
        return bppserv.insertBPPendingPermit(permit);
    }
	
	@DeleteMapping("deletePermit/{id}")
    public String deletePermit(@PathVariable int id) {
        return bppserv.deletePermit(id);
    }
}
