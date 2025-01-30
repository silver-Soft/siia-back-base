package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosConstanciaBiblioteca implements Serializable {

	@Id
	@Column(name = "IDHISTORIALACADEMICO")
	private Integer intIdHistorialAcademico;

	@Column(name = "DIRECCION")
	private String nbDireccion;

	@Column(name = "NBBIBLIOTECA")
	private String nbBiblioteca;

	@Column(name = "NOMBRE")
	private String nbNombre;

	@Column(name = "PROGRAMA")
	private String nbPrograma;

	@Column(name = "FACULTAD")
	private String nbFacultad;

	@Column(name = "MATRICULA")
	private String nbMatricula;

	@Column(name = "TITULAR")
	private String nbTitular;

	@Column(name = "PUESTO")
	private String nbPuesto;

	@Column(name = "CADENAQR")
	private String strCodigoQR;

	@Column(name = "CODIGOCALIDAD")
	private String nbCodigoCalidad;

	@Column(name = "NOTA")
	private String strNota;

	@Column(name = "FCEXPEDICION")
	private String strFcActual;

	@Column(name = "TRAMITE")
	private String strTramite;

	@Column(name = "GENERO")
	private String strGenero;

	@Column(name = "TRATAMIENTO")
	private String strTratamiento;

	@Column(name = "INTERESADO")
	private String strInteresado;

	@Column(name = "CADENAORIGINAL")
	private String strCadenaOriginal;

	@Column(name = "FIRMAJEFE")
	private String strFirmaJefe;
	
	@Column(name = "GENERODIRECTOR")
	private String generoDirector;
	
	@Column(name = "NBDIRECTOR")
	private String strNbDirector;
	
	

	public SePaDatosConstanciaBiblioteca() {
		super();
	}

	public Integer getIntIdHistorialAcademico() {
		return intIdHistorialAcademico;
	}

	public void setIntIdHistorialAcademico(Integer intIdHistorialAcademico) {
		this.intIdHistorialAcademico = intIdHistorialAcademico;
	}

	public String getNbDireccion() {
		return nbDireccion;
	}

	public void setNbDireccion(String nbDireccion) {
		this.nbDireccion = nbDireccion;
	}

	public String getNbBiblioteca() {
		return nbBiblioteca;
	}

	public void setNbBiblioteca(String nbBiblioteca) {
		this.nbBiblioteca = nbBiblioteca;
	}

	public String getNbNombre() {
		return nbNombre;
	}

	public void setNbNombre(String nbNombre) {
		this.nbNombre = nbNombre;
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

	public String getNbMatricula() {
		return nbMatricula;
	}

	public void setNbMatricula(String nbMatricula) {
		this.nbMatricula = nbMatricula;
	}

	public String getNbTitular() {
		return nbTitular;
	}

	public void setNbTitular(String nbTitular) {
		this.nbTitular = nbTitular;
	}

	public String getNbPuesto() {
		return nbPuesto;
	}

	public void setNbPuesto(String nbPuesto) {
		this.nbPuesto = nbPuesto;
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

	public String getStrNota() {
		return strNota;
	}

	public void setStrNota(String strNota) {
		this.strNota = strNota;
	}

	public String getStrFcActual() {
		return strFcActual;
	}

	public void setStrFcActual(String strFcActual) {
		this.strFcActual = strFcActual;
	}

	public String getStrTramite() {
		return strTramite;
	}

	public void setStrTramite(String strTramite) {
		this.strTramite = strTramite;
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

	public String getGeneroDirector() {
		return generoDirector;
	}

	public void setGeneroDirector(String generoDirector) {
		this.generoDirector = generoDirector;
	}

	public String getStrNbDirector() {
		return strNbDirector;
	}

	public void setStrNbDirector(String strNbDirector) {
		this.strNbDirector = strNbDirector;
	}
	
	
	

}
