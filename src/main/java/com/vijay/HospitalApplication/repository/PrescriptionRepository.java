package com.vijay.HospitalApplication.repository;

import com.vijay.HospitalApplication.entity.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
}
