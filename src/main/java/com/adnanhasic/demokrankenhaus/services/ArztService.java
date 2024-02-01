package com.adnanhasic.demokrankenhaus.services;

import com.adnanhasic.demokrankenhaus.models.Arzt;
import com.adnanhasic.demokrankenhaus.repositories.ArztRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArztService {

    @Autowired
    private ArztRepository arztRepository;

    public List<Arzt> getArzt(){

        return arztRepository.findAll();
    }
}
