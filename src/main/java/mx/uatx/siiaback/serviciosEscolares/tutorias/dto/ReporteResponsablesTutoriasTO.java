package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import javax.persistence.Column;

public class ReporteResponsablesTutoriasTO {

	private Integer intId;

	private String strNbPersona;

	private String strApPaterno;

	private String strApMaterno;

	private Integer intNoTutorado;

	private Integer intNoUna;

	private Integer intNoDos;

	private Integer intNoTres;

	private Integer intMasTres;

	private Integer intTotalTutorias;

	private Integer intSinFirmar;

	private Integer intRegistradas;

	private Integer intFirmadas;

	private String strPrctCumplimiento;

	private String strPrctregistrado;

	private Integer intPrctCumplimiento;

	private Integer intPrctRegistrado;

	private String strProgramaCampus;

	private String strProgramaEducativo;
	
	

	public ReporteResponsablesTutoriasTO() {
		super();
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrNbPersona() {
		return strNbPersona;
	}

	public void setStrNbPersona(String strNbPersona) {
		this.strNbPersona = strNbPersona;
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

	public Integer getIntNoTutorado() {
		return intNoTutorado;
	}

	public void setIntNoTutorado(Integer intNoTutorado) {
		this.intNoTutorado = intNoTutorado;
	}

	public Integer getIntNoUna() {
		return intNoUna;
	}

	public void setIntNoUna(Integer intNoUna) {
		this.intNoUna = intNoUna;
	}

	public Integer getIntNoDos() {
		return intNoDos;
	}

	public void setIntNoDos(Integer intNoDos) {
		this.intNoDos = intNoDos;
	}

	public Integer getIntNoTres() {
		return intNoTres;
	}

	public void setIntNoTres(Integer intNoTres) {
		this.intNoTres = intNoTres;
	}

	public Integer getIntMasTres() {
		return intMasTres;
	}

	public void setIntMasTres(Integer intMasTres) {
		this.intMasTres = intMasTres;
	}

	public Integer getIntTotalTutorias() {
		return intTotalTutorias;
	}

	public void setIntTotalTutorias(Integer intTotalTutorias) {
		this.intTotalTutorias = intTotalTutorias;
	}

	public Integer getIntSinFirmar() {
		return intSinFirmar;
	}

	public void setIntSinFirmar(Integer intSinFirmar) {
		this.intSinFirmar = intSinFirmar;
	}

	public Integer getIntRegistradas() {
		return intRegistradas;
	}

	public void setIntRegistradas(Integer intRegistradas) {
		this.intRegistradas = intRegistradas;
	}

	public Integer getIntFirmadas() {
		return intFirmadas;
	}

	public void setIntFirmadas(Integer intFirmadas) {
		this.intFirmadas = intFirmadas;
	}

	public String getStrPrctCumplimiento() {
		return strPrctCumplimiento;
	}

	public void setStrPrctCumplimiento(String strPrctCumplimiento) {
		this.strPrctCumplimiento = strPrctCumplimiento;
	}

	public String getStrPrctregistrado() {
		return strPrctregistrado;
	}

	public void setStrPrctregistrado(String strPrctregistrado) {
		this.strPrctregistrado = strPrctregistrado;
	}

	public Integer getIntPrctCumplimiento() {
		return intPrctCumplimiento;
	}

	public void setIntPrctCumplimiento(Integer intPrctCumplimiento) {
		this.intPrctCumplimiento = intPrctCumplimiento;
	}

	

	public Integer getIntPrctRegistrado() {
		return intPrctRegistrado;
	}

	public void setIntPrctRegistrado(Integer intPrctRegistrado) {
		this.intPrctRegistrado = intPrctRegistrado;
	}

	public String getStrProgramaCampus() {
		return strProgramaCampus;
	}

	public void setStrProgramaCampus(String strProgramaCampus) {
		this.strProgramaCampus = strProgramaCampus;
	}

	public String getStrProgramaEducativo() {
		return strProgramaEducativo;
	}

	public void setStrProgramaEducativo(String strProgramaEducativo) {
		this.strProgramaEducativo = strProgramaEducativo;
	}

}
