package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtCorrespondenciaAdmin {
	
	@Id
	@Column(name = "ID_CORRESPONDENCIA")
	private Long idCorrespondencia;
	
	@Column(name = "REFERENCIA")
	private String referencia;

	@Column(name = "FECHA")
	private Date fecha;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	@Column(name = "REMITENTE")
	private String remitente;

	@Column(name = "DESTINATARIO")
	private String destinatario;

	@Column(name = "NMINSTITUCION")
	private String nmInstitucion;
	
	@Column(name = "ASUNTO")
	private String asunto;
	
	@Column(name = "color")
	private String color;

	@Column(name = "PERMITEMODIFICAR")
	private Integer permiteModificar;

	@Column(name = "PERMITEELIMINAR")
	private Integer permiteEliminar;

	@Column(name = "PERMITEDOCUMENTOS")
	private Integer permiteDocumentos;
	
	@Column(name = "PERMITEGUARDAR")
	private Integer permiteGuardar;

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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getNmInstitucion() {
		return nmInstitucion;
	}

	public void setNmInstitucion(String nmInstitucion) {
		this.nmInstitucion = nmInstitucion;
	}

	public Integer getPermiteModificar() {
		return permiteModificar;
	}

	public void setPermiteModificar(Integer permiteModificar) {
		this.permiteModificar = permiteModificar;
	}

	public Integer getPermiteEliminar() {
		return permiteEliminar;
	}

	public void setPermiteEliminar(Integer permiteEliminar) {
		this.permiteEliminar = permiteEliminar;
	}

	public Integer getPermiteDocumentos() {
		return permiteDocumentos;
	}

	public void setPermiteDocumentos(Integer permiteDocumentos) {
		this.permiteDocumentos = permiteDocumentos;
	}

	public Integer getPermiteGuardar() {
		return permiteGuardar;
	}

	public void setPermiteGuardar(Integer permiteGuardar) {
		this.permiteGuardar = permiteGuardar;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
