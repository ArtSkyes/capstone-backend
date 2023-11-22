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

import com.bfp.oms.Entity.OccupancyApprovedClerkEntity;
import com.bfp.oms.Service.OccupancyApprovedClerkService;



@CrossOrigin
@RestController
@RequestMapping("/approved")
public class OccupancyApprovedClerkController {
    
    @Autowired
    OccupancyApprovedClerkService aserv;
    
    
    @GetMapping("/print")
    public String printApplocation() {
        return "Labad Naman!!!";
    }
    
    @GetMapping("/getAllApprovedApplication")
    public List<OccupancyApprovedClerkEntity> getAllApprovedApplication(){
        return aserv.getAllApprovedApplication();
    }
    @PutMapping("/putApprovedApplication")
    public OccupancyApprovedClerkEntity putApporvedApplication(@RequestParam int id, @RequestBody OccupancyApprovedClerkEntity newApprovedApplication) throws Exception {
        return aserv.putApprovedApplication(id, newApprovedApplication);
    }
	
	//adding records
    @PostMapping("/insertApprovedPermit")
    public OccupancyApprovedClerkEntity insertPermit(@RequestBody OccupancyApprovedClerkEntity permit) {
        return aserv.insertNodPermit(permit);
    }


    @DeleteMapping("deletePermit/{id}")
    public String deletePermit(@PathVariable int id) {
        return aserv.deleteItem(id);
    }
}

