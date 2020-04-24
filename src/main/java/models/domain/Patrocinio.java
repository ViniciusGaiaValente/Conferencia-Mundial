package models.domain;

import helpers.enums.TipoDePatrocinio;

public class Patrocinio {

    public TipoDePatrocinio tipo;
    public Patrocinador patrocinador;

    public Patrocinio() {}

    public Patrocinio(TipoDePatrocinio tipo, Patrocinador patrocinador) {
        this.tipo = tipo;
        this.patrocinador = patrocinador;
    }

    public Patrocinio(TipoDePatrocinio tipo, int id_patrocinador, String nome_patrocinador) {
        this.tipo = tipo;
        this.patrocinador = new Patrocinador(id_patrocinador, nome_patrocinador);
    }

    public TipoDePatrocinio getTipo() {
        return tipo;
    }

    public void setTipo(TipoDePatrocinio tipo) {
        this.tipo = tipo;
    }

    public Patrocinador getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(Patrocinador patrocinador) {
        this.patrocinador = patrocinador;
    }
}
