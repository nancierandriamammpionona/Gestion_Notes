package com.example.restservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "matiere")
public class Matiere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String matiere; // correspond à la colonne "matiere" dans la base

    public Matiere() {}

    public Integer getId() { 
        return id; 
    }

    public String getMatiere() { 
        return matiere; // <-- correction ici
    }

    public void setMatiere(String matiere) { 
        this.matiere = matiere; 
    }
}