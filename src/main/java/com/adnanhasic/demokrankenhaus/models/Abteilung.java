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
@Table(name = "abteilung")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "abteilungid")
public class Abteilung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "abteilungid", insertable = false, updatable = false)
    private Integer abteilungid;

    @Column(name = "abteilungname")
    private String abteilungname;

    @OneToMany(mappedBy = "abteilung")
    private List<Zimmer> zimmerList;

    @OneToOne
    @JoinColumn(name = "terminid", insertable = false, updatable = false)
    private Termin termin;
    private Integer terminid;

}
