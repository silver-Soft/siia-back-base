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
import javax.validation.constraints.NotNull;

@Entity
@Table(schema = "SIIUAT", name = "SIROLESPERSONAS")
public class SiRolesPersonas {
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDPERSONA", sequenceName = "SIIUAT.IDPERSONA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDPERSONA")
	@NotNull
	@Column(name = "IDPERSONA")
	private Long idPersona;
	
	@Column(name = "IDROL")
	private Integer intIdRol;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;
	
	@Column(name = "IDGRUPOUSUARIO")
	private Long idGrupoUsuario;

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public Integer getIntIdRol() {
		return intIdRol;
	}

	public void setIntIdRol(Integer intIdRol) {
		this.intIdRol = intIdRol;
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

	public Long getIdGrupoUsuario() {
		return idGrupoUsuario;
	}

	public void setIdGrupoUsuario(Long idGrupoUsuario) {
		this.idGrupoUsuario = idGrupoUsuario;
	}

}
