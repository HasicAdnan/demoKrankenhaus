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
@Table(name = "administrator")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "administratorid")
public class Administrator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer administratorid;
    @OneToOne
    @JoinColumn(name = "personid", insertable = false, updatable = false)
    private Person person;
    private Integer personid;



}
