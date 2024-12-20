package com.vijay.HospitalApplication.service;

import com.vijay.HospitalApplication.entity.Patient;
import com.vijay.HospitalApplication.event.PatientDischargedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class BillingService {
    @EventListener
    @Async
    public void processBill(PatientDischargedEvent patientDischargeEvent) {
        // Finalize billing details
        System.out.println("Billing Service: Finalizing bill for patient: "
                +patientDischargeEvent.getPatient().getId()+" : "+Thread.currentThread().getName());
    }
}
