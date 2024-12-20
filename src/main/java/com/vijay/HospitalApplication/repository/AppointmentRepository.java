package com.vijay.HospitalApplication.repository;

import com.vijay.HospitalApplication.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}