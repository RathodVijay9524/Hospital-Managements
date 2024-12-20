package com.vijay.HospitalApplication.event;

import com.vijay.HospitalApplication.entity.Patient;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
@ToString
public class PatientRegisteredEvent extends ApplicationEvent {
    private final Patient patient;

    public PatientRegisteredEvent(Object source, Patient patient) {
        super(source);
        this.patient = patient;
    }

}
