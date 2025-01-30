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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "SERESC", name = "SEAXALUMNOSACTAS")
public class SeAxAlumnosActas implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1785004168243419049L;

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDALUMNOACTA", sequenceName = "SERESC.IDALUMNOACTA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDALUMNOACTA")

	@Column(name = "IDALUMNOACTA")
	private Long lngIdAlumnoActa;

	@Column(name = "IDALUMNOCARGA")
	private Long lngIdAlumnoCarga;

	@Column(name = "IDACTA")
	private Long lngIdActa;

	@Column(name = "CLCALIFICACION")
	private Integer intClCalificacion;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "CLCALIFICACIONFINAL")
	private Integer intClCalificacionFinal;

	@Column(name = "IDTIPOCALIFICACION")
	private Integer intIdTipoCalificacion;

	@Column(name = "CLESTATUSALUMNOACTA")
	private Integer intClEstatusAlumnoActa;

	@Column(name = "DSREFERENCIA")
	private String strReferencia;

	@Column(name = "IDINSTITUCION")
	private Integer intIdInstitucion;

	@Column(name = "IDCENTROTRABAJO")
	private Integer intIdCentroTrabajo;

	@Column(name = "CONVALIDADA")
	private Integer intConvalidada;

	public Long getLngIdAlumnoActa() {
		return lngIdAlumnoActa;
	}

	public void setLngIdAlumnoActa(Long lngIdAlumnoActa) {
		this.lngIdAlumnoActa = lngIdAlumnoActa;
	}

	public Long getLngIdAlumnoCarga() {
		return lngIdAlumnoCarga;
	}

	public void setLngIdAlumnoCarga(Long lngIdAlumnoCarga) {
		this.lngIdAlumnoCarga = lngIdAlumnoCarga;
	}

	public Long getLngIdActa() {
		return lngIdActa;
	}

	public void setLngIdActa(Long lngIdActa) {
		this.lngIdActa = lngIdActa;
	}

	public Integer getIntClCalificacion() {
		return intClCalificacion;
	}

	public void setIntClCalificacion(Integer intClCalificacion) {
		this.intClCalificacion = intClCalificacion;
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

	public Integer getIntClCalificacionFinal() {
		return intClCalificacionFinal;
	}

	public void setIntClCalificacionFinal(Integer intClCalificacionFinal) {
		this.intClCalificacionFinal = intClCalificacionFinal;
	}

	public Integer getIntIdTipoCalificacion() {
		return intIdTipoCalificacion;
	}

	public void setIntIdTipoCalificacion(Integer intIdTipoCalificacion) {
		this.intIdTipoCalificacion = intIdTipoCalificacion;
	}

	public Integer getIntClEstatusAlumnoActa() {
		return intClEstatusAlumnoActa;
	}

	public void setIntClEstatusAlumnoActa(Integer intClEstatusAlumnoActa) {
		this.intClEstatusAlumnoActa = intClEstatusAlumnoActa;
	}

	public String getStrReferencia() {
		return strReferencia;
	}

	public void setStrReferencia(String strReferencia) {
		this.strReferencia = strReferencia;
	}

	public Integer getIntIdInstitucion() {
		return intIdInstitucion;
	}

	public void setIntIdInstitucion(Integer intIdInstitucion) {
		this.intIdInstitucion = intIdInstitucion;
	}

	public Integer getIntIdCentroTrabajo() {
		return intIdCentroTrabajo;
	}

	public void setIntIdCentroTrabajo(Integer intIdCentroTrabajo) {
		this.intIdCentroTrabajo = intIdCentroTrabajo;
	}

	public Integer getIntConvalidada() {
		return intConvalidada;
	}

	public void setIntConvalidada(Integer intConvalidada) {
		this.intConvalidada = intConvalidada;
	}

}
