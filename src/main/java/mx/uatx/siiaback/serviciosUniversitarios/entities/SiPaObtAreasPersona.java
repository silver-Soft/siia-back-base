package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtAreasPersona {
	
	@Id
	@Column(name = "IDAREACAMPUS")
	private Long idAreaCampus;
	
	@Column(name = "IDAREACAMPUSPADRE")
	private Long idAreaCampusPadre;
	
	@Column(name = "CLAREA")
	private Long clArea;
	
	@Column(name = "NBAREA")
	private String nbArea;
	
	@Column(name = "LEVEL")
	private Integer level;

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

	public Long getClArea() {
		return clArea;
	}

	public void setClArea(Long clArea) {
		this.clArea = clArea;
	}

	public String getNbArea() {
		return nbArea;
	}

	public void setNbArea(String nbArea) {
		this.nbArea = nbArea;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

}
