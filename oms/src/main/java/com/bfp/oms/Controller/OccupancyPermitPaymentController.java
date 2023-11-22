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

import com.bfp.oms.Entity.OccupancyPermitPaymentEntity;
import com.bfp.oms.Service.OccupancyPermitPaymentService;

@RestController
@RequestMapping("/OccupancyPayment")
@CrossOrigin
public class OccupancyPermitPaymentController {
	@Autowired
	OccupancyPermitPaymentService bpserv;
	
	//read all records
	@GetMapping("/getAllOccupancyPayment")
	public List<OccupancyPermitPaymentEntity> getAllOccupancyPayment(){
		return bpserv.getAllOccupancyPayment();
	}
	@PutMapping("/updateOccupancyPayment")
	public OccupancyPermitPaymentEntity putOccupancyPayment(@RequestParam int id,@RequestBody OccupancyPermitPaymentEntity newNewbpPaymentDetails) throws Exception{
		return bpserv.evaluatOccupancyPayment(id, newNewbpPaymentDetails);
	}
	
	
	@PostMapping("/insertOccupancyPayment")
    public OccupancyPermitPaymentEntity insertOccupancyPayment(@RequestBody OccupancyPermitPaymentEntity payment) {
        return bpserv.insertOccupancyPayment(payment);
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
