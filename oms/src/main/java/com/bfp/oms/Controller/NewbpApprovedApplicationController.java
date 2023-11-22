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

import com.bfp.oms.Entity.NewbpApprovedApplicationEntity;
import com.bfp.oms.Service.NewbpApprovedApplicationService;


@RestController
@RequestMapping("/newbpapplication")
@CrossOrigin
public class NewbpApprovedApplicationController {
	
	@Autowired
	NewbpApprovedApplicationService newbpserv;
	
	//get All Applications
	@GetMapping("/getAllNewbpApprovedApplication")
	public List<NewbpApprovedApplicationEntity> getAllNewbpApprovedApplication(){
		return newbpserv.getAllNewbpApprovedApplication();
	}
	
	//update records
	@PutMapping("/putNewbpApprovedApplication")
	public NewbpApprovedApplicationEntity putNewbpApprovedApplication(@RequestParam int id, @RequestBody NewbpApprovedApplicationEntity newNewbpApprovedApplicationDetails) throws Exception{
		return newbpserv.putNewbpApprovedApplication(id, newNewbpApprovedApplicationDetails);
	}
	
	//update records
	@PutMapping("/putEvalauteApprovedApplication")
		public NewbpApprovedApplicationEntity evaluateApprovedBp(@RequestParam int id, @RequestBody NewbpApprovedApplicationEntity newNewbpApprovedApplicationDetails) throws Exception{
			return newbpserv.evaluateApprovedBp(id, newNewbpApprovedApplicationDetails);
		}
	
	
	@PostMapping("/insertBusinessPermit")
    public NewbpApprovedApplicationEntity insertPermit(@RequestBody NewbpApprovedApplicationEntity permit) {
        return newbpserv.insertApprovedPermit(permit);
    }

	@GetMapping("/printApp")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	
	@DeleteMapping("deletePermit/{id}")
    public String deletePermit(@PathVariable int id) {
        return newbpserv.deleteItem(id);
    }
	

}
