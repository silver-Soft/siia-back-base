package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaAreaCampus {
	
	@Id
	@Column(name = "IDAREACAMPUS")
	private Long idAreaCampus;
	
	@Column(name = "NBARECAMPUS")
	private String nbAreaCampus;

	public Long getIdAreaCampus() {
		return idAreaCampus;
	}

	public void setIdAreaCampus(Long idAreaCampus) {
		this.idAreaCampus = idAreaCampus;
	}

	public String getNbAreaCampus() {
		return nbAreaCampus;
	}

	public void setNbAreaCampus(String nbAreaCampus) {
		this.nbAreaCampus = nbAreaCampus;
	}

}
