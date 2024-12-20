package com.vijay.HospitalApplication.repository;

import com.vijay.HospitalApplication.entity.TestResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestResultRepository extends JpaRepository<TestResult, Long> {
}