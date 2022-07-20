package org.hisp.openmrs.module.patientsearch.repository;

import org.hisp.openmrs.module.patientsearch.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    @Query(value = "SELECT * FROM person_name p, person_attribute d WHERE " +
            "(p.given_name LIKE CONCAT('%',:query, '%') AND d.person_id = p.person_id)" +
            "Or (p.middle_name LIKE CONCAT('%',:query, '%') AND d.person_id = p.person_id)" +
            "Or (p.family_name LIKE CONCAT('%',:query, '%') AND d.person_id = p.person_id)" +
            "Or (d.value LIKE CONCAT('%',:query, '%') AND d.person_id = p.person_id)", nativeQuery = true)
    List<Patient> searchPatients(String query);

}
