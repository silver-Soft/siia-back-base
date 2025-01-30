package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "SERESC", name = "SEMSTITULOS")
public class SeMsTitulo implements Serializable {

	private static final long serialVersionUID = 1L;

	public SeMsTitulo() {

	}

	public SeMsTitulo(Integer intIdIitulo, String intNumeroLibro, String strFoja, Date fcExamen, Date fcRecepcion,
			Date fcentrega, String observaciones, Date fcaudit, String usuarioaudit, Integer intNumeroTitulo,
			String strIdPeriodoTitulacion, Date fcExpedicion, Integer clTipoTitulacion, Integer clsttitulo,
			Integer idresultadoexamentitulacion, Long lngIdHistorialAcademico) {

		this.intIdIitulo = intIdIitulo;
		this.intNumeroLibro = intNumeroLibro;
		this.strFoja = strFoja;
		this.fcExamen = fcExamen;
		this.fcRecepcion = fcRecepcion;
		this.fcentrega = fcentrega;
		this.observaciones = observaciones;
		this.fcaudit = fcaudit;
		this.usuarioaudit = usuarioaudit;
		this.intNumeroTitulo = intNumeroTitulo;
		this.strIdPeriodoTitulacion = strIdPeriodoTitulacion;
		this.fcExpedicion = fcExpedicion;
		this.clTipoTitulacion = clTipoTitulacion;
		this.idresultadoexamentitulacion = idresultadoexamentitulacion;
		this.lngIdHistorialAcademico = lngIdHistorialAcademico;
	}

	@Id
	@SequenceGenerator(name = "generadorTitulo", sequenceName = "SERESC.IDTITULO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generadorTitulo")
	@Column(name = "IDTITULO", unique = true, nullable = false, precision = 5, scale = 0)
	private Integer intIdIitulo;

	@Column(name = "IDHISTORIALACADEMICO")
	private Long lngIdHistorialAcademico;

	@Column(name = "LIBRO", length = 20)
	private String intNumeroLibro;

	@Column(name = "FOJA", length = 30)
	private String strFoja;

	@Column(name = "FCEXAMEN", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fcExamen;

	@Column(name = "FCRECEPCION")
	@Temporal(TemporalType.DATE)
	private Date fcRecepcion;
	
	@Column(name = "FCENVIOPROFESIONES")
	@Temporal(TemporalType.DATE)
	private Date fcEnvioProfesiones;
	
	@Column(name = "FOLIORECEPPROFESIONES")
	private String strFolioRecepcionProfesiones;

	@Column(name = "FCENTREGA")
	@Temporal(TemporalType.DATE)
	private Date fcentrega;

	@Column(name = "CLTIPOTITULACION")
	private Integer clTipoTitulacion;

	@JoinColumn(name = "CLSTTITULO")
	private String clStTitulo;

	@Column(name = "OBSERVACIONES", length = 300)
	private String observaciones;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.DATE)
	private Date fcaudit;

	@Column(name = "USUARIOAUDIT", nullable = false)
	private String usuarioaudit;

	@Column(name = "NMTITULO")
	private Integer intNumeroTitulo;

	@Column(name = "IDPERIODOTITULACION")
	private String strIdPeriodoTitulacion;

	@Column(name = "FCEXPEDICION")
	@Temporal(TemporalType.DATE)
	private Date fcExpedicion;

	@Column(name = "FCSOLICITUD")
	@Temporal(TemporalType.DATE)
	private Date fcSolicitud;

	@Column(name = "IDRESULTADOEXAMENTITULACION")
	private Integer idresultadoexamentitulacion;

	@Column(name = "NBTITULADO", length = 200)
	private String strNombre;

	@Column(name = "APPATERNOTITULADO", length = 200)
	private String strApPaterno;

	@Column(name = "APMATERNOTITULADO", length = 200)
	private String strApMaterno;

	@Column(name = "FCFIRMARECTOR")
	@Temporal(TemporalType.DATE)
	private Date fcFirmaRector;

	@Column(name = "FCFIRMASECACADEMICO")
	@Temporal(TemporalType.DATE)
	private Date fcFirmaSecretario;

	@Column(name = "FIRMARECTOR")
	private String strFirmaRector;

	@Column(name = "FIRMASECACADEMICO")
	private String strFirmaSecretario;
	
	@Column(name = "ESTATUSPROFESIONES")
	private String strEstatusProfesiones;
	
	@Column(name = "IDESTATUSPROFESIONES")
	private Integer idEstatusProfesiones;

	@Column(name = "IDPERSONARECTOR")
	private Long lngIdPersonaFirmaRector;

	@Column(name = "IDPERSONASECACADEMICO")
	private Long lngIdPersonaFirmaSecretario;

	@Column(name = "CADENAORIGINAL")
	private String strCadenaOriginal;

	@Column(name = "CADENAORIGINALRECTOR")
	private String strCadenaOriginalRector;

	@Column(name = "CERTIFICADORESPRECTOR")
	private String strCertificadoRespRector;

	@Column(name = "CERTIFICADORESPACAD")
	private String strCertificadoRespAcad;

	@Column(name = "NOCERTIFICADORESPRECTOR")
	private String strNoCertificadoRespRector;

	@Column(name = "NOCERTIFICADORESPACAD")
	private String strNoCertificadoRespAcad;
	
	@Column(name = "CLESTATUSSOLICITUDCEDULA")
	Integer idTipoSolicitudTitulacion;
	
	
	@Column(name = "CLESTATUSESDUPLICADO")
	private Integer clEstatusDuplicado;
	
	@Column(name = "CLESTATUSVALIDADO")
	Integer intEstatusValidado;
	
	@Column(name = "CLESTATUSELECTRONICO")
	private Integer intIdEstatus;
	
	@Column(name = "CLESTATUSVALIDADOFACULTAD")
	private Integer intIdEstatusValidadoFacultad;
	
	@Column(name = "FCTERMINOESTUDIOSREAL")
	private Date dteFcTerminoCarrera;
	
	
	@Column(name = "CLESTATUSREVISADO")
	private Integer intIdEstatusRevisado;
	
	
	@Column(name = "FCREVISADO")
	@Temporal(TemporalType.DATE)
	private Date fcRevisado;
	
	@Column(name = "FCFINDESCARGA")
	@Temporal(TemporalType.DATE)
	private Date fechaLimiteDescarga;
	
	
	@Column(name = "IDPERSONAREVISO")
	private Long lngIdPersonaReviso;
	
	@Column(name = "FCEXPEDICIONFISICO")
	@Temporal(TemporalType.DATE)
	private Date fcExpedicionFisico;
	
	@Column(name = "FCVALIDACIONFACULTAD")
	private Date dteFcValidacionFacultad;
	
	@Column(name = "MOTIVORECHAZO")
	private String strMotivoRechazo;
	

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

	public Date getFcentrega() {
		return fcentrega;
	}

	public void setFcentrega(Date fcentrega) {
		this.fcentrega = fcentrega;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Date getFcaudit() {
		return fcaudit;
	}

	public void setFcaudit(Date fcaudit) {
		this.fcaudit = fcaudit;
	}

	public String getUsuarioaudit() {
		return usuarioaudit;
	}

	public void setUsuarioaudit(String usuarioaudit) {
		this.usuarioaudit = usuarioaudit;
	}

	public Integer getIntIdIitulo() {
		return intIdIitulo;
	}

	public void setIntIdIitulo(Integer intIdIitulo) {
		this.intIdIitulo = intIdIitulo;
	}

	public String getIntNumeroLibro() {
		return intNumeroLibro;
	}

	public void setIntNumeroLibro(String intNumeroLibro) {
		this.intNumeroLibro = intNumeroLibro;
	}

	public String getStrFoja() {
		return strFoja;
	}

	public void setStrFoja(String strFoja) {
		this.strFoja = strFoja;
	}

	public Date getFcExamen() {
		return fcExamen;
	}

	public void setFcExamen(Date fcExamen) {
		this.fcExamen = fcExamen;
	}

	public Date getFcRecepcion() {
		return fcRecepcion;
	}

	public void setFcRecepcion(Date fcRecepcion) {
		this.fcRecepcion = fcRecepcion;
	}

	public Integer getIntNumeroTitulo() {
		return intNumeroTitulo;
	}

	public void setIntNumeroTitulo(Integer intNumeroTitulo) {
		this.intNumeroTitulo = intNumeroTitulo;
	}

	public String getStrIdPeriodoTitulacion() {
		return strIdPeriodoTitulacion;
	}

	public void setStrIdPeriodoTitulacion(String strIdPeriodoTitulacion) {
		this.strIdPeriodoTitulacion = strIdPeriodoTitulacion;
	}

	public Date getFcExpedicion() {
		return fcExpedicion;
	}

	public void setFcExpedicion(Date fcExpedicion) {
		this.fcExpedicion = fcExpedicion;
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

	public Integer getIdresultadoexamentitulacion() {
		return idresultadoexamentitulacion;
	}

	public void setIdresultadoexamentitulacion(Integer idresultadoexamentitulacion) {
		this.idresultadoexamentitulacion = idresultadoexamentitulacion;
	}

	public String getClStTitulo() {
		return clStTitulo;
	}

	public void setClStTitulo(String clStTitulo) {
		this.clStTitulo = clStTitulo;
	}

	public Integer getClTipoTitulacion() {
		return clTipoTitulacion;
	}

	public void setClTipoTitulacion(Integer clTipoTitulacion) {
		this.clTipoTitulacion = clTipoTitulacion;
	}

	public Date getFcFirmaRector() {
		return fcFirmaRector;
	}

	public void setFcFirmaRector(Date fcFirmaRector) {
		this.fcFirmaRector = fcFirmaRector;
	}

	public Date getFcFirmaSecretario() {
		return fcFirmaSecretario;
	}

	public void setFcFirmaSecretario(Date fcFirmaSecretario) {
		this.fcFirmaSecretario = fcFirmaSecretario;
	}

	public String getStrFirmaRector() {
		return strFirmaRector;
	}

	public void setStrFirmaRector(String strFirmaRector) {
		this.strFirmaRector = strFirmaRector;
	}

	public String getStrFirmaSecretario() {
		return strFirmaSecretario;
	}

	public void setStrFirmaSecretario(String strFirmaSecretario) {
		this.strFirmaSecretario = strFirmaSecretario;
	}

	public Long getLngIdPersonaFirmaRector() {
		return lngIdPersonaFirmaRector;
	}

	public void setLngIdPersonaFirmaRector(Long lngIdPersonaFirmaRector) {
		this.lngIdPersonaFirmaRector = lngIdPersonaFirmaRector;
	}

	public Long getLngIdPersonaFirmaSecretario() {
		return lngIdPersonaFirmaSecretario;
	}

	public void setLngIdPersonaFirmaSecretario(Long lngIdPersonaFirmaSecretario) {
		this.lngIdPersonaFirmaSecretario = lngIdPersonaFirmaSecretario;
	}

	public String getStrCadenaOriginal() {
		return strCadenaOriginal;
	}

	public void setStrCadenaOriginal(String strCadenaOriginal) {
		this.strCadenaOriginal = strCadenaOriginal;
	}

	public String getStrCertificadoRespRector() {
		return strCertificadoRespRector;
	}

	public void setStrCertificadoRespRector(String strCertificadoRespRector) {
		this.strCertificadoRespRector = strCertificadoRespRector;
	}

	public String getStrCertificadoRespAcad() {
		return strCertificadoRespAcad;
	}

	public void setStrCertificadoRespAcad(String strCertificadoRespAcad) {
		this.strCertificadoRespAcad = strCertificadoRespAcad;
	}

	public String getStrNoCertificadoRespRector() {
		return strNoCertificadoRespRector;
	}

	public void setStrNoCertificadoRespRector(String strNoCertificadoRespRector) {
		this.strNoCertificadoRespRector = strNoCertificadoRespRector;
	}

	public String getStrNoCertificadoRespAcad() {
		return strNoCertificadoRespAcad;
	}

	public void setStrNoCertificadoRespAcad(String strNoCertificadoRespAcad) {
		this.strNoCertificadoRespAcad = strNoCertificadoRespAcad;
	}

	public String getStrCadenaOriginalRector() {
		return strCadenaOriginalRector;
	}

	public void setStrCadenaOriginalRector(String strCadenaOriginalRector) {
		this.strCadenaOriginalRector = strCadenaOriginalRector;
	}

	public Integer getIdTipoSolicitudTitulacion() {
		return idTipoSolicitudTitulacion;
	}

	public void setIdTipoSolicitudTitulacion(Integer idTipoSolicitudTitulacion) {
		this.idTipoSolicitudTitulacion = idTipoSolicitudTitulacion;
	}

	public Date getFcEnvioProfesiones() {
		return fcEnvioProfesiones;
	}

	public void setFcEnvioProfesiones(Date fcEnvioProfesiones) {
		this.fcEnvioProfesiones = fcEnvioProfesiones;
	}

	public String getStrFolioRecepcionProfesiones() {
		return strFolioRecepcionProfesiones;
	}

	public void setStrFolioRecepcionProfesiones(String strFolioRecepcionProfesiones) {
		this.strFolioRecepcionProfesiones = strFolioRecepcionProfesiones;
	}

	public String getStrEstatusProfesiones() {
		return strEstatusProfesiones;
	}

	public void setStrEstatusProfesiones(String strEstatusProfesiones) {
		this.strEstatusProfesiones = strEstatusProfesiones;
	}

	public Integer getIdEstatusProfesiones() {
		return idEstatusProfesiones;
	}

	public void setIdEstatusProfesiones(Integer idEstatusProfesiones) {
		this.idEstatusProfesiones = idEstatusProfesiones;
	}

	public Integer getIntEstatusValidado() {
		return intEstatusValidado;
	}

	public void setIntEstatusValidado(Integer intEstatusValidado) {
		this.intEstatusValidado = intEstatusValidado;
	}

	public Integer getIntIdEstatus() {
		return intIdEstatus;
	}

	public void setIntIdEstatus(Integer intIdEstatus) {
		this.intIdEstatus = intIdEstatus;
	}

	public Integer getIntIdEstatusValidadoFacultad() {
		return intIdEstatusValidadoFacultad;
	}

	public void setIntIdEstatusValidadoFacultad(Integer intIdEstatusValidadoFacultad) {
		this.intIdEstatusValidadoFacultad = intIdEstatusValidadoFacultad;
	}

	public Integer getClEstatusDuplicado() {
		return clEstatusDuplicado;
	}

	public void setClEstatusDuplicado(Integer clEstatusDuplicado) {
		this.clEstatusDuplicado = clEstatusDuplicado;
	}

	public Date getDteFcTerminoCarrera() {
		return dteFcTerminoCarrera;
	}

	public void setDteFcTerminoCarrera(Date dteFcTerminoCarrera) {
		this.dteFcTerminoCarrera = dteFcTerminoCarrera;
	}

	public Integer getIntIdEstatusRevisado() {
		return intIdEstatusRevisado;
	}

	public void setIntIdEstatusRevisado(Integer intIdEstatusRevisado) {
		this.intIdEstatusRevisado = intIdEstatusRevisado;
	}

	public Date getFcRevisado() {
		return fcRevisado;
	}

	public void setFcRevisado(Date fcRevisado) {
		this.fcRevisado = fcRevisado;
	}

	public Long getLngIdPersonaReviso() {
		return lngIdPersonaReviso;
	}

	public void setLngIdPersonaReviso(Long lngIdPersonaReviso) {
		this.lngIdPersonaReviso = lngIdPersonaReviso;
	}

	public Date getFechaLimiteDescarga() {
		return fechaLimiteDescarga;
	}

	public void setFechaLimiteDescarga(Date fechaLimiteDescarga) {
		this.fechaLimiteDescarga = fechaLimiteDescarga;
	}

	public Date getFcExpedicionFisico() {
		return fcExpedicionFisico;
	}

	public void setFcExpedicionFisico(Date fcExpedicionFisico) {
		this.fcExpedicionFisico = fcExpedicionFisico;
	}

	public Date getDteFcValidacionFacultad() {
		return dteFcValidacionFacultad;
	}

	public void setDteFcValidacionFacultad(Date dteFcValidacionFacultad) {
		this.dteFcValidacionFacultad = dteFcValidacionFacultad;
	}

	public String getStrMotivoRechazo() {
		return strMotivoRechazo;
	}

	public void setStrMotivoRechazo(String strMotivoRechazo) {
		this.strMotivoRechazo = strMotivoRechazo;
	}
	

		
}
