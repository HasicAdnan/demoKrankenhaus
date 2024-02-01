package com.adnanhasic.demokrankenhaus.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "arzt")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "arztid")
public class Arzt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "arztid", insertable = false, updatable = false)
    private Integer arztid;

    @OneToOne
    @JoinColumn(name = "personid", insertable = false, updatable = false)
    private Person person;
    private Integer personid;

    @OneToOne
    @JoinColumn(name = "terminid", insertable = false, updatable = false)
    private Termin termin;
    private Integer terminid;


}
