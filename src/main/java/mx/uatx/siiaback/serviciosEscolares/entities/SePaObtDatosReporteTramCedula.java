package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDatosReporteTramCedula {
	
	@Id
	@Column(name = "NMTITULO")
	private Integer intNmTitulo;
	
	@Column(name = "MATRICULA")
	private String strMatricula;
	
	@Column(name = "NOMBRE")
	private String strNombre;
	
	@Column(name = "LICENCIATURA")
	private String strLicenciatura;
	
	@Column(name = "FCENVIOPROFESIONES")
	private String strFcEnvioProfesiones;
	
	@Column(name = "GENERO")
	private String strGenero;
	
	public Integer getIntNmTitulo() {
		return intNmTitulo;
	}
	public void setIntNmTitulo(Integer intNmTitulo) {
		this.intNmTitulo = intNmTitulo;
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
	public String getStrLicenciatura() {
		return strLicenciatura;
	}
	public void setStrLicenciatura(String strLicenciatura) {
		this.strLicenciatura = strLicenciatura;
	}
	public String getStrFcEnvioProfesiones() {
		return strFcEnvioProfesiones;
	}
	public void setStrFcEnvioProfesiones(String strFcEnvioProfesiones) {
		this.strFcEnvioProfesiones = strFcEnvioProfesiones;
	}
	public String getStrGenero() {
		return strGenero;
	}
	public void setStrGenero(String strGenero) {
		this.strGenero = strGenero;
	}
	

}
