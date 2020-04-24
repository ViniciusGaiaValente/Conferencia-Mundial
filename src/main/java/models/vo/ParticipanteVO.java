package models.vo;

import models.domain.Participante;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "participante")
public class ParticipanteVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_participante")
	public int id;
	@Column(name = "nome")
	public String nome;
	@Column(name = "cpf")
	public String cpf;
	@Column(name = "endereco")
	public String endereco;
	@Column(name = "telefone")
	public String telefone;
	@Column(name = "email")
	public String email;
	@OneToMany(mappedBy = "participante", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public Set<PalestraParticipanteVO> participantes;

	public ParticipanteVO() {
	}

	public ParticipanteVO(String nome, String cpf, String endereco, String telefone, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}

	public ParticipanteVO(int id, String nome, String cpf, String endereco, String telefone, String email) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}

	public ParticipanteVO(Participante participante) {
		this.id = participante.id;
		this.nome = participante.nome;
		this.cpf = participante.cpf;
		this.endereco = participante.endereco;
		this.telefone = participante.telefone;
		this.email = participante.email;
	}

}
