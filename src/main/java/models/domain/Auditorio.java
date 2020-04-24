package models.domain;

public class Auditorio {

    public int id;
    public String nome;
    public int quantidadeDeLugares;

    public Auditorio() {}

    public Auditorio(String nome, int quantidadeDeLugares) {
        this.nome = nome;
        this.quantidadeDeLugares = quantidadeDeLugares;
    }

    public Auditorio(int id, String nome, int quantidadeDeLugares) {
        this.id = id;
        this.nome = nome;
        this.quantidadeDeLugares = quantidadeDeLugares;
    }

    public int getId() { return id; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeLugares() {
        return quantidadeDeLugares;
    }

    public void setQuantidadeDeLugares(Integer quantidadeDeLugares) {
        this.quantidadeDeLugares = quantidadeDeLugares;
    }
}
