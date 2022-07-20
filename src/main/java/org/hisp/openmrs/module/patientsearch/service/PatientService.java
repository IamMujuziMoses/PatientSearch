package org.hisp.openmrs.module.patientsearch.service;

import org.hisp.openmrs.module.patientsearch.entity.Patient;

import java.util.List;

public interface PatientService {

    List<Patient> searchPatients(String query);
}
