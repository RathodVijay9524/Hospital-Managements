package com.vijay.HospitalApplication.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class PatientDischargeRequest {
    private Long id;
    private String name;
    private boolean discharged;
    private int age;
    private String gender;
    private String contactInfo;
}
