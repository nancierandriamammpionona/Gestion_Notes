package com.example.restservice.repository;

import com.example.restservice.entity.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CandidatRepository extends JpaRepository<Candidat, Integer> {
}