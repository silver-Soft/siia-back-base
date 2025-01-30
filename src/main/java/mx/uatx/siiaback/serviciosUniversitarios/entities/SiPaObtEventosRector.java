package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SiPaObtEventosRector implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4354159037564177127L;
	@Id
	@Column(name = "IDEVENTORECTOR")
	private Integer intIdEventoRector;

	@Column(name = "FCSOLICITUD")
	private Date fcSolicitud;

	@Column(name = "IDAREASOLICITANTE")
	private Integer intIdAreaSolictante;

	@Column(name = "NBEVENTO")
	private String strNbEvento;

	@Column(name = "FCEVENTO")
	private Date fcEvento;

	@Column(name = "VESTIMENTA")
	private String strVestimenta;

	@Column(name = "SALUDOS")
	private String strSaludos;

	@Column(name = "INSTITUCIONES")
	private String strInstituciones;

	@Column(name = "NMPERSONASNACIONALES")
	private Integer intNmPersonasNacionales;

	@Column(name = "NMPERSONASEXTRAJERAS")
	private Integer intNmPersonasExtranjeras;

	@Column(name = "NMPERSONASLOCALES")
	private Integer intNmPersonasLocales;

	@Column(name = "NMUNIVERSIDADESNACIONALES")
	private Integer intNmUniversiadesNacionales;

	@Column(name = "NMUNIVERSIDADESEXTRAJERAS")
	private Integer intNmUniversiadesExtranjeras;

	@Column(name = "NMUNIVERSIDADESLOCALES")
	private Integer intNmUniversiadesLocales;

	@Column(name = "NMINSTITUCIONESNACIONALES")
	private Integer intNmInstitucionesNacionales;

	@Column(name = "NMINSTITUCIONESEXTRAJERAS")
	private Integer intNmInstitucionesExtranjeras;

	@Column(name = "NMINSTITUCIONESLOCALES")
	private Integer intNmInstitucionesLocales;

	@Column(name = "NBRESPONSABLE")
	private String strNbResponsable;

	@Column(name = "NBCONTACTO")
	private String strNbContacto;

	@Column(name = "TELEFONOCONTACTO")
	private String strTelefonoContacto;

	@Column(name = "MENSAJE")
	private String strMensaje;

	@Column(name = "ESTATUS")
	private String strEstatus;

	@Column(name = "OBSERVACIONES")
	private String strObservaciones;

	@Column(name = "IDPERSONAENREPRESENTACION")
	private Integer intPersonaRepresentacion;

	@Column(name = "LUGAREVENTO")
	private String strLugarEvento;

	@Column(name = "DIRECCIONEVENTO")
	private String strDireccionEvento;

	@Column(name = "TIPOPARTICIPACION")
	private String strTipoParticipacion;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "DURACIONHORAS")
	private Integer intDuracionHoras;
	
	@Column(name = "DURACIONMINUTOS")
	private Integer intDuracionMinutos;
	
	@Lob
    @Column(name = "ARCHIVO")
    private byte[] archivo;
	
	@Column(name = "DATOSRELEVANTES")
	private String strDatosRelevantes;

	@Column(name = "PERMITEMODIFICAR")
	private boolean blnPermiteModificar;
	
	@Column(name = "PERMITEELIMINAR")
	private boolean blnPermiteEliminar;
	
	public Integer getIntDuracionHoras() {
		return intDuracionHoras;
	}

	public void setIntDuracionHoras(Integer intDuracionHoras) {
		this.intDuracionHoras = intDuracionHoras;
	}

	public Integer getIntDuracionMinutos() {
		return intDuracionMinutos;
	}

	public void setIntDuracionMinutos(Integer intDuracionMinutos) {
		this.intDuracionMinutos = intDuracionMinutos;
	}

	public SiPaObtEventosRector() {
		super();
	}

	public Integer getIntIdEventoRector() {
		return intIdEventoRector;
	}

	public void setIntIdEventoRector(Integer intIdEventoRector) {
		this.intIdEventoRector = intIdEventoRector;
	}

	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	public Integer getIntIdAreaSolictante() {
		return intIdAreaSolictante;
	}

	public void setIntIdAreaSolictante(Integer intIdAreaSolictante) {
		this.intIdAreaSolictante = intIdAreaSolictante;
	}

	public String getStrNbEvento() {
		return strNbEvento;
	}

	public void setStrNbEvento(String strNbEvento) {
		this.strNbEvento = strNbEvento;
	}

	public Date getFcEvento() {
		return fcEvento;
	}

	public void setFcEvento(Date fcEvento) {
		this.fcEvento = fcEvento;
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

	public Integer getIntNmPersonasNacionales() {
		return intNmPersonasNacionales;
	}

	public void setIntNmPersonasNacionales(Integer intNmPersonasNacionales) {
		this.intNmPersonasNacionales = intNmPersonasNacionales;
	}

	public Integer getIntNmPersonasExtranjeras() {
		return intNmPersonasExtranjeras;
	}

	public void setIntNmPersonasExtranjeras(Integer intNmPersonasExtranjeras) {
		this.intNmPersonasExtranjeras = intNmPersonasExtranjeras;
	}

	public Integer getIntNmPersonasLocales() {
		return intNmPersonasLocales;
	}

	public void setIntNmPersonasLocales(Integer intNmPersonasLocales) {
		this.intNmPersonasLocales = intNmPersonasLocales;
	}

	public Integer getIntNmUniversiadesNacionales() {
		return intNmUniversiadesNacionales;
	}

	public void setIntNmUniversiadesNacionales(Integer intNmUniversiadesNacionales) {
		this.intNmUniversiadesNacionales = intNmUniversiadesNacionales;
	}

	public Integer getIntNmUniversiadesExtranjeras() {
		return intNmUniversiadesExtranjeras;
	}

	public void setIntNmUniversiadesExtranjeras(Integer intNmUniversiadesExtranjeras) {
		this.intNmUniversiadesExtranjeras = intNmUniversiadesExtranjeras;
	}

	public Integer getIntNmUniversiadesLocales() {
		return intNmUniversiadesLocales;
	}

	public void setIntNmUniversiadesLocales(Integer intNmUniversiadesLocales) {
		this.intNmUniversiadesLocales = intNmUniversiadesLocales;
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

	public Integer getIntNmInstitucionesLocales() {
		return intNmInstitucionesLocales;
	}

	public void setIntNmInstitucionesLocales(Integer intNmInstitucionesLocales) {
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

	public String getStrTelefonoContacto() {
		return strTelefonoContacto;
	}

	public void setStrTelefonoContacto(String strTelefonoContacto) {
		this.strTelefonoContacto = strTelefonoContacto;
	}

	public String getStrMensaje() {
		return strMensaje;
	}

	public void setStrMensaje(String strMensaje) {
		this.strMensaje = strMensaje;
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

	public Integer getIntPersonaRepresentacion() {
		return intPersonaRepresentacion;
	}

	public void setIntPersonaRepresentacion(Integer intPersonaRepresentacion) {
		this.intPersonaRepresentacion = intPersonaRepresentacion;
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

	public byte[] getArchivo() {
		return archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}

	public String getStrDatosRelevantes() {
		return strDatosRelevantes;
	}

	public void setStrDatosRelevantes(String strDatosRelevantes) {
		this.strDatosRelevantes = strDatosRelevantes;
	}

	public boolean isBlnPermiteModificar() {
		return blnPermiteModificar;
	}

	public void setBlnPermiteModificar(boolean blnPermiteModificar) {
		this.blnPermiteModificar = blnPermiteModificar;
	}

	public boolean isBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}

	
		
}
