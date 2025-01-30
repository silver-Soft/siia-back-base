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
@Table(schema = "SIIUAT", name="SIAXAREASPROGRAMAS")
public class SiAxAreasProgramas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4223417848338319231L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDAREAPROGRAMA", sequenceName = "SIIUAT.IDAREAPROGRAMA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDAREAPROGRAMA")
	
	@Column(name = "IDAREAPROGRAMA")
	private Integer intIdAreaPrograma;
	
	@Column(name = "IDAREACAMPUS")
	private Integer intIdAreaCampus;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;
	
	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus;

	public Integer getIntIdAreaPrograma() {
		return intIdAreaPrograma;
	}

	public void setIntIdAreaPrograma(Integer intIdAreaPrograma) {
		this.intIdAreaPrograma = intIdAreaPrograma;
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

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
	}

}
