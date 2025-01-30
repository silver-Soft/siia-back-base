package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtAreasCampusTrans implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6374847896737721797L;
	@Id
	@Column(name = "IDAREACAMPUS")
	private Integer intIdArea;
	
	@Column(name = "NBAREA")
	private String strNbArea;
	
	@Column(name = "DSCAMPUS")
	private String strDsCampus;
	
	public SiPaObtAreasCampusTrans() {
		super();
	}

	public Integer getIntIdArea() {
		return intIdArea;
	}

	public void setIntIdArea(Integer intIdArea) {
		this.intIdArea = intIdArea;
	}

	public String getStrNbArea() {
		return strNbArea;
	}

	public void setStrNbArea(String strNbArea) {
		this.strNbArea = strNbArea;
	}

	public String getStrDsCampus() {
		return strDsCampus;
	}

	public void setStrDsCampus(String strDsCampus) {
		this.strDsCampus = strDsCampus;
	}
	
}
