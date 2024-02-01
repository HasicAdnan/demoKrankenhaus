package com.adnanhasic.demokrankenhaus.repositories;

import com.adnanhasic.demokrankenhaus.models.Pflegepersonal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PflegepersonalRepository extends JpaRepository<Pflegepersonal, Integer> {
}
