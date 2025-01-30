package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "SIIUAT", name = "SI_MS_CORRESPONDENCIAS")
public class SiMsCorrespondencia {
	
	@Id
	@Column(name = "ID_CORRESPONDENCIA")
	@SequenceGenerator(name = "generadorIdentificadorCor", sequenceName = "SIIUAT.ID_CORRESPONDENCIA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generadorIdentificadorCor")
	private Long idCorrespondencia;
	
	@Column(name = "REFERENCIA")
	private String referencia;

	@Column(name = "FECHA")
	private Date fecha;

	@Column(name = "ASUNTO")
	private String asunto;

	@Column(name = "EXPEDIENTE")
	private String expediente;

	@Column(name = "ID_TIPO_DOCUMENTO")
	private Integer idTipoDocumento;

	@Column(name = "ID_CLASIFICACION_CORRESPONDENC")
	private Long idClasificacionCorrespondencia;

	@Column(name = "ID_TIPO_CORRESPONDENCIA")
	private Long idTipoCorrespondencia;

	@Column(name = "ID_REMITENTE")
	private Long idRemitente;

	@Column(name = "ID_PROCESO")
	private Long idProceso;

	@Column(name = "ID_DESTINATARIO")
	private Long idDestinatario;

	@Column(name = "ID_HISTORIAL_LABORAL")
	private Long idHistorialLaboral;

	@Column(name = "ID_AREA_CAMPUS")
	private Long idAreaCampus;

	@Column(name = "ID_INSTITUCION")
	private Long idInstitucion;

	@Column(name = "FC_AUDIT")
	private Date fcAudit;

	@Column(name = "USUARIO_AUDIT")
	private String usuarioAudit;
	
	
	public Long getIdCorrespondencia() {
		return idCorrespondencia;
	}
	public void setIdCorrespondencia(Long idCorrespondencia) {
		this.idCorrespondencia = idCorrespondencia;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getExpediente() {
		return expediente;
	}
	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}
	public Integer getIdTipoDocumento() {
		return idTipoDocumento;
	}
	public void setIdTipoDocumento(Integer idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}
	public Long getIdClasificacionCorrespondencia() {
		return idClasificacionCorrespondencia;
	}
	public void setIdClasificacionCorrespondencia(Long idClasificacionCorrespondencia) {
		this.idClasificacionCorrespondencia = idClasificacionCorrespondencia;
	}
	public Long getIdTipoCorrespondencia() {
		return idTipoCorrespondencia;
	}
	public void setIdTipoCorrespondencia(Long idTipoCorrespondencia) {
		this.idTipoCorrespondencia = idTipoCorrespondencia;
	}
	public Long getIdRemitente() {
		return idRemitente;
	}
	public void setIdRemitente(Long idRemitente) {
		this.idRemitente = idRemitente;
	}
	public Long getIdProceso() {
		return idProceso;
	}
	public void setIdProceso(Long idProceso) {
		this.idProceso = idProceso;
	}
	public Long getIdDestinatario() {
		return idDestinatario;
	}
	public void setIdDestinatario(Long idDestinatario) {
		this.idDestinatario = idDestinatario;
	}
	public Long getIdHistorialLaboral() {
		return idHistorialLaboral;
	}
	public void setIdHistorialLaboral(Long idHistorialLaboral) {
		this.idHistorialLaboral = idHistorialLaboral;
	}
	public Long getIdAreaCampus() {
		return idAreaCampus;
	}
	public void setIdAreaCampus(Long idAreaCampus) {
		this.idAreaCampus = idAreaCampus;
	}
	public Long getIdInstitucion() {
		return idInstitucion;
	}
	public void setIdInstitucion(Long idInstitucion) {
		this.idInstitucion = idInstitucion;
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
