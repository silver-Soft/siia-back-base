/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author sistemas10
 */
@Entity
@Table(schema = "SERESC", name = "SEAXPERIODOSSERVICIO")
public class SeAxPeriodosServicio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "GENID_SEAXPERIODOSSERVICIO", sequenceName = "SERESC.ID_PERIODOS", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENID_SEAXPERIODOSSERVICIO")
	@Column(name = "ID_SEAXPERIODOSSERVICIO")
	private Integer idSeAxPeriodosServicio;

	@Column(name = "PER_ACADEMICO", length = 30)
	private String strIdPeriodoAcademico;

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

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();

	@Column(name = "USUARIOAUDIT", length = 14)
	private String strUsuarioAudit;

	@Column(name = "IDAREACAMPUS")
	private Integer intIdAreaCampus;

	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus;

	public SeAxPeriodosServicio() {
	}

	public Integer getIdSeAxPeriodosServicio() {
		return idSeAxPeriodosServicio;
	}

	public void setIdSeAxPeriodosServicio(Integer idSeAxPeriodosServicio) {
		this.idSeAxPeriodosServicio = idSeAxPeriodosServicio;
	}

	public String getStrIdPeriodoAcademico() {
		return strIdPeriodoAcademico;
	}

	public void setStrIdPeriodoAcademico(String strIdPeriodoAcademico) {
		this.strIdPeriodoAcademico = strIdPeriodoAcademico;
	}

	public String getStrPermiso() {
		return strPermiso;
	}

	public void setStrPermiso(String strPermiso) {
		this.strPermiso = strPermiso;
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

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
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

}
