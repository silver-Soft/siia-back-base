package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtDatosReporteExcelAsp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2151668264341794508L;
	
	@Column(name = "FACULTAD")
	private String strFacultad;
	
	@Column(name = "CAMPUS")
	private String strCampus;
	
	@Column(name = "PROGRAMA_EDUCATIVO")
	private String strPrograma;

	@Column(name = "NIVEL_EDUCATIVO")
	private String strNivel;
	@Id
	@Column(name = "FOLIO_UAT")
	private Long lngFolioUat;
	
	@Column(name = "FOLIO_FICHA")
	private Long lngFolioFicha;
	
	@Column(name = "NOMBRE")
	private String strNombre;
	
	@Column(name = "APELLIDO_PATERNO")
	private String strApellidoPaterno;
	
	@Column(name = "APELLIDO_MATERNO")
	private String strApellidoMaterno;
	
	@Column(name = "CALLE")
	private String strCalle;
	
	@Column(name = "NUM_EXTERIOR")
	private String strNumExterior;
	
	@Column(name = "COLONIA")
	private String strColonia;
	
	@Column(name = "MUNICIPIO")
	private String strMunicipio;
	
	@Column(name = "ENTIDAD")
	private String strEntidad;
	
	@Column(name = "GENERO")
	private String strGenero;
	
	@Column(name = "CURP")
	private String strCurp;
	
	@Column(name = "ESTADO_CIVIL")
	private String strEstadoCivil;
	
	@Column(name = "TIPO_SEGURIDAD_SOCIAL")
	private String strTipoSeguridadSocial;
	
	@Column(name = "TELEFONO")
	private String strTelefono;
	
	@Column(name = "TELEFONO_TRABAJO")
	private String strTelefonoTrabajo;
	
	@Column(name = "CORREO_ELECTRONICO")
	private String strCorreoElectronico;
	
	@Column(name = "NOMBRE_TUTOR")
	private String strNombreTutor;
	
	@Column(name = "PATERNO_TUTOR")
	private String strPaternoTutor;
	
	@Column(name = "MATERNO_TUTOR")
	private String strMaternoTutor;
	
	@Column(name = "CALLE_TUTOR")
	private String strCalleTutor;
	
	@Column(name = "TELEFONO_TUTOR")
	private String strTelefonoTutor;
	
	@Column(name = "CORREO_ELECTRONICO_TUTOR")
	private String strCorreoElectronicoTutor;
	
	@Column(name = "ESCUELA_PROCEDENCIA")
	private String strEscuelaProcedencia;
	
	@Column(name = "PROMEDIO_GENERAL")
	private BigDecimal promedioGeneral;
	
	@Column(name = "ESPECIALIDAD")
	private String strEspecialidad;
	
	@Column(name = "TIPO_TRABAJO")
	private String strTipoTrabajo;
	
	@Column(name = "DIRECCION_TRABAJO")
	private String strDireccionTrabajo;
	
	@Column(name = "ESTATUS_ASPIRANTE")
	private String strEstatusAspirante;
	
	@Column(name = "SOV")
	private String strSov;
	
	@Column(name = "COINCIDE")
	private String strCoincide;
	
	@Column(name = "ASISTIOSOV")
	private String strAsistioSov;
	
	@Column(name = "CARRERAINICIAL")
	private String strCarreraInicial;
	
	@Column(name = "PUNTAJE")
	private Long lngPuntajeExamen;
	
	public SePaObtDatosReporteExcelAsp() {
		super();
	}

	public String getStrFacultad() {
		return strFacultad;
	}

	public void setStrFacultad(String strFacultad) {
		this.strFacultad = strFacultad;
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

	public String getStrNivel() {
		return strNivel;
	}

	public void setStrNivel(String strNivel) {
		this.strNivel = strNivel;
	}

	public Long getLngFolioUat() {
		return lngFolioUat;
	}

	public void setLngFolioUat(Long lngFolioUat) {
		this.lngFolioUat = lngFolioUat;
	}

	public Long getLngFolioFicha() {
		return lngFolioFicha;
	}

	public void setLngFolioFicha(Long lngFolioFicha) {
		this.lngFolioFicha = lngFolioFicha;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrApellidoPaterno() {
		return strApellidoPaterno;
	}

	public void setStrApellidoPaterno(String strApellidoPaterno) {
		this.strApellidoPaterno = strApellidoPaterno;
	}

	public String getStrApellidoMaterno() {
		return strApellidoMaterno;
	}

	public void setStrApellidoMaterno(String strApellidoMaterno) {
		this.strApellidoMaterno = strApellidoMaterno;
	}

	public String getStrCalle() {
		return strCalle;
	}

	public void setStrCalle(String strCalle) {
		this.strCalle = strCalle;
	}

	public String getStrNumExterior() {
		return strNumExterior;
	}

	public void setStrNumExterior(String strNumExterior) {
		this.strNumExterior = strNumExterior;
	}

	public String getStrColonia() {
		return strColonia;
	}

	public void setStrColonia(String strColonia) {
		this.strColonia = strColonia;
	}

	public String getStrMunicipio() {
		return strMunicipio;
	}

	public void setStrMunicipio(String strMunicipio) {
		this.strMunicipio = strMunicipio;
	}

	public String getStrEntidad() {
		return strEntidad;
	}

	public void setStrEntidad(String strEntidad) {
		this.strEntidad = strEntidad;
	}

	public String getStrGenero() {
		return strGenero;
	}

	public void setStrGenero(String strGenero) {
		this.strGenero = strGenero;
	}

	public String getStrCurp() {
		return strCurp;
	}

	public void setStrCurp(String strCurp) {
		this.strCurp = strCurp;
	}

	public String getStrEstadoCivil() {
		return strEstadoCivil;
	}

	public void setStrEstadoCivil(String strEstadoCivil) {
		this.strEstadoCivil = strEstadoCivil;
	}

	public String getStrTipoSeguridadSocial() {
		return strTipoSeguridadSocial;
	}

	public void setStrTipoSeguridadSocial(String strTipoSeguridadSocial) {
		this.strTipoSeguridadSocial = strTipoSeguridadSocial;
	}

	public String getStrTelefono() {
		return strTelefono;
	}

	public void setStrTelefono(String strTelefono) {
		this.strTelefono = strTelefono;
	}

	public String getStrTelefonoTrabajo() {
		return strTelefonoTrabajo;
	}

	public void setStrTelefonoTrabajo(String strTelefonoTrabajo) {
		this.strTelefonoTrabajo = strTelefonoTrabajo;
	}

	public String getStrCorreoElectronico() {
		return strCorreoElectronico;
	}

	public void setStrCorreoElectronico(String strCorreoElectronico) {
		this.strCorreoElectronico = strCorreoElectronico;
	}

	public String getStrNombreTutor() {
		return strNombreTutor;
	}

	public void setStrNombreTutor(String strNombreTutor) {
		this.strNombreTutor = strNombreTutor;
	}

	public String getStrPaternoTutor() {
		return strPaternoTutor;
	}

	public void setStrPaternoTutor(String strPaternoTutor) {
		this.strPaternoTutor = strPaternoTutor;
	}

	public String getStrMaternoTutor() {
		return strMaternoTutor;
	}

	public void setStrMaternoTutor(String strMaternoTutor) {
		this.strMaternoTutor = strMaternoTutor;
	}

	public String getStrCalleTutor() {
		return strCalleTutor;
	}

	public void setStrCalleTutor(String strCalleTutor) {
		this.strCalleTutor = strCalleTutor;
	}

	public String getStrTelefonoTutor() {
		return strTelefonoTutor;
	}

	public void setStrTelefonoTutor(String strTelefonoTutor) {
		this.strTelefonoTutor = strTelefonoTutor;
	}

	public String getStrCorreoElectronicoTutor() {
		return strCorreoElectronicoTutor;
	}

	public void setStrCorreoElectronicoTutor(String strCorreoElectronicoTutor) {
		this.strCorreoElectronicoTutor = strCorreoElectronicoTutor;
	}

	public String getStrEscuelaProcedencia() {
		return strEscuelaProcedencia;
	}

	public void setStrEscuelaProcedencia(String strEscuelaProcedencia) {
		this.strEscuelaProcedencia = strEscuelaProcedencia;
	}

	public BigDecimal getPromedioGeneral() {
		return promedioGeneral;
	}

	public void setPromedioGeneral(BigDecimal promedioGeneral) {
		this.promedioGeneral = promedioGeneral;
	}

	public String getStrEspecialidad() {
		return strEspecialidad;
	}

	public void setStrEspecialidad(String strEspecialidad) {
		this.strEspecialidad = strEspecialidad;
	}

	public String getStrTipoTrabajo() {
		return strTipoTrabajo;
	}

	public void setStrTipoTrabajo(String strTipoTrabajo) {
		this.strTipoTrabajo = strTipoTrabajo;
	}

	public String getStrDireccionTrabajo() {
		return strDireccionTrabajo;
	}

	public void setStrDireccionTrabajo(String strDireccionTrabajo) {
		this.strDireccionTrabajo = strDireccionTrabajo;
	}

	public String getStrEstatusAspirante() {
		return strEstatusAspirante;
	}

	public void setStrEstatusAspirante(String strEstatusAspirante) {
		this.strEstatusAspirante = strEstatusAspirante;
	}

	public String getStrSov() {
		return strSov;
	}

	public void setStrSov(String strSov) {
		this.strSov = strSov;
	}

	public String getStrAsistioSov() {
		return strAsistioSov;
	}

	public void setStrAsistioSov(String strAsistioSov) {
		this.strAsistioSov = strAsistioSov;
	}

	public String getStrCarreraInicial() {
		return strCarreraInicial;
	}

	public void setStrCarreraInicial(String strCarreraInicial) {
		this.strCarreraInicial = strCarreraInicial;
	}

	public Long getLngPuntajeExamen() {
		return lngPuntajeExamen;
	}

	public void setLngPuntajeExamen(Long lngPuntajeExamen) {
		this.lngPuntajeExamen = lngPuntajeExamen;
	}

	public String getStrCoincide() {
		return strCoincide;
	}

	public void setStrCoincide(String strCoincide) {
		this.strCoincide = strCoincide;
	}
	
	
}
