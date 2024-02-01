package com.adnanhasic.demokrankenhaus.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "patientid")
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patientid", insertable = false, updatable = false)
    private Integer patinetid;

    @OneToOne
    @JoinColumn(name = "personid", insertable = false, updatable = false)
    private Person person;
    private Integer personid;

    @OneToOne
    @JoinColumn(name = "terminid", insertable = false, updatable = false)
    private Termin termin;
    private Integer terminid;

    @OneToMany(mappedBy = "patient")
    private List<Aufenthalt> aufenthaltList;

}
