package com.look.tracking.service;

import com.look.tracking.document.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> listAll();
    Patient getById(Integer id);
    Patient save(Patient patient);
    void delete(Patient p);
}

