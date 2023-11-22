package com.bfp.oms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bfp.oms.Entity.RenewalPendingApplications;

@Repository
public interface RenewalPendingApplicationsRepository extends JpaRepository<RenewalPendingApplications, Integer> {

}
