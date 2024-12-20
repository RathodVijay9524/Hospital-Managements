package com.vijay.HospitalApplication.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Appointment appointment;
    private double consultationFee;
    private double testFee;
    private double pharmacyFee;
    private double totalAmount;

    // Getters and Setters
}

