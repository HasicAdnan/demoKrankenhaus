package com.adnanhasic.demokrankenhaus.repositories;

import com.adnanhasic.demokrankenhaus.models.Arzt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArztRepository extends JpaRepository<Arzt, Integer> {

}
