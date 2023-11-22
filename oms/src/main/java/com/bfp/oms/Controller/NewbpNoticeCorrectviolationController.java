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
import com.bfp.oms.Entity.NewbpNoticeCorrectViolationEntity;
import com.bfp.oms.Service.NewbpNoticeCorrectViolationService;



@RestController
@CrossOrigin
@RequestMapping("/newbpnoticecorrectviolation")
public class NewbpNoticeCorrectviolationController {
	
	@Autowired
	NewbpNoticeCorrectViolationService newncvserv;

	//read all records
	@GetMapping("/getAllNewbpCorrectViolation")
	public List<NewbpNoticeCorrectViolationEntity> getAllNewbpNoticeCorrectViolation(){
		return newncvserv.getAllNewbpNoticeCorrectViolation();
	}
	
	//update records
	@PutMapping("/putNewbpCorrectViolation")
	public NewbpNoticeCorrectViolationEntity putNewbpNoticeCorrectViolation(@RequestParam int newncv_id,@RequestBody NewbpNoticeCorrectViolationEntity newNewbpNoticeCorrectViolationDetails) throws Exception{
		return newncvserv.putNewbpNoticeCorrectViolation(newncv_id, newNewbpNoticeCorrectViolationDetails);
	}
	
	//update records
	@PutMapping("/updateNewbpCorrectViolation")
	public NewbpNoticeCorrectViolationEntity updateNewbpNoticeCorrectViolation(@RequestParam int id,@RequestBody NewbpNoticeCorrectViolationEntity newNewbpNoticeCorrectViolationDetails) throws Exception{
		return newncvserv.updateNewbpNoticeCorrectViolation(id, newNewbpNoticeCorrectViolationDetails);
	}
	
	//adding records
	@PostMapping("/insertNTCVPermit")
    public NewbpNoticeCorrectViolationEntity insertPermit(@RequestBody NewbpNoticeCorrectViolationEntity permit) {
        return newncvserv.insertNTCVPermit(permit);
    }
	
	@GetMapping("/printApp")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	
	@DeleteMapping("deletePermit/{id}")
    public String deletePermit(@PathVariable int id) {
        return newncvserv.deleteItem(id);
    }
}