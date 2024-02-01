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
@Table(name = "medikament")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "medikamentid")
public class Medikament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medikamentid", insertable = false, updatable = false)
    private Integer medikamentid;

    @Column(name = "medikamentname")
    private String medikamentname;

    @Column(name = "kategorie")
    private String kategorie;

    @Column(name = "lagerbestand")
    private String lagerbestand;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medikamentid", insertable = false, updatable = false)
    private Tagesbericht tagesbericht;


}
