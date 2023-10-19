package com.cituccs.bfp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cituccs.bfp.Entity.ApprovedApplicationEntity;
import com.cituccs.bfp.Service.ApprovedApplicationService;



@CrossOrigin
@RestController
@RequestMapping("/approved")
public class ApprovedApplicationController {
	
	@Autowired
	ApprovedApplicationService aserv;
	
	
	@GetMapping("/print")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	
	@GetMapping("/getAllApprovedApplication")
	public List<ApprovedApplicationEntity> getAllApprovedApplication(){
		return aserv.getAllApprovedApplication();
	}
	@PutMapping("/putApprovedApplication")
	public ApprovedApplicationEntity putApporvedApplication(@RequestParam int approved_id, @RequestBody ApprovedApplicationEntity newApprovedApplication) throws Exception {
		return aserv.putApprovedApplication(approved_id, newApprovedApplication);
	}	
}

