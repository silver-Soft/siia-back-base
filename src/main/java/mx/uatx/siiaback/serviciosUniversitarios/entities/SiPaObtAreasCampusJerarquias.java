package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtAreasCampusJerarquias {
	
	@Id
	@Column(name = "IDAREACAMPUS")
	private Long idAreaCampus;
	
	@Column(name = "IDAREACAMPUSPADRE")
	private Long idAreaCampusPadre;
	
	@Column(name = "NBARECAMPUS")
	private String nbAreaCampus;
	
	public Long getIdAreaCampus() {
		return idAreaCampus;
	}
	public void setIdAreaCampus(Long idAreaCampus) {
		this.idAreaCampus = idAreaCampus;
	}
	public Long getIdAreaCampusPadre() {
		return idAreaCampusPadre;
	}
	public void setIdAreaCampusPadre(Long idAreaCampusPadre) {
		this.idAreaCampusPadre = idAreaCampusPadre;
	}
	public String getNbAreaCampus() {
		return nbAreaCampus;
	}
	public void setNbAreaCampus(String nbAreaCampus) {
		this.nbAreaCampus = nbAreaCampus;
	}

}
