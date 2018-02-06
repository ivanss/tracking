package com.look.tracking.repository;

import com.look.tracking.document.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<Patient, Integer> {
}

