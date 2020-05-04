package models.vo;

import models.domain.Auditorio;

import javax.persistence.*;


@Entity
@Table (name = "auditorio")
public class AuditorioVO  {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_auditorio")
	public int id;
	@Column(name = "nome")
	public String nome;
	@Column(name = "quantidade_de_lugares")
	public int quantidadeDeLugares;

	public AuditorioVO() {}

	public AuditorioVO(Auditorio auditorio) {
		this.id = auditorio.id;
		this.nome = auditorio.nome;
		this.quantidadeDeLugares = auditorio.quantidadeDeLugares;
	}

	public AuditorioVO(int id, String nome, int quantidadeDeLugares) {
		this.id = id;
		this.nome = nome;
		this.quantidadeDeLugares = quantidadeDeLugares;
	}

}
