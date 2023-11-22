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

import com.bfp.oms.Entity.RenewalPendingApplications;
import com.bfp.oms.Service.RenewalPendingService;

@CrossOrigin
@RestController
@RequestMapping("/Renewal")
public class RenewalPendingApplicationController {

	@Autowired
	RenewalPendingService bppserv;
	
	@GetMapping("/print")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	
	@GetMapping("/getAllRenewalPermit")
	public List<RenewalPendingApplications> getAllRenewalBuildingPermit(){
		return bppserv.getAllPendingApplications();
	}
	
	@PutMapping("/putRenewalPermit")
	public RenewalPendingApplications putRenewalApplications(@RequestParam int id, @RequestBody RenewalPendingApplications newRenewalPendingApplications) throws Exception{
		return bppserv.updatePendingApplication(id, newRenewalPendingApplications);
	}
	@PostMapping("/insertRenewalPermit")
    public RenewalPendingApplications insertPermit(@RequestBody RenewalPendingApplications permit) {
        return bppserv.insertRenewalPendingPermit(permit);
    }
	
	@DeleteMapping("deletePermit/{id}")
    public String deletePermit(@PathVariable int id) {
        return bppserv.deletePermit(id);
    }
}
