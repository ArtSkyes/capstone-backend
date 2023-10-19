package com.cituccs.bfp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cituccs.bfp.Entity.DisaprovalApplicationEntity;
import com.cituccs.bfp.Service.DisaprovalApplicationService;

@RestController
@CrossOrigin
@RequestMapping("/disaprovalapp")
public class DisaprovalApplicationController {
	
	@Autowired
	DisaprovalApplicationService dserv;
	
	@GetMapping("/print")
	public String printDisApprovalApplication() {
		return "Labad Naman!!!";
	}
	
	@GetMapping("/getDisaprovalApp")
	public List<DisaprovalApplicationEntity> getAllDisaprovalApplication(){
		return dserv.getAllDisaprovalApplication();
	}
	
	@PutMapping("/putDisaprovalApp")
	public DisaprovalApplicationEntity putDisaprovalApplication(int disapproval_id, DisaprovalApplicationEntity newDisaprovalApplicationDetails) throws Exception{
		return dserv.putDisaprovalApplication(disapproval_id, newDisaprovalApplicationDetails);
	}
}
