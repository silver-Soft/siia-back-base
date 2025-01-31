package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtProgramaCampus implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1269877136493245963L;
	
	@Id
	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus;
	
	@Column(name = "IDPROGRAMAEDUCATIVO")
	private Integer intIdProgramaEducativo;
	
	@Column(name = "IDAREACAMPUS")
	private Integer intIdAreaCampus;
	
	@Column(name = "CLNIVELEDUCATIVO")
	private Integer intCveNivelEducativo;
	
	@Column(name = "DSREGISTROIMSS")
	private String strDsRegistroImss;
	
	@Column(name = "DSPROGRAMAEDUCATIVO")
	private String strDsProgramaEducativo;
	
	@Column(name = "DSPROGRAMACAMPUS")
	private String strDsProgramaCampus;
	
	@Column(name = "DSCAMPUS")
	private String strDsCampus;
	
	@Column(name = "DSNIVELEDUCATIVO")
	private String strDsNivelEducativo;

	public SePaObtProgramaCampus() {
		super();
	}

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
	}

	public Integer getIntIdProgramaEducativo() {
		return intIdProgramaEducativo;
	}

	public void setIntIdProgramaEducativo(Integer intIdProgramaEducativo) {
		this.intIdProgramaEducativo = intIdProgramaEducativo;
	}

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
	}

	public Integer getIntCveNivelEducativo() {
		return intCveNivelEducativo;
	}

	public void setIntCveNivelEducativo(Integer intCveNivelEducativo) {
		this.intCveNivelEducativo = intCveNivelEducativo;
	}

	public String getStrDsRegistroImss() {
		return strDsRegistroImss;
	}

	public void setStrDsRegistroImss(String strDsRegistroImss) {
		this.strDsRegistroImss = strDsRegistroImss;
	}

	public String getStrDsProgramaEducativo() {
		return strDsProgramaEducativo;
	}

	public void setStrDsProgramaEducativo(String strDsProgramaEducativo) {
		this.strDsProgramaEducativo = strDsProgramaEducativo;
	}

	public String getStrDsCampus() {
		return strDsCampus;
	}

	public void setStrDsCampus(String strDsCampus) {
		this.strDsCampus = strDsCampus;
	}

	public String getStrDsNivelEducativo() {
		return strDsNivelEducativo;
	}

	public void setStrDsNivelEducativo(String strDsNivelEducativo) {
		this.strDsNivelEducativo = strDsNivelEducativo;
	}

	public String getStrDsProgramaCampus() {
		return strDsProgramaCampus;
	}

	public void setStrDsProgramaCampus(String strDsProgramaCampus) {
		this.strDsProgramaCampus = strDsProgramaCampus;
	}
	
	
	

}
