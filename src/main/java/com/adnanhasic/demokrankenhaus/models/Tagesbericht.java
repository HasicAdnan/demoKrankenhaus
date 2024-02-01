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
@Table(name = "tagesbericht")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "tagesberichtid")
public class Tagesbericht {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tagesberichtid", insertable = false, updatable = false)
    private Integer tagesberichtid;

    @Column(name = "datum")
    private String datum;

    @Column(name = "sauerstoff")
    private Integer sauerstoff;

    @Column(name = "blutdruck")
    private String blutdruck;

    @Column(name = "herzfrequenz")
    private Integer herzfrequenz;

    @Column(name = "temperatur")
    private Double temperatur;

    @Column(name = "blutzucker")
    private Double blutzucker;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tagesberichtid", insertable = false, updatable = false)
    private Medikament medikament;
    private Integer medikamentid;

    @OneToOne
    @JoinColumn(name = "pflegepersonalid", insertable = false, updatable = false)
    private Pflegepersonal pflegepersonal;
    private Integer pflegepersonalid;

}
