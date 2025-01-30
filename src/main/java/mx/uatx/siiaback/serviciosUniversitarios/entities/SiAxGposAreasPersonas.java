package mx.uatx.siiaback.serviciosUniversitarios.entities;

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
@Table(schema = "SIIUAT", name = "SIAXGPOSAREASPERSONAS")
public class SiAxGposAreasPersonas {
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDGRUPOAREAPERSONA", sequenceName = "SIIUAT.IDGRUPOAREAPERSONA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDGRUPOAREAPERSONA")
	@Column(name = "IDGRUPOAREAPERSONA")
	private Long idGrupoAreaPersona;
	
	@Column(name = "IDGRUPOAREA")
	private Long idGrupoArea;
	
	@Column(name = "IDPERSONA")
	private Long idPersona;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public Long getIdGrupoAreaPersona() {
		return idGrupoAreaPersona;
	}

	public void setIdGrupoAreaPersona(Long idGrupoAreaPersona) {
		this.idGrupoAreaPersona = idGrupoAreaPersona;
	}

	public Long getIdGrupoArea() {
		return idGrupoArea;
	}

	public void setIdGrupoArea(Long idGrupoArea) {
		this.idGrupoArea = idGrupoArea;
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
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
