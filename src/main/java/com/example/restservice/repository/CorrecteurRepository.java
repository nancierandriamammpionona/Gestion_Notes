package com.example.restservice.repository;

import com.example.restservice.entity.Correcteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CorrecteurRepository extends JpaRepository<Correcteur, Integer> {
}