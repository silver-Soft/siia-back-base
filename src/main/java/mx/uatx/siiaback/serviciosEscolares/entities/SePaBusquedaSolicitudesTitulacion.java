package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaBusquedaSolicitudesTitulacion {

	@Id
	@Column(name = "IDTITULO")
	private Integer intIdTitulo;

	@Column(name = "NMTITULO")
	private Integer intNmTitulo;

	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "NOMBRE")
	private String strNombre;

	@Column(name = "APPATERNO")
	private String strApPaterno;

	@Column(name = "APMATERNO")
	private String strApMaterno;

	@Column(name = "PROGRAMA")
	private String strPrograma;

	@Column(name = "TELEFONO")
	private String strTelefono;

	@Column(name = "CORREO")
	private String strCorreoElectronico;

	@Column(name = "DSTIPOTITULACION")
	private String strDsTipoTitulacion;

	@Column(name = "ESTATUS")
	private String strEstatus;

	@Column(name = "LIBRO")
	private String strLibro;

	@Column(name = "FOJA")
	private String strFoja;

	@Column(name = "FCEXAMEN")
	private Date dteFcExamen;

	@Column(name = "FCEXPEDICION")
	private Date dteFcExpedicion;

	@Column(name = "OBSERVACIONES")
	private String strObservaciones;

	@Column(name = "RESULTADOEXAMEN")
	private String strResultadoExamen;

	@Column(name = "FCTERMINOCARRERA")
	private Date dteFcTerminoCarrera;

	@Column(name = "VALIDADOFACULTAD")
	private String strValidadoFacultad;

	@Column(name = "VALIDADOTITULACION")
	private String strValidadoTitulacion;

	@Column(name = "INSTITUCIONPROCEDENCIA")
	private String strInstitutoProcedencia;

	@Column(name = "FCINICIO")
	private Date dteFcInicio;

	@Column(name = "FCTERMINACION")
	private Date dteFcTermino;

	@Column(name = "CADENAORIGINALACADEMICO")
	private String strCadenaOriginalAcademico;

	@Column(name = "CADENAORIGINALRECTOR")
	private String strCadenaOriginalRector;

	@Column(name = "FCFIRMASECACADEMICO")
	private Date fcFirmaSecretarioAcademico;

	@Column(name = "FCFIRMARECTOR")
	private Date fcFirmaRector;

	@Column(name = "FOLIORECEPPROFESIONES")
	private String strFolioRecepcionProfesiones;

	@Column(name = "ESTATUSPROFESIONES")
	private String strEstatusProfesiones;

	@Column(name = "FCENVIOPROFESIONES")
	private Date dteFcEnvioProfesiones;

	@Column(name = "DUPLICADO")
	private String strDuplicado;

	@Column(name = "TIPOTITULO")
	private String strTipoTitulo;

	@Column(name = "CLTIPOTITULACION")
	private Integer clTipoTitulacion;

	@Column(name = "CLSTTITULO")
	private String clStTitulo;

	@Column(name = "IDRESULTADOEXAMENTITULACION")
	private Integer idresultadoexamentitulacion;

	@Column(name = "CLESTATUSESDUPLICADO")
	private Integer clEstatusDuplicado;

	@Column(name = "PERMITECONSULTAR")
	private Integer permiteConsultar;

	@Column(name = "PERMITEMODIFICAR")
	private Integer permiteModificar;

	@Column(name = "PERMITEVALIDAR")
	private Integer permiteValidar;

	@Column(name = "PERMITEREVISAR")
	private Integer permiteRevisar;
	
	@Column(name = "PERMITEDESVALIDAR")
	private Integer permiteDesValidar;

	@Column(name = "IDPERSONA")
	private Long lngIdpersona;

	@Column(name = "FCRECEPCION")
	private Date fcRecepcion;

	@Column(name = "NBTITULADO")
	private String strNombreTitulado;

	@Column(name = "APPATERNOTITULADO")
	private String strApPaternoTitulado;

	@Column(name = "APMATERNOTITULADO")
	private String strApMaternoTitulado;

	@Column(name = "PERMITEEXPEDIENTE")
	private Integer permiteExpDigital;
	
	@Column(name = "CURP")
	private String strCURP;
	
	@Column(name = "FCFINDESCARGA")
	private Date fechaLimiteDescarga;
	
	@Column(name = "OBSEXPEDIENTE")
	private String obsExpediente;
	
	@Column(name = "PERMITEDESCARGA")
	private Integer permiteDescarga;
	
	@Column(name = "PERMITEPRORROGA")
	private Integer permiteProrroga;
	
	@Column(name = "PERMITEIMPRIMIRTITULOFISICO")
	private Integer permiteImprimirTitFisico;
	
	@Column(name = "CLESTATUSSOLICITUDCEDULA")
	private Integer intClEstatusCedula;
	
	@Column(name = "FCVALIDACIONFACULTAD")
	private Date dteFcValidacionFacultad;
	
	@Column(name = "PERMITEPRORROGAFAC")
	private Integer permiteProrrogaFac;
	

	public SePaBusquedaSolicitudesTitulacion() {
		super();
	}

	public Integer getIntIdTitulo() {
		return intIdTitulo;
	}

	public void setIntIdTitulo(Integer intIdTitulo) {
		this.intIdTitulo = intIdTitulo;
	}

	public Integer getIntNmTitulo() {
		return intNmTitulo;
	}

	public void setIntNmTitulo(Integer intNmTitulo) {
		this.intNmTitulo = intNmTitulo;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
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

	public String getStrPrograma() {
		return strPrograma;
	}

	public void setStrPrograma(String strPrograma) {
		this.strPrograma = strPrograma;
	}

	public String getStrTelefono() {
		return strTelefono;
	}

	public void setStrTelefono(String strTelefono) {
		this.strTelefono = strTelefono;
	}

	public String getStrCorreoElectronico() {
		return strCorreoElectronico;
	}

	public void setStrCorreoElectronico(String strCorreoElectronico) {
		this.strCorreoElectronico = strCorreoElectronico;
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

	public String getStrLibro() {
		return strLibro;
	}

	public void setStrLibro(String strLibro) {
		this.strLibro = strLibro;
	}

	public String getStrFoja() {
		return strFoja;
	}

	public void setStrFoja(String strFoja) {
		this.strFoja = strFoja;
	}

	public Date getDteFcExamen() {
		return dteFcExamen;
	}

	public void setDteFcExamen(Date dteFcExamen) {
		this.dteFcExamen = dteFcExamen;
	}

	public Date getDteFcExpedicion() {
		return dteFcExpedicion;
	}

	public void setDteFcExpedicion(Date dteFcExpedicion) {
		this.dteFcExpedicion = dteFcExpedicion;
	}

	public String getStrObservaciones() {
		return strObservaciones;
	}

	public void setStrObservaciones(String strObservaciones) {
		this.strObservaciones = strObservaciones;
	}

	public String getStrResultadoExamen() {
		return strResultadoExamen;
	}

	public void setStrResultadoExamen(String strResultadoExamen) {
		this.strResultadoExamen = strResultadoExamen;
	}

	public Date getDteFcTerminoCarrera() {
		return dteFcTerminoCarrera;
	}

	public void setDteFcTerminoCarrera(Date dteFcTerminoCarrera) {
		this.dteFcTerminoCarrera = dteFcTerminoCarrera;
	}

	public String getStrValidadoFacultad() {
		return strValidadoFacultad;
	}

	public void setStrValidadoFacultad(String strValidadoFacultad) {
		this.strValidadoFacultad = strValidadoFacultad;
	}

	public String getStrValidadoTitulacion() {
		return strValidadoTitulacion;
	}

	public void setStrValidadoTitulacion(String strValidadoTitulacion) {
		this.strValidadoTitulacion = strValidadoTitulacion;
	}

	public String getStrInstitutoProcedencia() {
		return strInstitutoProcedencia;
	}

	public void setStrInstitutoProcedencia(String strInstitutoProcedencia) {
		this.strInstitutoProcedencia = strInstitutoProcedencia;
	}

	public Date getDteFcInicio() {
		return dteFcInicio;
	}

	public void setDteFcInicio(Date dteFcInicio) {
		this.dteFcInicio = dteFcInicio;
	}

	public Date getDteFcTermino() {
		return dteFcTermino;
	}

	public void setDteFcTermino(Date dteFcTermino) {
		this.dteFcTermino = dteFcTermino;
	}

	public String getStrCadenaOriginalAcademico() {
		return strCadenaOriginalAcademico;
	}

	public void setStrCadenaOriginalAcademico(String strCadenaOriginalAcademico) {
		this.strCadenaOriginalAcademico = strCadenaOriginalAcademico;
	}

	public String getStrCadenaOriginalRector() {
		return strCadenaOriginalRector;
	}

	public void setStrCadenaOriginalRector(String strCadenaOriginalRector) {
		this.strCadenaOriginalRector = strCadenaOriginalRector;
	}

	public Date getFcFirmaSecretarioAcademico() {
		return fcFirmaSecretarioAcademico;
	}

	public void setFcFirmaSecretarioAcademico(Date fcFirmaSecretarioAcademico) {
		this.fcFirmaSecretarioAcademico = fcFirmaSecretarioAcademico;
	}

	public Date getFcFirmaRector() {
		return fcFirmaRector;
	}

	public void setFcFirmaRector(Date fcFirmaRector) {
		this.fcFirmaRector = fcFirmaRector;
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

	public Date getDteFcEnvioProfesiones() {
		return dteFcEnvioProfesiones;
	}

	public void setDteFcEnvioProfesiones(Date dteFcEnvioProfesiones) {
		this.dteFcEnvioProfesiones = dteFcEnvioProfesiones;
	}

	public String getStrDuplicado() {
		return strDuplicado;
	}

	public void setStrDuplicado(String strDuplicado) {
		this.strDuplicado = strDuplicado;
	}

	public String getStrTipoTitulo() {
		return strTipoTitulo;
	}

	public void setStrTipoTitulo(String strTipoTitulo) {
		this.strTipoTitulo = strTipoTitulo;
	}

	public Integer getPermiteConsultar() {
		return permiteConsultar;
	}

	public void setPermiteConsultar(Integer permiteConsultar) {
		this.permiteConsultar = permiteConsultar;
	}

	public Integer getPermiteModificar() {
		return permiteModificar;
	}

	public void setPermiteModificar(Integer permiteModificar) {
		this.permiteModificar = permiteModificar;
	}

	public Integer getPermiteValidar() {
		return permiteValidar;
	}

	public void setPermiteValidar(Integer permiteValidar) {
		this.permiteValidar = permiteValidar;
	}

	public Long getLngIdpersona() {
		return lngIdpersona;
	}

	public void setLngIdpersona(Long lngIdpersona) {
		this.lngIdpersona = lngIdpersona;
	}

	public Integer getClTipoTitulacion() {
		return clTipoTitulacion;
	}

	public void setClTipoTitulacion(Integer clTipoTitulacion) {
		this.clTipoTitulacion = clTipoTitulacion;
	}

	public String getClStTitulo() {
		return clStTitulo;
	}

	public void setClStTitulo(String clStTitulo) {
		this.clStTitulo = clStTitulo;
	}

	public Integer getIdresultadoexamentitulacion() {
		return idresultadoexamentitulacion;
	}

	public void setIdresultadoexamentitulacion(Integer idresultadoexamentitulacion) {
		this.idresultadoexamentitulacion = idresultadoexamentitulacion;
	}

	public Integer getClEstatusDuplicado() {
		return clEstatusDuplicado;
	}

	public void setClEstatusDuplicado(Integer clEstatusDuplicado) {
		this.clEstatusDuplicado = clEstatusDuplicado;
	}

	public Date getFcRecepcion() {
		return fcRecepcion;
	}

	public void setFcRecepcion(Date fcRecepcion) {
		this.fcRecepcion = fcRecepcion;
	}

	public String getStrNombreTitulado() {
		return strNombreTitulado;
	}

	public void setStrNombreTitulado(String strNombreTitulado) {
		this.strNombreTitulado = strNombreTitulado;
	}

	public String getStrApPaternoTitulado() {
		return strApPaternoTitulado;
	}

	public void setStrApPaternoTitulado(String strApPaternoTitulado) {
		this.strApPaternoTitulado = strApPaternoTitulado;
	}

	public String getStrApMaternoTitulado() {
		return strApMaternoTitulado;
	}

	public void setStrApMaternoTitulado(String strApMaternoTitulado) {
		this.strApMaternoTitulado = strApMaternoTitulado;
	}

	public Integer getPermiteRevisar() {
		return permiteRevisar;
	}

	public void setPermiteRevisar(Integer permiteRevisar) {
		this.permiteRevisar = permiteRevisar;
	}

	public Integer getPermiteExpDigital() {
		return permiteExpDigital;
	}

	public void setPermiteExpDigital(Integer permiteExpDigital) {
		this.permiteExpDigital = permiteExpDigital;
	}

	public Integer getPermiteDesValidar() {
		return permiteDesValidar;
	}

	public void setPermiteDesValidar(Integer permiteDesValidar) {
		this.permiteDesValidar = permiteDesValidar;
	}

	public String getStrCURP() {
		return strCURP;
	}

	public void setStrCURP(String strCURP) {
		this.strCURP = strCURP;
	}

	public Date getFechaLimiteDescarga() {
		return fechaLimiteDescarga;
	}

	public void setFechaLimiteDescarga(Date fechaLimiteDescarga) {
		this.fechaLimiteDescarga = fechaLimiteDescarga;
	}

	public String getObsExpediente() {
		return obsExpediente;
	}

	public void setObsExpediente(String obsExpediente) {
		this.obsExpediente = obsExpediente;
	}

	public Integer getPermiteDescarga() {
		return permiteDescarga;
	}

	public void setPermiteDescarga(Integer permiteDescarga) {
		this.permiteDescarga = permiteDescarga;
	}

	public Integer getPermiteProrroga() {
		return permiteProrroga;
	}

	public void setPermiteProrroga(Integer permiteProrroga) {
		this.permiteProrroga = permiteProrroga;
	}

	public Integer getPermiteImprimirTitFisico() {
		return permiteImprimirTitFisico;
	}

	public void setPermiteImprimirTitFisico(Integer permiteImprimirTitFisico) {
		this.permiteImprimirTitFisico = permiteImprimirTitFisico;
	}

	public Integer getIntClEstatusCedula() {
		return intClEstatusCedula;
	}

	public void setIntClEstatusCedula(Integer intClEstatusCedula) {
		this.intClEstatusCedula = intClEstatusCedula;
	}

	public Date getDteFcValidacionFacultad() {
		return dteFcValidacionFacultad;
	}

	public void setDteFcValidacionFacultad(Date dteFcValidacionFacultad) {
		this.dteFcValidacionFacultad = dteFcValidacionFacultad;
	}

	public Integer getPermiteProrrogaFac() {
		return permiteProrrogaFac;
	}

	public void setPermiteProrrogaFac(Integer permiteProrrogaFac) {
		this.permiteProrrogaFac = permiteProrrogaFac;
	}
	
	
	
	

}
