package com.adnanhasic.demokrankenhaus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PflegepersonalController {
    @GetMapping("/pflegepersonal")
    public String getBett() {
        return "pflegepersonal";
    }
}
