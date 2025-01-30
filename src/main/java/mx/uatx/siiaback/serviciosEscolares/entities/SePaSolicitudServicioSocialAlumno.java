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
import javax.persistence.Lob;

/**
 *
 * @author sistemas10
 */
@Entity
public class SePaSolicitudServicioSocialAlumno implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5869040257182029645L;

	@Id
	@Column(name = "ID_SEAXSOLICITUDESSERSOC")
	private Long longIdSolicitud;

	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "FC_SOLICITUD")
	private Date fcSolicitud;

	@Column(name = "NB_JEFE")
	private String strNbJefe;

	@Column(name = "CARGO_JEFE")
	private String strCargoJefe;

	@Column(name = "IDPERIODO")
	private String strPerAcademico;

	@Column(name = "HORARIO")
	private String strHorario;

	@Column(name = "TURNO")
	private String strTurnoServicio;

	@Column(name = "PER_ID_SEAXPERIODOSSERVICIO")
	private Integer intPerServicio;

	@Column(name = "PROG_ID_SEAXPROGRAMASSERSOC")
	private Integer intProgSerSoc;
	
	@Column(name = "ESTATUS")
	private String strEstatus;
	
	@Column(name = "TURNO_ALUMNO")
	private String strTurnoAlumno;
	
	@Column(name = "GRUPO_ALUMNO")
	private String strGrupoAlumno;
	
	@Column(name = "FC_SOLGENERADA")
	private Date fcSolGenerada;

	@Column(name = "DSPERIODOTEMPORADA")
	private String strPeriodoTemporada;

	@Column(name = "IDHISTORIALACADEMICO")
	private Long lngIdHistorialAcademico;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "NOMBRE_SEAXPROGRAMASSERSOC")
	private String strNombrePrograma;

	@Column(name = "AREA")
	private String strArea;

	@Column(name = "NOMBRESECTDEPENDENCIAS")
	private String strNombreDependencia;

	@Column(name = "DIRECCION")
	private String strDireccion;

	@Column(name = "TITULAR")
	private String strTitular;

	@Column(name = "TELEFONO")
	private Long lngTelefono;

	@Column(name = "SECTOR")
	private String strSector;

	@Column(name = "IDSECTDEPENDENCIAS")
	private Integer intIdDependencia;

	@Column(name = "NBPERSONACARTA")
	private String strNbPersonaCarta;

	@Column(name = "CARGOPERSONACARTA")
	private String strCargoPersonaCarta;
	
	@Column(name = "FCSOLCARTATERMINACION")
	private Date fcSolCartaTerminacion;
	
	@Column(name = "FC_INICIO")
	private Date fcInicioServicioSocial;
	
	@Column(name = "ESTATUSDOCUMENTO")
	private String strEstatusDocumento;
	
	@Column(name = "PERMITESOLICITUD")
	private Boolean blnPermiteSolicitud;

	@Column(name = "PERMITEIMPRIMIR")
	private Boolean blnPermiteImprimir;

	@Column(name = "TITULARSS")
	private String strNbJefeServicioSocialUniversitario;

	@Column(name = "PERMITEIMPRIMIRCONSTANCIA")
	private Boolean blnPermiteImprimirConstancia;

	@Column(name = "IDFOTOESTUDIOPERSONA")
	private Long lngIdFotoEstudioPersona;
	
	@Column(name = "FOTO")
	@Lob
	private byte[] fotografia;
	
	@Column(name = "CORREOJEFE")
	private String strCorreoJefe;
	
	@Column(name = "PERMITEMODIFICAR")
	private Boolean blnPermiteModificar;

	@Column(name = "PERMITECANCELAR")
	private Boolean blnPermiteCancelar;
	
	@Column(name = "PERMITEEVALUACIONJEFE")
	private Boolean blnPermiteEvaluacionJefe;
	
	@Column(name = "MENSAJE")
	private String strLeyendaEvaluacion;
	

	
	/**
	 * @return the longIdSolicitud
	 */
	public Long getLongIdSolicitud() {
		return longIdSolicitud;
	}

	/**
	 * @param longIdSolicitud the longIdSolicitud to set
	 */
	public void setLongIdSolicitud(Long longIdSolicitud) {
		this.longIdSolicitud = longIdSolicitud;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	/**
	 * @return the fcSolicitud
	 */
	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	/**
	 * @param fcSolicitud the fcSolicitud to set
	 */
	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	/**
	 * @return the strNbJefe
	 */
	public String getStrNbJefe() {
		return strNbJefe;
	}

	/**
	 * @param strNbJefe the strNbJefe to set
	 */
	public void setStrNbJefe(String strNbJefe) {
		this.strNbJefe = strNbJefe;
	}

	/**
	 * @return the strCargoJefe
	 */
	public String getStrCargoJefe() {
		return strCargoJefe;
	}

	/**
	 * @param strCargoJefe the strCargoJefe to set
	 */
	public void setStrCargoJefe(String strCargoJefe) {
		this.strCargoJefe = strCargoJefe;
	}

	/**
	 * @return the strPerAcademico
	 */
	public String getStrPerAcademico() {
		return strPerAcademico;
	}

	/**
	 * @param strPerAcademico the strPerAcademico to set
	 */
	public void setStrPerAcademico(String strPerAcademico) {
		this.strPerAcademico = strPerAcademico;
	}

	/**
	 * @return the strHorario
	 */
	public String getStrHorario() {
		return strHorario;
	}

	/**
	 * @param strHorario the strHorario to set
	 */
	public void setStrHorario(String strHorario) {
		this.strHorario = strHorario;
	}

	/**
	 * @return the strTurnoServicio
	 */
	public String getStrTurnoServicio() {
		return strTurnoServicio;
	}

	/**
	 * @param strTurnoServicio the strTurnoServicio to set
	 */
	public void setStrTurnoServicio(String strTurnoServicio) {
		this.strTurnoServicio = strTurnoServicio;
	}

	/**
	 * @return the strEstatus
	 */
	public String getStrEstatus() {
		return strEstatus;
	}

	/**
	 * @param strEstatus the strEstatus to set
	 */
	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	/**
	 * @return the strTurnoAlumno
	 */
	public String getStrTurnoAlumno() {
		return strTurnoAlumno;
	}

	/**
	 * @param strTurnoAlumno the strTurnoAlumno to set
	 */
	public void setStrTurnoAlumno(String strTurnoAlumno) {
		this.strTurnoAlumno = strTurnoAlumno;
	}

	/**
	 * @return the strGrupoAlumno
	 */
	public String getStrGrupoAlumno() {
		return strGrupoAlumno;
	}

	/**
	 * @param strGrupoAlumno the strGrupoAlumno to set
	 */
	public void setStrGrupoAlumno(String strGrupoAlumno) {
		this.strGrupoAlumno = strGrupoAlumno;
	}

	/**
	 * @return the fcSolGenerada
	 */
	public Date getFcSolGenerada() {
		return fcSolGenerada;
	}

	/**
	 * @param fcSolGenerada the fcSolGenerada to set
	 */
	public void setFcSolGenerada(Date fcSolGenerada) {
		this.fcSolGenerada = fcSolGenerada;
	}

	/**
	 * @return the strPeriodoTemporada
	 */
	public String getStrPeriodoTemporada() {
		return strPeriodoTemporada;
	}

	/**
	 * @param strPeriodoTemporada the strPeriodoTemporada to set
	 */
	public void setStrPeriodoTemporada(String strPeriodoTemporada) {
		this.strPeriodoTemporada = strPeriodoTemporada;
	}

	public Integer getIntPerServicio() {
		return intPerServicio;
	}

	public void setIntPerServicio(Integer intPerServicio) {
		this.intPerServicio = intPerServicio;
	}

	public Integer getIntProgSerSoc() {
		return intProgSerSoc;
	}

	public void setIntProgSerSoc(Integer intProgSerSoc) {
		this.intProgSerSoc = intProgSerSoc;
	}

	public Long getLngIdHistorialAcademico() {
		return lngIdHistorialAcademico;
	}

	public void setLngIdHistorialAcademico(Long lngIdHistorialAcademico) {
		this.lngIdHistorialAcademico = lngIdHistorialAcademico;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public String getStrNombrePrograma() {
		return strNombrePrograma;
	}

	public void setStrNombrePrograma(String strNombrePrograma) {
		this.strNombrePrograma = strNombrePrograma;
	}

	public String getStrArea() {
		return strArea;
	}

	public void setStrArea(String strArea) {
		this.strArea = strArea;
	}

	public String getStrNombreDependencia() {
		return strNombreDependencia;
	}

	public void setStrNombreDependencia(String strNombreDependencia) {
		this.strNombreDependencia = strNombreDependencia;
	}

	public String getStrDireccion() {
		return strDireccion;
	}

	public void setStrDireccion(String strDireccion) {
		this.strDireccion = strDireccion;
	}

	public String getStrTitular() {
		return strTitular;
	}

	public void setStrTitular(String strTitular) {
		this.strTitular = strTitular;
	}

	public Long getLngTelefono() {
		return lngTelefono;
	}

	public void setLngTelefono(Long lngTelefono) {
		this.lngTelefono = lngTelefono;
	}

	public String getStrSector() {
		return strSector;
	}

	public void setStrSector(String strSector) {
		this.strSector = strSector;
	}

	public Integer getIntIdDependencia() {
		return intIdDependencia;
	}

	public void setIntIdDependencia(Integer intIdDependencia) {
		this.intIdDependencia = intIdDependencia;
	}

	public String getStrNbPersonaCarta() {
		return strNbPersonaCarta;
	}

	public void setStrNbPersonaCarta(String strNbPersonaCarta) {
		this.strNbPersonaCarta = strNbPersonaCarta;
	}

	public String getStrCargoPersonaCarta() {
		return strCargoPersonaCarta;
	}

	public void setStrCargoPersonaCarta(String strCargoPersonaCarta) {
		this.strCargoPersonaCarta = strCargoPersonaCarta;
	}

	public Date getFcInicioServicioSocial() {
		return fcInicioServicioSocial;
	}

	public void setFcInicioServicioSocial(Date fcInicioServicioSocial) {
		this.fcInicioServicioSocial = fcInicioServicioSocial;
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

	public Boolean getBlnPermiteImprimirConstancia() {
		return blnPermiteImprimirConstancia;
	}

	public void setBlnPermiteImprimirConstancia(Boolean blnPermiteImprimirConstancia) {
		this.blnPermiteImprimirConstancia = blnPermiteImprimirConstancia;
	}

	public Long getLngIdFotoEstudioPersona() {
		return lngIdFotoEstudioPersona;
	}

	public void setLngIdFotoEstudioPersona(Long lngIdFotoEstudioPersona) {
		this.lngIdFotoEstudioPersona = lngIdFotoEstudioPersona;
	}

	public byte[] getFotografia() {
		return fotografia;
	}

	public void setFotografia(byte[] fotografia) {
		this.fotografia = fotografia;
	}

	public Boolean getBlnPermiteModificar() {
		return blnPermiteModificar;
	}

	public void setBlnPermiteModificar(Boolean blnPermiteModificar) {
		this.blnPermiteModificar = blnPermiteModificar;
	}

	public Boolean getBlnPermiteCancelar() {
		return blnPermiteCancelar;
	}

	public void setBlnPermiteCancelar(Boolean blnPermiteCancelar) {
		this.blnPermiteCancelar = blnPermiteCancelar;
	}

	public Boolean getBlnPermiteEvaluacionJefe() {
		return blnPermiteEvaluacionJefe;
	}

	public void setBlnPermiteEvaluacionJefe(Boolean blnPermiteEvaluacionJefe) {
		this.blnPermiteEvaluacionJefe = blnPermiteEvaluacionJefe;
	}

	public String getStrCorreoJefe() {
		return strCorreoJefe;
	}

	public void setStrCorreoJefe(String strCorreoJefe) {
		this.strCorreoJefe = strCorreoJefe;
	}

	public String getStrLeyendaEvaluacion() {
		return strLeyendaEvaluacion;
	}

	public void setStrLeyendaEvaluacion(String strLeyendaEvaluacion) {
		this.strLeyendaEvaluacion = strLeyendaEvaluacion;
	}

}
