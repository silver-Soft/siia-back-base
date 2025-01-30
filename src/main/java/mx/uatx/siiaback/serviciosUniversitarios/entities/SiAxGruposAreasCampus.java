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
@Table(schema = "SIIUAT", name = "SIAXGRUPOSAREASCAMPUS")
public class SiAxGruposAreasCampus implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4742440340340816782L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDGRUPOAREACAMPUS", sequenceName = "SIIUAT.IDGRUPOAREACAMPUS", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDGRUPOAREACAMPUS")
	@Column(name = "IDGRUPOAREACAMPUS")
	private Integer intIdGrupoAreaCampus;
	
	@Column(name = "IDGRUPOAREA")
	private Integer intIdGrupoArea;
	
	@Column(name = "IDAREACAMPUS")
	private Integer intIdAreaCampus;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public Integer getIntIdGrupoAreaCampus() {
		return intIdGrupoAreaCampus;
	}

	public void setIntIdGrupoAreaCampus(Integer intIdGrupoAreaCampus) {
		this.intIdGrupoAreaCampus = intIdGrupoAreaCampus;
	}

	public Integer getIntIdGrupoArea() {
		return intIdGrupoArea;
	}

	public void setIntIdGrupoArea(Integer intIdGrupoArea) {
		this.intIdGrupoArea = intIdGrupoArea;
	}

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
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
