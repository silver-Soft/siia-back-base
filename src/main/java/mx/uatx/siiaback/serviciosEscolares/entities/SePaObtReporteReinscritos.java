package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtReporteReinscritos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8974199783061356506L;
	@Id
	@Column(name="IDALUMNOPERIODO")
	private Long lngIdAlumnoPeriodo;
	
	@Column(name="IDHISTORIALACADEMICO")
	private Long lngIdHistorialAcademico;
	
	@Column(name="MATRICULA")
	private String strMatricula;
	
	@Column(name="NOMBRE")
	private String strNombre;

	@Column(name="FCSOLICITUD")
	private Date dtFcSolcitud;
	
	@Column(name="DSPERIODOCURSADO")
	private String strDsPeriodoCursado;
	
	@Column(name="PROGRAMACAMPUS")
	private String strProgramaCampus;

	public Long getLngIdAlumnoPeriodo() {
		return lngIdAlumnoPeriodo;
	}

	public void setLngIdAlumnoPeriodo(Long lngIdAlumnoPeriodo) {
		this.lngIdAlumnoPeriodo = lngIdAlumnoPeriodo;
	}

	public Long getLngIdHistorialAcademico() {
		return lngIdHistorialAcademico;
	}

	public void setLngIdHistorialAcademico(Long lngIdHistorialAcademico) {
		this.lngIdHistorialAcademico = lngIdHistorialAcademico;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public Date getDtFcSolcitud() {
		return dtFcSolcitud;
	}

	public void setDtFcSolcitud(Date dtFcSolcitud) {
		this.dtFcSolcitud = dtFcSolcitud;
	}

	public String getStrDsPeriodoCursado() {
		return strDsPeriodoCursado;
	}

	public void setStrDsPeriodoCursado(String strDsPeriodoCursado) {
		this.strDsPeriodoCursado = strDsPeriodoCursado;
	}

	public String getStrProgramaCampus() {
		return strProgramaCampus;
	}

	public void setStrProgramaCampus(String strProgramaCampus) {
		this.strProgramaCampus = strProgramaCampus;
	}
	
	
}
