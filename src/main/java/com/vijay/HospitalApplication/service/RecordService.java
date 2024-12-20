package com.vijay.HospitalApplication.service;

import com.vijay.HospitalApplication.entity.Patient;
import org.springframework.stereotype.Service;

@Service
public class RecordService {
    public void updateRecords(Patient patient) {
        // Asynchronous record updating logic here
        System.out.println("Records updated for patient: " + patient.getName());
    }
}