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
@Table(schema = "SIIUAT", name = "SIMSVISITANTES")
public class SiMsVisitantes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6768236097327408510L;
	@Id
	@Column(name = "IDVISITANTE", length = 9)
	private Long lngIdVisitante;

	@Column(name = "NBVISITANTE", length = 80)
	private String strNbVisitante;

	@Column(name = "APPATERNO", length = 50)
	private String strApPaterno;

	@Column(name = "APMATERNO", length = 50)
	private String strApMaterno;

	@Column(name = "DOCUMENTOVISITANTE")
	private byte[] blobDocumentoVisitante;

	@Column(name = "CORREO", length = 40)
	private String strCorreo;

	@Column(name = "TELEFONO", length = 25)
	private String strTelefono;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT", length = 30)
	private String strUsuarioAudit;

	@Column(name = "FCALTA")
	private Date fcAlta;

	@Column(name = "FCBAJA")
	private Date fcBaja;

	@Column(name = "EDAD", length = 3)
	private Integer intEdad;

	@Column(name = "CLESTATUS", length = 1)
	private Integer intClEstatus;

	@Column(name = "TIPO", length = 30)
	private String strTipo;

	@Column(name = "MATRICULA", length = 30)
	private String strMatricula;

	@Column(name = "IDAREACAMPUS", length = 4)
	private Integer intIdAreaCampus;

	public Long getLngIdVisitante() {
		return lngIdVisitante;
	}

	public void setLngIdVisitante(Long lngIdVisitante) {
		this.lngIdVisitante = lngIdVisitante;
	}

	public String getStrNbVisitante() {
		return strNbVisitante;
	}

	public void setStrNbVisitante(String strNbVisitante) {
		this.strNbVisitante = strNbVisitante;
	}

	public String getStrApPaterno() {
		return strApPaterno;
	}

	public void setStrApPaterno(String strApPaterno) {
		this.strApPaterno = strApPaterno;
	}

	public String getStrApMaterno() {
		return strApMaterno;
	}

	public void setStrApMaterno(String strApMaterno) {
		this.strApMaterno = strApMaterno;
	}

	public byte[] getBlobDocumentoVisitante() {
		return blobDocumentoVisitante;
	}

	public void setBlobDocumentoVisitante(byte[] blobDocumentoVisitante) {
		this.blobDocumentoVisitante = blobDocumentoVisitante;
	}

	public String getStrCorreo() {
		return strCorreo;
	}

	public void setStrCorreo(String strCorreo) {
		this.strCorreo = strCorreo;
	}

	public String getStrTelefono() {
		return strTelefono;
	}

	public void setStrTelefono(String strTelefono) {
		this.strTelefono = strTelefono;
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

	public Date getFcAlta() {
		return fcAlta;
	}

	public void setFcAlta(Date fcAlta) {
		this.fcAlta = fcAlta;
	}

	public Date getFcBaja() {
		return fcBaja;
	}

	public void setFcBaja(Date fcBaja) {
		this.fcBaja = fcBaja;
	}

	public Integer getIntEdad() {
		return intEdad;
	}

	public void setIntEdad(Integer intEdad) {
		this.intEdad = intEdad;
	}

	public Integer getIntClEstatus() {
		return intClEstatus;
	}

	public void setIntClEstatus(Integer intClEstatus) {
		this.intClEstatus = intClEstatus;
	}

	public String getStrTipo() {
		return strTipo;
	}

	public void setStrTipo(String strTipo) {
		this.strTipo = strTipo;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
	}

}