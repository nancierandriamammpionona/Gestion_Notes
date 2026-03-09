package com.example.restservice.controller;

import com.example.restservice.entity.Correcteur;
import com.example.restservice.service.CorrecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class CorrecteurController {

    @Autowired
    private CorrecteurService correcteurService;

    @GetMapping("/correcteurs")
    public String listeCorrecteurs(Model model) {

        List<Correcteur> liste = correcteurService.getAllCorrecteurs();

        model.addAttribute("correcteurs", liste);

        return "correcteurs";
    }

    @GetMapping("/correcteur/edit/{id}")
    public String editCorrecteur(@PathVariable("id") Integer id, Model model){

        Correcteur correcteur = correcteurService.getCorrecteurById(id);

        model.addAttribute("correcteur", correcteur);

        return "editCorrecteur";
    }

    @PostMapping("/correcteur/update")
    public String updateCorrecteur(@ModelAttribute Correcteur correcteur){

        correcteurService.saveCorrecteur(correcteur);

        return "redirect:/correcteurs";
    }

    @GetMapping("/correcteur/delete/{id}")
    public String deleteCorrecteur(@PathVariable("id") Integer id){

        correcteurService.deleteCorrecteur(id);

        return "redirect:/correcteurs";
    }

    @GetMapping("/correcteur/add")
    public String showAddForm(Model model){

        model.addAttribute("correcteur", new Correcteur());

        return "addCorrecteur";
    }

    @PostMapping("/correcteur/save")
    public String saveCorrecteur(@ModelAttribute Correcteur correcteur){

        correcteurService.saveCorrecteur(correcteur);

        return "redirect:/correcteurs";
    }
}