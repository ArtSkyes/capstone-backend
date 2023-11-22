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

import com.bfp.oms.Entity.BusinessPendingApplications;
import com.bfp.oms.Service.BusinessPendingApplicationService;

@RestController
@CrossOrigin
@RequestMapping("/BPPending")
public class BusinessPendingApplicationController {

	@Autowired
	BusinessPendingApplicationService bppserv;
	
	@GetMapping("/print")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	
	@GetMapping("/getAllBPPermit")
	public List<BusinessPendingApplications> getAllBuildingPermit(){
		return bppserv.getAllPendingApplications();
	}
	
	@PutMapping("/putBPPermit")
	public BusinessPendingApplications putBPPendingApplications(@RequestParam int id, @RequestBody BusinessPendingApplications newBPPendingApplications) throws Exception{
		return bppserv.updatePendingApplication(id, newBPPendingApplications);
	}
	
	@PostMapping("/insertBPPermit")
    public BusinessPendingApplications insertPermit(@RequestBody BusinessPendingApplications permit) {
        return bppserv.insertBPPendingPermit(permit);
    }
	
	@DeleteMapping("deletePermit/{id}")
    public String deletePermit(@PathVariable int id) {
        return bppserv.deletePermit(id);
    }
}
