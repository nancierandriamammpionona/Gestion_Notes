package com.example.restservice.service;

import com.example.restservice.entity.Candidat;
import com.example.restservice.repository.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatService {

    @Autowired
    private CandidatRepository candidatRepository;

    public List<Candidat> getAllCandidats() {
        return candidatRepository.findAll();
    }

    public Candidat getCandidatById(Integer id){
        return candidatRepository.findById(id).orElse(null);
    }

    public void saveCandidat(Candidat candidat){
        candidatRepository.save(candidat);
    }

    public void deleteCandidat(Integer id){
        candidatRepository.deleteById(id);
    }

  
}