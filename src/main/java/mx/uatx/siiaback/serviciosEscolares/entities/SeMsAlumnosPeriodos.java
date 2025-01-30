package mx.uatx.siiaback.serviciosEscolares.entities;

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

/**
 *
 * @author zerodkpg
 */
@Entity
@Table(schema = "SERESC", name = "SEMSALUMNOSPERIODOS")
public class SeMsAlumnosPeriodos implements SeMsAlumnosPeriodosI, Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4357433080367069025L;

	@Id
	@Basic(optional = false)
	@Column(name = "IDALUMNOPERIODO")
	@SequenceGenerator(name = "GENIDALUMNOPERIODO", sequenceName = "SERESC.IDALUMNOPERIODO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENIDALUMNOPERIODO")
	private Long lngIdAlumnoPeriodo;

	@Column(name = "IDHISTORIALACADEMICO")
	private Long lngIdHistorialAcademico;

	@Column(name = "IDPERIODO")
	private String strIdPeriodo;

	@Column(name = "IDPAGO")
	private String strIdPago;

	@Column(name = "CLTIPOALUMNO")
	private String strClTipoAlumno;

	@Column(name = "CLSTALUMNOPERIODO")
	private String strClStaAlumnoPeriodo;

	@Column(name = "CLPERIODOCURSADO")
	private Long lngClPeriodoCursado;

	@Column(name = "FCSOLICITUD")
	private Date fcSolicitud;

	@Column(name = "FCAUTORIZACION")
	private Date fcAutorizacion;

	@Column(name = "FCINSCRIPCION")
	private Date fcInscripcion;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "CLSTCREDENCIAL")
	private Integer intClStCredencial;

	@Column(name = "CLSTSEGUROSOCIAL")
	private Integer intClStSeguroSocial;

	@Column(name = "CLESTATUSCAMBIOFOTO")
	private Integer intClEstatusCambioFoto;

	@Column(name = "CLESTATUSCAMBIOFIRMA")
	private Integer intClEstatusCambioFirma;
	
	public Long getLngIdAlumnoPeriodo() {
		return lngIdAlumnoPeriodo;
	}

	public void setLngIdAlumnoPeriodo(Long lngIdAlumnoPeriodo) {
		this.lngIdAlumnoPeriodo = lngIdAlumnoPeriodo;
	}

	public Long getLngIdHistorialAcademico() {
		return lngIdHistorialAcademico;
	}

	public void setLngIdHistorialAcademico(Long lngIdHistorialAcademico) {
		this.lngIdHistorialAcademico = lngIdHistorialAcademico;
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public String getStrIdPago() {
		return strIdPago;
	}

	public void setStrIdPago(String strIdPago) {
		this.strIdPago = strIdPago;
	}

	public String getStrClTipoAlumno() {
		return strClTipoAlumno;
	}

	public void setStrClTipoAlumno(String strClTipoAlumno) {
		this.strClTipoAlumno = strClTipoAlumno;
	}

	public String getStrClStaAlumnoPeriodo() {
		return strClStaAlumnoPeriodo;
	}

	public void setStrClStaAlumnoPeriodo(String strClStaAlumnoPeriodo) {
		this.strClStaAlumnoPeriodo = strClStaAlumnoPeriodo;
	}

	public Long getLngClPeriodoCursado() {
		return lngClPeriodoCursado;
	}

	public void setLngClPeriodoCursado(Long lngClPeriodoCursado) {
		this.lngClPeriodoCursado = lngClPeriodoCursado;
	}

	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	public Date getFcAutorizacion() {
		return fcAutorizacion;
	}

	public void setFcAutorizacion(Date fcAutorizacion) {
		this.fcAutorizacion = fcAutorizacion;
	}

	public Date getFcInscripcion() {
		return fcInscripcion;
	}

	public void setFcInscripcion(Date fcInscripcion) {
		this.fcInscripcion = fcInscripcion;
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

	public Integer getIntClStCredencial() {
		return intClStCredencial;
	}

	public void setIntClStCredencial(Integer intClStCredencial) {
		this.intClStCredencial = intClStCredencial;
	}

	public Integer getIntClStSeguroSocial() {
		return intClStSeguroSocial;
	}

	public void setIntClStSeguroSocial(Integer intClStSeguroSocial) {
		this.intClStSeguroSocial = intClStSeguroSocial;
	}

	public Integer getIntClEstatusCambioFoto() {
		return intClEstatusCambioFoto;
	}

	public void setIntClEstatusCambioFoto(Integer intClEstatusCambioFoto) {
		this.intClEstatusCambioFoto = intClEstatusCambioFoto;
	}

	public Integer getIntClEstatusCambioFirma() {
		return intClEstatusCambioFirma;
	}

	public void setIntClEstatusCambioFirma(Integer intClEstatusCambioFirma) {
		this.intClEstatusCambioFirma = intClEstatusCambioFirma;
	}

}
