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
@Table(schema = "SIIUAT", name = "SI_DT_TEMAS_REUNIONES")
public class SiDtTemasReuniones {
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "ID_TEMA_REUNION", sequenceName = "SIIUAT.ID_TEMA_REUNION", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_TEMA_REUNION")
	@NotNull
	@Column(name = "ID_TEMA_REUNION")
	private Long idTemaReunion;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	@Column(name = "ID_REUNION")
	private Long idReunion;
	
	@Column(name = "FC_AUDIT")
	private Date fcAudit;
	
	@Column(name = "USUARIO_AUDIT")
	private String usuarioAudit;

	public Long getIdTemaReunion() {
		return idTemaReunion;
	}

	public void setIdTemaReunion(Long idTemaReunion) {
		this.idTemaReunion = idTemaReunion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getIdReunion() {
		return idReunion;
	}

	public void setIdReunion(Long idReunion) {
		this.idReunion = idReunion;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getUsuarioAudit() {
		return usuarioAudit;
	}

	public void setUsuarioAudit(String usuarioAudit) {
		this.usuarioAudit = usuarioAudit;
	}
	
}
