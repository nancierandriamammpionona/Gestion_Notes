package com.example.restservice.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "note")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_candidat")
    private Integer idCandidat;

    @Column(name = "id_matiere")
    private Integer idMatiere;

    private BigDecimal note;

    @Column(name = "id_correcteur")
    private Integer idCorrecteur;

    public Note() {}

    public Integer getId() {
        return id;
    }

    public Integer getIdCandidat() {
        return idCandidat;
    }

    public void setIdCandidat(Integer idCandidat) {
        this.idCandidat = idCandidat;
    }

    public Integer getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(Integer idMatiere) {
        this.idMatiere = idMatiere;
    }

    public BigDecimal getNote() {
        return note;
    }

    public void setNote(BigDecimal note) {
        this.note = note;
    }

    public Integer getIdCorrecteur() {
        return idCorrecteur;
    }

    public void setIdCorrecteur(Integer idCorrecteur) {
        this.idCorrecteur = idCorrecteur;
    }
}