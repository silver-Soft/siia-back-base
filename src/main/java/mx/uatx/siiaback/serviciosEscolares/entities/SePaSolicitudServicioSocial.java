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
public class SePaSolicitudServicioSocial implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2015928709512240478L;

	@Id
	@Column(name = "ID_SEAXSOLICITUDESSERSOC")
	private Long lngIdSolicitud;

	@Column(name = "IDHISTORIALACADEMICO")
	private Long lngIdHistorialAcademico;
	
	@Column(name = "IDPERSONA")
	private Long lngIdPersona;

	@Column(name = "FC_SOLICITUD")
	private Date fcSolicitud;

	@Column(name = "NB_JEFE")
	private String strNbJefe;

	@Column(name = "CARGO_JEFE")
	private String strCargoJefe;

	@Column(name = "IDPERIODO")
	private String strIdPeriodo;

	@Column(name = "HORARIO")
	private String strHorario;

	@Column(name = "TURNO")
	private String strTurno;

	@Column(name = "PER_ID_SEAXPERIODOSSERVICIO")
	private Integer intIdPeriodoSerivicio;

	@Column(name = "PROG_ID_SEAXPROGRAMASSERSOC")
	private Integer intIdProgramaSerSoc;

	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "ESTATUS")
	private String strEstatus;

	@Column(name = "NOMBRE")
	private String strNombreCompletoAlumno;

	@Column(name = "PROGRAMACAMPUS")
	private String strProgramaCampus;

	@Column(name = "PROGRAMASERSOC")
	private String strProgramaServicioSocial;

	@Column(name = "NOMBREDEPENDENCIA")
	private String strNombreDependencia;
	
	@Column(name = "HABILITARLIBERACION")
	private Boolean blnActivarFnLiberacion;
	
	@Column(name = "HABILITARCARTA")
	private Boolean blnActivarFnCartaTerm;
	
	@Column(name = "PERMITESOLICITUD")
	private Boolean blnPermiteSolicitud;
	
	@Column(name = "PERMITEIMPRIMIR")
	private Boolean blnPermiteImprimir;
	
	@Column(name = "FCSOLCARTATERMINACION")
	private Date fcSolCartaTerminacion;
	
	@Column(name = "TITULARSS")
	private String strNbJefeServicioSocialUniversitario;
	
	@Column(name = "PERMITEVALIDAR")
	private Boolean blnPermiteValidar;
	
	@Column(name = "FIRMAJEFESERSOC")
	private String strFirmaJefeSerSoc;
	
	@Column(name = "FCFIRMAJEFESERSOC")
	private Date fcFirmaJefeSerSoc;
	
	@Column(name = "CADENAORIGINALJEFESERSOC")
	private String strCadenaOriginalJefeSerSoc;
	
	@Column(name = "FIRMASECEXTENSION")
	private String strFirmaSecExtension;
	
	@Column(name = "FCFIRMASECEXTENSION")
	private Date fcFirmaSecExtension;
	
	@Column(name = "CADENAORIGINALSECEXTENSION")
	private String strCadenaOriginalSecExtension;
	
	@Column(name = "SELLO")
	private String strSello;
	
	@Column(name = "FCSELLADO")
	private Date fcSellado;
	
	@Column(name = "PERMITEIMPRIMIREVALUACION")
	private Boolean blnPermiteImprimirEvaluacion;
	
	@Column(name = "MENSAJE")
	private String strLeyendaEvaluacion;

	public Long getLngIdSolicitud() {
		return lngIdSolicitud;
	}

	public void setLngIdSolicitud(Long lngIdSolicitud) {
		this.lngIdSolicitud = lngIdSolicitud;
	}

	public Long getLngIdHistorialAcademico() {
		return lngIdHistorialAcademico;
	}

	public void setLngIdHistorialAcademico(Long lngIdHistorialAcademico) {
		this.lngIdHistorialAcademico = lngIdHistorialAcademico;
	}

	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	public String getStrNbJefe() {
		return strNbJefe;
	}

	public void setStrNbJefe(String strNbJefe) {
		this.strNbJefe = strNbJefe;
	}

	public String getStrCargoJefe() {
		return strCargoJefe;
	}

	public void setStrCargoJefe(String strCargoJefe) {
		this.strCargoJefe = strCargoJefe;
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public String getStrHorario() {
		return strHorario;
	}

	public void setStrHorario(String strHorario) {
		this.strHorario = strHorario;
	}

	public String getStrTurno() {
		return strTurno;
	}

	public void setStrTurno(String strTurno) {
		this.strTurno = strTurno;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public String getStrNombreCompletoAlumno() {
		return strNombreCompletoAlumno;
	}

	public void setStrNombreCompletoAlumno(String strNombreCompletoAlumno) {
		this.strNombreCompletoAlumno = strNombreCompletoAlumno;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrProgramaCampus() {
		return strProgramaCampus;
	}

	public void setStrProgramaCampus(String strProgramaCampus) {
		this.strProgramaCampus = strProgramaCampus;
	}

	public Integer getIntIdPeriodoSerivicio() {
		return intIdPeriodoSerivicio;
	}

	public void setIntIdPeriodoSerivicio(Integer intIdPeriodoSerivicio) {
		this.intIdPeriodoSerivicio = intIdPeriodoSerivicio;
	}

	public Integer getIntIdProgramaSerSoc() {
		return intIdProgramaSerSoc;
	}

	public void setIntIdProgramaSerSoc(Integer intIdProgramaSerSoc) {
		this.intIdProgramaSerSoc = intIdProgramaSerSoc;
	}

	public String getStrProgramaServicioSocial() {
		return strProgramaServicioSocial;
	}

	public void setStrProgramaServicioSocial(String strProgramaServicioSocial) {
		this.strProgramaServicioSocial = strProgramaServicioSocial;
	}

	public String getStrNombreDependencia() {
		return strNombreDependencia;
	}

	public void setStrNombreDependencia(String strNombreDependencia) {
		this.strNombreDependencia = strNombreDependencia;
	}

	public Boolean getBlnActivarFnLiberacion() {
		return blnActivarFnLiberacion;
	}

	public void setBlnActivarFnLiberacion(Boolean blnActivarFnLiberacion) {
		this.blnActivarFnLiberacion = blnActivarFnLiberacion;
	}

	public Boolean getBlnActivarFnCartaTerm() {
		return blnActivarFnCartaTerm;
	}

	public void setBlnActivarFnCartaTerm(Boolean blnActivarFnCartaTerm) {
		this.blnActivarFnCartaTerm = blnActivarFnCartaTerm;
	}

	public Boolean getBlnPermiteSolicitud() {
		return blnPermiteSolicitud;
	}

	public void setBlnPermiteSolicitud(Boolean blnPermiteSolicitud) {
		this.blnPermiteSolicitud = blnPermiteSolicitud;
	}

	public Boolean getBlnPermiteImprimir() {
		return blnPermiteImprimir;
	}

	public void setBlnPermiteImprimir(Boolean blnPermiteImprimir) {
		this.blnPermiteImprimir = blnPermiteImprimir;
	}

	public Date getFcSolCartaTerminacion() {
		return fcSolCartaTerminacion;
	}

	public void setFcSolCartaTerminacion(Date fcSolCartaTerminacion) {
		this.fcSolCartaTerminacion = fcSolCartaTerminacion;
	}

	public String getStrNbJefeServicioSocialUniversitario() {
		return strNbJefeServicioSocialUniversitario;
	}

	public void setStrNbJefeServicioSocialUniversitario(String strNbJefeServicioSocialUniversitario) {
		this.strNbJefeServicioSocialUniversitario = strNbJefeServicioSocialUniversitario;
	}

	public Boolean getBlnPermiteValidar() {
		return blnPermiteValidar;
	}

	public void setBlnPermiteValidar(Boolean blnPermiteValidar) {
		this.blnPermiteValidar = blnPermiteValidar;
	}

	public Long getLngIdPersona() {
		return lngIdPersona;
	}

	public void setLngIdPersona(Long lngIdPersona) {
		this.lngIdPersona = lngIdPersona;
	}

	public String getStrFirmaJefeSerSoc() {
		return strFirmaJefeSerSoc;
	}

	public void setStrFirmaJefeSerSoc(String strFirmaJefeSerSoc) {
		this.strFirmaJefeSerSoc = strFirmaJefeSerSoc;
	}

	public Date getFcFirmaJefeSerSoc() {
		return fcFirmaJefeSerSoc;
	}

	public void setFcFirmaJefeSerSoc(Date fcFirmaJefeSerSoc) {
		this.fcFirmaJefeSerSoc = fcFirmaJefeSerSoc;
	}

	public String getStrCadenaOriginalJefeSerSoc() {
		return strCadenaOriginalJefeSerSoc;
	}

	public void setStrCadenaOriginalJefeSerSoc(String strCadenaOriginalJefeSerSoc) {
		this.strCadenaOriginalJefeSerSoc = strCadenaOriginalJefeSerSoc;
	}

	public String getStrFirmaSecExtension() {
		return strFirmaSecExtension;
	}

	public void setStrFirmaSecExtension(String strFirmaSecExtension) {
		this.strFirmaSecExtension = strFirmaSecExtension;
	}

	public Date getFcFirmaSecExtension() {
		return fcFirmaSecExtension;
	}

	public void setFcFirmaSecExtension(Date fcFirmaSecExtension) {
		this.fcFirmaSecExtension = fcFirmaSecExtension;
	}

	public String getStrCadenaOriginalSecExtension() {
		return strCadenaOriginalSecExtension;
	}

	public void setStrCadenaOriginalSecExtension(String strCadenaOriginalSecExtension) {
		this.strCadenaOriginalSecExtension = strCadenaOriginalSecExtension;
	}

	public String getStrSello() {
		return strSello;
	}

	public void setStrSello(String strSello) {
		this.strSello = strSello;
	}

	public Date getFcSellado() {
		return fcSellado;
	}

	public void setFcSellado(Date fcSellado) {
		this.fcSellado = fcSellado;
	}

	public Boolean getBlnPermiteImprimirEvaluacion() {
		return blnPermiteImprimirEvaluacion;
	}

	public void setBlnPermiteImprimirEvaluacion(Boolean blnPermiteImprimirEvaluacion) {
		this.blnPermiteImprimirEvaluacion = blnPermiteImprimirEvaluacion;
	}

	public String getStrLeyendaEvaluacion() {
		return strLeyendaEvaluacion;
	}

	public void setStrLeyendaEvaluacion(String strLeyendaEvaluacion) {
		this.strLeyendaEvaluacion = strLeyendaEvaluacion;
	}

	
	
	

}
