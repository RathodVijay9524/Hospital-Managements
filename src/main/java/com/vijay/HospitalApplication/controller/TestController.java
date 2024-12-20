package com.vijay.HospitalApplication.controller;

import com.vijay.HospitalApplication.entity.TestResult;
import com.vijay.HospitalApplication.service.TestResultService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tests")
@AllArgsConstructor
public class TestController {
    
    private final TestResultService testResultService;

    @PostMapping("/record")
    public ResponseEntity<String> recordTestResult(@RequestBody TestResult testResult) {
        // Record test result logic here
        return ResponseEntity.ok("Test result recorded successfully");
    }
}
