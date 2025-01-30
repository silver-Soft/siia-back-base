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
public class SePaComprobanteSolTitulacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7678653396866966009L;

	@Id
	@Column(name = "IDTITULO")
	private int intIdIitulo;

	@Column(name = "FCEXAMEN")
	private String strFcExamen;

	@Column(name = "PROGRAMA")
	private String strPrograma;

	@Column(name = "NOMBRE")
	private String strNombreCompleto;

	@Column(name = "APPATERNO")
	private String strApPaterno;

	@Column(name = "APMATERNO")
	private String strApMaterno;

	@Column(name = "GENERO")
	private String strSexo;

	@Column(name = "GENTILICIO")
	private String strGentilicio;

	@Column(name = "AREACAMPUS")
	private String strArea;

	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "generacion")
	private String strGeneracion;

	@Column(name = "TIPOTIT")
	private String strDsTipoTitulacion;

	@Column(name = "RESULTADOTIT")
	private String strResultadoExamenTitulacion;

	@Column(name = "CALLE")
	private String strNbCalle;

	@Column(name = "ASENTAMIENTO")
	private String strAsentamiento;

	@Column(name = "CODIGOPOSTAL")
	private String strCodigoPostal;

	@Column(name = "MUNICIPIO")
	private String strNbMunicipio;

	@Column(name = "TELCASA")
	private String strTelCasa;

	@Column(name = "TELOFICINA")
	private String strTelOficina;

	@Column(name = "TELCEL")
	private String strTelCelular;

	@Column(name = "CORREO")
	private String strCorreoElectronico;

	@Column(name = "FCSOLICITUD")
	private String strFcSolicitud;

	@Column(name = "CURP")
	private String strCurp;

	@Column(name = "FCACTAEXAMEN")
	private Date dteFcExamen;

	@Column(name = "FCEXPEDICION")
	private Date fcExpedicion;

	@Column(name = "NMTITULO")
	private Integer intNumeroTitulo;

	@Column(name = "IDENTIDADANTECEDENTE")
	private Integer intIdAntecedenteHistAcad;

	@Column(name = "FCINICIOANTECEDENTE")
	private Date fcInicioUltimoGrado;

	@Column(name = "FCTERMINACIONANTECEDENTE")
	private Date fcFinalUltimoGrado;

	@Column(name = "INSTITUCIONANTECEDENTE")
	private String strNombreEscuelaProcedencia;

	@Column(name = "NMCEDULA")
	private String strCedulaProfesional;

	@Column(name = "TITULOELEC")
	private String strEsTituloElectronico;

	public int getIntIdIitulo() {
		return intIdIitulo;
	}

	public void setIntIdIitulo(int intIdIitulo) {
		this.intIdIitulo = intIdIitulo;
	}

	public String getStrFcExamen() {
		return strFcExamen;
	}

	public void setStrFcExamen(String strFcExamen) {
		this.strFcExamen = strFcExamen;
	}

	public String getStrPrograma() {
		return strPrograma;
	}

	public void setStrPrograma(String strPrograma) {
		this.strPrograma = strPrograma;
	}

	public String getStrNombreCompleto() {
		return strNombreCompleto;
	}

	public void setStrNombreCompleto(String strNombreCompleto) {
		this.strNombreCompleto = strNombreCompleto;
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

	public String getStrGentilicio() {
		return strGentilicio;
	}

	public void setStrGentilicio(String strGentilicio) {
		this.strGentilicio = strGentilicio;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrGeneracion() {
		return strGeneracion;
	}

	public void setStrGeneracion(String strGeneracion) {
		this.strGeneracion = strGeneracion;
	}

	public String getStrDsTipoTitulacion() {
		return strDsTipoTitulacion;
	}

	public void setStrDsTipoTitulacion(String strDsTipoTitulacion) {
		this.strDsTipoTitulacion = strDsTipoTitulacion;
	}

	public String getStrResultadoExamenTitulacion() {
		return strResultadoExamenTitulacion;
	}

	public void setStrResultadoExamenTitulacion(String strResultadoExamenTitulacion) {
		this.strResultadoExamenTitulacion = strResultadoExamenTitulacion;
	}

	public String getStrSexo() {
		return strSexo;
	}

	public void setStrSexo(String strSexo) {
		this.strSexo = strSexo;
	}

	public String getStrArea() {
		return strArea;
	}

	public void setStrArea(String strArea) {
		this.strArea = strArea;
	}

	public String getStrNbCalle() {
		return strNbCalle;
	}

	public void setStrNbCalle(String strNbCalle) {
		this.strNbCalle = strNbCalle;
	}

	public String getStrAsentamiento() {
		return strAsentamiento;
	}

	public void setStrAsentamiento(String strAsentamiento) {
		this.strAsentamiento = strAsentamiento;
	}

	public String getStrCodigoPostal() {
		return strCodigoPostal;
	}

	public void setStrCodigoPostal(String strCodigoPostal) {
		this.strCodigoPostal = strCodigoPostal;
	}

	public String getStrNbMunicipio() {
		return strNbMunicipio;
	}

	public void setStrNbMunicipio(String strNbMunicipio) {
		this.strNbMunicipio = strNbMunicipio;
	}

	public String getStrTelCasa() {
		return strTelCasa;
	}

	public void setStrTelCasa(String strTelCasa) {
		this.strTelCasa = strTelCasa;
	}

	public String getStrTelOficina() {
		return strTelOficina;
	}

	public void setStrTelOficina(String strTelOficina) {
		this.strTelOficina = strTelOficina;
	}

	public String getStrTelCelular() {
		return strTelCelular;
	}

	public void setStrTelCelular(String strTelCelular) {
		this.strTelCelular = strTelCelular;
	}

	public String getStrCorreoElectronico() {
		return strCorreoElectronico;
	}

	public void setStrCorreoElectronico(String strCorreoElectronico) {
		this.strCorreoElectronico = strCorreoElectronico;
	}

	public String getStrFcSolicitud() {
		return strFcSolicitud;
	}

	public void setStrFcSolicitud(String strFcSolicitud) {
		this.strFcSolicitud = strFcSolicitud;
	}

	public String getStrCurp() {
		return strCurp;
	}

	public void setStrCurp(String strCurp) {
		this.strCurp = strCurp;
	}

	public Date getDteFcExamen() {
		return dteFcExamen;
	}

	public void setDteFcExamen(Date dteFcExamen) {
		this.dteFcExamen = dteFcExamen;
	}

	public Date getFcExpedicion() {
		return fcExpedicion;
	}

	public void setFcExpedicion(Date fcExpedicion) {
		this.fcExpedicion = fcExpedicion;
	}

	public Integer getIntNumeroTitulo() {
		return intNumeroTitulo;
	}

	public void setIntNumeroTitulo(Integer intNumeroTitulo) {
		this.intNumeroTitulo = intNumeroTitulo;
	}

	public Integer getIntIdAntecedenteHistAcad() {
		return intIdAntecedenteHistAcad;
	}

	public void setIntIdAntecedenteHistAcad(Integer intIdAntecedenteHistAcad) {
		this.intIdAntecedenteHistAcad = intIdAntecedenteHistAcad;
	}

	public Date getFcInicioUltimoGrado() {
		return fcInicioUltimoGrado;
	}

	public void setFcInicioUltimoGrado(Date fcInicioUltimoGrado) {
		this.fcInicioUltimoGrado = fcInicioUltimoGrado;
	}

	public Date getFcFinalUltimoGrado() {
		return fcFinalUltimoGrado;
	}

	public void setFcFinalUltimoGrado(Date fcFinalUltimoGrado) {
		this.fcFinalUltimoGrado = fcFinalUltimoGrado;
	}

	public String getStrNombreEscuelaProcedencia() {
		return strNombreEscuelaProcedencia;
	}

	public void setStrNombreEscuelaProcedencia(String strNombreEscuelaProcedencia) {
		this.strNombreEscuelaProcedencia = strNombreEscuelaProcedencia;
	}

	public String getStrCedulaProfesional() {
		return strCedulaProfesional;
	}

	public void setStrCedulaProfesional(String strCedulaProfesional) {
		this.strCedulaProfesional = strCedulaProfesional;
	}

	public String getStrEsTituloElectronico() {
		return strEsTituloElectronico;
	}

	public void setStrEsTituloElectronico(String strEsTituloElectronico) {
		this.strEsTituloElectronico = strEsTituloElectronico;
	}

}
