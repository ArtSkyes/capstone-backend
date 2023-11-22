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
import com.bfp.oms.Entity.RenewalbpNoticeComplyEntity;
import com.bfp.oms.Service.RenewalbpNoticeComplyService;


@RestController
@RequestMapping("/renewalbpnoticetocomply")
@CrossOrigin
public class RenewalbpNoticeComplyController {

	@Autowired
	RenewalbpNoticeComplyService renewncserv;
	
	//read all records
	@GetMapping("/getAllRenewalbpNoticeToComply")
	public List<RenewalbpNoticeComplyEntity> getAllRenewalbpNoticeComply(){
		return renewncserv.getAllRenewalbpNoticeComply();
	}
	@PutMapping("/updateRemarksRenewal")
	public RenewalbpNoticeComplyEntity putRenewalbpNoticeComply(@RequestParam int renewnc_id,@RequestBody RenewalbpNoticeComplyEntity newRenewalbpNoticeComplyDetails) throws Exception{
		return renewncserv.putRenewalbpNoticeComply(renewnc_id, newRenewalbpNoticeComplyDetails);
	}
	
	@PutMapping("/updateRenewalbpNTC")
	public RenewalbpNoticeComplyEntity updateRenewalbpNoticeComply(@RequestParam int id,@RequestBody RenewalbpNoticeComplyEntity newRenewalbpNoticeComplyDetails) throws Exception{
		return renewncserv.updateRenewalbpNoticeComply(id, newRenewalbpNoticeComplyDetails);
	}
	
	@PostMapping("/insertRenewalNTCPermit")
    public RenewalbpNoticeComplyEntity insertPermit(@RequestBody RenewalbpNoticeComplyEntity permit) {
        return renewncserv.insertNTCPermit(permit);
    }
	
	@GetMapping("/printApp")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	
	@DeleteMapping("deletePermit/{id}")
    public String deletePermit(@PathVariable int id) {
        return renewncserv.deleteItem(id);
    }
}