package com.example.restservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "resolution")
public class Resolution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;

    public Resolution() {}

    public Integer getId() { return id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
}