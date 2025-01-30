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
public class SePaTitulo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "IDTITULO")
	private Integer intIdIitulo;

	@Column(name = "LIBRO")
	private String intNoLibro;

	@Column(name = "FOJA")
	private String intFoja;

	@Column(name = "FCEXAMEN")
	private Date fcExamen;

	@Column(name = "FCRECEPCION")
	private Date fcRecepcion;

	@Column(name = "FCENTREGA")
	private Date fcEntrega;

	@Column(name = "CLTIPOTITULACION")
	private Integer clTipoTitulacion;

	@Column(name = "CLSTTITULO")
	private String clStTitulacion;

	@Column(name = "OBSERVACIONES")
	private String strObservaciones;

	@Column(name = "IDRESULTADOEXAMENTITULACION")
	private Integer idResultadoExamenTitulacion;

	@Column(name = "NMTITULO")
	private Integer intNumeroTitulo;

	@Column(name = "IDPERIODOTITULACION")
	private String intIdPeriodoTitulo;

	@Column(name = "FCEXPEDICION")
	private Date fcExpedicion;

	@Column(name = "DSTIPOTITULACION")
	private String strDsTipoTitulacion;

	@Column(name = "DSSTTITULO")
	private String strEstatus;

	@Column(name = "DSRESULTADOEXAMENTITULACION")
	private String strResultadoExamen;

	@Column(name = "PERMITEGUARDAR")
	private Integer intPermiteGuardar;

	@Column(name = "NOMBRE")
	private String strNombre;

	@Column(name = "APPATERNO")
	private String strApPaterno;

	@Column(name = "APMATERNO")
	private String strApMaterno;

	@Column(name = "IDPERSONACORREO")
	private Integer intIdPersonaCorreo;

	@Column(name = "CORREO")
	private String strCorreoElectronico;
	
	@Column(name = "IDANTECEDENTEHISTACAD")
	private Integer intIdAntecedenteHistAcad;
	
	@Column(name = "FCINICIO")
	private Date fcInicioUltimoGrado;
	
	@Column(name = "FCTERMINACION")
	private Date fcFinalUltimoGrado;

	@Column(name = "NMCEDULA")
	private String strCedulaProfesional;
	
	@Column(name = "NBINSTITUCION")
	private String strNombreEscuelaProcedencia;
	
	@Column(name = "IDENTIDAD")
	private Integer intIdEntidad;
	
	@Column(name = "TIPOTRAMITE")
	private Integer idTipoSolicitudTitulacion;
	
	@Column(name = "PERMITEIMPRIMIRTITELEC")
	private Boolean blnPermiteImprimirTitulo;
	
	@Column(name = "CLESTATUSELECTRONICO")
	private Integer clEstatusElectronico;
	
	@Column(name = "FOTO")
	@Lob
	private byte[] archivo;
	
	@Column(name = "IDFOTOESTUDIOPERSONA")
	private Long lngIdFotoEstudioPersona;
	
	@Column(name = "MOTIVORECHAZO")
	private String strMensajeMotivoRechazo;
	

	public Integer getIntIdIitulo() {
		return intIdIitulo;
	}

	public void setIntIdIitulo(Integer intIdIitulo) {
		this.intIdIitulo = intIdIitulo;
	}

	public String getIntNoLibro() {
		return intNoLibro;
	}

	public void setIntNoLibro(String intNoLibro) {
		this.intNoLibro = intNoLibro;
	}

	public String getIntFoja() {
		return intFoja;
	}

	public void setIntFoja(String intFoja) {
		this.intFoja = intFoja;
	}

	public Date getFcRecepcion() {
		return fcRecepcion;
	}

	public void setFcRecepcion(Date fcRecepcion) {
		this.fcRecepcion = fcRecepcion;
	}

	public Date getFcEntrega() {
		return fcEntrega;
	}

	public void setFcEntrega(Date fcEntrega) {
		this.fcEntrega = fcEntrega;
	}

	public Integer getClTipoTitulacion() {
		return clTipoTitulacion;
	}

	public void setClTipoTitulacion(Integer clTipoTitulacion) {
		this.clTipoTitulacion = clTipoTitulacion;
	}

	public String getClStTitulacion() {
		return clStTitulacion;
	}

	public void setClStTitulacion(String clStTitulacion) {
		this.clStTitulacion = clStTitulacion;
	}

	public String getStrObservaciones() {
		return strObservaciones;
	}

	public void setStrObservaciones(String strObservaciones) {
		this.strObservaciones = strObservaciones;
	}

	public Integer getIntNumeroTitulo() {
		return intNumeroTitulo;
	}

	public void setIntNumeroTitulo(Integer intNumeroTitulo) {
		this.intNumeroTitulo = intNumeroTitulo;
	}

	public String getIntIdPeriodoTitulo() {
		return intIdPeriodoTitulo;
	}

	public void setIntIdPeriodoTitulo(String intIdPeriodoTitulo) {
		this.intIdPeriodoTitulo = intIdPeriodoTitulo;
	}

	public Date getFcExpedicion() {
		return fcExpedicion;
	}

	public void setFcExpedicion(Date fcExpedicion) {
		this.fcExpedicion = fcExpedicion;
	}

	public String getStrDsTipoTitulacion() {
		return strDsTipoTitulacion;
	}

	public void setStrDsTipoTitulacion(String strDsTipoTitulacion) {
		this.strDsTipoTitulacion = strDsTipoTitulacion;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public String getStrResultadoExamen() {
		return strResultadoExamen;
	}

	public void setStrResultadoExamen(String strResultadoExamen) {
		this.strResultadoExamen = strResultadoExamen;
	}

	public Integer getIntPermiteGuardar() {
		return intPermiteGuardar;
	}

	public void setIntPermiteGuardar(Integer intPermiteGuardar) {
		this.intPermiteGuardar = intPermiteGuardar;
	}

	public Integer getIdResultadoExamenTitulacion() {
		return idResultadoExamenTitulacion;
	}

	public void setIdResultadoExamenTitulacion(Integer idResultadoExamenTitulacion) {
		this.idResultadoExamenTitulacion = idResultadoExamenTitulacion;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
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

	public Integer getIntIdPersonaCorreo() {
		return intIdPersonaCorreo;
	}

	public void setIntIdPersonaCorreo(Integer intIdPersonaCorreo) {
		this.intIdPersonaCorreo = intIdPersonaCorreo;
	}

	public String getStrCorreoElectronico() {
		return strCorreoElectronico;
	}

	public void setStrCorreoElectronico(String strCorreoElectronico) {
		this.strCorreoElectronico = strCorreoElectronico;
	}

	public Date getFcExamen() {
		return fcExamen;
	}

	public void setFcExamen(Date fcExamen) {
		this.fcExamen = fcExamen;
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

	public String getStrCedulaProfesional() {
		return strCedulaProfesional;
	}

	public void setStrCedulaProfesional(String strCedulaProfesional) {
		this.strCedulaProfesional = strCedulaProfesional;
	}

	public String getStrNombreEscuelaProcedencia() {
		return strNombreEscuelaProcedencia;
	}

	public void setStrNombreEscuelaProcedencia(String strNombreEscuelaProcedencia) {
		this.strNombreEscuelaProcedencia = strNombreEscuelaProcedencia;
	}

	public Integer getIntIdEntidad() {
		return intIdEntidad;
	}

	public void setIntIdEntidad(Integer intIdEntidad) {
		this.intIdEntidad = intIdEntidad;
	}

	public Integer getIdTipoSolicitudTitulacion() {
		return idTipoSolicitudTitulacion;
	}

	public void setIdTipoSolicitudTitulacion(Integer idTipoSolicitudTitulacion) {
		this.idTipoSolicitudTitulacion = idTipoSolicitudTitulacion;
	}

	public Boolean getBlnPermiteImprimirTitulo() {
		return blnPermiteImprimirTitulo;
	}

	public void setBlnPermiteImprimirTitulo(Boolean blnPermiteImprimirTitulo) {
		this.blnPermiteImprimirTitulo = blnPermiteImprimirTitulo;
	}

	public Integer getClEstatusElectronico() {
		return clEstatusElectronico;
	}

	public void setClEstatusElectronico(Integer clEstatusElectronico) {
		this.clEstatusElectronico = clEstatusElectronico;
	}

	public byte[] getArchivo() {
		return archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}

	public Long getLngIdFotoEstudioPersona() {
		return lngIdFotoEstudioPersona;
	}

	public void setLngIdFotoEstudioPersona(Long lngIdFotoEstudioPersona) {
		this.lngIdFotoEstudioPersona = lngIdFotoEstudioPersona;
	}

	public String getStrMensajeMotivoRechazo() {
		return strMensajeMotivoRechazo;
	}

	public void setStrMensajeMotivoRechazo(String strMensajeMotivoRechazo) {
		this.strMensajeMotivoRechazo = strMensajeMotivoRechazo;
	}

}
