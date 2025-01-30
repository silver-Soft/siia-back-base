package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtCargaAcademica {
	
	@Id
	@Column(name = "IDALUMNOCARGA")
	private Long idAlumnoCarga;
	
	@Column(name = "GRUPO")
	private Long grupo;

	@Column(name = "MATERIA")
	private String materia;

	@Column(name = "DOCENTE")
	private String docente;

	@Column(name = "OBSERVACIONES")
	private String observaciones;

	@Column(name = "PERMITEVALIDARCARGA")
	private Boolean permiteValidarCarga;

	@Column(name = "PERMITEELIMINAR")
	private Boolean permiteEliminar;

	@Column(name = "OBSERVACIONESTUTOR")
	private String observacionesTutor;
	
	public Long getIdAlumnoCarga() {
		return idAlumnoCarga;
	}
	public void setIdAlumnoCarga(Long idAlumnoCarga) {
		this.idAlumnoCarga = idAlumnoCarga;
	}
	public Long getGrupo() {
		return grupo;
	}
	public void setGrupo(Long grupo) {
		this.grupo = grupo;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getDocente() {
		return docente;
	}
	public void setDocente(String docente) {
		this.docente = docente;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Boolean getPermiteValidarCarga() {
		return permiteValidarCarga;
	}
	public void setPermiteValidarCarga(Boolean permiteValidarCarga) {
		this.permiteValidarCarga = permiteValidarCarga;
	}
	public Boolean getPermiteEliminar() {
		return permiteEliminar;
	}
	public void setPermiteEliminar(Boolean permiteEliminar) {
		this.permiteEliminar = permiteEliminar;
	}
	public String getObservacionesTutor() {
		return observacionesTutor;
	}
	public void setObservacionesTutor(String observacionesTutor) {
		this.observacionesTutor = observacionesTutor;
	}

}
