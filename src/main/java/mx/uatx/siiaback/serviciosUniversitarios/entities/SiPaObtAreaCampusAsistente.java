package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SiPaObtAreaCampusAsistente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3080742391784334481L;
	@Id
	@Column(name = "IDAREA")
	private Integer intIdArea;
	
	@Column(name = "NOMBREAREA")
	private String strNombreArea;
	
	public SiPaObtAreaCampusAsistente() {
		super();
	}

	public Integer getIntIdArea() {
		return intIdArea;
	}

	public void setIntIdArea(Integer intIdArea) {
		this.intIdArea = intIdArea;
	}

	public String getStrNombreArea() {
		return strNombreArea;
	}

	public void setStrNombreArea(String strNombreArea) {
		this.strNombreArea = strNombreArea;
	}
	
	
}
