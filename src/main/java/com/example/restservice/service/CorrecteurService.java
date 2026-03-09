package com.example.restservice.service;

import com.example.restservice.entity.Correcteur;
import com.example.restservice.repository.CorrecteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorrecteurService {

    @Autowired
    private CorrecteurRepository correcteurRepository;

    public List<Correcteur> getAllCorrecteurs() {
        return correcteurRepository.findAll();
    }

    public Correcteur getCorrecteurById(Integer id){
        return correcteurRepository.findById(id).orElse(null);
    }

    public void saveCorrecteur(Correcteur correcteur){
        correcteurRepository.save(correcteur);
    }

    public void deleteCorrecteur(Integer id){
        correcteurRepository.deleteById(id);
    }

  
}