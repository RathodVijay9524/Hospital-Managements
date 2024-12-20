package com.vijay.HospitalApplication.repository;

import com.vijay.HospitalApplication.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}

