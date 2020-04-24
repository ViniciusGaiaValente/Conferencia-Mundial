package models.domain;

import java.util.ArrayList;

public class Palestra {

    public int id;
    public String titulo;
    public String tema;
    public Auditorio auditorio;
    public ArrayList<Patrocinio> patrocinios = new ArrayList<Patrocinio>();
    public ArrayList<Palestrante> palestrantes = new ArrayList<Palestrante>();
    public ArrayList<Participante> participantes = new ArrayList<Participante>();

    public Palestra() {}

    public Palestra(String titulo, String tema, Auditorio auditorio) {
        this.titulo = titulo;
        this.tema = tema;
        this.auditorio = auditorio;
    }

    public Palestra(int id, String titulo, String tema, Auditorio auditorio) {
        this.id = id;
        this.titulo = titulo;
        this.tema = tema;
        this.auditorio = auditorio;
    }

    public Palestra(String titulo, String tema, Auditorio auditorio, ArrayList<Patrocinio> patrocinios, ArrayList<Palestrante> palestrantes, ArrayList<Participante> participantes) {
        this.titulo = titulo;
        this.tema = tema;
        this.auditorio = auditorio;
        this.patrocinios = patrocinios;
        this.palestrantes = palestrantes;
        this.participantes = participantes;
    }

    public int getId() { return id; }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Auditorio getAuditorio() {
        return auditorio;
    }

    public void setAuditorio(Auditorio auditorio) {
        this.auditorio = auditorio;
    }

    public ArrayList<Patrocinio> getPatrocinios() {
        return patrocinios;
    }

    public void setPatrocinios(ArrayList<Patrocinio> patrocinios) {
        this.patrocinios = patrocinios;
    }

    public ArrayList<Palestrante> getPalestrantes() {
        return palestrantes;
    }

    public void setPalestrantes(ArrayList<Palestrante> palestrantes) {
        this.palestrantes = palestrantes;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }
}