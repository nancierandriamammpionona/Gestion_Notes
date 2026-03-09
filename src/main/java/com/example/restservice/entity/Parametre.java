package com.example.restservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "parametre")
public class Parametre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_matiere")
    private Integer idMatiere;

    private Integer diff;

    @ManyToOne
    @JoinColumn(name = "id_operateur")
    private Operateur operateur;

    @ManyToOne
    @JoinColumn(name = "id_resolution")
    private Resolution resolution;

    public Parametre() {}

    public Integer getId() {
        return id;
    }

    public Integer getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(Integer idMatiere) {
        this.idMatiere = idMatiere;
    }

    public Integer getDiff() {
        return diff;
    }

    public void setDiff(Integer diff) {
        this.diff = diff;
    }

    public Operateur getOperateur() {
        return operateur;
    }

    public void setOperateur(Operateur operateur) {
        this.operateur = operateur;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}