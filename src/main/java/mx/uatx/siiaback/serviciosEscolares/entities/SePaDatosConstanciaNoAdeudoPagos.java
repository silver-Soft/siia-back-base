package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosConstanciaNoAdeudoPagos {
	
	@Id
	@Column(name = "IDHISTORIALACADEMICO")
	private Integer intIdHistorialAcademico;

	@Column(name = "NOMBRE")
	private String nbNombre;

	@Column(name = "FACULTAD")
	private String nbFacultad;

	@Column(name = "PROGRAMA")
	private String nbPrograma;

	@Column(name = "MATRICULA")
	private String nbMatricula;

	@Column(name = "PERIODOS")
	private String strPeriodos;
	
	@Column(name = "TITULARCONTADOR")
	private String strTitularContador;
	
	@Column(name = "PUESTOCONTADOR")
	private String strPuestoContador;
	
	@Column(name = "TITULARSECRETARIA")
	private String strTitularSecretaria;
	
	@Column(name = "PUESTOSECRETARIA")
	private String strPuestoSecretaria;
	
	@Column(name = "INTERESADO")
	private String strInteresado;

	@Column(name = "CADENAQR")
	private String strCodigoQR;

	@Column(name = "CODIGOCALIDAD")
	private String nbCodigoCalidad;

	@Column(name = "FCEXPEDICION")
	private String strFcActual;

	@Column(name = "GENERO")
	private String strGenero;

	@Column(name = "TRATAMIENTO")
	private String strTratamiento;
	
	@Column(name = "CADENAORIGINAL")
	private String strCadenaOriginal;

	@Column(name = "FIRMAJEFE")
	private String strFirmaJefe;
	
	

	public SePaDatosConstanciaNoAdeudoPagos() {
		super();
	}

	public Integer getIntIdHistorialAcademico() {
		return intIdHistorialAcademico;
	}

	public void setIntIdHistorialAcademico(Integer intIdHistorialAcademico) {
		this.intIdHistorialAcademico = intIdHistorialAcademico;
	}

	public String getNbNombre() {
		return nbNombre;
	}

	public void setNbNombre(String nbNombre) {
		this.nbNombre = nbNombre;
	}

	public String getNbFacultad() {
		return nbFacultad;
	}

	public void setNbFacultad(String nbFacultad) {
		this.nbFacultad = nbFacultad;
	}

	public String getNbPrograma() {
		return nbPrograma;
	}

	public void setNbPrograma(String nbPrograma) {
		this.nbPrograma = nbPrograma;
	}

	public String getNbMatricula() {
		return nbMatricula;
	}

	public void setNbMatricula(String nbMatricula) {
		this.nbMatricula = nbMatricula;
	}

	public String getStrPeriodos() {
		return strPeriodos;
	}

	public void setStrPeriodos(String strPeriodos) {
		this.strPeriodos = strPeriodos;
	}

	public String getStrTitularContador() {
		return strTitularContador;
	}

	public void setStrTitularContador(String strTitularContador) {
		this.strTitularContador = strTitularContador;
	}

	public String getStrPuestoContador() {
		return strPuestoContador;
	}

	public void setStrPuestoContador(String strPuestoContador) {
		this.strPuestoContador = strPuestoContador;
	}

	public String getStrTitularSecretaria() {
		return strTitularSecretaria;
	}

	public void setStrTitularSecretaria(String strTitularSecretaria) {
		this.strTitularSecretaria = strTitularSecretaria;
	}

	public String getStrPuestoSecretaria() {
		return strPuestoSecretaria;
	}

	public void setStrPuestoSecretaria(String strPuestoSecretaria) {
		this.strPuestoSecretaria = strPuestoSecretaria;
	}

	public String getStrCodigoQR() {
		return strCodigoQR;
	}

	public void setStrCodigoQR(String strCodigoQR) {
		this.strCodigoQR = strCodigoQR;
	}

	public String getNbCodigoCalidad() {
		return nbCodigoCalidad;
	}

	public void setNbCodigoCalidad(String nbCodigoCalidad) {
		this.nbCodigoCalidad = nbCodigoCalidad;
	}

	public String getStrFcActual() {
		return strFcActual;
	}

	public void setStrFcActual(String strFcActual) {
		this.strFcActual = strFcActual;
	}

	public String getStrGenero() {
		return strGenero;
	}

	public void setStrGenero(String strGenero) {
		this.strGenero = strGenero;
	}

	public String getStrTratamiento() {
		return strTratamiento;
	}

	public void setStrTratamiento(String strTratamiento) {
		this.strTratamiento = strTratamiento;
	}

	public String getStrInteresado() {
		return strInteresado;
	}

	public void setStrInteresado(String strInteresado) {
		this.strInteresado = strInteresado;
	}

	public String getStrCadenaOriginal() {
		return strCadenaOriginal;
	}

	public void setStrCadenaOriginal(String strCadenaOriginal) {
		this.strCadenaOriginal = strCadenaOriginal;
	}

	public String getStrFirmaJefe() {
		return strFirmaJefe;
	}

	public void setStrFirmaJefe(String strFirmaJefe) {
		this.strFirmaJefe = strFirmaJefe;
	}
	

}
