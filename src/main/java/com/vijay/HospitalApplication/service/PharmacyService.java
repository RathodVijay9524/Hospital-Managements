package com.vijay.HospitalApplication.service;

import com.vijay.HospitalApplication.event.PatientDischargedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class PharmacyService {

    @Async
    @EventListener
    public void updatePatientHistory(PatientDischargedEvent event) {
        // Update medical records
        System.out.println("Medical Records Service: Updating records for patient "
                +event.getPatient().getName()+" : "+Thread.currentThread().getName());
    }
}
