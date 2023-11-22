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
import com.bfp.oms.Entity.NewbpNoticeComplyEntity;
import com.bfp.oms.Service.NewbpNoticeComplyService;



@RestController
@RequestMapping("/newbpnoticetocomply")
@CrossOrigin
public class NewbpNoticeComplyController {
	
	@Autowired
	NewbpNoticeComplyService newncserv;
	
	//get all records
	@GetMapping("/getAllNewbpNoticetoComply")
	public List<NewbpNoticeComplyEntity> getAllNewbpNoticeComply(){
		return newncserv.getAllNewbpNoticeComply();
		
	}
	
	//update records
	@PutMapping("/putNewComply")
	public NewbpNoticeComplyEntity putNewbpNoticeComply(@RequestParam int id,@RequestBody NewbpNoticeComplyEntity newNewbpNoticeComplyDetails) throws Exception {
		return newncserv.putNewbpNoticeComply(id, newNewbpNoticeComplyDetails);
	}
	
	@PutMapping("/updateNewbpNotucetoComply")
	public NewbpNoticeComplyEntity updateNewbpNoticeComply(@RequestParam int id, @RequestBody NewbpNoticeComplyEntity newNewbpNoticeComplyDetails) throws Exception {
		return newncserv.updateNewbpNoticeComply(id, newNewbpNoticeComplyDetails);
	}
	
	
	//adding records
	@PostMapping("/insertNTCPermit")
    public NewbpNoticeComplyEntity insertPermit(@RequestBody NewbpNoticeComplyEntity permit) {
        return newncserv.insertNTCPermit(permit);
    }
	
	@GetMapping("/printApp")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	
	@DeleteMapping("deletePermit/{id}")
    public String deletePermit(@PathVariable int id) {
        return newncserv.deleteItem(id);
    }

}