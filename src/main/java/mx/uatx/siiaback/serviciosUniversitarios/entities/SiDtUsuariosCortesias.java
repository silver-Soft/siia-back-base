/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "SIIUAT", name = "SIDTUSUARIOSCORTESIAS")
public class SiDtUsuariosCortesias implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5860222623137487685L;

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "GENID_USUARIOCORT", sequenceName = "SIIUAT.ID_USUARIOCORT", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENID_USUARIOCORT")
	@Column(name = "IDUSUARIOCORT")
	private Long lngIdUsuarioCort;

	@Column(name = "CLESTATUSCORTACTIVA")
	private Integer intClEstatusCort;

	@Column(name = "PERSONAAUTORIZO")
	private String strPersonaAutorizo;

	@Column(name = "USUARIOAUDIT", length = 30)
	private String strUsuarioAudit;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit;

	@Column(name = "IDUSUARIOACTDEPYREC")
	private Long lngIdUsuarioActDepYRec;

	public Long getLngIdUsuarioCort() {
		return lngIdUsuarioCort;
	}

	public void setLngIdUsuarioCort(Long lngIdUsuarioCort) {
		this.lngIdUsuarioCort = lngIdUsuarioCort;
	}

	public Integer getIntClEstatusCort() {
		return intClEstatusCort;
	}

	public void setIntClEstatusCort(Integer intClEstatusCort) {
		this.intClEstatusCort = intClEstatusCort;
	}

	public String getStrPersonaAutorizo() {
		return strPersonaAutorizo;
	}

	public void setStrPersonaAutorizo(String strPersonaAutorizo) {
		this.strPersonaAutorizo = strPersonaAutorizo;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public Long getLngIdUsuarioActDepYRec() {
		return lngIdUsuarioActDepYRec;
	}

	public void setLngIdUsuarioActDepYRec(Long lngIdUsuarioActDepYRec) {
		this.lngIdUsuarioActDepYRec = lngIdUsuarioActDepYRec;
	}

}
