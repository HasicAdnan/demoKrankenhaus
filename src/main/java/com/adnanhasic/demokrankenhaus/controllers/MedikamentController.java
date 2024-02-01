package com.adnanhasic.demokrankenhaus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MedikamentController {
    @GetMapping("/medikamente")
    public String getBett() {
        return "medikament";
    }
}
