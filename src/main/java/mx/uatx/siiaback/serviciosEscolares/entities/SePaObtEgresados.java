package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtEgresados implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6266454355919209559L;
	
	@Id
	@Column(name = "ID")
	private Integer id;

	@Column(name = "NBPERSONA")
	private String strNbPersona;

	@Column(name = "APPATERNO")
	private String strApPaterno;

	@Column(name = "APMATERNO")
	private String strApMaterno;

	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "PERIODOEGRESO")
	private String strPeriodoEgreso;
	
	@Column(name = "IDPERSONA")
	private Long lngIdPersona;

	@Column(name = "IDPERSONACORREO")
	private Integer intIdPersonaCorreo;

	@Column(name = "DSCORREO")
	private String strDsCorreo;

	@Column(name = "IDPERSONATELEFONO")
	private Integer intIdPersonaTelefono;

	@Column(name = "NMTELEFONO")
	private String strNmTelefono;

	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus;

	@Column(name = "ULTIMOCUESTIONARIO")
	private String strcuestionario;

	@Column(name = "LOGIN")
	private String strLogin;

	@Column(name = "PERIODOINGRESO")
	private String strPeriodoIngreso;

	@Column(name = "IDPERIODOINGRESO")
	private String strIdPeriodoIngreso;

	@Column(name = "AREA")
	private Integer intArea;

	@Column(name = "DSESTATUSHISTACAD")
	private String strDsEstatusHistAcad;

	@Column(name = "PASSWORD")
	private String strPassword;

	@Column(name = "IDPERIODOEVALUACION")
	private String strIdPeriodoEvaluacion;

	@Column(name = "PERMITESELECCIONAR")
	private Integer intPermiteSeleccionar;
	
	@Column(name = "IDPERIODOACTUAL")
	private String idPeriodoActual;
	
	@Column(name = "COLOR")
	private String strColor;

	public String getStrNbPersona() {
		return strNbPersona;
	}

	public void setStrNbPersona(String strNbPersona) {
		this.strNbPersona = strNbPersona;
	}

	public String getStrApPaterno() {
		return strApPaterno;
	}

	public void setStrApPaterno(String strApPaterno) {
		this.strApPaterno = strApPaterno;
	}

	public String getStrApMaterno() {
		return strApMaterno;
	}

	public void setStrApMaterno(String strApMaterno) {
		this.strApMaterno = strApMaterno;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrPeriodoEgreso() {
		return strPeriodoEgreso;
	}

	public void setStrPeriodoEgreso(String strPeriodoEgreso) {
		this.strPeriodoEgreso = strPeriodoEgreso;
	}

	public Long getLngIdPersona() {
		return lngIdPersona;
	}

	public void setLngIdPersona(Long lngIdPersona) {
		this.lngIdPersona = lngIdPersona;
	}

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
	}

	public String getStrcuestionario() {
		return strcuestionario;
	}

	public void setStrcuestionario(String strcuestionario) {
		this.strcuestionario = strcuestionario;
	}

	public String getStrLogin() {
		return strLogin;
	}

	public void setStrLogin(String strLogin) {
		this.strLogin = strLogin;
	}

	public String getStrPeriodoIngreso() {
		return strPeriodoIngreso;
	}

	public void setStrPeriodoIngreso(String strPeriodoIngreso) {
		this.strPeriodoIngreso = strPeriodoIngreso;
	}

	public String getStrIdPeriodoIngreso() {
		return strIdPeriodoIngreso;
	}

	public void setStrIdPeriodoIngreso(String strIdPeriodoIngreso) {
		this.strIdPeriodoIngreso = strIdPeriodoIngreso;
	}

	public Integer getIntArea() {
		return intArea;
	}

	public void setIntArea(Integer intArea) {
		this.intArea = intArea;
	}

	public String getStrDsEstatusHistAcad() {
		return strDsEstatusHistAcad;
	}

	public void setStrDsEstatusHistAcad(String strDsEstatusHistAcad) {
		this.strDsEstatusHistAcad = strDsEstatusHistAcad;
	}

	public Integer getIntIdPersonaCorreo() {
		return intIdPersonaCorreo;
	}

	public void setIntIdPersonaCorreo(Integer intIdPersonaCorreo) {
		this.intIdPersonaCorreo = intIdPersonaCorreo;
	}

	public String getStrDsCorreo() {
		return strDsCorreo;
	}

	public void setStrDsCorreo(String strDsCorreo) {
		this.strDsCorreo = strDsCorreo;
	}

	public Integer getIntIdPersonaTelefono() {
		return intIdPersonaTelefono;
	}

	public void setIntIdPersonaTelefono(Integer intIdPersonaTelefono) {
		this.intIdPersonaTelefono = intIdPersonaTelefono;
	}

	public String getStrNmTelefono() {
		return strNmTelefono;
	}

	public void setStrNmTelefono(String strNmTelefono) {
		this.strNmTelefono = strNmTelefono;
	}

	public String getStrIdPeriodoEvaluacion() {
		return strIdPeriodoEvaluacion;
	}

	public void setStrIdPeriodoEvaluacion(String strIdPeriodoEvaluacion) {
		this.strIdPeriodoEvaluacion = strIdPeriodoEvaluacion;
	}

	public String getStrPassword() {
		return strPassword;
	}

	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}

	public Integer getIntPermiteSeleccionar() {
		return intPermiteSeleccionar;
	}

	public void setIntPermiteSeleccionar(Integer intPermiteSeleccionar) {
		this.intPermiteSeleccionar = intPermiteSeleccionar;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdPeriodoActual() {
		return idPeriodoActual;
	}

	public void setIdPeriodoActual(String idPeriodoActual) {
		this.idPeriodoActual = idPeriodoActual;
	}

	public String getStrColor() {
		return strColor;
	}

	public void setStrColor(String strColor) {
		this.strColor = strColor;
	}

}