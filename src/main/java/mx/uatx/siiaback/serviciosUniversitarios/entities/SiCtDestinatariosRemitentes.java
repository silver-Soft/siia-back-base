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
@Table(schema = "SIIUAT", name="SI_CT_DESTINATORIOS_REMITENTES")
public class SiCtDestinatariosRemitentes {
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "ID_DESTINATARIO_REMITENTE", sequenceName = "SIIUAT.ID_DESTINATARIO_REMITENTE", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_DESTINATARIO_REMITENTE")
	@NotNull
	@Column(name = "ID_DESTINATARIO_REMITENTE")
	private Long idDestinatarioRemitente;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	@Column(name = "FC_AUDIT")
	private Date fcAudit;
	
	@Column(name = "USUARIO_AUDIT")
	private String usuarioAudit;
	
	public Long getIdDestinatarioRemitente() {
		return idDestinatarioRemitente;
	}
	public void setIdDestinatarioRemitente(Long idDestinatarioRemitente) {
		this.idDestinatarioRemitente = idDestinatarioRemitente;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
