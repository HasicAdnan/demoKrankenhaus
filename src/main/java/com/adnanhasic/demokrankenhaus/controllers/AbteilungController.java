package com.adnanhasic.demokrankenhaus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AbteilungController {
    @GetMapping("/abteilungen")
    public String getAbteilungen() {
        return "abteilung";
    }
}
