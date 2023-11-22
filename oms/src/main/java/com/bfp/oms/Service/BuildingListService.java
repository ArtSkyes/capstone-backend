package com.bfp.oms.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfp.oms.Entity.BuildingListEntity;
import com.bfp.oms.Repository.BuildingListRepository;


@Service
public class BuildingListService {
	@Autowired
	BuildingListRepository brepo;
	
		//Get All Permits
		public List<BuildingListEntity> getallPermits(){
			return brepo.findAll();
		}
		
		//C - Create or insert a pending Application
	    public BuildingListEntity insertPermit(BuildingListEntity permit) {
	        return brepo.save(permit);
	    }
	    //R - Read or search BuildingPermit by Building Permit No
	    public BuildingListEntity findByBuildingPermitNo(String buildingpermitno) {
	        if (brepo.findByBuildingpermitno(buildingpermitno)!= null ) {
	        	  return brepo.findByBuildingpermitno(buildingpermitno);
	        }
	        else
	            return null;
	    }
	    //U - Update a permit
	    public BuildingListEntity updatePermit(int id, BuildingListEntity newFormDetails) throws Exception{
	    	BuildingListEntity bfp = new BuildingListEntity();
	    	try {
	    		bfp = brepo.findById(id).get();
	    		bfp.setBuildingpermitno(newFormDetails.getBuildingpermitno());
	    		bfp.setNamepermitee(newFormDetails.getNamepermitee());
	    		bfp.setBusinessname(newFormDetails.getBusinessname());
	    		bfp.setAddress(newFormDetails.getAddress());
	    		bfp.setTypeofoccupancy(newFormDetails.getTypeofoccupancy());
	    		bfp.setContactno(newFormDetails.getContactno());
	    		bfp.setDatereceived(newFormDetails.getDatereceived());
	    		bfp.setReceivedby(newFormDetails.getReceivedby());
	    		bfp.setStatus(newFormDetails.getStatus());
	    		bfp.setEvaluator(newFormDetails.getEvaluator());
	    		bfp.setNostorey(newFormDetails.getNostorey());
	    		bfp.setConstructrenovate(newFormDetails.getConstructrenovate());
	    		bfp.setStructureConstructed(newFormDetails.isStructureconstructed());
	    		bfp.setRemarks(newFormDetails.getRemarks());
	    		bfp.setDefects(newFormDetails.getDefects());
	    		return brepo.save(bfp);
	    		
	    	}catch(NoSuchElementException nex){
	    		throw new Exception("ID number "+id+" does not exist!");
	    	}
	    	
	    }
	    
	  //U - Add Evaluation to Permit
	    public BuildingListEntity addEvaluation(int id, BuildingListEntity newFormDetails) throws Exception{
	    	BuildingListEntity bfp = new BuildingListEntity();
	    	try {
	    		bfp.setStatus(newFormDetails.getStatus());
	    		bfp.setEvaluator(newFormDetails.getEvaluator());
	    		bfp.setNostorey(newFormDetails.getNostorey());
	    		bfp.setConstructrenovate(newFormDetails.getConstructrenovate());
	    		bfp.setStructureConstructed(newFormDetails.isStructureconstructed());
	    		bfp.setRemarks(newFormDetails.getRemarks());
	    		bfp.setDefects(newFormDetails.getDefects());
	    		return brepo.save(bfp);
	    		
	    	}catch(NoSuchElementException nex){
	    		throw new Exception("ID number "+id+" does not exist!");
	    	}
	    	
	    }
	    
	    
	    
	    //D - Delete a course permit
	    public String deletePermit(int controlno) {
	        String msg;
	        if(brepo.findById(controlno) != null) {
	        	brepo.deleteById(controlno); //find the id number of the student to be deleted
	            msg = "Item ID Number: " + controlno + " was successfully deleted!";
	        } else {
	            msg = "Item ID Number: " + controlno + " was NOT found!";
	        }
	        
	        return msg;
	    }
}