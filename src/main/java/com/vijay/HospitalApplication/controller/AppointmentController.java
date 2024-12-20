package com.vijay.HospitalApplication.controller;

import com.vijay.HospitalApplication.entity.Appointment;
import com.vijay.HospitalApplication.service.AppointmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/appointments")
@AllArgsConstructor
public class AppointmentController {

    private final AppointmentService appointmentService;
    @PostMapping("/schedule")
    public ResponseEntity<String> scheduleAppointment(@RequestBody Appointment appointment) {
        // Schedule appointment logic here
        return ResponseEntity.ok("Appointment scheduled successfully");
    }
}







