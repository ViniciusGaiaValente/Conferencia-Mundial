package models.vo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "palestra_participante")
public class PalestraParticipanteVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_palestra_participante")
	public int id;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_palestra")
	public PalestraVO palestra;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_participante")
	public ParticipanteVO participante;

}
