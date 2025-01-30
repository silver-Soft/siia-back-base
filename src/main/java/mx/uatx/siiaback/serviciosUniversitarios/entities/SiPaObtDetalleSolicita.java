package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtDetalleSolicita implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2044389533452193582L;
	@Id
	@Column(name = "ID")
	private Integer intId;
	
	@Column(name = "LOGIN")
	private String strLogin;

	@Column(name = "TIPOPERSONA")
	private String strTipoPersona;

	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "NUMERODEEMPLEADO")
	private String strNumeroDeEmpleado;

	@Column(name = "NOMBRE")
	private String strNombre;

	@Column(name = "FACULTAD")
	private String strFacultad;

	@Column(name = "PROGRAMA")
	private String strPrograma;

	@Column(name = "SEMESTRE")
	private String strSemestre;

	@Column(name = "PROMEDIO")
	private BigDecimal promedio;

	@Column(name = "ESTATUS")
	private String strEstatus;	
	
	public SiPaObtDetalleSolicita() {
		super();
	}

	public String getStrLogin() {
		return strLogin;
	}

	public void setStrLogin(String strLogin) {
		this.strLogin = strLogin;
	}

	public String getStrTipoPersona() {
		return strTipoPersona;
	}

	public void setStrTipoPersona(String strTipoPersona) {
		this.strTipoPersona = strTipoPersona;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}
	
	public String getStrNumeroDeEmpleado() {
		return strNumeroDeEmpleado;
	}

	public void setStrNumeroDeEmpleado(String strNumeroDeEmpleado) {
		this.strNumeroDeEmpleado = strNumeroDeEmpleado;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrFacultad() {
		return strFacultad;
	}

	public void setStrFacultad(String strFacultad) {
		this.strFacultad = strFacultad;
	}

	public String getStrPrograma() {
		return strPrograma;
	}

	public void setStrPrograma(String strPrograma) {
		this.strPrograma = strPrograma;
	}


	public String getStrSemestre() {
		return strSemestre;
	}

	public void setStrSemestre(String strSemestre) {
		this.strSemestre = strSemestre;
	}

	public BigDecimal getPromedio() {
		return promedio;
	}

	public void setPromedio(BigDecimal promedio) {
		this.promedio = promedio;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}	
	
}
