package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.bfp.Entity.BusinessPendingApplications;

@Repository
public interface BusinessPendingApplicationsRepository extends JpaRepository<BusinessPendingApplications, Integer> {

}
