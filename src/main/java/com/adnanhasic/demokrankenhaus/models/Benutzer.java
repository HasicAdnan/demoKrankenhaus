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
@Table(name = "benutzer")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "benutzerid")
public class Benutzer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "benutzerid", insertable = false, updatable = false)
    private Integer benutzerid;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @OneToOne
    @JoinColumn(name = "personid", insertable = false, updatable = false)
    private Person person;
    private Integer personid;

}
