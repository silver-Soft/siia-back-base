package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtFunciones implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7975834503229351665L;
	@Id
	@Column(name = "IDFUNCION")
	private Integer intIdFuncion;
	
	@Column(name = "DSSERIE")
	private String strDsSerie;
	
	@Column(name = "DSSUBSERIE")
	private String strDsSubSerie;
	
	@Column(name = "DSFUNCION")
	private String strDsFuncion;
	
	@Column(name = "IDFUNCIONPADRE")
	private Integer intIdFuncionPadre;
	
	@Column(name = "IDVALORDOCUMENTAL")
	private Integer intIdValorDocumental;
	
	@Column(name = "DSVALORDOCUMENTAL")
	private String strDsValorDocumental;
	
	@Column(name = "PLAZOCONSERVACIONAT")
	private String strPlazoConservacionAT;
	
	@Column(name = "PLAZOCONSERVACIONAC")
	private String strPlazoConservacionAC;
	
	@Column(name = "TOTALANIOS")
	private Integer intTotalAnios;
	
	@Column(name = "IDTECNICASELECCION")
	private Integer intIdTecnicaSeleccion;
	
	@Column(name = "DSTECNICASELECCION")
	private String strDsTecnicaSeleccion;
	
	@Column(name = "IDACCESO")
	private Integer intIdAcceso;
	
	@Column(name = "DSACCESO")
	private String strDsAcceso;
	
	@Column(name = "DESTINOFINAL")
	private String strDestinoFinal;
	
	@Column(name = "IDFUNCIONSUSTANTIVA")
	private Integer intIdFuncionSustantiva;
	
	@Column(name = "IDAREACAMPUS")
	private Integer intIdAreaCampus;
	
	@Column(name = "AREA")
	private String strArea;
	
	@Column(name = "DSFUNCIONSUSTANTIVA")
	private String strDsFuncionSustantiva;
	
	public SiPaObtFunciones() {
		super();
	}

	public Integer getIntIdFuncion() {
		return intIdFuncion;
	}

	public void setIntIdFuncion(Integer intIdFuncion) {
		this.intIdFuncion = intIdFuncion;
	}

	public String getStrDsFuncion() {
		return strDsFuncion;
	}

	public void setStrDsFuncion(String strDsFuncion) {
		this.strDsFuncion = strDsFuncion;
	}

	public String getStrDsSerie() {
		return strDsSerie;
	}

	public void setStrDsSerie(String strDsSerie) {
		this.strDsSerie = strDsSerie;
	}

	public String getStrDsSubSerie() {
		return strDsSubSerie;
	}

	public void setStrDsSubSerie(String strDsSubSerie) {
		this.strDsSubSerie = strDsSubSerie;
	}

	public Integer getIntIdFuncionPadre() {
		return intIdFuncionPadre;
	}

	public void setIntIdFuncionPadre(Integer intIdFuncionPadre) {
		this.intIdFuncionPadre = intIdFuncionPadre;
	}

	public Integer getIntIdValorDocumental() {
		return intIdValorDocumental;
	}

	public void setIntIdValorDocumental(Integer intIdValorDocumental) {
		this.intIdValorDocumental = intIdValorDocumental;
	}

	public String getStrDsValorDocumental() {
		return strDsValorDocumental;
	}

	public void setStrDsValorDocumental(String strDsValorDocumental) {
		this.strDsValorDocumental = strDsValorDocumental;
	}
	
	public String getStrPlazoConservacionAT() {
		return strPlazoConservacionAT;
	}

	public void setStrPlazoConservacionAT(String strPlazoConservacionAT) {
		this.strPlazoConservacionAT = strPlazoConservacionAT;
	}

	public String getStrPlazoConservacionAC() {
		return strPlazoConservacionAC;
	}

	public void setStrPlazoConservacionAC(String strPlazoConservacionAC) {
		this.strPlazoConservacionAC = strPlazoConservacionAC;
	}

	public Integer getIntTotalAnios() {
		return intTotalAnios;
	}

	public void setIntTotalAnios(Integer intTotalAnios) {
		this.intTotalAnios = intTotalAnios;
	}

	public Integer getIntIdTecnicaSeleccion() {
		return intIdTecnicaSeleccion;
	}

	public void setIntIdTecnicaSeleccion(Integer intIdTecnicaSeleccion) {
		this.intIdTecnicaSeleccion = intIdTecnicaSeleccion;
	}

	public String getStrDsTecnicaSeleccion() {
		return strDsTecnicaSeleccion;
	}

	public void setStrDsTecnicaSeleccion(String strDsTecnicaSeleccion) {
		this.strDsTecnicaSeleccion = strDsTecnicaSeleccion;
	}

	public Integer getIntIdAcceso() {
		return intIdAcceso;
	}

	public void setIntIdAcceso(Integer intIdAcceso) {
		this.intIdAcceso = intIdAcceso;
	}

	public String getStrDsAcceso() {
		return strDsAcceso;
	}

	public void setStrDsAcceso(String strDsAcceso) {
		this.strDsAcceso = strDsAcceso;
	}

	public String getStrDestinoFinal() {
		return strDestinoFinal;
	}

	public void setStrDestinoFinal(String strDestinoFinal) {
		this.strDestinoFinal = strDestinoFinal;
	}

	public Integer getIntIdFuncionSustantiva() {
		return intIdFuncionSustantiva;
	}

	public void setIntIdFuncionSustantiva(Integer intIdFuncionSustantiva) {
		this.intIdFuncionSustantiva = intIdFuncionSustantiva;
	}

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
	}

	public String getStrArea() {
		return strArea;
	}

	public void setStrArea(String strArea) {
		this.strArea = strArea;
	}

	public String getStrDsFuncionSustantiva() {
		return strDsFuncionSustantiva;
	}

	public void setStrDsFuncionSustantiva(String strDsFuncionSustantiva) {
		this.strDsFuncionSustantiva = strDsFuncionSustantiva;
	}
	
	
}
