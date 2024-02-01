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
@Table(name = "zimmer")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "zimmerid")
public class Zimmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "zimmerid", insertable = false, updatable = false)
    private Integer zimmerid;

    @Column(name = "zimmernummer")
    private Integer zimmernummer;
    @Column(name = "kapazitaet")
    private Integer kapazitaet;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "abteilungid", insertable = false, updatable = false)
    private Abteilung abteilung;

    @OneToMany(mappedBy = "zimmer")
    List <Bett> bettList;




}
