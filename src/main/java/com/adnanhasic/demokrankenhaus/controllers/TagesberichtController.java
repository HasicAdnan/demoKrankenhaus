package com.adnanhasic.demokrankenhaus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TagesberichtController {
    @GetMapping("/tagesberichte")
    public String getBett() {
        return "tagesbericht";
    }
}
