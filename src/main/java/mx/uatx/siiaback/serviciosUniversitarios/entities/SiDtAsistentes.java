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
@Table(schema = "SIIUAT", name = "SI_DT_ASISTENTES")
public class SiDtAsistentes {
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "ID_ASISTENTE", sequenceName = "SIIUAT.ID_ASISTENTE", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_ASISTENTE")
	@NotNull
	@Column(name = "ID_ASISTENTE")
	private Long idAsistente;
	
	@Column(name = "ASISTIO")
	private boolean asistio;
	
	@Column(name = "ID_HISTORIAL_LABORAL")
	private Long idHistorialLaboral;
	
	@Column(name = "ID_REUNION")
	private Long idReunion;
	
	@Column(name = "FC_AUDIT")
	private Date fcAudit;
	
	@Column(name = "USUARIO_AUDIT")
	private String usuarioAudit;
	
	public Long getIdAsistente() {
		return idAsistente;
	}
	public void setIdAsistente(Long idAsistente) {
		this.idAsistente = idAsistente;
	}
	public boolean isAsistio() {
		return asistio;
	}
	public void setAsistio(boolean asistio) {
		this.asistio = asistio;
	}
	public Long getIdHistorialLaboral() {
		return idHistorialLaboral;
	}
	public void setIdHistorialLaboral(Long idHistorialLaboral) {
		this.idHistorialLaboral = idHistorialLaboral;
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
