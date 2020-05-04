package models.domain;

import models.vo.PalestranteVO;

import java.util.ArrayList;
import java.util.Collection;

public class Palestrante {

    public int id;
    public String nome;
    public String cpf;
    public String endereco;
    public String telefone;
    public String email;

    public Palestrante() {}

    public Palestrante(String nome, String cpf, String endereco, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public Palestrante(PalestranteVO palestranteVO) {
        this.id = palestranteVO.id;
        this.nome = palestranteVO.nome;
        this.cpf = palestranteVO.cpf;
        this.endereco = palestranteVO.endereco;
        this.telefone = palestranteVO.telefone;
        this.email = palestranteVO.email;
    }

    public Palestrante(int id, String nome, String cpf, String endereco, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public int getId() { return id; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
