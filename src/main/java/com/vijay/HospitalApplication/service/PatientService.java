package com.vijay.HospitalApplication.service;

import com.vijay.HospitalApplication.entity.Patient;
import com.vijay.HospitalApplication.event.PatientDischargedEvent;
import com.vijay.HospitalApplication.event.PatientRegisteredEvent;
import com.vijay.HospitalApplication.repository.PatientRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class PatientService {
    private final ApplicationEventPublisher eventPublisher;
    private final PatientRepository patientRepository;

    public PatientService(ApplicationEventPublisher eventPublisher, PatientRepository patientRepository) {
        this.eventPublisher = eventPublisher;
        this.patientRepository = patientRepository;
    }

    public void registerPatient(Patient patient) {
        log.info("patient Registration process initiated {} ", patient.getName());
        Patient savedPatient = patientRepository.save(patient);
        eventPublisher.publishEvent(new PatientRegisteredEvent(this, savedPatient));
        log.info("patient Registration process Completed {} ", savedPatient.getName());

    }

    public void dischargePatient(Long patientId) {
        log.info("patient discharge process initiated..! {} ", patientId);
        Patient patient = patientRepository.findById(patientId).orElseThrow(() -> new RuntimeException("Patient not found"));
        patient.setDischarged(true);
        patientRepository.save(patient);
        eventPublisher.publishEvent(new PatientDischargedEvent(this, patient));
        log.info("patient discharge process Completed..! {} ", patient.getName());
    }
}

