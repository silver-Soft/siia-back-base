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

@Entity
@Table(schema = "SIIUAT", name = "SIAXCORREOSAREASCAMPUS")
public class SiAxCorreosAreasCampus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8426978299788542739L;

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDCORREOAREACAMPUS", sequenceName = "SIIUAT.IDCORREOAREACAMPUS", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDCORREOAREACAMPUS")
	@Column(name = "IDCORREOAREACAMPUS")
	private Integer intIdCorreoAreaCampus;

	@Column(name = "IDAREACAMPUS")
	private Integer intIdAreaCampus;

	@Column(name = "DSCORREOAREACAMPUS")
	private String strDsCorreoAreaCampus;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "IDPUESTO")
	private Integer intIdPuesto;

	public Integer getIntIdCorreoAreaCampus() {
		return intIdCorreoAreaCampus;
	}

	public void setIntIdCorreoAreaCampus(Integer intIdCorreoAreaCampus) {
		this.intIdCorreoAreaCampus = intIdCorreoAreaCampus;
	}

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
	}

	public String getStrDsCorreoAreaCampus() {
		return strDsCorreoAreaCampus;
	}

	public void setStrDsCorreoAreaCampus(String strDsCorreoAreaCampus) {
		this.strDsCorreoAreaCampus = strDsCorreoAreaCampus;
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

}