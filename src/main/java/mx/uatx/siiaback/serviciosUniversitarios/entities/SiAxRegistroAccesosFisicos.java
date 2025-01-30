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
import javax.validation.constraints.NotNull;

@Entity
@Table(schema = "SIIUAT", name = "SIAXREGISTROACCESOSFISICOS")
public class SiAxRegistroAccesosFisicos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1001884189525259871L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDREGISTROACCESOFISICOAREA", sequenceName = "SIIUAT.IDREGISTROACCESOFISICOAREA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDREGISTROACCESOFISICOAREA")
	@NotNull

	@Column(name = "IDREGISTROACCESOFISICOAREA")
	private Long lngIdRegistroAccesoFisicoArea;

	@Column(name = "IDPERSONA")
	private Long lngIdPersona;
	
	@Column(name = "FCREGISTROACCESO")
	private Date fcRegistroAcceso;
	
	@Column(name = "IDACCESOFISICOAREA")
	private Integer intIdAccesoFisicoArea;
	
	@Column(name = "IDPERSONAREGISTROACCESO")
	private Long lngIdPersonaRegistroAcceso;
	
	@Column(name = "TIPOACCESO")
	private String strTipoAcceso;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;
	
	@Column(name = "TIPOPERSONA")
	private String strTipoPersona;
	
	@Column(name = "IDVISITANTE")
	private Long lngIdVisitante;
	
	@Column(name = "IDVEHICULOPERSONAL")
	private Long lngIdVehiculoPersonal;
	
	@Column(name = "USUARIOREGSALIDA")
	private String strUsuarioRegSalida;
	

	public Long getLngIdRegistroAccesoFisicoArea() {
		return lngIdRegistroAccesoFisicoArea;
	}

	public void setLngIdRegistroAccesoFisicoArea(Long lngIdRegistroAccesoFisicoArea) {
		this.lngIdRegistroAccesoFisicoArea = lngIdRegistroAccesoFisicoArea;
	}

	public Long getLngIdPersona() {
		return lngIdPersona;
	}

	public void setLngIdPersona(Long lngIdPersona) {
		this.lngIdPersona = lngIdPersona;
	}

	public Date getFcRegistroAcceso() {
		return fcRegistroAcceso;
	}

	public void setFcRegistroAcceso(Date fcRegistroAcceso) {
		this.fcRegistroAcceso = fcRegistroAcceso;
	}

	public Integer getIntIdAccesoFisicoArea() {
		return intIdAccesoFisicoArea;
	}

	public void setIntIdAccesoFisicoArea(Integer intIdAccesoFisicoArea) {
		this.intIdAccesoFisicoArea = intIdAccesoFisicoArea;
	}

	public Long getLngIdPersonaRegistroAcceso() {
		return lngIdPersonaRegistroAcceso;
	}

	public void setLngIdPersonaRegistroAcceso(Long lngIdPersonaRegistroAcceso) {
		this.lngIdPersonaRegistroAcceso = lngIdPersonaRegistroAcceso;
	}

	public String getStrTipoAcceso() {
		return strTipoAcceso;
	}

	public void setStrTipoAcceso(String strTipoAcceso) {
		this.strTipoAcceso = strTipoAcceso;
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

	public String getStrTipoPersona() {
		return strTipoPersona;
	}

	public void setStrTipoPersona(String strTipoPersona) {
		this.strTipoPersona = strTipoPersona;
	}

	public Long getLngIdVisitante() {
		return lngIdVisitante;
	}

	public void setLngIdVisitante(Long lngIdVisitante) {
		this.lngIdVisitante = lngIdVisitante;
	}

	public Long getLngIdVehiculoPersonal() {
		return lngIdVehiculoPersonal;
	}

	public void setLngIdVehiculoPersonal(Long lngIdVehiculoPersonal) {
		this.lngIdVehiculoPersonal = lngIdVehiculoPersonal;
	}

	public String getStrUsuarioRegSalida() {
		return strUsuarioRegSalida;
	}

	public void setStrUsuarioRegSalida(String strUsuarioRegSalida) {
		this.strUsuarioRegSalida = strUsuarioRegSalida;
	}
	
}