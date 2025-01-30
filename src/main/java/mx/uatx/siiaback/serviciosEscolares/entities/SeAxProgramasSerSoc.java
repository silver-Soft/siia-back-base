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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author zerodkpg
 */
@Entity
@Table(schema = "SERESC", name = "SEAXPROGRAMASSERSOC")
public class SeAxProgramasSerSoc implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1428190741950294947L;

	@Id
	@Basic(optional = false)
	@Column(name = "ID_SEAXPROGRAMASSERSOC")
	@SequenceGenerator(name = "GENID_SEAXPROGRAMASSERSOC", sequenceName = "SERESC.ID_PROGRAMAS", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENID_SEAXPROGRAMASSERSOC")
	private Integer intIdPrograma;

	@Column(name = "NOMBRE_SEAXPROGRAMASSERSOC")
	private String strNombre;

	@Column(name = "AREA")
	private String strArea;

	@Column(name = "ESTATUS")
	private String strEstatus;
	
	@Column(name = "USUARIOAUDIT")
	private String strUsuarioLog;
	
	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();

	@JoinColumn(name = "DEP_ID_SECTDEPENDENCIAS", referencedColumnName = "IDSECTDEPENDENCIAS")
	@ManyToOne(optional = false)
	private SeCtDependencias dependencia;

	public SeAxProgramasSerSoc() {
	}

	public Integer getIntIdPrograma() {
		return intIdPrograma;
	}

	public void setIntIdPrograma(Integer intIdPrograma) {
		this.intIdPrograma = intIdPrograma;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrArea() {
		return strArea;
	}

	public void setStrArea(String strArea) {
		this.strArea = strArea;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public SeCtDependencias getDependencia() {
		return dependencia;
	}

	public void setDependencia(SeCtDependencias dependencia) {
		this.dependencia = dependencia;
	}

	public String getStrUsuarioLog() {
		return strUsuarioLog;
	}

	public void setStrUsuarioLog(String strUsuarioLog) {
		this.strUsuarioLog = strUsuarioLog;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}
	
}
