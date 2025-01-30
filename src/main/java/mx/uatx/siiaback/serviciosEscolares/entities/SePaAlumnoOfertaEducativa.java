package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.BeanUtils;

@Entity
public class SePaAlumnoOfertaEducativa implements Serializable {

	private static final long serialVersionUID = 9011021074950974369L;

	@Id
	@Column(name = "IDALUMNOPERIODO")
	private Long lngIdAlumnoPeriodo;
	
	@Column(name = "IDALUMNOCARGA")
	private Long lngIdAlumnoCarga;

	@Column(name = "IDHISTORIALACADEMICO")
	private Integer intHistorialAcademico;

	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "NBPERSONA")
	private String strNbPersona;

	@Column(name = "APPATERNO")
	private String strApPaternoAlumno;

	@Column(name = "APMATERNO")
	private String strApMaternoAlumno;

	@Column(name = "DSPERIODOCURSADO")
	private String strDsPeriodoCursado;

	@Column(name = "PERMITESELECCIONAR")
	private Boolean blnPermiteSeleccionar;

	public SePaAlumnoOfertaEducativa(final SePaAlumnoOfertaEducativa entidad) {
		BeanUtils.copyProperties(entidad, this);
	}

	public SePaAlumnoOfertaEducativa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getLngIdAlumnoPeriodo() {
		return lngIdAlumnoPeriodo;
	}

	public void setLngIdAlumnoPeriodo(Long lngIdAlumnoPeriodo) {
		this.lngIdAlumnoPeriodo = lngIdAlumnoPeriodo;
	}

	public Integer getIntHistorialAcademico() {
		return intHistorialAcademico;
	}

	public void setIntHistorialAcademico(Integer intHistorialAcademico) {
		this.intHistorialAcademico = intHistorialAcademico;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrNbPersona() {
		return strNbPersona;
	}

	public void setStrNbPersona(String strNbPersona) {
		this.strNbPersona = strNbPersona;
	}

	public String getStrApPaternoAlumno() {
		return strApPaternoAlumno;
	}

	public void setStrApPaternoAlumno(String strApPaternoAlumno) {
		this.strApPaternoAlumno = strApPaternoAlumno;
	}

	public String getStrApMaternoAlumno() {
		return strApMaternoAlumno;
	}

	public void setStrApMaternoAlumno(String strApMaternoAlumno) {
		this.strApMaternoAlumno = strApMaternoAlumno;
	}

	public String getStrDsPeriodoCursado() {
		return strDsPeriodoCursado;
	}

	public void setStrDsPeriodoCursado(String strDsPeriodoCursado) {
		this.strDsPeriodoCursado = strDsPeriodoCursado;
	}

	public Boolean getBlnPermiteSeleccionar() {
		return blnPermiteSeleccionar;
	}

	public void setBlnPermiteSeleccionar(Boolean blnPermiteSeleccionar) {
		this.blnPermiteSeleccionar = blnPermiteSeleccionar;
	}

	public Long getLngIdAlumnoCarga() {
		return lngIdAlumnoCarga;
	}

	public void setLngIdAlumnoCarga(Long lngIdAlumnoCarga) {
		this.lngIdAlumnoCarga = lngIdAlumnoCarga;
	}
	
	

}
