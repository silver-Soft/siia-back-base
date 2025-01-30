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
@Table(schema = "SIIUAT", name = "SIAXGPOSPROGRAMASPERSONAS")
public class SiAxGposProgramasPersonas {
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDGRUPOPROGRAMAPERSONA", sequenceName = "SIIUAT.IDGRUPOPROGRAMAPERSONA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDGRUPOPROGRAMAPERSONA")
	@Column(name = "IDGRUPOPROGRAMAPERSONA")
	private Long idGrupoProgramaPersona;
	
	
	@Column(name = "IDGRUPOPROGRAMA")
	private Long idGrupoPrograma;
	
	@Column(name = "IDPERSONA")
	private Long idPersona;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;
	
	public Long getIdGrupoPrograma() {
		return idGrupoPrograma;
	}

	public void setIdGrupoPrograma(Long idGrupoPrograma) {
		this.idGrupoPrograma = idGrupoPrograma;
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

	public Long getIdGrupoProgramaPersona() {
		return idGrupoProgramaPersona;
	}

	public void setIdGrupoProgramaPersona(Long idGrupoProgramaPersona) {
		this.idGrupoProgramaPersona = idGrupoProgramaPersona;
	}

}
