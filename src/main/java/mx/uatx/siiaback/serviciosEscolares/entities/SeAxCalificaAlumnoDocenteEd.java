/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author sistemas10
 */
@Entity
@Table(schema = "SERESC", name = "SEAXCALIFICAALUMNODOCENTE_ED")
public class SeAxCalificaAlumnoDocenteEd implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8437488975297070064L;

	@Id
	@Column(name = "IDALUMNOCARGA")
	private Long lngIdAlumnoCarga;

	@Column(name = "CLDIMENSION_ED")
	private String strClDimensionED;

	@Column(name = "NMOBTENIDO")
	private Integer intNmObtenido;

	@Column(name = "NMOPTIMO")
	private Integer intNmOptimo;

	@Column(name = "IDOFERTADOCENTE")
	private Long lngIdOfertaDocente;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public SeAxCalificaAlumnoDocenteEd() {

	}

	public SeAxCalificaAlumnoDocenteEd(Long lngIdAlumnoCarga, String strClDimensionED, 
			Integer intNmObtenido, Integer intNmOptimo, Long lngIdOfertaDocente, Date fcAudit, String usuarioAudit) {
		super();
		this.lngIdAlumnoCarga = lngIdAlumnoCarga;
		this.strClDimensionED = strClDimensionED;
		this.intNmObtenido = intNmObtenido;
		this.intNmOptimo = intNmOptimo;
		this.lngIdOfertaDocente = lngIdOfertaDocente;
		this.fcAudit = fcAudit;
		this.strUsuarioAudit = usuarioAudit;
	}

	public Long getLngIdAlumnoCarga() {
		return lngIdAlumnoCarga;
	}

	public void setLngIdAlumnoCarga(Long lngIdAlumnoCarga) {
		this.lngIdAlumnoCarga = lngIdAlumnoCarga;
	}

	public String getStrClDimensionED() {
		return strClDimensionED;
	}

	public void setStrClDimensionED(String strClDimensionED) {
		this.strClDimensionED = strClDimensionED;
	}

	public Integer getIntNmObtenido() {
		return intNmObtenido;
	}

	public void setIntNmObtenido(Integer intNmObtenido) {
		this.intNmObtenido = intNmObtenido;
	}

	public Integer getIntNmOptimo() {
		return intNmOptimo;
	}

	public void setIntNmOptimo(Integer intNmOptimo) {
		this.intNmOptimo = intNmOptimo;
	}

	public Long getLngIdOfertaDocente() {
		return lngIdOfertaDocente;
	}

	public void setLngIdOfertaDocente(Long lngIdOfertaDocente) {
		this.lngIdOfertaDocente = lngIdOfertaDocente;
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
