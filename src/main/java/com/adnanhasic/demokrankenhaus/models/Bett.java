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
@Table(name = "bett")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "bettid")
public class Bett {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bettid", insertable = false, updatable = false)
    private Integer bettid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "zimmerid", insertable = false, updatable = false)
    private Zimmer zimmer;

}
