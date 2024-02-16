package org.example.SpringSem4Hmwrk.controller;

import lombok.AllArgsConstructor;
import org.example.SpringSem4Hmwrk.model.Salon;
import org.example.SpringSem4Hmwrk.service.SalonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class SalonController {

    private final SalonService salonService;

    /**
     * Метод для отображения списка салонов
     * @param model
     * @return
     */

    @GetMapping("/salons")
    public String viewSalons(Model model) {
        List<Salon> salons = salonService.findAll();
        model.addAttribute("salons", salons);
        return "salons";
    }

    /**
     * Метод для добавления салона
     * @param s
     * @return
     */

    @PostMapping ("/salons")
    public String addSalon(Salon s) {
        salonService.addSalon(s);
        return "redirect:/salons";
    }

//    @PostMapping("/salons")
//    public String addSalon(Salon s, Model model) {
//        salonService.addSalon(s);
//        List<Salon> salons = salonService.findAll();
//        model.addAttribute("salons", salons);
//        return "salons";
//
//    }

}
