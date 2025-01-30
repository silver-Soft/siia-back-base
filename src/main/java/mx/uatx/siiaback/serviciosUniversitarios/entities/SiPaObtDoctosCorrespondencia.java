package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtDoctosCorrespondencia {
	
	@Id
	@Column(name = "ID_DOCUMENTO_ACTIVIDAD")
	private Long idDocumentoActividad;
	
	@Column(name = "TITULO")
	private String titulo;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "ARCHIVO")
	private byte[] archivo;
	
	@Column(name = "PERMITEMODIFICAR")
	private Integer permiteModificar;
	
	@Column(name = "PERMITEELIMINAR")
	private Integer permiteEliminar;
	
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
	public byte[] getArchivo() {
		return archivo;
	}
	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}
	

}
