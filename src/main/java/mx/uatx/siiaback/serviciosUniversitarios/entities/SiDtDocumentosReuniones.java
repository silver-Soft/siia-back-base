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
@Table(schema = "SIIUAT", name="SI_DT_DOCUMENTOS_REUNIONES")
public class SiDtDocumentosReuniones {
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "ID_DOCUMENTO_REUNION", sequenceName = "SIIUAT.ID_DOCUMENTO_REUNION", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_DOCUMENTO_REUNION")
    @NotNull
    @Column(name = "ID_DOCUMENTO_REUNION")
	private Long idDocumentoReunion;
	
	@Column(name = "TITULO")
	private String titulo;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "ID_REUNION")
	private Long idReunion;
	
	@Column(name = "FC_AUDIT")
	private Date fcAudit;
	
	@Column(name = "USUARIO_AUDIT")
	private String usuarioAudit;
	
	@Column(name = "ARCHIVO")
	private byte[] archivo;

	public Long getIdDocumentoReunion() {
		return idDocumentoReunion;
	}

	public void setIdDocumentoReunion(Long idDocumentoReunion) {
		this.idDocumentoReunion = idDocumentoReunion;
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

	public byte[] getArchivo() {
		return archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}
}
