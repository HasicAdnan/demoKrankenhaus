package com.adnanhasic.demokrankenhaus.controllers;

import com.adnanhasic.demokrankenhaus.models.Zimmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ZimmerController {
    @GetMapping("/zimmer")
    public String getBett() {
        return "zimmer";
    }
}
