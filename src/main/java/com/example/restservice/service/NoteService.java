package com.example.restservice.service;

import com.example.restservice.entity.Note;       // <-- entity
import com.example.restservice.entity.Parametre;  // <-- entity
import com.example.restservice.repository.NoteRepository;
import com.example.restservice.repository.ParametreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    @Autowired
    private ParametreRepository parametreRepository;

    public Double calculNoteFinale(int idCandidat, int idMatiere) {

        List<Note> notesEntity = noteRepository.findByIdCandidatAndIdMatiere(idCandidat, idMatiere);
        if (notesEntity.isEmpty()) return null;

        // ✅ Conversion BigDecimal -> Double
        List<Double> notes = notesEntity.stream()
                .map(n -> n.getNote().doubleValue())
                .toList();

        double sommeDifferences = 0;
        for (int i = 0; i < notes.size(); i++) {
            for (int j = i + 1; j < notes.size(); j++) {
                sommeDifferences += Math.abs(notes.get(i) - notes.get(j));
            }
        }

        Parametre param = parametreRepository.findByIdMatiere(idMatiere);
        if (param == null) throw new RuntimeException("Paramètre non défini pour la matière id=" + idMatiere);

        boolean condition = false;
        switch (param.getOperateur().getSymbole()) {
            case ">":
                condition = sommeDifferences > param.getDiff();
                break;
            case "<":
                condition = sommeDifferences < param.getDiff();
                break;
            default:
                throw new RuntimeException("Opérateur inconnu : " + param.getOperateur().getSymbole());
        }

        double noteFinale;
        if (param.getResolution().getNom().equalsIgnoreCase("plus petit")) {
            noteFinale = notes.stream().min(Double::compare).get();
        } else {
            noteFinale = notes.stream().max(Double::compare).get();
        }

        return noteFinale;
    }
}