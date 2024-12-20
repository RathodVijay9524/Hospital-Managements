package com.vijay.HospitalApplication.repository;

import com.vijay.HospitalApplication.entity.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}
