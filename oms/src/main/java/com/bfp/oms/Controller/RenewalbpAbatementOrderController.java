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

import com.bfp.oms.Entity.RenewalbpAbatementOrderEntity;
import com.bfp.oms.Service.RenewalbpAbatementOrderService;



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
	@PutMapping("/updateRemarks")
	public RenewalbpAbatementOrderEntity putRenewalbpAbatementOrder(@RequestParam int id,@RequestBody RenewalbpAbatementOrderEntity newRenewalbpAbatementOrderDetails) throws Exception{
		return renewaoserv.putRenewalbpAbatementOrder(id, newRenewalbpAbatementOrderDetails);
	}
		
	@PutMapping("/updateRenewalbpAbatement")
	public RenewalbpAbatementOrderEntity updateRenewalbpAbatementOrder(@RequestParam int id,@RequestBody RenewalbpAbatementOrderEntity newRenewalbpAbatementOrderDetails) throws Exception{
		return renewaoserv.updateRenewalbpAbatementOrder(id, newRenewalbpAbatementOrderDetails);
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