package com.cituccs.bfp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cituccs.bfp.Entity.ClosureOrderEntity;
import com.cituccs.bfp.Service.ClosureOrderService;


@RestController
@CrossOrigin
@RequestMapping("/closureorder")
public class ClosureOrderController {
	
	@Autowired
	ClosureOrderService coserv;
	
	@GetMapping("/getAllClosureOrder")
	public List<ClosureOrderEntity> getAllClosureOrder(){
		return coserv.getAllClosureOrder();
	}
	
	@PutMapping("/putClosureOrder")
	public ClosureOrderEntity putClosureOrder(int co_id, ClosureOrderEntity newClosureOrderDetails) throws Exception{
		return coserv.putClosureOrder(co_id, newClosureOrderDetails);
	}

}
