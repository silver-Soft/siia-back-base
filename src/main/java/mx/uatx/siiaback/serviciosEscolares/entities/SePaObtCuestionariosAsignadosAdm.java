package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtCuestionariosAsignadosAdm {
	
	@Id
	@Column(name = "FOLIO")
	private Long folio;
	
	@Column(name = "CUESTIONARIO")
	private String cuestionario;

	@Column(name = "ESTATUS")
	private String estatus;

	@Column(name = "PERIODO")
	private String periodo;

	@Column(name = "PERMITEMODIFICAR")
	private Boolean permiteModificar;

	@Column(name = "PERMITEELIMINAR")
	private Boolean permiteEliminar;
	
	public Long getFolio() {
		return folio;
	}
	public void setFolio(Long folio) {
		this.folio = folio;
	}
	public String getCuestionario() {
		return cuestionario;
	}
	public void setCuestionario(String cuestionario) {
		this.cuestionario = cuestionario;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public Boolean getPermiteModificar() {
		return permiteModificar;
	}
	public void setPermiteModificar(Boolean permiteModificar) {
		this.permiteModificar = permiteModificar;
	}
	public Boolean getPermiteEliminar() {
		return permiteEliminar;
	}
	public void setPermiteEliminar(Boolean permiteEliminar) {
		this.permiteEliminar = permiteEliminar;
	}

}
