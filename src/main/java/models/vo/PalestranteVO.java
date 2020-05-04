package models.vo;

import models.domain.Palestrante;

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
@Table(name = "palestrante")
public class PalestranteVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_palestrante")
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
	
	@OneToMany(mappedBy = "palestrante", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public Set<PalestraPalestranteVO> palestrantes;

	public PalestranteVO() {}

	public PalestranteVO(Palestrante palestrante) {
		this.id = palestrante.id;
		this.nome = palestrante.nome;
		this.cpf = palestrante.cpf;
		this.endereco = palestrante.endereco;
		this.telefone = palestrante.telefone;
		this.email = palestrante.email;
	}

	public PalestranteVO(int id, String nome, String cpf, String endereco, String telefone, String email) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}

}
