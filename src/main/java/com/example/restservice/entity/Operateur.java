package com.example.restservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "operateur")
public class Operateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String symbole;

    public Operateur() {}

    public Integer getId() {
        return id;
    }

    public String getSymbole() {
        return symbole;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }
}