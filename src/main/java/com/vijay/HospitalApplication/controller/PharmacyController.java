package com.vijay.HospitalApplication.controller;

import com.vijay.HospitalApplication.entity.Prescription;
import com.vijay.HospitalApplication.service.PharmacyService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pharmacy")
@AllArgsConstructor
public class PharmacyController {

    private final PharmacyService pharmacyService;
    @PostMapping("/dispense")
    public ResponseEntity<String> dispenseMedication(@RequestBody Prescription prescription) {
        // Dispense medication logic here
        return ResponseEntity.ok("Medication dispensed successfully");
    }
}
