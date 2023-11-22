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

import com.bfp.oms.Entity.RenewalbpClosureOrderEntity;
import com.bfp.oms.Service.RenewalbpClosureOrderService;



@RestController
@RequestMapping("/renewalbpclosureorder")
@CrossOrigin
public class RenewalbpClosureOrder {

	@Autowired
	RenewalbpClosureOrderService renewcoserv;
	
	//read all records
	@GetMapping("/getAllRenewalbpClosureOrder")
	public List<RenewalbpClosureOrderEntity> getAllRenewalbpClosureOrder(){
		return renewcoserv.getAllRenewalbpClosureOrder();
	}
	
	
	@PutMapping("/updateRemarks")
	public RenewalbpClosureOrderEntity putRenewalbpClosureOrder(@RequestParam int id, @RequestBody RenewalbpClosureOrderEntity newRenewalbpClosureOrderDetails) throws Exception{
	     return renewcoserv.putRenewalbpClosureOrder(id, newRenewalbpClosureOrderDetails);
	}
	
	@PutMapping("/updateRenewalbpClosure")
	public RenewalbpClosureOrderEntity updateRenewalbpClosureOrder(int id, RenewalbpClosureOrderEntity newRenewalbpClosureOrderDetails) throws Exception{
		return renewcoserv.updateRenewalbpClosureOrder(id, newRenewalbpClosureOrderDetails);
	}
	
	@PostMapping("/insertRenewalClosurePermit")
    public RenewalbpClosureOrderEntity insertPermit(@RequestBody RenewalbpClosureOrderEntity permit) {
        return renewcoserv.insertClosurePermit(permit);
    }
	
	@GetMapping("/printApp")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	@DeleteMapping("deletePermit/{id}")
    public String deletePermit(@PathVariable int id) {
        return renewcoserv.deleteItem(id);
    }
}

