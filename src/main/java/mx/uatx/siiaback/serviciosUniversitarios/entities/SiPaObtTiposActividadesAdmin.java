package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtTiposActividadesAdmin {
	
	@Id
	@Column(name = "ID_TIPO_ACTIVIDAD")
	private Long idTipoActividad;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	@Column(name = "NBAREA")
	private String nbArea;
	
	@Column(name = "SEGUIMIENTO")
	private boolean seguimiento;
	
	@Column(name = "PERMITEMODIFICAR")
	private boolean permiteModificar;
	
	@Column(name = "PERMITEELIMINAR")
	private boolean permiteEliminar;
	
	public Long getIdTipoActividad() {
		return idTipoActividad;
	}
	public void setIdTipoActividad(Long idTipoActividad) {
		this.idTipoActividad = idTipoActividad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNbArea() {
		return nbArea;
	}
	public void setNbArea(String nbArea) {
		this.nbArea = nbArea;
	}
	public boolean isSeguimiento() {
		return seguimiento;
	}
	public void setSeguimiento(boolean seguimiento) {
		this.seguimiento = seguimiento;
	}
	public boolean isPermiteModificar() {
		return permiteModificar;
	}
	public void setPermiteModificar(boolean permiteModificar) {
		this.permiteModificar = permiteModificar;
	}
	public boolean isPermiteEliminar() {
		return permiteEliminar;
	}
	public void setPermiteEliminar(boolean permiteEliminar) {
		this.permiteEliminar = permiteEliminar;
	}
	
	
	

}
