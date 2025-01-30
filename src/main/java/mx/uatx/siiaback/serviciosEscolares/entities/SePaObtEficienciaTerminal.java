package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtEficienciaTerminal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7842022484378812475L;

	@Id
	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus;

	@Column(name = "DSNIVELEDUCATIVO")
	private String strDsNivelEducativo;

	@Column(name = "DSPROGRAMAEDUCATIVO")
	private String strDsProgramaEducativo;

	@Column(name = "DSCAMPUS")
	private String strDsCampus;

	@Column(name = "TOTALCOHORTE")
	private Integer intTotalCohorte;

	@Column(name = "MCOHORTE")
	private Integer intMCohorte;

	@Column(name = "HCOHORTE")
	private Integer intHCohorte;

	@Column(name = "EGRESADOS")
	private Integer intEgresados;

	@Column(name = "MEGRESADAS")
	private Integer intMEgresadas;

	@Column(name = "HEGRESADOS")
	private Integer intHEgresados;

	@Column(name = "EFICIENCIAEGRESO")
	private Integer intEficienciaEgreso;

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
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

	public Integer getIntTotalCohorte() {
		return intTotalCohorte;
	}

	public void setIntTotalCohorte(Integer intTotalCohorte) {
		this.intTotalCohorte = intTotalCohorte;
	}

	public Integer getIntMCohorte() {
		return intMCohorte;
	}

	public void setIntMCohorte(Integer intMCohorte) {
		this.intMCohorte = intMCohorte;
	}

	public Integer getIntHCohorte() {
		return intHCohorte;
	}

	public void setIntHCohorte(Integer intHCohorte) {
		this.intHCohorte = intHCohorte;
	}

	public Integer getIntEgresados() {
		return intEgresados;
	}

	public void setIntEgresados(Integer intEgresados) {
		this.intEgresados = intEgresados;
	}

	public Integer getIntMEgresadas() {
		return intMEgresadas;
	}

	public void setIntMEgresadas(Integer intMEgresadas) {
		this.intMEgresadas = intMEgresadas;
	}

	public Integer getIntHEgresados() {
		return intHEgresados;
	}

	public void setIntHEgresados(Integer intHEgresados) {
		this.intHEgresados = intHEgresados;
	}

	public Integer getIntEficienciaEgreso() {
		return intEficienciaEgreso;
	}

	public void setIntEficienciaEgreso(Integer intEficienciaEgreso) {
		this.intEficienciaEgreso = intEficienciaEgreso;
	}

}