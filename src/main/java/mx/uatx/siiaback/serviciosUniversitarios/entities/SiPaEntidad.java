package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaEntidad implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4189632152384044646L;

	@Id
	@Column(name = "IDENTIDAD")
	private Integer intIdEntidad;
	
	@Column(name = "CLPAIS")
	private String strCvePais;
	
	@Column(name = "NBENTIDAD")
	private String strEntidad;
	
	@Column(name = "ABREVIATURA")
	private String strAbreviatura;
	
	@Column(name = "IDCARTOGRAFIA")
	private Long lngIdCartografia;

	public SiPaEntidad() {
		super();
	}

	public String getStrCvePais() {
		return strCvePais;
	}

	public void setStrCvePais(String strCvePais) {
		this.strCvePais = strCvePais;
	}

	public String getStrEntidad() {
		return strEntidad;
	}

	public void setStrEntidad(String strEntidad) {
		this.strEntidad = strEntidad;
	}

	public String getStrAbreviatura() {
		return strAbreviatura;
	}

	public void setStrAbreviatura(String strAbreviatura) {
		this.strAbreviatura = strAbreviatura;
	}

	public Integer getIntIdEntidad() {
		return intIdEntidad;
	}

	public void setIntIdEntidad(Integer intIdEntidad) {
		this.intIdEntidad = intIdEntidad;
	}

	public Long getLngIdCartografia() {
		return lngIdCartografia;
	}

	public void setLngIdCartografia(Long lngIdCartografia) {
		this.lngIdCartografia = lngIdCartografia;
	}
}
