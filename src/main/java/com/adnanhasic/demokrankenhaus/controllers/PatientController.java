package com.adnanhasic.demokrankenhaus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientController {
    @GetMapping("/patienten")
    public String getPatienten() {
        return "patient";
    }
}

