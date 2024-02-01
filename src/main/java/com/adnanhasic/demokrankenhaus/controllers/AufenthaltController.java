package com.adnanhasic.demokrankenhaus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AufenthaltController {
    @GetMapping("/aufenthalte")
    public String getAufenthalt() {
        return "aufenthalt";
    }
}
