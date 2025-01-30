package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SePaDatosConstanciaEstudio {
	
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
	
	@Column(name = "DSPERIODO")
	private String strPeriodo;
	
	@Column(name = "SEMESTRE")
	private String strSemestre;
	
	@Column(name = "INTERESADO")
	private String strInteresado;
	
	@Column(name = "IDSOLICITUDDOCUMENTO")
	private Integer intIdSolicitudDocumento;
	
	@Column(name = "FCINICIOPERIODO")
	private String strFcInicioPeriodo;
	
	@Column(name = "FCFINPERIODO")
	private String strFcFinPeriodo;
	
	@Column(name = "PROMEDIO")
	private String strPromedio;
	
	@Column(name = "PROMEDIOANTERIOR")
	private String strPromedioAnterior;
	
	@Column(name = "NMSEMESTRES")
	private Integer noSemestres;
	
	@Column(name = "PARRAFOINICIAL")
	private String strParrafo;
	
	@Column(name = "TIPOAREA")
	private String strArea;
	
	@Column(name = "CLAVE")
	private String strClave;
	
	@Column(name = "PERIODOVACACIONAL")
	private String strPeriodoVacacional;
	
	@Column(name = "CADENAORIGINAL")
	private String strCadenaOriginal;
	
	@Column(name = "FIRMAJEFE")
	private String strFirmaJefe;
	
	@Column(name = "EGRESADO")
	private String strEgresado;
	
	
	@Column(name = "ULTIMOPERIODO")
	private String strUltimoPeriodo;
	
	@Column(name = "PERIODOFIN")
	private String strPeriodoFin;
	
	@Column(name = "PARRAFOFINAL")
	private String strParrafoFinal;
	
	@Lob
    @Column(name = "FOTOGRAFIA")
    private byte[] foto;
	
	@Column(name = "FCINGRESO")
	private Date fcIngreso;
	
	@Column(name = "FCINICIOPERIODOANT")
	private String strFcInicioPeriodoAnt;
	
	@Column(name = "FCFINPERIODOANT")
	private String strFcFinPeriodoAnt;

	public SePaDatosConstanciaEstudio() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getStrFcInicioPeriodoAnt() {
		return strFcInicioPeriodoAnt;
	}



	public void setStrFcInicioPeriodoAnt(String strFcInicioPeriodoAnt) {
		this.strFcInicioPeriodoAnt = strFcInicioPeriodoAnt;
	}



	public String getStrFcFinPeriodoAnt() {
		return strFcFinPeriodoAnt;
	}



	public void setStrFcFinPeriodoAnt(String strFcFinPeriodoAnt) {
		this.strFcFinPeriodoAnt = strFcFinPeriodoAnt;
	}



	public Date getFcIngreso() {
		return fcIngreso;
	}



	public void setFcIngreso(Date fcIngreso) {
		this.fcIngreso = fcIngreso;
	}



	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
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

	public String getStrPeriodo() {
		return strPeriodo;
	}

	public void setStrPeriodo(String strPeriodo) {
		this.strPeriodo = strPeriodo;
	}

	public String getStrSemestre() {
		return strSemestre;
	}

	public void setStrSemestre(String strSemestre) {
		this.strSemestre = strSemestre;
	}

	public String getStrInteresado() {
		return strInteresado;
	}

	public void setStrInteresado(String strInteresado) {
		this.strInteresado = strInteresado;
	}

	public Integer getIntIdSolicitudDocumento() {
		return intIdSolicitudDocumento;
	}

	public void setIntIdSolicitudDocumento(Integer intIdSolicitudDocumento) {
		this.intIdSolicitudDocumento = intIdSolicitudDocumento;
	}

	public String getStrFcInicioPeriodo() {
		return strFcInicioPeriodo;
	}

	public void setStrFcInicioPeriodo(String strFcInicioPeriodo) {
		this.strFcInicioPeriodo = strFcInicioPeriodo;
	}

	public String getStrFcFinPeriodo() {
		return strFcFinPeriodo;
	}

	public void setStrFcFinPeriodo(String strFcFinPeriodo) {
		this.strFcFinPeriodo = strFcFinPeriodo;
	}

	public String getStrPromedio() {
		return strPromedio;
	}

	public void setStrPromedio(String strPromedio) {
		this.strPromedio = strPromedio;
	}

	public String getStrPromedioAnterior() {
		return strPromedioAnterior;
	}

	public void setStrPromedioAnterior(String strPromedioAnterior) {
		this.strPromedioAnterior = strPromedioAnterior;
	}

	public Integer getNoSemestres() {
		return noSemestres;
	}

	public void setNoSemestres(Integer noSemestres) {
		this.noSemestres = noSemestres;
	}

	public String getStrParrafo() {
		return strParrafo;
	}

	public void setStrParrafo(String strParrafo) {
		this.strParrafo = strParrafo;
	}

	public String getStrArea() {
		return strArea;
	}

	public void setStrArea(String strArea) {
		this.strArea = strArea;
	}

	public String getStrClave() {
		return strClave;
	}

	public void setStrClave(String strClave) {
		this.strClave = strClave;
	}

	public String getStrPeriodoVacacional() {
		return strPeriodoVacacional;
	}

	public void setStrPeriodoVacacional(String strPeriodoVacacional) {
		this.strPeriodoVacacional = strPeriodoVacacional;
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

	public String getStrEgresado() {
		return strEgresado;
	}

	public void setStrEgresado(String strEgresado) {
		this.strEgresado = strEgresado;
	}

	public String getStrUltimoPeriodo() {
		return strUltimoPeriodo;
	}

	public void setStrUltimoPeriodo(String strUltimoPeriodo) {
		this.strUltimoPeriodo = strUltimoPeriodo;
	}

	public String getStrPeriodoFin() {
		return strPeriodoFin;
	}

	public void setStrPeriodoFin(String strPeriodoFin) {
		this.strPeriodoFin = strPeriodoFin;
	}

	public String getStrParrafoFinal() {
		return strParrafoFinal;
	}

	public void setStrParrafoFinal(String strParrafoFinal) {
		this.strParrafoFinal = strParrafoFinal;
	}
	
	
	
	
	
	
	
	
	
	
	

}
