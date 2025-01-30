package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtDatosReporteCurriculumInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3368300404142254112L;
	@Id
	@Column(name = "IDINFORMACIONCURRICULAR")
	private Long lngIdInformacionCurricular;
	
	@Column(name = "IDPERIODO")
	private String strIdPeriodo;
	
	@Column(name = "PERIODOINFORME")
	private String strPeriodoInforme;
	
	@Column(name = "PUESTO")
	private String strPuesto;
	
	@Column(name = "CARGO")
	private String strCargo;
	
	@Column(name = "NBSERVIDORPUBLICO")
	private String strNbServidorPublico;
	
	@Column(name = "AREAADSCRIPCION")
	private String strAreaAdscripcion;
	
	@Column(name = "GRADOMAXIMOESTUDIOS")
	private String strGradoMaximoEstudios;
	
	@Column(name = "LICENCIATURA")
	private String strLicenciatura;
	
	@Column(name = "HIPERVINCULO")
	private String strHipervinculo;
	
	@Column(name = "DSSANCIONES")
	private String strDsSanciones;

	public Long getLngIdInformacionCurricular() {
		return lngIdInformacionCurricular;
	}

	public void setLngIdInformacionCurricular(Long lngIdInformacionCurricular) {
		this.lngIdInformacionCurricular = lngIdInformacionCurricular;
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public String getStrPeriodoInforme() {
		return strPeriodoInforme;
	}

	public void setStrPeriodoInforme(String strPeriodoInforme) {
		this.strPeriodoInforme = strPeriodoInforme;
	}

	public String getStrPuesto() {
		return strPuesto;
	}

	public void setStrPuesto(String strPuesto) {
		this.strPuesto = strPuesto;
	}

	public String getStrCargo() {
		return strCargo;
	}

	public void setStrCargo(String strCargo) {
		this.strCargo = strCargo;
	}

	public String getStrNbServidorPublico() {
		return strNbServidorPublico;
	}

	public void setStrNbServidorPublico(String strNbServidorPublico) {
		this.strNbServidorPublico = strNbServidorPublico;
	}

	public String getStrAreaAdscripcion() {
		return strAreaAdscripcion;
	}

	public void setStrAreaAdscripcion(String strAreaAdscripcion) {
		this.strAreaAdscripcion = strAreaAdscripcion;
	}

	public String getStrGradoMaximoEstudios() {
		return strGradoMaximoEstudios;
	}

	public void setStrGradoMaximoEstudios(String strGradoMaximoEstudios) {
		this.strGradoMaximoEstudios = strGradoMaximoEstudios;
	}

	public String getStrLicenciatura() {
		return strLicenciatura;
	}

	public void setStrLicenciatura(String strLicenciatura) {
		this.strLicenciatura = strLicenciatura;
	}

	public String getStrHipervinculo() {
		return strHipervinculo;
	}

	public void setStrHipervinculo(String strHipervinculo) {
		this.strHipervinculo = strHipervinculo;
	}

	public String getStrDsSanciones() {
		return strDsSanciones;
	}

	public void setStrDsSanciones(String strDsSanciones) {
		this.strDsSanciones = strDsSanciones;
	}
	
	
	
}
