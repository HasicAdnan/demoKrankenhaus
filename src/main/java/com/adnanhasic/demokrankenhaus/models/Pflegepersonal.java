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
@Table(name = "pflegepersonal")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "pflegepersonalid")
public class Pflegepersonal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pflegepersonalid", insertable = false, updatable = false)
    private Integer pflegepersonalid;

    @OneToOne
    @JoinColumn(name = "personid", insertable = false, updatable = false)
    private Person person;
    private Integer personid;

    @OneToOne
    @JoinColumn(name = "tagesberichtid", insertable = false, updatable = false)
    private Tagesbericht tagesbericht;
    private Integer tagesberichtid;


}
