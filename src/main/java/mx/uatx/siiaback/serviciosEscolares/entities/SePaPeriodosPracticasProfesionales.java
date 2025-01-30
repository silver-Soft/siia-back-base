package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class SePaPeriodosPracticasProfesionales implements Serializable {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 4527389604629153827L;

	@Id
	@Column(name = "ID_SEAXPERIODOSPRACTICAS")
	private Integer idSeAxPeriodosPracticas;

	@Column(name = "PER_ACADEMICO", length = 30)
	private String strPeriodoAcademico;

	@Column(name = "PERMISO", length = 14)
	private String strPermiso;

	@Column(name = "FC_INICIO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcInicio;

	@Column(name = "FC_FIN")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcFin;

	@Column(name = "ESTATUS", length = 10)
	private String strEstatus;

	@Column(name = "IDAREACAMPUS")
	private Integer intIdAreaCampus;

	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus;

	@Column(name = "FC_AUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();

	@Column(name = "USUARIOAUDIT", length = 14)
	private String strUsuarioAudit;

	@Column(name = "DSPERIODOTEMPORADA", length = 10)
	private String strDsPeriodoTemporada;

	public Integer getIdSeAxPeriodosPracticas() {
		return idSeAxPeriodosPracticas;
	}

	public void setIdSeAxPeriodosPracticas(Integer idSeAxPeriodosServicio) {
		this.idSeAxPeriodosPracticas = idSeAxPeriodosServicio;
	}

	public Date getFcInicio() {
		return fcInicio;
	}

	public void setFcInicio(Date fcInicio) {
		this.fcInicio = fcInicio;
	}

	public Date getFcFin() {
		return fcFin;
	}

	public void setFcFin(Date fcFin) {
		this.fcFin = fcFin;
	}

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
	}

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
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

	public String getStrDsPeriodoTemporada() {
		return strDsPeriodoTemporada;
	}

	public void setStrDsPeriodoTemporada(String strDsPeriodoTemporada) {
		this.strDsPeriodoTemporada = strDsPeriodoTemporada;
	}

	public String getStrPeriodoAcademico() {
		return strPeriodoAcademico;
	}

	public void setStrPeriodoAcademico(String strPeriodoAcademico) {
		this.strPeriodoAcademico = strPeriodoAcademico;
	}

	public String getStrPermiso() {
		return strPermiso;
	}

	public void setStrPermiso(String strPermiso) {
		this.strPermiso = strPermiso;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

}
