package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDatosTitSelladoHist implements java.io.Serializable {
	
	@Id
	@Column(name = "IDTITULO")
	private Integer intIdTitulo;

	@Column(name = "CADENAORIGINAL")
	private String strCadena;
	
	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "NOMBRE")
	private String strNombre;
	
	@Column(name = "APELLIDOPATERNO")
	private String strApellidoPaterno;
	
	@Column(name = "APELLIDOMATERNO")
	private String strApellidoMaterno;
	
	@Column(name = "CURP")
	private String strCurp;
	
	@Column(name = "NBCARRERA")
	private String strNbCarrera;
	
	@Column(name = "FCEXAMEN")
	private Date fcExcamen;
	
	@Column(name = "FCEXPEDICION")
	private Date fcExpedicion;
	
	@Column(name = "FCENVIOPROFESIONES")
	private Date fcenvioprofesiones;
	
	@Column(name = "CORREO")
	private String strCorreo;
	
	@Column(name = "PERMITEENVIARCORREO")
	private boolean blnPermiteEnviarCorreo;

	public Integer getIntIdTitulo() {
		return intIdTitulo;
	}

	public void setIntIdTitulo(Integer intIdTitulo) {
		this.intIdTitulo = intIdTitulo;
	}

	public String getStrCadena() {
		return strCadena;
	}

	public void setStrCadena(String strCadena) {
		this.strCadena = strCadena;
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

	public String getStrApellidoPaterno() {
		return strApellidoPaterno;
	}

	public void setStrApellidoPaterno(String strApellidoPaterno) {
		this.strApellidoPaterno = strApellidoPaterno;
	}

	public String getStrApellidoMaterno() {
		return strApellidoMaterno;
	}

	public void setStrApellidoMaterno(String strApellidoMaterno) {
		this.strApellidoMaterno = strApellidoMaterno;
	}

	public String getStrCurp() {
		return strCurp;
	}

	public void setStrCurp(String strCurp) {
		this.strCurp = strCurp;
	}

	public String getStrNbCarrera() {
		return strNbCarrera;
	}

	public void setStrNbCarrera(String strNbCarrera) {
		this.strNbCarrera = strNbCarrera;
	}

	public Date getFcExcamen() {
		return fcExcamen;
	}

	public void setFcExcamen(Date fcExcamen) {
		this.fcExcamen = fcExcamen;
	}

	public Date getFcExpedicion() {
		return fcExpedicion;
	}

	public void setFcExpedicion(Date fcExpedicion) {
		this.fcExpedicion = fcExpedicion;
	}

	public Date getFcenvioprofesiones() {
		return fcenvioprofesiones;
	}

	public void setFcenvioprofesiones(Date fcenvioprofesiones) {
		this.fcenvioprofesiones = fcenvioprofesiones;
	}

	public String getStrCorreo() {
		return strCorreo;
	}

	public void setStrCorreo(String strCorreo) {
		this.strCorreo = strCorreo;
	}

	public boolean isBlnPermiteEnviarCorreo() {
		return blnPermiteEnviarCorreo;
	}

	public void setBlnPermiteEnviarCorreo(boolean blnPermiteEnviarCorreo) {
		this.blnPermiteEnviarCorreo = blnPermiteEnviarCorreo;
	}

	
}
