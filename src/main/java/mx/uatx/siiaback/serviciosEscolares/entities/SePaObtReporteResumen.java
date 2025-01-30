package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtReporteResumen implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1536439978772219709L;
	@Id
	@Column(name="ID")
	private Integer intId;
	
	@Column(name="DSNIVELEDUCATIVO")
	private String strDsNivelEducativo;
	
	@Column(name="DSPROGRAMAEDUCATIVO")
	private String strDsProgramaEducativo;
	
	@Column(name="DSCAMPUS")
	private String strDsCampus;
	
	@Column(name="TOTAL")
	private Integer intTotal;
	
	@Column(name="HOMBRES_ACEPTADOS")
	private Integer intH;
	
	@Column(name="MUJERES_ACEPTADAS")
	private Integer intM;
	
	@Column(name="TOTAL_NOACEPTADOS")
	private Integer intSinValidar;
	
	@Column(name="HOMBRES_NOACEPTADOS")
	private Integer intHSinValidar;
	
	@Column(name="MUJERES_NOACEPTADAS")
	private Integer intMSinValidar;
	
	@Column(name="TOTAL_MATRICULADOS")
	private Integer intMatriculados;
	
	@Column(name="TOTALASPACEPTADOS")
	private Integer intAspAceptados;

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrDsNivelEducativo() {
		return strDsNivelEducativo;
	}

	public void setStrDsNivelEducativo(String strDsNivelEducativo) {
		this.strDsNivelEducativo = strDsNivelEducativo;
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

	public Integer getIntTotal() {
		return intTotal;
	}

	public void setIntTotal(Integer intTotal) {
		this.intTotal = intTotal;
	}

	public Integer getIntH() {
		return intH;
	}

	public void setIntH(Integer intH) {
		this.intH = intH;
	}

	public Integer getIntM() {
		return intM;
	}

	public void setIntM(Integer intM) {
		this.intM = intM;
	}

	public Integer getIntSinValidar() {
		return intSinValidar;
	}

	public void setIntSinValidar(Integer intSinValidar) {
		this.intSinValidar = intSinValidar;
	}

	public Integer getIntHSinValidar() {
		return intHSinValidar;
	}

	public void setIntHSinValidar(Integer intHSinValidar) {
		this.intHSinValidar = intHSinValidar;
	}

	public Integer getIntMSinValidar() {
		return intMSinValidar;
	}

	public void setIntMSinValidar(Integer intMSinValidar) {
		this.intMSinValidar = intMSinValidar;
	}

	public Integer getIntMatriculados() {
		return intMatriculados;
	}

	public void setIntMatriculados(Integer intMatriculados) {
		this.intMatriculados = intMatriculados;
	}

	public Integer getIntAspAceptados() {
		return intAspAceptados;
	}

	public void setIntAspAceptados(Integer intAspAceptados) {
		this.intAspAceptados = intAspAceptados;
	}
	
	
}
