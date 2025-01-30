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
public class SePaSolicitudPracticasProfesionalesAlumno implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5869040257182029645L;

	@Id
	@Column(name = "IDSOLICITUDPRACPRO")
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

	@Column(name = "IDPERIODOSPRACPRO")
	private Integer intPerServicio;

	@Column(name = "IDPROGRAMAPRACPRO")
	private Integer intProgSerSoc;

	@Column(name = "ID_PROG_EDUC")
	private Integer intIdProgEdu;

	@Column(name = "ID_FACULTAD")
	private Integer intIdFacultad;

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

	@Column(name = "NOMBREPROGRAMASPRACPRO")
	private String strNombrePrograma;

	@Column(name = "AREA")
	private String strArea;

	@Column(name = "NOMBRESECTDEPENDENCIASPP")
	private String strNombreDependencia;

	@Column(name = "DIRECCION")
	private String strDireccion;

	@Column(name = "TITULAR")
	private String strTitular;

	@Column(name = "TELEFONO")
	private Long lngTelefono;

	@Column(name = "SECTOR")
	private String strSector;

	@Column(name = "IDSECTDEPENDENCIASPP")
	private Integer intIdDependencia;

	@Column(name = "NBPERSONACARTA")
	private String strNbPersonaCarta;

	@Column(name = "CARGOPERSONACARTA")
	private String strCargoPersonaCarta;

	@Column(name = "PERMITESOLICITUD")
	private Boolean blnPermiteSolicitud;

	@Column(name = "PERMITEIMPRIMIR")
	private Boolean blnPermiteImprimir;

	@Column(name = "FCSOLCARTATERMINACION")
	private Date fcSolCartaTerminacion;

	@Column(name = "TITULARSS")
	private String strNbJefeServicioSocialUniversitario;

	@Column(name = "FC_INICIO")
	private Date fcInicioServicioSocial;
	
	@Column(name = "TIPOAPOYO")
	private String strTipoApoyo;
	
	@Column(name = "MNAPOYO")
	private Double dblMontoApoyo;
	
	@Column(name = "PERIODICIDAD")
	private String strPeridiocidad;
	
	@Column(name = "DSESPECIE")
	private String strDsEspecie;
	
	@Column(name = "FCINICIO")
	private Date fcInicio;
	
	@Column(name = "FCFIN")
	private Date fcFin;
	
	@Column(name = "DSACTIVIDADES")
	private String strDsActividades;
	
	@Column(name = "ASESOR")
	private String strAsesor;
	
	@Column(name = "COORDINADOREXTYCULTURA")
	private String strCooridnador;
	
	@Column(name = "PERMITEIMPRIMIRCONSTANCIA")
	private Boolean blnPermiteImprimirConstancia;

	@Column(name = "FOTO")
	private byte[] bytesFotoAlumno;

	@Column(name = "IDFOTOESTUDIOPERSONA")
	private Long lngIdFotoEstudioPersona;
	
	
	@Column(name = "PERMITECANCELAR")
	private Boolean blnPermiteCancelar;

	@Column(name = "PERMITEMODIFICAR")
	private Boolean blnPermiteModificar;

	@Column(name = "RUBRO")
	private String strRubro;

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

	public Integer getIntIdFacultad() {
		return intIdFacultad;
	}

	public void setIntIdFacultad(Integer intIdFacultad) {
		this.intIdFacultad = intIdFacultad;
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

	public Integer getIntIdProgEdu() {
		return intIdProgEdu;
	}

	public void setIntIdProgEdu(Integer intIdProgEdu) {
		this.intIdProgEdu = intIdProgEdu;
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

	public String getStrTipoApoyo() {
		return strTipoApoyo;
	}

	public void setStrTipoApoyo(String strTipoApoyo) {
		this.strTipoApoyo = strTipoApoyo;
	}

	public Double getDblMontoApoyo() {
		return dblMontoApoyo;
	}

	public void setDblMontoApoyo(Double dblMontoApoyo) {
		this.dblMontoApoyo = dblMontoApoyo;
	}

	public String getStrPeridiocidad() {
		return strPeridiocidad;
	}

	public void setStrPeridiocidad(String strPeridiocidad) {
		this.strPeridiocidad = strPeridiocidad;
	}

	public String getStrDsEspecie() {
		return strDsEspecie;
	}

	public void setStrDsEspecie(String strDsEspecie) {
		this.strDsEspecie = strDsEspecie;
	}

	public Date getFcInicio() {
		return fcInicio;
	}

	public void setFcInicio(Date fcInicio) {
		this.fcInicio = fcInicio;
	}

	public Date getFcFin() {
		return fcFin;
	}

	public void setFcFin(Date fcFin) {
		this.fcFin = fcFin;
	}

	public String getStrDsActividades() {
		return strDsActividades;
	}

	public void setStrDsActividades(String strDsActividades) {
		this.strDsActividades = strDsActividades;
	}

	public String getStrAsesor() {
		return strAsesor;
	}

	public void setStrAsesor(String strAsesor) {
		this.strAsesor = strAsesor;
	}

	public String getStrCooridnador() {
		return strCooridnador;
	}

	public void setStrCooridnador(String strCooridnador) {
		this.strCooridnador = strCooridnador;
	}

	public Boolean getBlnPermiteImprimirConstancia() {
		return blnPermiteImprimirConstancia;
	}

	public void setBlnPermiteImprimirConstancia(Boolean blnPermiteImprimirConstancia) {
		this.blnPermiteImprimirConstancia = blnPermiteImprimirConstancia;
	}

	public byte[] getBytesFotoAlumno() {
		return bytesFotoAlumno;
	}

	public void setBytesFotoAlumno(byte[] bytesFotoAlumno) {
		this.bytesFotoAlumno = bytesFotoAlumno;
	}

	public Long getLngIdFotoEstudioPersona() {
		return lngIdFotoEstudioPersona;
	}

	public void setLngIdFotoEstudioPersona(Long lngIdFotoEstudioPersona) {
		this.lngIdFotoEstudioPersona = lngIdFotoEstudioPersona;
	}

	public Boolean getBlnPermiteCancelar() {
		return blnPermiteCancelar;
	}

	public void setBlnPermiteCancelar(Boolean blnPermiteCancelar) {
		this.blnPermiteCancelar = blnPermiteCancelar;
	}

	public Boolean getBlnPermiteModificar() {
		return blnPermiteModificar;
	}

	public void setBlnPermiteModificar(Boolean blnPermiteModificar) {
		this.blnPermiteModificar = blnPermiteModificar;
	}

	public String getStrRubro() {
		return strRubro;
	}

	public void setStrRubro(String strRubro) {
		this.strRubro = strRubro;
	}

	

}
