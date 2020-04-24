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
@Table(name = "palestra_palestrante")
public class PalestraPalestranteVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_palestra_palestrante")
	public int id;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_palestra")
	public PalestraVO palestra;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_palestrante")
	public PalestranteVO palestrante;

}
