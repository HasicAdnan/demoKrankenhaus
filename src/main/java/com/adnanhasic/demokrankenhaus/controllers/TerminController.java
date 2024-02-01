package com.adnanhasic.demokrankenhaus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TerminController {
    @GetMapping("/termine")
    public String getBett() {
        return "termin";
    }
}
