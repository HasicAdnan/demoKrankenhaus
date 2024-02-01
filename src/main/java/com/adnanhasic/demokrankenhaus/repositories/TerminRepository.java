package com.adnanhasic.demokrankenhaus.repositories;

import com.adnanhasic.demokrankenhaus.models.Termin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminRepository extends JpaRepository<Termin, Integer> {
}
