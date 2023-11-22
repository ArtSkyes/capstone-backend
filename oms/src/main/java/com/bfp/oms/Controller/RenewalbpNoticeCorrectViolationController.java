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
import com.bfp.oms.Entity.RenewalbpNoticeCorrectViolationEntity;
import com.bfp.oms.Service.RenewalbpNoticeCorrectViolationService;



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
	
	@PutMapping("/updateRemarksNTCV")
	public RenewalbpNoticeCorrectViolationEntity putRenewalbpNoticeCorrectViolation(@RequestParam int renewao_id,@RequestBody RenewalbpNoticeCorrectViolationEntity newRenewalbpNoticeCorrectViolationDetials) throws Exception{
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
