package com.vijay.HospitalApplication.service;

import com.vijay.HospitalApplication.entity.Patient;
import com.vijay.HospitalApplication.event.PatientDischargedEvent;
import com.vijay.HospitalApplication.event.PatientRegisteredEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @Async
    @EventListener
    public void notifyPatients(PatientDischargedEvent event) {
        // Send discharge notification
        System.out.println("Notification Service: Sending discharge notification for patient "
                +event.getPatient().getName()+" : "+Thread.currentThread().getName());
    }

    @Async
    @EventListener
    public void notifyPatient(PatientRegisteredEvent event) {
        // Send discharge notification
        System.out.println("Notification Service: You are successfully register at our service..!!"
                +event.getPatient().getName()+" : "+Thread.currentThread().getName());
    }
}

