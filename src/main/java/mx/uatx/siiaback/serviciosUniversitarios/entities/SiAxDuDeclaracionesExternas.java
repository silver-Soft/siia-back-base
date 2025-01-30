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
@Table(schema = "SIIUAT", name = "SIAXDUDECLARACIONESEXTERNAS")
public class SiAxDuDeclaracionesExternas {
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDDECLARACIONEXTERNA", sequenceName = "SIIUAT.IDDECLARACIONEXTERNA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDDECLARACIONEXTERNA")
	@Column(name = "IDDECLARACIONEXTERNA")
	private Long idDeclaracionExterna;
	
	@Column(name = "FCDECLARACIONEXTERNA")
	private Date fcDeclaracionExterna;

	@Column(name = "IDPERSONA")
	private Long idPersona;

	@Column(name = "IDPERIODO")
	private String idPeriodo;

	@Column(name = "OBSERVACIONES")
	private String observaciones;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String usuarioAudit;
	
	public Long getIdDeclaracionExterna() {
		return idDeclaracionExterna;
	}
	public void setIdDeclaracionExterna(Long idDeclaracionExterna) {
		this.idDeclaracionExterna = idDeclaracionExterna;
	}
	public Date getFcDeclaracionExterna() {
		return fcDeclaracionExterna;
	}
	public void setFcDeclaracionExterna(Date fcDeclaracionExterna) {
		this.fcDeclaracionExterna = fcDeclaracionExterna;
	}
	public Long getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}
	public String getIdPeriodo() {
		return idPeriodo;
	}
	public void setIdPeriodo(String idPeriodo) {
		this.idPeriodo = idPeriodo;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
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
