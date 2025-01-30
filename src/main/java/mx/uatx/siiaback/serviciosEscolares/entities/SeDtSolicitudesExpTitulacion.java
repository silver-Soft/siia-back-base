package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Rogelio Lima
 */
@Entity
@Table(schema = "SERESC", name = "SEDTSOLICITUDEXPTITULACION")
public class SeDtSolicitudesExpTitulacion implements java.io.Serializable {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = -7073223778294353356L;

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "GENIDDTSOLICITUDEXPITULACION", sequenceName = "SERESC.IDDTSOLICITUDEXPTITULACION", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENIDDTSOLICITUDEXPITULACION")
	@Column(name = "IDDTSOLICITUDEXPTITULACION")
	private Long lngIdDtSolicitudExptitulacion;

	@Basic(optional = false)
	@Column(name = "IDHISTORIALACADEMICO",nullable=false)
	private Integer idHistorialAcademico;
	
	@Column(name = "CLESTATUSPERMITIDO",nullable=true)
	private Integer intClEstatus;

	@Column(name = "IDSOLICITUDEXPTITULACION")
	private Integer intIdSolicitudExpediente;

	@Column(name = "OBSERVACIONES", length = 100,nullable=true)
	private String strObservaciones;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT", length = 30)
	private String strUsuarioAudit;

	public Long getLngIdDtSolicitudExptitulacion() {
		return lngIdDtSolicitudExptitulacion;
	}

	public void setLngIdDtSolicitudExptitulacion(Long lngIdDtSolicitudExptitulacion) {
		this.lngIdDtSolicitudExptitulacion = lngIdDtSolicitudExptitulacion;
	}

	public Integer getIdHistorialAcademico() {
		return idHistorialAcademico;
	}

	public void setIdHistorialAcademico(Integer idHistorialAcademico) {
		this.idHistorialAcademico = idHistorialAcademico;
	}
	
	public Integer getIntClEstatus() {
		return intClEstatus;
	}

	public void setIntClEstatus(Integer intClEstatus) {
		this.intClEstatus = intClEstatus;
	}

	public Integer getIntIdSolicitudExpediente() {
		return intIdSolicitudExpediente;
	}

	public void setIntIdSolicitudExpediente(Integer intIdSolicitudExpediente) {
		this.intIdSolicitudExpediente = intIdSolicitudExpediente;
	}

	public String getStrObservaciones() {
		return strObservaciones;
	}

	public void setStrObservaciones(String strObservaciones) {
		this.strObservaciones = strObservaciones;
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
