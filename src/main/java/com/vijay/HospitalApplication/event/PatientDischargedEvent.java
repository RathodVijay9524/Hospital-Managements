package com.vijay.HospitalApplication.event;

import com.vijay.HospitalApplication.entity.Patient;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
@ToString
public class PatientDischargedEvent extends ApplicationEvent {
    private final Patient patient;

    public PatientDischargedEvent(Object source, Patient patient) {
        super(source);
        this.patient = patient;
    }

}

