package models.domain;

import models.domain.Palestra;

import java.util.ArrayList;

public class Patrocinador {

    public int id;
    public String nome;

    public Patrocinador() {}

    public Patrocinador(String nome) {
        this.nome = nome;
    }

    public Patrocinador(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
