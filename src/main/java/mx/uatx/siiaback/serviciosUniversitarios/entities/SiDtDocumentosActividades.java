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
@Table(schema = "SIIUAT", name="SI_DT_DOCUMENTOS_ACTIVIDADES")
public class SiDtDocumentosActividades {
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "ID_DOCUMENTO_ACTIVIDAD", sequenceName = "SIIUAT.ID_DOCUMENTO_ACTIVIDAD", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_DOCUMENTO_ACTIVIDAD")
    @NotNull
    @Column(name = "ID_DOCUMENTO_ACTIVIDAD")
	private Long idDocumentoActividad;
	
	@Column(name = "TITULO")
	private String titulo;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "FC_AUDIT")
	private Date fcAudit;
	
	@Column(name = "USUARIO_AUDIT")
	private String usuarioAudit;
	
	@Column(name = "ID_ACTIVIDAD")
	private Long idActividad;
	
	@Column(name = "ARCHIVO")
	private byte[] archivo;
	
	@Column(name = "ID_CORRESPONDENCIA")
	private Long idCorrespondencia;

	public Long getIdDocumentoActividad() {
		return idDocumentoActividad;
	}

	public void setIdDocumentoActividad(Long idDocumentoActividad) {
		this.idDocumentoActividad = idDocumentoActividad;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public Long getIdActividad() {
		return idActividad;
	}

	public void setIdActividad(Long idActividad) {
		this.idActividad = idActividad;
	}

	public byte[] getArchivo() {
		return archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}

	public Long getIdCorrespondencia() {
		return idCorrespondencia;
	}

	public void setIdCorrespondencia(Long idCorrespondencia) {
		this.idCorrespondencia = idCorrespondencia;
	}

}
