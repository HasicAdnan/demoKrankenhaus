package com.adnanhasic.demokrankenhaus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BettContoller {
    @GetMapping("/betten")
    public String getBett() {
        return "bett";
    }
}
