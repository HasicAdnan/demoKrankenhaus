package com.adnanhasic.demokrankenhaus.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "aufenthalt")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "aufenthaltid")
public class Aufenthalt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aufenthaltid", insertable = false, updatable = false)
    private Integer aufenthaltid;

    @Column(name = "aufnahmedatum")
    private Date aufnahmedatum;

    @Column(name = "entalssungdatum")
    private Date entlassungdatum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patientid", insertable = false, updatable = false)
    private Patient patient;
    private Integer patientid;


}
