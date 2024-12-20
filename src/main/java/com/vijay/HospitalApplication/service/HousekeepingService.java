package com.vijay.HospitalApplication.service;

import com.vijay.HospitalApplication.entity.Patient;
import com.vijay.HospitalApplication.event.PatientDischargedEvent;
import com.vijay.HospitalApplication.event.PatientRegisteredEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class HousekeepingService {
    @Async
    @EventListener
    public void cleanAndAssign(PatientDischargedEvent event) {
        // Prepare the room for the next patient
        System.out.println("Housekeeping Service: Preparing room for next patient after discharge of :"
                +event.getPatient().getName()+" : "+Thread.currentThread().getName());
    }
    @Async
    @EventListener
    public void cleanAndAssign(PatientRegisteredEvent event) {
        // Prepare the room for the next patient
        System.out.println("Housekeeping Service: Preparing room for this Patient :"
                +event.getPatient().getId()+" : "+Thread.currentThread().getName());
    }
}
