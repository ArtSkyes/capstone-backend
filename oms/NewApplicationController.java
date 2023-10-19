package com.cituccs.bfp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cituccs.bfp.Entity.NewApplicationEntity;
import com.cituccs.bfp.Service.NewApplicationService;



@RestController
@RequestMapping("/application")
@CrossOrigin
public class NewApplicationController {

	@Autowired
	NewApplicationService nserv;
	
	
	//print
	@GetMapping("/printApp")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	
	//get all applications
	@GetMapping("/getAllNewApplication")
	public List<NewApplicationEntity> getAllNewApplication(){
		return nserv.getAllNewApplication();
	}

	@PutMapping("/putNewApplication/{id}")
	public NewApplicationEntity putNewApplication(@PathVariable int new_id, @RequestBody NewApplicationEntity newNewApplicationDetails) throws Exception{
		return nserv.putNewApplication(new_id, newNewApplicationDetails);
	}
	
	 @PostMapping("/insertPermit")
	    public NewApplicationEntity insertPermit(@RequestBody NewApplicationEntity permit) {
	        return nserv.insertOccupancyPermit(permit);
	    }
	
}

