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
import com.cituccs.bfp.Entity.NewbpAbatementOrderEntity;
import com.cituccs.bfp.Service.NewbpAbatementOrderService;



@RestController
@RequestMapping("/newbpabatementorder")
@CrossOrigin
public class NewbpAbatementOrderController {
	
	@Autowired
	NewbpAbatementOrderService newaoserv;
	
	@GetMapping("/getAllNewbpAbatementOrder")
	public List<NewbpAbatementOrderEntity> getAllNewbpAbatementOrder(){
		return newaoserv.getAllNewbpAbatementOrder();
	}
	
	@PutMapping("/putNewbpAbatementOrder")
	public NewbpAbatementOrderEntity putNewbpAbatementOrder(int newao_id, NewbpAbatementOrderEntity newNewbpAbatementOrderDetails) throws Exception {
		return newaoserv.putNewbpAbatementOrder(newao_id, newNewbpAbatementOrderDetails);
	}
	@PutMapping("/updateNewbpAbatementOrder")
	public NewbpAbatementOrderEntity updateNewbpAbatementOrder(@RequestParam int id,@RequestBody NewbpAbatementOrderEntity newNewbpAbatementOrderDetails) throws Exception {
		return newaoserv.updateNewbpAbatementOrder(id, newNewbpAbatementOrderDetails);
	}
	
	@PostMapping("/insertAbatementPermit")
    public NewbpAbatementOrderEntity insertPermit(@RequestBody NewbpAbatementOrderEntity permit) {
        return newaoserv.insertAbatementPermit(permit);
    }
	
	@GetMapping("/printApp")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	
	@DeleteMapping("deletePermit/{id}")
    public String deletePermit(@PathVariable int id) {
        return newaoserv.deleteItem(id);
    }
}