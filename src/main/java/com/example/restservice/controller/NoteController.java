package com.example.restservice.controller;

import com.example.restservice.service.NoteService;
import com.example.restservice.repository.MatiereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NoteController {

    @Autowired
    private NoteService noteService;

    @Autowired // <- important pour que Spring injecte le repository
    private MatiereRepository matiereRepository;

    @GetMapping("/resultats")
    public String afficherResultats(Model model) {
        return "resultats";
    }

    // Affiche le formulaire pour calculer la note finale
    @GetMapping("/calculNoteFinale")
    public String afficherFormulaire(Model model) {
        // on envoie la liste des matières au formulaire
        model.addAttribute("matieres", matiereRepository.findAll());
        return "noteFinaleParMatiere"; // JSP
    }

    // Reçoit les données du formulaire et calcule la note finale
    @PostMapping("/calculNoteFinale")
    public String calculNoteFinale(@RequestParam int idCandidat,
                                   @RequestParam int idMatiere,
                                   Model model) {
        Double noteFinale = noteService.calculNoteFinale(idCandidat, idMatiere);
        model.addAttribute("noteFinale", noteFinale);

        // On renvoie aussi la liste des matières pour le formulaire
        model.addAttribute("matieres", matiereRepository.findAll());

        return "noteFinaleParMatiere";
    }
}