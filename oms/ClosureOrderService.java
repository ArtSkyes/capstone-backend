package com.cituccs.bfp.Service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cituccs.bfp.Entity.ClosureOrderEntity;
import com.cituccs.bfp.Repository.ClosureOrderRepository;


@Service
public class ClosureOrderService {
	
	@Autowired
	ClosureOrderRepository corepo;
	
	//read all records
	public List<ClosureOrderEntity> getAllClosureOrder(){
		return corepo.findAll();
	}
	
	//update records
	public ClosureOrderEntity putClosureOrder(int co_id, ClosureOrderEntity newClosureOrderDetails) throws Exception{
		
		ClosureOrderEntity newClosureOrder = new ClosureOrderEntity();
		
		try {
			//search
			newClosureOrder = corepo.findById(co_id).get();
			
			//update
			newClosureOrder.setStatus(newClosureOrderDetails.getStatus());
			
			//save
			return corepo.save(newClosureOrder);
			
		}catch(NoResultException nex) {
			throw new Exception("ID Number" + co_id + "Does not Exist!");
		}
		
	}
	
	

}
