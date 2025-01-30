package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosConstanciaExpedienteCompleto {

	@Id
	@Column(name = "IDHISTORIALACADEMICO")
	private Integer intIdHistorialAcademico;

	@Column(name = "NIVELEDUCATIVO")
	private String strNivelEducativo;

	@Column(name = "NOMBRE")
	private String nbNombre;

	@Column(name = "MATRICULA")
	private String nbMatricula;

	@Column(name = "PROGRAMA")
	private String nbPrograma;

	@Column(name = "FACULTAD")
	private String nbFacultad;

	@Column(name = "TITULAR")
	private String strTitular;

	@Column(name = "PUESTO")
	private String strPuesto;

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
	
	@Column(name = "PARRAFOINICIAL")
	private String strParrafo;

	public SePaDatosConstanciaExpedienteCompleto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIntIdHistorialAcademico() {
		return intIdHistorialAcademico;
	}

	public void setIntIdHistorialAcademico(Integer intIdHistorialAcademico) {
		this.intIdHistorialAcademico = intIdHistorialAcademico;
	}

	public String getStrNivelEducativo() {
		return strNivelEducativo;
	}

	public void setStrNivelEducativo(String strNivelEducativo) {
		this.strNivelEducativo = strNivelEducativo;
	}

	public String getNbNombre() {
		return nbNombre;
	}

	public void setNbNombre(String nbNombre) {
		this.nbNombre = nbNombre;
	}

	public String getNbMatricula() {
		return nbMatricula;
	}

	public void setNbMatricula(String nbMatricula) {
		this.nbMatricula = nbMatricula;
	}

	public String getNbPrograma() {
		return nbPrograma;
	}

	public void setNbPrograma(String nbPrograma) {
		this.nbPrograma = nbPrograma;
	}

	public String getNbFacultad() {
		return nbFacultad;
	}

	public void setNbFacultad(String nbFacultad) {
		this.nbFacultad = nbFacultad;
	}

	public String getStrTitular() {
		return strTitular;
	}

	public void setStrTitular(String strTitular) {
		this.strTitular = strTitular;
	}

	public String getStrPuesto() {
		return strPuesto;
	}

	public void setStrPuesto(String strPuesto) {
		this.strPuesto = strPuesto;
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

	public String getStrParrafo() {
		return strParrafo;
	}

	public void setStrParrafo(String strParrafo) {
		this.strParrafo = strParrafo;
	}
	
	
	
	

}
