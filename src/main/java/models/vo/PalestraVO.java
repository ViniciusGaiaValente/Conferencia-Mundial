package models.vo;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "palestra")
public class PalestraVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int id;
	@Column(name = "titulo")
	public String titulo;
	@Column(name = "tema")
	public String tema;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_auditorio_fk")
	public AuditorioVO auditorio;
	@OneToMany(mappedBy = "palestra", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public Set<PalestraPatrocinadorVO> patrocinadores;
	@OneToMany(mappedBy = "palestra", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public Set<PalestraParticipanteVO> participantes;
	@OneToMany(mappedBy = "palestra", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public Set<PalestraPalestranteVO> palestrantes;
	
	public PalestraVO() {
	}

	public PalestraVO(int id, String titulo, String tema, AuditorioVO auditorio) {
		this.id = id;
		this.titulo = titulo;
		this.tema = tema;
		this.auditorio = auditorio;
	}

	public PalestraVO(String titulo, String tema, AuditorioVO auditorio, Set<PalestraPatrocinadorVO> patrocinadores,
			Set<PalestraPalestranteVO> palestrantes, Set<PalestraParticipanteVO> participantes) {
		this.titulo = titulo;
		this.tema = tema;
		this.auditorio = auditorio;
		this.patrocinadores = patrocinadores;
		this.palestrantes = palestrantes;
		this.participantes = participantes;
	}

}