package com.look.tracking.service;

import com.look.tracking.document.Patient;
import com.look.tracking.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> listAll() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getById(Integer id) {
        return null;
    }

    @Override
    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void delete(Patient p) {
        patientRepository.delete(p);
    }
}
