package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaAsentamiento implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6679052449083992494L;

	@Id
	@Column(name = "CLASENTAMIENTO")
	private Long lngCveAsentamiento;

	@Column(name = "IDLOCALIDAD")
	private Long lngIdLocalidad;

	@Column(name = "IDTIPOASENTAMIENTO")
	private Integer intIdTipoAsentamiento;

	@Column(name = "IDMUNICIPIO")
	private Long lngIdMunicipio;

	@Column(name = "NBASENTAMIENTO")
	private String strNbAsentamiento;

	@Column(name = "CODIGOPOSTAL")
	private Integer intCodigoPostal;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "IDCARTOGRAFIA")
	private Long lngIdCartografia;

	public SiPaAsentamiento() {
		super();
	}

	public Long getLngIdLocalidad() {
		return lngIdLocalidad;
	}

	public void setLngIdLocalidad(Long lngIdLocalidad) {
		this.lngIdLocalidad = lngIdLocalidad;
	}

	public Long getLngCveAsentamiento() {
		return lngCveAsentamiento;
	}

	public void setLngCveAsentamiento(Long lngCveAsentamiento) {
		this.lngCveAsentamiento = lngCveAsentamiento;
	}

	public Integer getIntIdTipoAsentamiento() {
		return intIdTipoAsentamiento;
	}

	public void setIntIdTipoAsentamiento(Integer intIdTipoAsentamiento) {
		this.intIdTipoAsentamiento = intIdTipoAsentamiento;
	}

	public Long getLngIdMunicipio() {
		return lngIdMunicipio;
	}

	public void setLngIdMunicipio(Long lngIdMunicipio) {
		this.lngIdMunicipio = lngIdMunicipio;
	}

	public String getStrNbAsentamiento() {
		return strNbAsentamiento;
	}

	public void setStrNbAsentamiento(String strNbAsentamiento) {
		this.strNbAsentamiento = strNbAsentamiento;
	}

	public Integer getIntCodigoPostal() {
		return intCodigoPostal;
	}

	public void setIntCodigoPostal(Integer intCodigoPostal) {
		this.intCodigoPostal = intCodigoPostal;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public Long getLngIdCartografia() {
		return lngIdCartografia;
	}

	public void setLngIdCartografia(Long lngIdCartografia) {
		this.lngIdCartografia = lngIdCartografia;
	}

}
