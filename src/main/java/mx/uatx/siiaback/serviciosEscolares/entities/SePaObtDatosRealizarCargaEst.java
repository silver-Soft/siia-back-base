package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDatosRealizarCargaEst {
	
	@Id
	@Column(name = "IDALUMNOPERIODO")
	private Long idAlumnoPeriodo;
	
	@Column(name = "FACULTAD")
	private String facultad;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "MATRICULA")
	private String matricula;
	
	@Column(name = "PROGRAMA")
	private String programa;
	
	@Column(name = "PERIODO")
	private String periodo;
	
	@Column(name = "PLAN")
	private String plan;
	
	@Column(name = "FECHAAUTORIZACION")
	private Date fechaAutorizacion;
	
	@Column(name = "TUTOR")
	private String tutor;
	
	@Column(name = "FECHAAUTORIZACIONLETRA")
	private String fechaAutorizacionLetra;
	
	
	public Long getIdAlumnoPeriodo() {
		return idAlumnoPeriodo;
	}
	public void setIdAlumnoPeriodo(Long idAlumnoPeriodo) {
		this.idAlumnoPeriodo = idAlumnoPeriodo;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getTutor() {
		return tutor;
	}
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}
	public String getFechaAutorizacionLetra() {
		return fechaAutorizacionLetra;
	}
	public void setFechaAutorizacionLetra(String fechaAutorizacionLetra) {
		this.fechaAutorizacionLetra = fechaAutorizacionLetra;
	}
	public Date getFechaAutorizacion() {
		return fechaAutorizacion;
	}
	public void setFechaAutorizacion(Date fechaAutorizacion) {
		this.fechaAutorizacion = fechaAutorizacion;
	}

}
