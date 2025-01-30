package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaAlumnosOferta implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 9011021074950974369L;

	@Id
	@Column(name = "IDALUMNOCARGA")
	private Long lngIdAlumnoCarga;

	@Column(name = "MATRICULA")
	private String strMatricula;
	
	@Column(name = "NBPERSONA")
	private String strNombreAlumno;

	@Column(name = "APPATERNO")
	private String strApPaternoAlumno;

	@Column(name = "APMATERNO")
	private String strApMaternoAlumno;

	@Column(name = "DSSTALUMNOCARGA")
	private String strDescEstatusAlumno;

	@Column(name = "PERMITEELIMINAR")
	private Boolean blnPermiteEliminar;
	
	@Column(name = "IDHISTORIALACADEMICO")
	private Integer intHistorialAcademico;
	
	

	public SePaAlumnosOferta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getLngIdAlumnoCarga() {
		return lngIdAlumnoCarga;
	}

	public void setLngIdAlumnoCarga(Long lngIdAlumnoCarga) {
		this.lngIdAlumnoCarga = lngIdAlumnoCarga;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrNombreAlumno() {
		return strNombreAlumno;
	}

	public void setStrNombreAlumno(String strNombreAlumno) {
		this.strNombreAlumno = strNombreAlumno;
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

	public String getStrDescEstatusAlumno() {
		return strDescEstatusAlumno;
	}

	public void setStrDescEstatusAlumno(String strDescEstatusAlumno) {
		this.strDescEstatusAlumno = strDescEstatusAlumno;
	}

	public Boolean getBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(Boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}

	public Integer getIntHistorialAcademico() {
		return intHistorialAcademico;
	}

	public void setIntHistorialAcademico(Integer intHistorialAcademico) {
		this.intHistorialAcademico = intHistorialAcademico;
	}

}
