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
@Table(schema = "SERESC", name = "SEAXALUMNOSCARGAS")
public class SeAxAlumnosCargas implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5954611268820708237L;
	

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "GENID_IDALUMNOCARGA", sequenceName = "SERESC.IDALUMNOCARGA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENID_IDALUMNOCARGA")
	@Column(name = "IDALUMNOCARGA")
	private Long lngIdAlumnoCarga;

	@Column(name = "IDALUMNOPERIODO")
	private Long lngIdAlumnoPeriodo;

	@Column(name = "IDOFERTA")
	private Long lngIdOferta;

	@Column(name = "CLSTALUMNOCARGA")
	private String strCvEstatusAlumnoCarga;

	@Column(name = "CLSTEVALUACIONDOCENTE")
	private Integer intCveEstatusEvaluacionDocente;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;
	
	@Column(name = "DSOBSERVACIONES")
	private String strDsObservaciones;

	@Column(name = "FCCARGA")
	private Date fcCarga;
	
	@Column(name = "FCAUTORIZACION")
	private Date fcAutorizacion;
	
	public SeAxAlumnosCargas() {

	}

	public Long getLngIdAlumnoCarga() {
		return lngIdAlumnoCarga;
	}

	public void setLngIdAlumnoCarga(Long lngIdAlumnoCarga) {
		this.lngIdAlumnoCarga = lngIdAlumnoCarga;
	}

	public Long getLngIdAlumnoPeriodo() {
		return lngIdAlumnoPeriodo;
	}

	public void setLngIdAlumnoPeriodo(Long lngIdAlumnoPeriodo) {
		this.lngIdAlumnoPeriodo = lngIdAlumnoPeriodo;
	}

	public Long getLngIdOferta() {
		return lngIdOferta;
	}

	public void setLngIdOferta(Long lngIdOferta) {
		this.lngIdOferta = lngIdOferta;
	}

	public String getStrCvEstatusAlumnoCarga() {
		return strCvEstatusAlumnoCarga;
	}

	public void setStrCvEstatusAlumnoCarga(String strCvEstatusAlumnoCarga) {
		this.strCvEstatusAlumnoCarga = strCvEstatusAlumnoCarga;
	}

	public Integer getIntCveEstatusEvaluacionDocente() {
		return intCveEstatusEvaluacionDocente;
	}

	public void setIntCveEstatusEvaluacionDocente(Integer intCveEstatusEvaluacionDocente) {
		this.intCveEstatusEvaluacionDocente = intCveEstatusEvaluacionDocente;
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

	public String getStrDsObservaciones() {
		return strDsObservaciones;
	}

	public void setStrDsObservaciones(String strDsObservaciones) {
		this.strDsObservaciones = strDsObservaciones;
	}

	public Date getFcCarga() {
		return fcCarga;
	}

	public void setFcCarga(Date fcCarga) {
		this.fcCarga = fcCarga;
	}

	public Date getFcAutorizacion() {
		return fcAutorizacion;
	}

	public void setFcAutorizacion(Date fcAutorizacion) {
		this.fcAutorizacion = fcAutorizacion;
	}

}
