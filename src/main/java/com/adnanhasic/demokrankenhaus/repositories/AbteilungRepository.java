package com.adnanhasic.demokrankenhaus.repositories;


import com.adnanhasic.demokrankenhaus.models.Abteilung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbteilungRepository extends JpaRepository<Abteilung, Integer> {
}
