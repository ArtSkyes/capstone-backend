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

import com.bfp.oms.Entity.NewBusinessPaymentEntity;
import com.bfp.oms.Service.NewBusinessPermitPaymentService;

@RestController
@RequestMapping("/newBusinessPayment")
@CrossOrigin
public class NewBusinessPermitPaymentController {
	@Autowired
	NewBusinessPermitPaymentService bpserv;
	
	//read all records
	@GetMapping("/getAllNewbpPayment")
	public List<NewBusinessPaymentEntity> getAllNewBusinessPayment(){
		return bpserv.getAllNewBusinessPayment();
	}
	@PutMapping("/updateNewBpPayment")
	public NewBusinessPaymentEntity putNewBusinessPayment(@RequestParam int id,@RequestBody NewBusinessPaymentEntity newNewbpPaymentDetails) throws Exception{
		return bpserv.evaluateBusinessPayment(id, newNewbpPaymentDetails);
	}
	
	
	@PostMapping("/insertNewBpPayment")
    public NewBusinessPaymentEntity insertNewBusinessPayment(@RequestBody NewBusinessPaymentEntity payment) {
        return bpserv.insertNewBusinessPayment(payment);
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