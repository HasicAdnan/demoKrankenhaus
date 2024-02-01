package com.adnanhasic.demokrankenhaus.repositories;

import com.adnanhasic.demokrankenhaus.models.Bett;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BettRepository extends JpaRepository<Bett, Integer> {
}
