package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(schema = "SIIUAT", name="SIMSTRANSFUNCIONES")
public class SiMsTransFunciones implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1054840591035692619L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDFUNCION", sequenceName = "SIIUAT.IDFUNCION", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDFUNCION")
    @NotNull
    
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
	
	@Column(name = "PLAZOCONSERVACIONAT")
	private String strPlazoConservacionAT;
	
	@Column(name = "PLAZOCONSERVACIONAC")
	private String strPlazoConservacionAC;
	
	@Column(name = "TOTALANIOS")
	private Integer intTotalAnios;
	
	@Column(name = "IDTECNICASELECCION")
	private Integer intIdTecnicaSeleccion;
	
	@Column(name = "IDACCESO")
	private Integer intIdAcceso;
	
	@Column(name = "DESTINOFINAL")
	private String strDestinoFinal;
	
	@Column(name = "FCAUDIT")
    private Date fcAudit;
	
	@Column(name = "USUARIOAUDIT")
    private String strUsuarioAudit;
	
	@Column(name = "IDFUNCIONSUSTANTIVA")
	private Integer intIdFuncionSuntantiva;
	
	@Column(name = "IDAREACAMPUS")
	private Integer intIdAreaCampus;

	public Integer getIntIdFuncion() {
		return intIdFuncion;
	}

	public void setIntIdFuncion(Integer intIdFuncion) {
		this.intIdFuncion = intIdFuncion;
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

	public String getStrDsFuncion() {
		return strDsFuncion;
	}

	public void setStrDsFuncion(String strDsFuncion) {
		this.strDsFuncion = strDsFuncion;
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

	public Integer getIntIdAcceso() {
		return intIdAcceso;
	}

	public void setIntIdAcceso(Integer intIdAcceso) {
		this.intIdAcceso = intIdAcceso;
	}

	public String getStrDestinoFinal() {
		return strDestinoFinal;
	}

	public void setStrDestinoFinal(String strDestinoFinal) {
		this.strDestinoFinal = strDestinoFinal;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public Integer getIntIdFuncionSuntantiva() {
		return intIdFuncionSuntantiva;
	}

	public void setIntIdFuncionSuntantiva(Integer intIdFuncionSuntantiva) {
		this.intIdFuncionSuntantiva = intIdFuncionSuntantiva;
	}

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
	}
	
}
