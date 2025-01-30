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
@Table(schema = "SIIUAT", name = "SIAXTELEFONOSAREASCAMPUS")
public class SiAxTelefonosAreasCampus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8024765435282110963L;

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDTELEFONOAREACAMPUS", sequenceName = "SIIUAT.IDTELEFONOAREACAMPUS", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDTELEFONOAREACAMPUS")
	@NotNull

	@Column(name = "IDTELEFONOAREACAMPUS")
	private Integer intIdTelefonoAreaCampus;

	@Column(name = "IDAREACAMPUS")
	private Integer intIdAreaCampus;

	@Column(name = "DSTELEFONOAREACAMPUS")
	private String strDsTelefonoAreaCampus;

	@Column(name = "NMCODIGOAREA")
	private String strNmCodigoArea;

	@Column(name = "NMEXTENSION")
	private String strNmExtension;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "IDPUESTO")
	private Integer intIdPuesto;

	@Column(name = "CLESTATUS")
	private Integer intClEstatus;

	public Integer getIntIdTelefonoAreaCampus() {
		return intIdTelefonoAreaCampus;
	}

	public void setIntIdTelefonoAreaCampus(Integer intIdTelefonoAreaCampus) {
		this.intIdTelefonoAreaCampus = intIdTelefonoAreaCampus;
	}

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
	}

	public String getStrDsTelefonoAreaCampus() {
		return strDsTelefonoAreaCampus;
	}

	public void setStrDsTelefonoAreaCampus(String strDsTelefonoAreaCampus) {
		this.strDsTelefonoAreaCampus = strDsTelefonoAreaCampus;
	}

	public String getStrNmCodigoArea() {
		return strNmCodigoArea;
	}

	public void setStrNmCodigoArea(String strNmCodigoArea) {
		this.strNmCodigoArea = strNmCodigoArea;
	}

	public String getStrNmExtension() {
		return strNmExtension;
	}

	public void setStrNmExtension(String strNmExtension) {
		this.strNmExtension = strNmExtension;
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

	public Integer getIntIdPuesto() {
		return intIdPuesto;
	}

	public void setIntIdPuesto(Integer intIdPuesto) {
		this.intIdPuesto = intIdPuesto;
	}

	public Integer getIntClEstatus() {
		return intClEstatus;
	}

	public void setIntClEstatus(Integer intClEstatus) {
		this.intClEstatus = intClEstatus;
	}

}