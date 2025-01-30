package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "SIIUAT", name = "SIMSAVISOS")
public class SiMsAviso implements Serializable {
	private int idAviso;
	private Integer intIdMensajeAviso;
	private Integer intIdPersona;
	private Date fechaCreacion;
	private Date fechaEnterado;
	private String descripcion;
	private String estatusAviso;
	private Date fcAudit;
	private String usuarioAudit;

	public SiMsAviso() {
	}

	public SiMsAviso(int idaviso, Integer intIdMensajeAviso,
			Integer intIdPersona, Date fechaCreacion, String estatusaviso,
			String usuarioaudit) {
		this.idAviso = idaviso;
		this.intIdMensajeAviso = intIdMensajeAviso;
		this.intIdPersona = intIdPersona;
		this.fechaCreacion = fechaCreacion;
		this.estatusAviso = estatusaviso;
		this.usuarioAudit = usuarioaudit;
	}
	public SiMsAviso(int idaviso, Integer intIdMensajeAviso,
			Integer intIdPersona, Date fechaCreacion, Date fechaEnterado,
			String descripcion, String estatusaviso, Date fcaudit,
			String usuarioaudit) {
		this.idAviso = idaviso;
		this.intIdMensajeAviso = intIdMensajeAviso;
		this.intIdPersona = intIdPersona;
		this.fechaCreacion = fechaCreacion;
		this.fechaEnterado = fechaEnterado;
		this.descripcion = descripcion;
		this.estatusAviso = estatusaviso;
		this.fcAudit = fcaudit;
		this.usuarioAudit = usuarioaudit;
	}

	@Id
	@Column(name = "IDAVISO", unique = true, nullable = false, precision = 8, scale = 0)
	@SequenceGenerator(name = "generadorAviso", sequenceName = "SIIUAT.IDAVISO", allocationSize=1) 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="generadorAviso")
	public int getIdAviso() {
		return idAviso;
	}
	public void setIdAviso(int idAviso) {
		this.idAviso = idAviso;
	}

	@Column(name = "IDMENSAJEAVISO", nullable = false)
	public Integer getIntIdMensajeAviso() {
		return this.intIdMensajeAviso;
	}
	public void setIntIdMensajeAviso(Integer intIdMensajeAviso) {
		this.intIdMensajeAviso = intIdMensajeAviso;
	}

	@Column(name = "IDPERSONA", nullable = false)
	public Integer getIntIdPersona() {
		return intIdPersona;
	}
	public void setIntIdPersona(Integer intIdPersona) {
		this.intIdPersona = intIdPersona;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FECHA_CREACION", nullable = false, length = 7)
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "FECHA_ENTERADO", length = 7)
	public Date getFechaEnterado() {
		return this.fechaEnterado;
	}
	public void setFechaEnterado(Date fechaEnterado) {
		this.fechaEnterado = fechaEnterado;
	}

	@Column(name = "DESCRIPCION", length = 1000)
	public String getDescripcion() {
		return this.descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "ESTATUSAVISO", nullable = false, length = 30)
	public String getEstatusAviso() {
		return estatusAviso;
	}
	public void setEstatusAviso(String estatusAviso) {
		this.estatusAviso = estatusAviso;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FCAUDIT", length = 7)
	public Date getFcAudit() {
		return fcAudit;
	}
	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	@Column(name = "USUARIOAUDIT", nullable = false, length = 30)
	public String getUsuarioAudit() {
		return usuarioAudit;
	}
	public void setUsuarioAudit(String usuarioAudit) {
		this.usuarioAudit = usuarioAudit;
	}

}
