package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaTutoradosPrograma implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5767805246742049644L;
	@Id
	@Column(name = "IDHISTORIALACADEMICO")
	private long lngIdHistorialAcademico;
	@Column(name = "MATRICULA")
	private String strMatricula;
	@Column(name = "NBALUMNO")
	private String strNbAlumno;
	@Column(name = "NBTUTOR")
	private String strNbTutor;
	@Column(name = "NBCOLOR")
	private String strColor;
	
	public SePaTutoradosPrograma(){
		super();
	}

	public long getLngIdHistorialAcademico() {
		return lngIdHistorialAcademico;
	}

	public void setLngIdHistorialAcademico(long lngIdHistorialAcademico) {
		this.lngIdHistorialAcademico = lngIdHistorialAcademico;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrNbAlumno() {
		return strNbAlumno;
	}

	public void setStrNbAlumno(String strNbAlumno) {
		this.strNbAlumno = strNbAlumno;
	}

	public String getStrNbTutor() {
		return strNbTutor;
	}

	public void setStrNbTutor(String strNbTutor) {
		this.strNbTutor = strNbTutor;
	}

	public String getStrColor() {
		return strColor;
	}

	public void setStrColor(String strColor) {
		this.strColor = strColor;
	}
	
}
