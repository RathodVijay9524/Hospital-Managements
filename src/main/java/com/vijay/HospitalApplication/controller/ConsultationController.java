package com.vijay.HospitalApplication.controller;

import com.vijay.HospitalApplication.entity.Consultation;
import com.vijay.HospitalApplication.service.ConsultationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/consultations")
@AllArgsConstructor
public class ConsultationController {
    private final ConsultationService consultationService;

    @PostMapping("/update")
    public ResponseEntity<String> updateConsultation(@RequestBody Consultation consultation) {
        // Update consultation logic here
        return ResponseEntity.ok("Consultation updated successfully");
    }
}
