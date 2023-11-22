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

import com.bfp.oms.Entity.RenewalBusinessPaymentEntity;
import com.bfp.oms.Service.RenewalBusinessPermitPaymentService;

@RestController
@RequestMapping("/newRenewalBusinessPayment")
@CrossOrigin
public class RenewalBusinessPermitPaymentController {
	@Autowired
	RenewalBusinessPermitPaymentService bpserv;
	
	//read all records
	@GetMapping("/getAllRenewalbpPayment")
	public List<RenewalBusinessPaymentEntity> getAllRenewalPayment(){
		return bpserv.getAllRenewalPayment();
	}
	@PutMapping("/updateRenewalBpPayment")
	public RenewalBusinessPaymentEntity putRenewalPayment(@RequestParam int id,@RequestBody RenewalBusinessPaymentEntity newNewbpPaymentDetails) throws Exception{
		return bpserv.evaluateRenewalBusinessPayment(id, newNewbpPaymentDetails);
	}
	
	
	@PostMapping("/insertRenewalBpPayment")
    public RenewalBusinessPaymentEntity insertRenewalPayment(@RequestBody RenewalBusinessPaymentEntity payment) {
        return bpserv.insertRenewalBusinessPayment(payment);
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