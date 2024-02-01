package com.adnanhasic.demokrankenhaus;

import com.adnanhasic.demokrankenhaus.models.Arzt;
import com.adnanhasic.demokrankenhaus.repositories.ArztRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ApplicationController {

    @GetMapping("/index")
    public String goHome() {
        return "index";
    }

    @Autowired
    private ArztRepository arztRepository; // Pretpostavljamo da imate repozitorij za Arzt objekte

    @GetMapping("/aerzte")
    public String nekaMetoda(Model model) {
        List<Arzt> aerzte = arztRepository.findAll(); // Prilagodite ovo vašoj logici za dohvat Arzt objekata iz baze
        model.addAttribute("aerzte", aerzte);
        return "arzt"; // Prilagodite ime vašeg predloška
    }

}
