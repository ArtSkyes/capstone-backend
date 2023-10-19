package com.cituccs.bfp.Controller;

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

import com.cituccs.bfp.Entity.RenewalbpAbatementOrderEntity;
import com.cituccs.bfp.Service.RenewalbpAbatementOrderService;



@RestController
@RequestMapping("/renewalbpabatementorder")
@CrossOrigin
public class RenewalbpAbatementOrderController {

	@Autowired
	RenewalbpAbatementOrderService renewaoserv;
	//read all records
	@GetMapping("/getAllRenewalbpAbatementOrder")
	public List<RenewalbpAbatementOrderEntity> getAllRenewalbpAbatementOrder(){
		return renewaoserv.getAllRenewalbpAbatementOrder();
	}
	
	public RenewalbpAbatementOrderEntity putRenewalbpAbatementOrder(int renewao_id, RenewalbpAbatementOrderEntity newRenewalbpAbatementOrderDetails) throws Exception{
		return renewaoserv.putRenewalbpAbatementOrder(renewao_id, newRenewalbpAbatementOrderDetails);
	}
		
	@PutMapping("/updateRenewalbpAbatement")
	public RenewalbpAbatementOrderEntity updateRenewalbpAbatementOrder(@RequestParam int id,@RequestBody RenewalbpAbatementOrderEntity newRenewalbpAbatementOrderDetails) throws Exception{
		return renewaoserv.putRenewalbpAbatementOrder(id, newRenewalbpAbatementOrderDetails);
	}
	
	@PostMapping("/insertRenewalAbatementPermit")
    public RenewalbpAbatementOrderEntity insertPermit(@RequestBody RenewalbpAbatementOrderEntity permit) {
        return renewaoserv.insertAbatementPermit(permit);
    }
	
	@GetMapping("/printApp")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	@DeleteMapping("deletePermit/{id}")
    public String deletePermit(@PathVariable int id) {
        return renewaoserv.deleteItem(id);
    }
	
	
}
