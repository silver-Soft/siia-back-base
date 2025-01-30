package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtTemasReuniones {
	
	@Id
	@Column(name = "ID_TEMA_REUNION")
	private Long idTemaReunion;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	@Column(name = "PERMITEELIMINAR")
	private boolean permiteEliminar;

	public Long getIdTemaReunion() {
		return idTemaReunion;
	}

	public void setIdTemaReunion(Long idTemaReunion) {
		this.idTemaReunion = idTemaReunion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isPermiteEliminar() {
		return permiteEliminar;
	}

	public void setPermiteEliminar(boolean permiteEliminar) {
		this.permiteEliminar = permiteEliminar;
	}

}
