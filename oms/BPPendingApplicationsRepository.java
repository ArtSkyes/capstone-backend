package com.cituccs.bfp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cituccs.bfp.Entity.BPPendingApplications;

@Repository
public interface BPPendingApplicationsRepository extends JpaRepository<BPPendingApplications, Integer> {

}
