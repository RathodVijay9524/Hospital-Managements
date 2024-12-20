package com.vijay.HospitalApplication.controller;

import com.vijay.HospitalApplication.entity.Patient;
import com.vijay.HospitalApplication.service.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/patients")
@AllArgsConstructor
public class PatientController {

    private final PatientService patientService;

    @PostMapping("/register")
    public ResponseEntity<String> registerPatient(@RequestBody Patient patient) {
        patientService.registerPatient(patient);
        return ResponseEntity.ok("Patient registered successfully !!");
    }

    @PostMapping("/discharge/{patientId}")
    public ResponseEntity<String> dischargePatient(@PathVariable Long patientId) {
        patientService.dischargePatient(patientId);
        return ResponseEntity.ok("Patient discharged successfully !!");
    }
}

