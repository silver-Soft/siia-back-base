package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "SIIUAT", name = "SIAXASIGNACIONESPETICIONES")
public class SiAxAsignacionesPeticiones implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7177915879353087620L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDASIGNACIONPETICION", sequenceName = "SIIUAT.IDASIGNACIONPETICION", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDASIGNACIONPETICION")	
	@Column(name = "IDASIGNACIONPETICION")
	private Long lngIdAsignacionPeticion;
	
	@Column(name = "IDPETICION")
	private Long lngIdPeticion;
	
	@Column(name = "IDPERSONAASIGNA")
	private Long lngIdPersonaAsignada;
	
	@Column(name = "IDPERSONAREALIZA")
	private Long lngIdPersonaRealiza;
	
	@Column(name = "CLESTATUS")
	private Integer intClEstatus;
	
	@Column(name = "FCASIGNACION")
	private Date fcAsignacion;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public Long getLngIdAsignacionPeticion() {
		return lngIdAsignacionPeticion;
	}

	public void setLngIdAsignacionPeticion(Long lngIdAsignacionPeticion) {
		this.lngIdAsignacionPeticion = lngIdAsignacionPeticion;
	}

	public Long getLngIdPeticion() {
		return lngIdPeticion;
	}

	public void setLngIdPeticion(Long lngIdPeticion) {
		this.lngIdPeticion = lngIdPeticion;
	}

	public Long getLngIdPersonaAsignada() {
		return lngIdPersonaAsignada;
	}

	public void setLngIdPersonaAsignada(Long lngIdPersonaAsignada) {
		this.lngIdPersonaAsignada = lngIdPersonaAsignada;
	}

	public Long getLngIdPersonaRealiza() {
		return lngIdPersonaRealiza;
	}

	public void setLngIdPersonaRealiza(Long lngIdPersonaRealiza) {
		this.lngIdPersonaRealiza = lngIdPersonaRealiza;
	}

	public Integer getIntClEstatus() {
		return intClEstatus;
	}

	public void setIntClEstatus(Integer intClEstatus) {
		this.intClEstatus = intClEstatus;
	}

	public Date getFcAsignacion() {
		return fcAsignacion;
	}

	public void setFcAsignacion(Date fcAsignacion) {
		this.fcAsignacion = fcAsignacion;
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
	
	
}
