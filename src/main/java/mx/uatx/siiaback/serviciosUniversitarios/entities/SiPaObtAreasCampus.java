package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtAreasCampus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8972736600754651472L;

	@Id
	@Column(name = "IDAREACAMPUS")
	private Integer intIdAreaCampus;

	@Column(name = "NBAREA")
	private String strNbArea;

	@Column(name = "PERMITEMODIFICAR")
	private Boolean blnPermiteModificar;

	@Column(name = "PERMITEELIMINAR")
	private Boolean blnPermiteEliminar;

	@Column(name = "PERMITEPUESTOS")
	private Boolean blnPermitePuestos;

	@Column(name = "PERMITECORREOS")
	private Boolean blnPermiteCorreos;

	@Column(name = "PERMITETELEFONOS")
	private Boolean blnPermiteTelefonos;

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
	}

	public String getStrNbArea() {
		return strNbArea;
	}

	public void setStrNbArea(String strNbArea) {
		this.strNbArea = strNbArea;
	}

	public Boolean getBlnPermiteModificar() {
		return blnPermiteModificar;
	}

	public void setBlnPermiteModificar(Boolean blnPermiteModificar) {
		this.blnPermiteModificar = blnPermiteModificar;
	}

	public Boolean getBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(Boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}

	public Boolean getBlnPermitePuestos() {
		return blnPermitePuestos;
	}

	public void setBlnPermitePuestos(Boolean blnPermitePuestos) {
		this.blnPermitePuestos = blnPermitePuestos;
	}

	public Boolean getBlnPermiteCorreos() {
		return blnPermiteCorreos;
	}

	public void setBlnPermiteCorreos(Boolean blnPermiteCorreos) {
		this.blnPermiteCorreos = blnPermiteCorreos;
	}

	public Boolean getBlnPermiteTelefonos() {
		return blnPermiteTelefonos;
	}

	public void setBlnPermiteTelefonos(Boolean blnPermiteTelefonos) {
		this.blnPermiteTelefonos = blnPermiteTelefonos;
	}

}