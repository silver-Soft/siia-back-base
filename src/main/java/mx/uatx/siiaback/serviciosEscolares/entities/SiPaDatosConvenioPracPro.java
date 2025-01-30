package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaDatosConvenioPracPro {

	@Id
	@Column(name = "IDSOLICITUDPRACPRO")
	private Integer intIdSolicitud;

	@Column(name = "NBDEPENDENCIA")
	private String strNbDependencia;

	@Column(name = "DIRECCIONDEPENDENCIA")
	private String strDireccionDependencia;

	@Column(name = "TELEFONODEPENDENCIA")
	private String strTelefonoDependencia;

	@Column(name = "NBPERSONACARTA")
	private String strNbPersonaCarta;

	@Column(name = "CARGOPERSONACARTA")
	private String strCargoPersonaCarta;
	
	@Column(name = "NBJEFEINMEDIATO")
	private String strNbJefeInmediato;

	@Column(name = "CARGOJEFEINMEDIATO")
	private String strCargoJefeInmediato;
	
	@Column(name = "TIPOAPOYO")
	private String strTipoApoyo;

	@Column(name = "MNAPOYO")
	private Double dblMnApoyo;
	
	@Column(name = "CANTIDADLETRA")
	private String strCantidadLetra;

	@Column(name = "DSESPECIE")
	private String strDsEspecie;

	@Column(name = "FCINICIO")
	private Date fcInicio;

	@Column(name = "FCFIN")
	private Date fcFin;

	@Column(name = "DSACTIVIDADES")
	private String strDsActividades;

	@Column(name = "FACULTAD")
	private String strNombreFactultad;

	@Column(name = "PROGRAMA")
	private String strDsPrograma;

	@Column(name = "DOMICILIOFACULTAD")
	private String strDomicilioFactultad;

	@Column(name = "TELEFONOFACULTAD")
	private String strTelefonoFactultad;

	@Column(name = "NBEXTENSION")
	private String strNbExtension;

	@Column(name = "NBRESPPRACPRO")
	private String strNbResponsable;

	@Column(name = "NBTITULARAPRENDIZAJE")
	private String strNbTitularAprendizaje;

	@Column(name = "NBPRACTICANTE")
	private String strNbPracticante;

	@Column(name = "CORREOPRACTICANTE")
	private String strNbCorreoPracticante;

	@Column(name = "LICYGENERACION")
	private String strLicYGeneracion;

	@Column(name = "TELEFONOPRACTICANTE")
	private String strTelefonoPracticante;

	@Column(name = "SEMESTRE")
	private String strSemestre;

	@Column(name = "NOMBREPROGRAMASPRACPRO")
	private String strNbProgramaPracPro;
	
	@Column(name = "FECHAACTUAL")
	private String strFechaActual;
	
	@Column(name = "PERIODICIDAD")
	private String strPeriodicidad;
	
	
	
	

	public SiPaDatosConvenioPracPro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SiPaDatosConvenioPracPro(Integer intIdSolicitud, String strNbDependencia, String strDireccionDependencia,
			String strTelefonoDependencia, String strNbPersonaCarta, String strCargoPersonaCarta,
			String strNbJefeInmediato, String strCargoJefeInmediato, String strTipoApoyo, Double dblMnApoyo,
			String strDsEspecie, Date fcInicio, Date fcFin, String strDsActividades, String strNombreFactultad,
			String strDsPrograma, String strDomicilioFactultad, String strTelefonoFactultad, String strNbExtension,
			String strNbResponsable, String strNbTitularAprendizaje, String strNbPracticante,
			String strNbCorreoPracticante, String strLicYGeneracion, String strTelefonoPracticante, String strSemestre,
			String strNbProgramaPracPro) {
		super();
		this.intIdSolicitud = intIdSolicitud;
		this.strNbDependencia = strNbDependencia;
		this.strDireccionDependencia = strDireccionDependencia;
		this.strTelefonoDependencia = strTelefonoDependencia;
		this.strNbPersonaCarta = strNbPersonaCarta;
		this.strCargoPersonaCarta = strCargoPersonaCarta;
		this.strNbJefeInmediato = strNbJefeInmediato;
		this.strCargoJefeInmediato = strCargoJefeInmediato;
		this.strTipoApoyo = strTipoApoyo;
		this.dblMnApoyo = dblMnApoyo;
		this.strDsEspecie = strDsEspecie;
		this.fcInicio = fcInicio;
		this.fcFin = fcFin;
		this.strDsActividades = strDsActividades;
		this.strNombreFactultad = strNombreFactultad;
		this.strDsPrograma = strDsPrograma;
		this.strDomicilioFactultad = strDomicilioFactultad;
		this.strTelefonoFactultad = strTelefonoFactultad;
		this.strNbExtension = strNbExtension;
		this.strNbResponsable = strNbResponsable;
		this.strNbTitularAprendizaje = strNbTitularAprendizaje;
		this.strNbPracticante = strNbPracticante;
		this.strNbCorreoPracticante = strNbCorreoPracticante;
		this.strLicYGeneracion = strLicYGeneracion;
		this.strTelefonoPracticante = strTelefonoPracticante;
		this.strSemestre = strSemestre;
		this.strNbProgramaPracPro = strNbProgramaPracPro;
	}

	public Integer getIntIdSolicitud() {
		return intIdSolicitud;
	}

	public void setIntIdSolicitud(Integer intIdSolicitud) {
		this.intIdSolicitud = intIdSolicitud;
	}

	public String getStrNbDependencia() {
		return strNbDependencia;
	}

	public void setStrNbDependencia(String strNbDependencia) {
		this.strNbDependencia = strNbDependencia;
	}

	public String getStrDireccionDependencia() {
		return strDireccionDependencia;
	}

	public void setStrDireccionDependencia(String strDireccionDependencia) {
		this.strDireccionDependencia = strDireccionDependencia;
	}

	public String getStrTelefonoDependencia() {
		return strTelefonoDependencia;
	}

	public void setStrTelefonoDependencia(String strTelefonoDependencia) {
		this.strTelefonoDependencia = strTelefonoDependencia;
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

	public String getStrNbJefeInmediato() {
		return strNbJefeInmediato;
	}

	public void setStrNbJefeInmediato(String strNbJefeInmediato) {
		this.strNbJefeInmediato = strNbJefeInmediato;
	}

	public String getStrCargoJefeInmediato() {
		return strCargoJefeInmediato;
	}

	public void setStrCargoJefeInmediato(String strCargoJefeInmediato) {
		this.strCargoJefeInmediato = strCargoJefeInmediato;
	}

	public String getStrTipoApoyo() {
		return strTipoApoyo;
	}

	public void setStrTipoApoyo(String strTipoApoyo) {
		this.strTipoApoyo = strTipoApoyo;
	}

	public Double getDblMnApoyo() {
		return dblMnApoyo;
	}

	public void setDblMnApoyo(Double dblMnApoyo) {
		this.dblMnApoyo = dblMnApoyo;
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

	public String getStrNombreFactultad() {
		return strNombreFactultad;
	}

	public void setStrNombreFactultad(String strNombreFactultad) {
		this.strNombreFactultad = strNombreFactultad;
	}

	public String getStrDsPrograma() {
		return strDsPrograma;
	}

	public void setStrDsPrograma(String strDsPrograma) {
		this.strDsPrograma = strDsPrograma;
	}

	public String getStrDomicilioFactultad() {
		return strDomicilioFactultad;
	}

	public void setStrDomicilioFactultad(String strDomicilioFactultad) {
		this.strDomicilioFactultad = strDomicilioFactultad;
	}

	public String getStrTelefonoFactultad() {
		return strTelefonoFactultad;
	}

	public void setStrTelefonoFactultad(String strTelefonoFactultad) {
		this.strTelefonoFactultad = strTelefonoFactultad;
	}

	public String getStrNbExtension() {
		return strNbExtension;
	}

	public void setStrNbExtension(String strNbExtension) {
		this.strNbExtension = strNbExtension;
	}

	public String getStrNbResponsable() {
		return strNbResponsable;
	}

	public void setStrNbResponsable(String strNbResponsable) {
		this.strNbResponsable = strNbResponsable;
	}

	public String getStrNbTitularAprendizaje() {
		return strNbTitularAprendizaje;
	}

	public void setStrNbTitularAprendizaje(String strNbTitularAprendizaje) {
		this.strNbTitularAprendizaje = strNbTitularAprendizaje;
	}

	public String getStrNbPracticante() {
		return strNbPracticante;
	}

	public void setStrNbPracticante(String strNbPracticante) {
		this.strNbPracticante = strNbPracticante;
	}

	public String getStrNbCorreoPracticante() {
		return strNbCorreoPracticante;
	}

	public void setStrNbCorreoPracticante(String strNbCorreoPracticante) {
		this.strNbCorreoPracticante = strNbCorreoPracticante;
	}

	public String getStrLicYGeneracion() {
		return strLicYGeneracion;
	}

	public void setStrLicYGeneracion(String strLicYGeneracion) {
		this.strLicYGeneracion = strLicYGeneracion;
	}

	public String getStrTelefonoPracticante() {
		return strTelefonoPracticante;
	}

	public void setStrTelefonoPracticante(String strTelefonoPracticante) {
		this.strTelefonoPracticante = strTelefonoPracticante;
	}

	public String getStrSemestre() {
		return strSemestre;
	}

	public void setStrSemestre(String strSemestre) {
		this.strSemestre = strSemestre;
	}

	public String getStrNbProgramaPracPro() {
		return strNbProgramaPracPro;
	}

	public void setStrNbProgramaPracPro(String strNbProgramaPracPro) {
		this.strNbProgramaPracPro = strNbProgramaPracPro;
	}

	public String getStrFechaActual() {
		return strFechaActual;
	}

	public void setStrFechaActual(String strFechaActual) {
		this.strFechaActual = strFechaActual;
	}

	public String getStrPeriodicidad() {
		return strPeriodicidad;
	}

	public void setStrPeriodicidad(String strPeriodicidad) {
		this.strPeriodicidad = strPeriodicidad;
	}

	public String getStrCantidadLetra() {
		return strCantidadLetra;
	}

	public void setStrCantidadLetra(String strCantidadLetra) {
		this.strCantidadLetra = strCantidadLetra;
	}
	
	
		

}
