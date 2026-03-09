package com.example.restservice.repository;

import com.example.restservice.entity.Parametre; // <-- ici entity au lieu de model
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParametreRepository extends JpaRepository<Parametre, Integer> {
    Parametre findByIdMatiere(int idMatiere);
}