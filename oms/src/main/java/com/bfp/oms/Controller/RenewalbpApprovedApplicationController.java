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
import com.bfp.oms.Entity.RenewalbpApprovedApplicationEntity;
import com.bfp.oms.Service.RenewalbpApprovedApplicationService;


@RestController
@RequestMapping("/renewalbpapprovedapplication")
@CrossOrigin
public class RenewalbpApprovedApplicationController {

	@Autowired
	RenewalbpApprovedApplicationService renewapserv;
	
	//read all records
	@GetMapping("/getAllRenewalbpApprovedApplication")
	public List<RenewalbpApprovedApplicationEntity> getAllRenewabpApprovedApplication(){
		return renewapserv.getAllRenewabpApprovedApplication();
	}
	@PutMapping("/putAllRenewalApprovedApplication")
	public RenewalbpApprovedApplicationEntity putAllRenewalbpApprovedApplication(int renewbp_id, RenewalbpApprovedApplicationEntity newRenewalbpApprovedApplicationDetails) throws Exception{
		return renewapserv.putAllRenewalbpApprovedApplication(renewbp_id, newRenewalbpApprovedApplicationDetails);
	}
	//update records
	@PutMapping("/putEvalauteApprovedApplication")
	public RenewalbpApprovedApplicationEntity evaluateApprovedBp(@RequestParam int id, @RequestBody RenewalbpApprovedApplicationEntity newRenewalApprovedApplicationDetails) throws Exception{
		return renewapserv.evaluateApprovedBp(id, newRenewalApprovedApplicationDetails);
	}
		
		
	@PostMapping("/insertRenewalBusinessPermit")
    public RenewalbpApprovedApplicationEntity insertPermit(@RequestBody RenewalbpApprovedApplicationEntity permit) {
		return renewapserv.insertApprovedPermit(permit);
    }

	@GetMapping("/printApp")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	@DeleteMapping("deletePermit/{id}")
    public String deletePermit(@PathVariable int id) {
        return renewapserv.deleteItem(id);
    }
	
	
}
