package com.adnanhasic.demokrankenhaus.controllers;


import com.adnanhasic.demokrankenhaus.models.Arzt;
import com.adnanhasic.demokrankenhaus.services.ArztService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ArztController {
    @Autowired
    private ArztService arztService;


    @GetMapping("/arzt")
    public String getArzt(Model model) {
        List<Arzt> arztList = arztService.getArzt();
        model.addAttribute("aerzte", arztList);

        return "arzt";
    }
}

