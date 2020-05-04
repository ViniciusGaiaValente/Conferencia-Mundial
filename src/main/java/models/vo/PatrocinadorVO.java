package models.vo;

import models.domain.Patrocinador;

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
@Table(name = "patrocinador")
public class PatrocinadorVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_patrocinador")
	public int id;
	@Column(name = "nome")
	public String nome;
	@OneToMany(mappedBy = "patrocinador", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public Set<PalestraPatrocinadorVO> patrocinador;

	public PatrocinadorVO() {
	}

	public PatrocinadorVO(Patrocinador patrocinador) {
		this.id = patrocinador.id;
		this.nome = patrocinador.nome;
	}

	public PatrocinadorVO(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

}
