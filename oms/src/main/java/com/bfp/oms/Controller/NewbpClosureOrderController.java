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

import com.bfp.oms.Entity.NewbpClosureOrderEntity;
import com.bfp.oms.Service.NewbpClosureOrderService;



@RestController
@RequestMapping("/newbpclosureorder")
@CrossOrigin
public class NewbpClosureOrderController {

	@Autowired
	NewbpClosureOrderService newcoserv;
	
	
	//read all records
	@GetMapping("/getAllNewbpClosure")
	public List<NewbpClosureOrderEntity> getAllNewbpClosureOrder(){
		return newcoserv.getAllNewbpClosureOrder();
	}
	@PutMapping("/updateRemarks")
	public NewbpClosureOrderEntity putNewbpClosureOrder(@RequestParam int id,@RequestBody NewbpClosureOrderEntity newNewbpClosureOrderDetails) throws Exception{
		return newcoserv.putNewbpClosureOrder(id, newNewbpClosureOrderDetails);
	}
	
	@PutMapping("/updateNewbpClosure")
	public NewbpClosureOrderEntity updateNewbpClosureOrder(@RequestParam int id,@RequestBody NewbpClosureOrderEntity newNewbpClosureOrderDetails) throws Exception{
		return newcoserv.updateNewbpClosureOrder(id, newNewbpClosureOrderDetails);
	}
	
	@PostMapping("/insertClosurePermit")
    public NewbpClosureOrderEntity insertPermit(@RequestBody NewbpClosureOrderEntity permit) {
        return newcoserv.insertClosurePermit(permit);
    }
	
	@GetMapping("/printApp")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	
	@DeleteMapping("deletePermit/{id}")
    public String deletePermit(@PathVariable int id) {
        return newcoserv.deleteItem(id);
    }
}

	