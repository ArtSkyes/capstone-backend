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

import com.bfp.oms.Entity.OccupancyPendingClerkEntity;
import com.bfp.oms.Service.OccupancyPendingClerkService;


@RestController
@RequestMapping("/occupancyPendingclerk")
@CrossOrigin
public class OccupancyPendingClerkController {
    @Autowired
    OccupancyPendingClerkService oserv;

    @GetMapping("/getAllOccupancyPendingClerk")
    public List<OccupancyPendingClerkEntity> getAllRenewalbpAbatementOrder(){
        return oserv.getAllPendingOccupancy();
    }


    @PutMapping("/updateOccupancyPendingClerk")
    public OccupancyPendingClerkEntity updateRenewalbpAbatementOrder(@RequestParam int id,@RequestBody OccupancyPendingClerkEntity newPendingOccupancy) throws Exception{
        return oserv.updateOccupancyPending(id, newPendingOccupancy);
    }

    @PostMapping("/insertPendingOccupancy")
    public OccupancyPendingClerkEntity insertPermit(@RequestBody OccupancyPendingClerkEntity permit) {
        return oserv.insertOccupancyPending(permit);
    }

    @GetMapping("/printApp")
    public String printApplocation() {
        return "Labad Naman!!!";
    }
    @DeleteMapping("deletePermit/{id}")
    public String deletePermit(@PathVariable int id) {
        return oserv.deleteItem(id);
    }

}