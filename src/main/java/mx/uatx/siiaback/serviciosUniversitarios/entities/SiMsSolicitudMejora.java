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
@Table(schema = "SIIUAT", name="SIMSSOLICITUDMEJORA")
public class SiMsSolicitudMejora implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4857550021998206077L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDSOLICITUDMEJORA", sequenceName = "SIIUAT.IDSOLICITUDMEJORA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDSOLICITUDMEJORA")
	@NotNull
	
	@Column(name = "IDSOLICITUDMEJORA")
	private Integer intIdSolicitudMejora;
	
	@Column(name = "DSSOLICITUDMEJORA")
	private String strDsSolicitudMejora;
	
	@Column(name = "IDPERSONASOLICITANTE")
	private Long lngIdPersonaSolicitante;	
	
	@Column(name = "IDAREACAMPUSSOLICITANTE")
	private Integer intIdAreaCampusSolicitante;
	
	@Column(name = "IDPERSONAREALIZA")
	private Long lngIdPersonaRealiza;	
	
	@Column(name = "FCSOLICITUD")
	private Date fcSolicitud;
	
	@Column(name = "FCCOMPROMISO")
	private Date fcCompromiso;
	
	@Column(name = "FCTERMINO")
	private Date fcTermino;
	
	@Column(name = "DSOBSERVACIONES")
	private String strDsObservaciones;
	
	@Column(name = "FCNOTIFICACION")
	private Date fcNotificacion;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;
	
	@Column(name = "IDPROCESO")
	private Integer intIdProceso;
	
	@Column(name = "IDTIPOSOLICITUDMEJORA")
	private Integer intIdTipoSolicitudMejora;
	
	@Column(name = "IDSTSOLICITUDMEJORA")
	private Integer intStSolicitudMejora;
	
	@Column(name = "NMDIASESFUERZO")
	private Integer intNmDiasEsfuerzo;
		
	@Column(name = "DSPERIODOATENCION")
	private String strDsPeriodoAtencion;
	
	@Column(name = "IDPRIORIDAD")
	private Integer intIdPrioridad;
	
	@Column(name = "IDORIGENPETICION")
	private Long intIdOrigenPeticion;

	public String getStrDsSolicitudMejora() {
		return strDsSolicitudMejora;
	}

	public void setStrDsSolicitudMejora(String strDsSolicitudMejora) {
		this.strDsSolicitudMejora = strDsSolicitudMejora;
	}

	public Long getLngIdPersonaSolcitante() {
		return lngIdPersonaSolicitante;
	}

	public void setLngIdPersonaSolcitante(Long lngIdPersonaSolcitante) {
		this.lngIdPersonaSolicitante = lngIdPersonaSolcitante;
	}

	public Integer getIntIdAreaCampusSolicitante() {
		return intIdAreaCampusSolicitante;
	}

	public void setIntIdAreaCampusSolicitante(Integer intIdAreaCampusSolicitante) {
		this.intIdAreaCampusSolicitante = intIdAreaCampusSolicitante;
	}

	public Long getLngIdPersonaRealiza() {
		return lngIdPersonaRealiza;
	}

	public void setLngIdPersonaRealiza(Long lngIdPersonaRealiza) {
		this.lngIdPersonaRealiza = lngIdPersonaRealiza;
	}

	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	public Date getFcCompromiso() {
		return fcCompromiso;
	}

	public void setFcCompromiso(Date fcCompromiso) {
		this.fcCompromiso = fcCompromiso;
	}

	public Date getFcTermino() {
		return fcTermino;
	}

	public void setFcTermino(Date fcTermino) {
		this.fcTermino = fcTermino;
	}

	public String getStrDsObservaciones() {
		return strDsObservaciones;
	}

	public void setStrDsObservaciones(String strDsObservaciones) {
		this.strDsObservaciones = strDsObservaciones;
	}

	public Date getFcNotificacion() {
		return fcNotificacion;
	}

	public void setFcNotificacion(Date fcNotificacion) {
		this.fcNotificacion = fcNotificacion;
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

	public Integer getIntIdProceso() {
		return intIdProceso;
	}

	public void setIntIdProceso(Integer intIdProceso) {
		this.intIdProceso = intIdProceso;
	}

	public Integer getIntIdTipoSolicitudMejora() {
		return intIdTipoSolicitudMejora;
	}

	public void setIntIdTipoSolicitudMejora(Integer intIdTipoSolicitudMejora) {
		this.intIdTipoSolicitudMejora = intIdTipoSolicitudMejora;
	}

	public Integer getIntStSolicitudMejora() {
		return intStSolicitudMejora;
	}

	public void setIntStSolicitudMejora(Integer intStSolicitudMejora) {
		this.intStSolicitudMejora = intStSolicitudMejora;
	}

	public Integer getIntNmDiasEsfuerzo() {
		return intNmDiasEsfuerzo;
	}

	public void setIntNmDiasEsfuerzo(Integer intNmDiasEsfuerzo) {
		this.intNmDiasEsfuerzo = intNmDiasEsfuerzo;
	}

	public String getStrDsPeriodoAtencion() {
		return strDsPeriodoAtencion;
	}

	public void setStrDsPeriodoAtencion(String strDsPeriodoAtencion) {
		this.strDsPeriodoAtencion = strDsPeriodoAtencion;
	}

	public Integer getIntIdPrioridad() {
		return intIdPrioridad;
	}

	public void setIntIdPrioridad(Integer intIdPrioridad) {
		this.intIdPrioridad = intIdPrioridad;
	}



	public Long getIntIdOrigenPeticion() {
		return intIdOrigenPeticion;
	}

	public void setIntIdOrigenPeticion(Long intIdOrigenPeticion) {
		this.intIdOrigenPeticion = intIdOrigenPeticion;
	}

	public Integer getIntIdSolicitudMejora() {
		return intIdSolicitudMejora;
	}

	public void setIntIdSolicitudMejora(Integer intIdSolicitudMejora) {
		this.intIdSolicitudMejora = intIdSolicitudMejora;
	}

	public Long getLngIdPersonaSolicitante() {
		return lngIdPersonaSolicitante;
	}

	public void setLngIdPersonaSolicitante(Long lngIdPersonaSolicitante) {
		this.lngIdPersonaSolicitante = lngIdPersonaSolicitante;
	}	
	
}
