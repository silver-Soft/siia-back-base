package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaGruposHistorial {
	
	@Id
	@Column(name = "IDGPOSTHISTACAD")
	private Integer idGpostHistAcad;
	
	@Column(name = "NBGPOSTHISTACAD")
	private String nbGpostHistAcad;

	public Integer getIdGpostHistAcad() {
		return idGpostHistAcad;
	}

	public void setIdGpostHistAcad(Integer idGpostHistAcad) {
		this.idGpostHistAcad = idGpostHistAcad;
	}

	public String getNbGpostHistAcad() {
		return nbGpostHistAcad;
	}

	public void setNbGpostHistAcad(String nbGpostHistAcad) {
		this.nbGpostHistAcad = nbGpostHistAcad;
	}

}
