package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaMateriasAutorizarCarga {
	
	@Id
	@Column(name="IDALUMNOCARGA")
	private Long idAlumnoCarga;
	
	@Column(name="GRUPO")
	private Long grupo;

	@Column(name="MATERIA")
	private String nbMateria;

	@Column(name="DOCENTE")
	private String nbDocente;

	@Column(name="OBSERVACIONES")
	private String observaciones;
	
	@Column(name="OBSERVACIONESTUTOR")
	private String observacionesTutor;

	@Column(name="PERMITEVALIDARCARGA")
	private Integer permiteValidarCarga; //saber si habilito el boton autorizar

	@Column(name="PERMITEALUMNOCARGA")
	private Integer permiteAlumnoCarga;// saber si permite guardarlo en grupos

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

	public String getNbMateria() {
		return nbMateria;
	}

	public void setNbMateria(String nbMateria) {
		this.nbMateria = nbMateria;
	}

	public String getNbDocente() {
		return nbDocente;
	}

	public void setNbDocente(String nbDocente) {
		this.nbDocente = nbDocente;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Integer getPermiteValidarCarga() {
		return permiteValidarCarga;
	}

	public void setPermiteValidarCarga(Integer permiteValidarCarga) {
		this.permiteValidarCarga = permiteValidarCarga;
	}

	public Integer getPermiteAlumnoCarga() {
		return permiteAlumnoCarga;
	}

	public void setPermiteAlumnoCarga(Integer permiteAlumnoCarga) {
		this.permiteAlumnoCarga = permiteAlumnoCarga;
	}

	public String getObservacionesTutor() {
		return observacionesTutor;
	}

	public void setObservacionesTutor(String observacionesTutor) {
		this.observacionesTutor = observacionesTutor;
	}

}
