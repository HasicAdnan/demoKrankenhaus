package com.adnanhasic.demokrankenhaus.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "untersuchungstermin")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "untersuchungsterminid")
public class Termin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "terminid", insertable = false, updatable = false)
    private Integer terminid;

    @Column(name = "datum")
    private Date datum;

    @Column(name = "uhrzeit")
    private Time uhrzeit;


    @OneToOne
    @JoinColumn(name = "patientid", insertable = false, updatable = false)
    private Patient patient;
    private Integer patientid;

    @OneToOne
    @JoinColumn(name = "abteilungid", insertable = false, updatable = false)
    private Abteilung abteilung;
    private Integer abteilungid;


    @ManyToOne
    @JoinColumn(name = "arztid", insertable = false, updatable = false)
    private Arzt arzt;


}
