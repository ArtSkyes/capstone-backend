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
import com.cituccs.bfp.Entity.RenewalbpNoticeCorrectViolationEntity;
import com.cituccs.bfp.Service.RenewalbpNoticeCorrectViolationService;



@RestController
@RequestMapping("/renewalbpnoticetocorrectviolation")
@CrossOrigin
public class RenewalbpNoticeCorrectViolationController {
	
	@Autowired
	RenewalbpNoticeCorrectViolationService renewcvserv;

	
	//read all records
	@GetMapping("/getAllRenewalbpNoticeToCorrectViolation")
	public List<RenewalbpNoticeCorrectViolationEntity> getAllRenewalbpNoticeCorrectViolation(){
		return renewcvserv.getAllRenewalbpNoticeCorrectViolation();
	}
	
	public RenewalbpNoticeCorrectViolationEntity putRenewalbpNoticeCorrectViolation(int renewao_id, RenewalbpNoticeCorrectViolationEntity newRenewalbpNoticeCorrectViolationDetials) throws Exception{
		return renewcvserv.putRenewalbpNoticeCorrectViolation(renewao_id, newRenewalbpNoticeCorrectViolationDetials);
	}
	
	@PutMapping("/updateRenewalbpNTCV")
	public RenewalbpNoticeCorrectViolationEntity updateRenewalbpNoticeCorrectViolation(@RequestParam int id,@RequestBody RenewalbpNoticeCorrectViolationEntity newRenewalbpNoticeCorrectViolationDetials) throws Exception{
		return renewcvserv.updateRenewalbpNoticeCorrectViolation(id, newRenewalbpNoticeCorrectViolationDetials);
	}
	
	@PostMapping("/insertRenewalNTCVPermit")
    public RenewalbpNoticeCorrectViolationEntity insertPermit(@RequestBody RenewalbpNoticeCorrectViolationEntity permit) {
        return renewcvserv.insertNTCVPermit(permit);
    }
	
	@GetMapping("/printApp")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	
	@DeleteMapping("deletePermit/{id}")
    public String deletePermit(@PathVariable int id) {
        return renewcvserv.deleteItem(id);
    }
}
