package com.adnanhasic.demokrankenhaus.repositories;

import com.adnanhasic.demokrankenhaus.models.Medikament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedikamentRepository extends JpaRepository<Medikament, Integer> {
}
