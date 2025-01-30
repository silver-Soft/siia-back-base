package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaMunicipio implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -808082198020968045L;

	@Id
	@Column(name = "IDMUNICIPIO")
	private Long lngIdMunicipio;

	@Column(name = "IDENTIDAD")
	private String strIdentidad;

	@Column(name = "NBMUNICIPIO")
	private String strNbMunicipio;

	@Column(name = "ABREVIATURA")
	private String strAbreviatura;

	@Column(name = "IDESTADOPAIS")
	private Integer intIdEstadoPais;

	@Column(name = "IDCARTOGRAFIA")
	private Long lngIdCartografia;

	public SiPaMunicipio() {
		super();
	}

	public Long getLngIdMunicipio() {
		return lngIdMunicipio;
	}

	public void setLngIdMunicipio(Long lngIdMunicipio) {
		this.lngIdMunicipio = lngIdMunicipio;
	}

	public String getStrIdentidad() {
		return strIdentidad;
	}

	public void setStrIdentidad(String strIdentidad) {
		this.strIdentidad = strIdentidad;
	}

	public String getStrNbMunicipio() {
		return strNbMunicipio;
	}

	public void setStrNbMunicipio(String strNbMunicipio) {
		this.strNbMunicipio = strNbMunicipio;
	}

	public String getStrAbreviatura() {
		return strAbreviatura;
	}

	public void setStrAbreviatura(String strAbreviatura) {
		this.strAbreviatura = strAbreviatura;
	}

	public Integer getIntIdEstadoPais() {
		return intIdEstadoPais;
	}

	public void setIntIdEstadoPais(Integer intIdEstadoPais) {
		this.intIdEstadoPais = intIdEstadoPais;
	}

	public Long getLngIdCartografia() {
		return lngIdCartografia;
	}

	public void setLngIdCartografia(Long lngIdCartografia) {
		this.lngIdCartografia = lngIdCartografia;
	}
}
