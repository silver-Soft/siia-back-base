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
@Table(schema = "SIIUAT", name = "SICTGRUPOSAREAS")
public class SiCtGruposAreas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7742819652818432724L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDGRUPOAREA", sequenceName = "SIIUAT.IDGRUPOAREA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDGRUPOAREA")
	@NotNull
	@Column(name = "IDGRUPOAREA")
	private Integer intIdGrupoArea;
	
	@Column(name = "CLESTATUS")
	private Integer intClEstatus;
	
	@Column(name = "NBGRUPOAREA")
	private String strNbGrupoArea;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public Integer getIntIdGrupoArea() {
		return intIdGrupoArea;
	}

	public void setIntIdGrupoArea(Integer intIdGrupoArea) {
		this.intIdGrupoArea = intIdGrupoArea;
	}

	public Integer getIntClEstatus() {
		return intClEstatus;
	}

	public void setIntClEstatus(Integer intClEstatus) {
		this.intClEstatus = intClEstatus;
	}

	public String getStrNbGrupoArea() {
		return strNbGrupoArea;
	}

	public void setStrNbGrupoArea(String strNbGrupoArea) {
		this.strNbGrupoArea = strNbGrupoArea;
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
