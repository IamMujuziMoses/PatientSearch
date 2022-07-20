package org.hisp.openmrs.module.patientsearch.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "person_name")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long person_id;
    private String uuid;
    private String given_name;
    private String middle_name;
    private String family_name;
    @CreationTimestamp
    private LocalDateTime date_created;
    private String creator;
    @UpdateTimestamp
    private LocalDateTime date_changed;
    private String changed_by;
}
