package com.bfp.oms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfp.oms.Entity.BusinessPendingApplications;

@Repository
public interface BusinessPendingApplicationsRepository extends JpaRepository<BusinessPendingApplications, Integer> {

}
