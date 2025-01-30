/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author sistemas10
 */
@Entity
public class SiPaEventoRector{

	@Id
    @Column(name = "IDEVENTORECTOR")
	private Integer idEventoRector;
	
    @Column(name = "FCSOLICITUD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dteFcSolicitud;
    
    @Column(name = "AREASOLICITANTE")
    private String strAreaSolicitante;
    
    @Column(name = "NBEVENTO")
    private String strNbEvento;
    
    @Column(name = "FCEVENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dteFcEvento;
    
    @Column(name = "VESTIMENTA")
    private String strVestimenta;
    
    @Column(name = "SALUDOS")
    private String strSaludos;
    
    @Column(name = "INSTITUCIONES")
    private String strInstituciones;
    
    @Column(name = "NMPERSONASNACIONALES")
    private String strPersonasNacionales;
    
    @Column(name = "NMPERSONASEXTRANJERAS")
    private String strPersonasExtranjeras;
    
    @Column(name = "NMUNIVERSIDADESLOCALES")
    private String strUniversidadesLocales;
    
    @Column(name = "NMINSTITUCIONESNACIONALES")
    private Integer intNmInstitucionesNacionales;
    
    @Column(name = "NMINSTITUCIONESEXTRANJERAS")
    private Integer intNmInstitucionesExtranjeras;
    
    @Column(name = "NMINSTITUCIONESLOCALES")
    private String intNmInstitucionesLocales;
    
    @Column(name = "NBRESPONSABLE")
    private String strNbResponsable;
    
    @Column(name = "NBCONTACTO")
    private String strNbContacto;

    @Column(name = "MENSAJE")
    private String strMensaje;
    
    @Column(name = "TELEFONOCONTACTO")
    private String strTelefonoContacto;
    
    @Column(name = "ESTATUS")
    private String strEstatus;
    
    @Column(name = "OBSERVACIONES")
    private String strObservaciones;
    
    @Column(name = "IDPERSONAENREPRESENTACION")
    private Integer intIdPersonaRepresentacion;
    
    @Column(name = "LUGAREVENTO")
    private String strLugarEvento;
    
    @Column(name = "DIRECCIONEVENTO")
    private String strDireccionEvento;
    
    @Column(name = "TIPOPARTICIPACION")
    private String strTipoParticipacion;
    
    @Column(name = "DURACIONHORAS")
    private String strDuracionHoras;
    
    @Column(name = "DURACIONMINUTOS")
    private String strDuracionMinutos;
    
    @Column(name = "ARCHIVO")
    private byte[] bytesOficioInvitacion;
    
    @Column(name = "PERMITEDESCARGAR")
    private boolean permiteDescargar;
    
    @Column(name = "PERMITEVALIDAR")
    private boolean permiteValidar;
	

	public Integer getIdEventoRector() {
		return idEventoRector;
	}

	public void setIdEventoRector(Integer idEventoRector) {
		this.idEventoRector = idEventoRector;
	}

	public Date getDteFcSolicitud() {
		return dteFcSolicitud;
	}

	public void setDteFcSolicitud(Date dteFcSolicitud) {
		this.dteFcSolicitud = dteFcSolicitud;
	}

	public String getStrAreaSolicitante() {
		return strAreaSolicitante;
	}

	public void setStrAreaSolicitante(String strAreaSolicitante) {
		this.strAreaSolicitante = strAreaSolicitante;
	}

	public String getStrNbEvento() {
		return strNbEvento;
	}

	public void setStrNbEvento(String strNbEvento) {
		this.strNbEvento = strNbEvento;
	}

	public Date getDteFcEvento() {
		return dteFcEvento;
	}

	public void setDteFcEvento(Date dteFcEvento) {
		this.dteFcEvento = dteFcEvento;
	}

	public String getStrVestimenta() {
		return strVestimenta;
	}

	public void setStrVestimenta(String strVestimenta) {
		this.strVestimenta = strVestimenta;
	}

	public String getStrSaludos() {
		return strSaludos;
	}

	public void setStrSaludos(String strSaludos) {
		this.strSaludos = strSaludos;
	}

	public String getStrInstituciones() {
		return strInstituciones;
	}

	public void setStrInstituciones(String strInstituciones) {
		this.strInstituciones = strInstituciones;
	}

	public String getStrPersonasNacionales() {
		return strPersonasNacionales;
	}

	public void setStrPersonasNacionales(String strPersonasNacionales) {
		this.strPersonasNacionales = strPersonasNacionales;
	}

	public String getStrPersonasExtranjeras() {
		return strPersonasExtranjeras;
	}

	public void setStrPersonasExtranjeras(String strPersonasExtranjeras) {
		this.strPersonasExtranjeras = strPersonasExtranjeras;
	}

	public String getStrUniversidadesLocales() {
		return strUniversidadesLocales;
	}

	public void setStrUniversidadesLocales(String strUniversidadesLocales) {
		this.strUniversidadesLocales = strUniversidadesLocales;
	}

	public Integer getIntNmInstitucionesNacionales() {
		return intNmInstitucionesNacionales;
	}

	public void setIntNmInstitucionesNacionales(Integer intNmInstitucionesNacionales) {
		this.intNmInstitucionesNacionales = intNmInstitucionesNacionales;
	}

	public Integer getIntNmInstitucionesExtranjeras() {
		return intNmInstitucionesExtranjeras;
	}

	public void setIntNmInstitucionesExtranjeras(Integer intNmInstitucionesExtranjeras) {
		this.intNmInstitucionesExtranjeras = intNmInstitucionesExtranjeras;
	}

	public String getIntNmInstitucionesLocales() {
		return intNmInstitucionesLocales;
	}

	public void setIntNmInstitucionesLocales(String intNmInstitucionesLocales) {
		this.intNmInstitucionesLocales = intNmInstitucionesLocales;
	}

	public String getStrNbResponsable() {
		return strNbResponsable;
	}

	public void setStrNbResponsable(String strNbResponsable) {
		this.strNbResponsable = strNbResponsable;
	}

	public String getStrNbContacto() {
		return strNbContacto;
	}

	public void setStrNbContacto(String strNbContacto) {
		this.strNbContacto = strNbContacto;
	}

	public String getStrMensaje() {
		return strMensaje;
	}

	public void setStrMensaje(String strMensaje) {
		this.strMensaje = strMensaje;
	}

	public String getStrTelefonoContacto() {
		return strTelefonoContacto;
	}

	public void setStrTelefonoContacto(String strTelefonoContacto) {
		this.strTelefonoContacto = strTelefonoContacto;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public String getStrObservaciones() {
		return strObservaciones;
	}

	public void setStrObservaciones(String strObservaciones) {
		this.strObservaciones = strObservaciones;
	}

	public Integer getIntIdPersonaRepresentacion() {
		return intIdPersonaRepresentacion;
	}

	public void setIntIdPersonaRepresentacion(Integer intIdPersonaRepresentacion) {
		this.intIdPersonaRepresentacion = intIdPersonaRepresentacion;
	}

	public String getStrLugarEvento() {
		return strLugarEvento;
	}

	public void setStrLugarEvento(String strLugarEvento) {
		this.strLugarEvento = strLugarEvento;
	}

	public String getStrDireccionEvento() {
		return strDireccionEvento;
	}

	public void setStrDireccionEvento(String strDireccionEvento) {
		this.strDireccionEvento = strDireccionEvento;
	}

	public String getStrTipoParticipacion() {
		return strTipoParticipacion;
	}

	public void setStrTipoParticipacion(String strTipoParticipacion) {
		this.strTipoParticipacion = strTipoParticipacion;
	}

	public String getStrDuracionHoras() {
		return strDuracionHoras;
	}

	public void setStrDuracionHoras(String strDuracionHoras) {
		this.strDuracionHoras = strDuracionHoras;
	}

	public String getStrDuracionMinutos() {
		return strDuracionMinutos;
	}

	public void setStrDuracionMinutos(String strDuracionMinutos) {
		this.strDuracionMinutos = strDuracionMinutos;
	}

	public byte[] getBytesOficioInvitacion() {
		return bytesOficioInvitacion;
	}

	public void setBytesOficioInvitacion(byte[] bytesOficioInvitacion) {
		this.bytesOficioInvitacion = bytesOficioInvitacion;
	}

	public boolean isPermiteDescargar() {
		return permiteDescargar;
	}

	public void setPermiteDescargar(boolean permiteDescargar) {
		this.permiteDescargar = permiteDescargar;
	}

	public boolean isPermiteValidar() {
		return permiteValidar;
	}

	public void setPermiteValidar(boolean permiteValidar) {
		this.permiteValidar = permiteValidar;
	}
	
	
	
    
    
    
    
    


}
