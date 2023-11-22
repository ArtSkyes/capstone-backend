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

import com.bfp.oms.Entity.BuildingPermitPaymentEntity;
import com.bfp.oms.Service.BuildingPermitPaymentService;

@RestController
@RequestMapping("/BuildingPermitPayment")
@CrossOrigin
public class BuildingPermitPaymentController {
	@Autowired
	BuildingPermitPaymentService bpserv;
	
	//read all records
	@GetMapping("/getAllBuildingPayment")
	public List<BuildingPermitPaymentEntity> getAllBuildingPayment(){
		return bpserv.getAllBuildingPayment();
	}
	@PutMapping("/updateBuildingPayment")
	public BuildingPermitPaymentEntity putBuildingPayment(@RequestParam int id,@RequestBody BuildingPermitPaymentEntity newNewbpPaymentDetails) throws Exception{
		return bpserv.evaluateBuildingPayment(id, newNewbpPaymentDetails);
	}
	
	@PostMapping("/insertBuildingPayment")
    public BuildingPermitPaymentEntity insertBuildingPayment(@RequestBody BuildingPermitPaymentEntity payment) {
        return bpserv.insertNewBuildingPayment(payment);
    }
	
	@GetMapping("/printApp")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	
	@DeleteMapping("deletePermit/{id}")
    public String deletePermit(@PathVariable int id) {
        return bpserv.deleteItem(id);
    }
	
	
	
}