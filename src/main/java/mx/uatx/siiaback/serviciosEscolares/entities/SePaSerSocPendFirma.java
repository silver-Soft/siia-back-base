package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaSerSocPendFirma implements Serializable {
	
	@Id
	@Column(name = "IDSOLICITUD")
	private Long idSolicitud;
	
	@Column(name = "FCSOLCARTATERMINACION")
	private Date fcSolCartaTerminacion;
	
	@Column(name = "MATRICULA")
	private String matricula;
	
	@Column(name = "NBALUMNO")
	private String nbAlumno;
	
	@Column(name = "APPATERNOALUMNO")
	private String appaternoAlumno;
	
	@Column(name = "APMATERNOALUMNO")
	private String apmaternoAlumno;
	
	@Column(name = "PROGRAMACAMPUS")
	private String programaCampus;
	
	@Column(name = "FACULTAD")
	private String facultad;
	
	@Column(name = "CADENAORIGINAL")
	private String cadenaOriginal;
	
	@Column(name = "ESTATUS")
	private String estatus;
	
	
	public Long getIdSolicitud() {
		return idSolicitud;
	}
	public void setIdSolicitud(Long idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
	public Date getFcSolCartaTerminacion() {
		return fcSolCartaTerminacion;
	}
	public void setFcSolCartaTerminacion(Date fcSolCartaTerminacion) {
		this.fcSolCartaTerminacion = fcSolCartaTerminacion;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNbAlumno() {
		return nbAlumno;
	}
	public void setNbAlumno(String nbAlumno) {
		this.nbAlumno = nbAlumno;
	}
	public String getAppaternoAlumno() {
		return appaternoAlumno;
	}
	public void setAppaternoAlumno(String appaternoAlumno) {
		this.appaternoAlumno = appaternoAlumno;
	}
	public String getApmaternoAlumno() {
		return apmaternoAlumno;
	}
	public void setApmaternoAlumno(String apmaternoAlumno) {
		this.apmaternoAlumno = apmaternoAlumno;
	}
	public String getProgramaCampus() {
		return programaCampus;
	}
	public void setProgramaCampus(String programaCampus) {
		this.programaCampus = programaCampus;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	public String getCadenaOriginal() {
		return cadenaOriginal;
	}
	public void setCadenaOriginal(String cadenaOriginal) {
		this.cadenaOriginal = cadenaOriginal;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
	
	
}
