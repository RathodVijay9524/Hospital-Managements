package com.vijay.HospitalApplication.repository;

import com.vijay.HospitalApplication.entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepository extends JpaRepository<Billing, Long> {
}
