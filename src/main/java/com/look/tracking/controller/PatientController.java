package com.look.tracking.controller;

import com.look.tracking.document.Patient;
import com.look.tracking.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/patients")
    public List<Patient> pacientes() {
        return patientService.listAll();
    }

    @GetMapping("/prueba")
    public String ss() {
        return "holaaa";
    }
}
