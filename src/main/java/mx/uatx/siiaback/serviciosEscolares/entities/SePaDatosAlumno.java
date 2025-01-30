/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author sistemas10
 */
@Entity
public class SePaDatosAlumno implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5014547667398016000L;

	@Id
	@Column(name = "IDPERSONA")
	private Long lngIdPersona;

	@Column(name = "IDHISTORIALACADEMICO")
	private Long lngIdHistorialAcademico;

	@Column(name = "NOMBRE")
	private String strNombre;

	@Column(name = "FCNACIMIENTO")
	private Date fcNacimiento;

	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "CURP")
	private String strCurp;

	@Column(name = "NSS")
	private String strNumSegSocial;

	@Column(name = "CORREO")
	private String strDsCorreo;

	@Column(name = "TELEFONO")
	private String strTelefono;

	@Column(name = "NBCALLE")
	private String strNbCalle;

	@Column(name = "NMEXTERIOR")
	private String strNmExterior;

	@Column(name = "NBASENTAMIENTO")
	private String strNbAsentamiento;

	@Column(name = "CODIGOPOSTAL")
	private Integer intCodigoPostal;

	@Column(name = "NBMUNICIPIO")
	private String strNbMunicipio;

	@Column(name = "NBENTIDAD")
	private String strNbEntidad;

	@Column(name = "PROGRAMACAMPUS")
	private String strProgramaCampus;

	@Column(name = "FACULTAD")
	private String strFacultad;

	@Column(name = "PREFIJOGENERO")
	private String strPrefijoGenero;

	@Column(name = "FACULTADSINCAMPUS")
	private String strFacultadSinCampus;

	@Column(name = "CAMPUS")
	private String strCampus;

	@Column(name = "PROGRAMA")
	private String strPrograma;

	@Column(name = "DSGENERO")
	private String strDsGenero;

	public Long getLngIdPersona() {
		return lngIdPersona;
	}

	public void setLngIdPersona(Long lngIdPersona) {
		this.lngIdPersona = lngIdPersona;
	}

	public Long getLngIdHistorialAcademico() {
		return lngIdHistorialAcademico;
	}

	public void setLngIdHistorialAcademico(Long lngIdHistorialAcademico) {
		this.lngIdHistorialAcademico = lngIdHistorialAcademico;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public Date getFcNacimiento() {
		return fcNacimiento;
	}

	public void setFcNacimiento(Date fcNacimiento) {
		this.fcNacimiento = fcNacimiento;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrCurp() {
		return strCurp;
	}

	public void setStrCurp(String strCurp) {
		this.strCurp = strCurp;
	}

	public String getStrNumSegSocial() {
		return strNumSegSocial;
	}

	public void setStrNumSegSocial(String strNumSegSocial) {
		this.strNumSegSocial = strNumSegSocial;
	}

	public String getStrDsCorreo() {
		return strDsCorreo;
	}

	public void setStrDsCorreo(String strDsCorreo) {
		this.strDsCorreo = strDsCorreo;
	}

	public String getStrTelefono() {
		return strTelefono;
	}

	public void setStrTelefono(String strTelefono) {
		this.strTelefono = strTelefono;
	}

	public String getStrNbCalle() {
		return strNbCalle;
	}

	public void setStrNbCalle(String strNbCalle) {
		this.strNbCalle = strNbCalle;
	}

	public String getStrNmExterior() {
		return strNmExterior;
	}

	public void setStrNmExterior(String strNmExterior) {
		this.strNmExterior = strNmExterior;
	}

	public String getStrNbAsentamiento() {
		return strNbAsentamiento;
	}

	public void setStrNbAsentamiento(String strNbAsentamiento) {
		this.strNbAsentamiento = strNbAsentamiento;
	}

	public Integer getIntCodigoPostal() {
		return intCodigoPostal;
	}

	public void setIntCodigoPostal(Integer intCodigoPostal) {
		this.intCodigoPostal = intCodigoPostal;
	}

	public String getStrNbMunicipio() {
		return strNbMunicipio;
	}

	public void setStrNbMunicipio(String strNbMunicipio) {
		this.strNbMunicipio = strNbMunicipio;
	}

	public String getStrNbEntidad() {
		return strNbEntidad;
	}

	public void setStrNbEntidad(String strNbEntidad) {
		this.strNbEntidad = strNbEntidad;
	}

	public String getStrProgramaCampus() {
		return strProgramaCampus;
	}

	public void setStrProgramaCampus(String strProgramaCampus) {
		this.strProgramaCampus = strProgramaCampus;
	}

	public String getStrFacultad() {
		return strFacultad;
	}

	public void setStrFacultad(String strFacultad) {
		this.strFacultad = strFacultad;
	}

	public String getStrPrefijoGenero() {
		return strPrefijoGenero;
	}

	public void setStrPrefijoGenero(String strPrefijoGenero) {
		this.strPrefijoGenero = strPrefijoGenero;
	}

	public String getStrFacultadSinCampus() {
		return strFacultadSinCampus;
	}

	public void setStrFacultadSinCampus(String strFacultadSinCampus) {
		this.strFacultadSinCampus = strFacultadSinCampus;
	}

	public String getStrCampus() {
		return strCampus;
	}

	public void setStrCampus(String strCampus) {
		this.strCampus = strCampus;
	}

	public String getStrPrograma() {
		return strPrograma;
	}

	public void setStrPrograma(String strPrograma) {
		this.strPrograma = strPrograma;
	}

	public String getStrDsGenero() {
		return strDsGenero;
	}

	public void setStrDsGenero(String strDsGenero) {
		this.strDsGenero = strDsGenero;
	}

}
