package org.hisp.openmrs.module.patientsearch.service.impl;

import org.hisp.openmrs.module.patientsearch.entity.Patient;
import org.hisp.openmrs.module.patientsearch.repository.PatientRepository;
import org.hisp.openmrs.module.patientsearch.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> searchPatients(String query) {
        List<Patient> patients = patientRepository.searchPatients(query);
        return patients;
    }
}
