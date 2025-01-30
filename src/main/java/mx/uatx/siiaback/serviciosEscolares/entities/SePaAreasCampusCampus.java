package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaAreasCampusCampus implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2455120346007994945L;
	@Id
	@Column(name = "IDAREACAMPUS")
	private Integer intIdAreaCampus;
	@Column(name = "CLCAMPUS")
	private Integer intCveCampus;
	@Column(name = "CLAREA")
	private Integer intCveArea;
	@Column(name = "DV")
	private Integer intDv;
	@Column(name = "MATBANCO")
	private Integer intMatBanco;
	@Column(name = "IDDOMICILIO")
	private Long lngDomicilioId;
	@Column(name = "NBAREA")
	private String strNbArea;
	@Column(name = "NMAREAUNIVERSITARIA")
	private String strNmAreaUniversitaria;
	@Column(name = "DSCAMPUS")
	private String strDsCampus;

	public SePaAreasCampusCampus() {
		super();
	}

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
	}

	public Integer getIntCveCampus() {
		return intCveCampus;
	}

	public void setIntCveCampus(Integer intCveCampus) {
		this.intCveCampus = intCveCampus;
	}

	public Integer getIntCveArea() {
		return intCveArea;
	}

	public void setIntCveArea(Integer intCveArea) {
		this.intCveArea = intCveArea;
	}

	public Integer getIntDv() {
		return intDv;
	}

	public void setIntDv(Integer intDv) {
		this.intDv = intDv;
	}

	public Integer getIntMatBanco() {
		return intMatBanco;
	}

	public void setIntMatBanco(Integer intMatBanco) {
		this.intMatBanco = intMatBanco;
	}

	public Long getLngDomicilioId() {
		return lngDomicilioId;
	}

	public void setLngDomicilioId(Long lngDomicilioId) {
		this.lngDomicilioId = lngDomicilioId;
	}

	public String getStrNbArea() {
		return strNbArea;
	}

	public void setStrNbArea(String strNbArea) {
		this.strNbArea = strNbArea;
	}

	public String getStrNmAreaUniversitaria() {
		return strNmAreaUniversitaria;
	}

	public void setStrNmAreaUniversitaria(String strNmAreaUniversitaria) {
		this.strNmAreaUniversitaria = strNmAreaUniversitaria;
	}

	public String getStrDsCampus() {
		return strDsCampus;
	}

	public void setStrDsCampus(String strDsCampus) {
		this.strDsCampus = strDsCampus;
	}

}
