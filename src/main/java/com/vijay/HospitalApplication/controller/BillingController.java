package com.vijay.HospitalApplication.controller;

import com.vijay.HospitalApplication.entity.Billing;
import com.vijay.HospitalApplication.service.BillingService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/billing")
@AllArgsConstructor
public class BillingController {
    private final BillingService billingService;

    @PostMapping("/process")
    public ResponseEntity<String> processBilling(@RequestBody Billing billing) {
        // Process billing logic here
        return ResponseEntity.ok("Billing processed successfully");
    }
}
