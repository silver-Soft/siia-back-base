package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtRezagoEducativo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6619559932565260834L;

	@Id
	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus;

	@Column(name = "DSNIVELEDUCATIVO")
	private String strDsNivelEducativo;

	@Column(name = "DSPROGRAMAEDUCATIVO")
	private String strDsProgramaEducativo;

	@Column(name = "DSCAMPUS")
	private String strDsCampus;

	@Column(name = "CUANTOS")
	private Integer intCuantos;

	@Column(name = "MUJERES")
	private Integer intMujeres;

	@Column(name = "HOMBRES")
	private Integer intHombres;

	@Column(name = "EGRESADOS")
	private Integer intEgresados;

	@Column(name = "MEGRESADAS")
	private Integer intMEgresadas;

	@Column(name = "HEGRESADOS")
	private Integer intHEgresados;

	@Column(name = "REZAGOEDUCATIVO")
	private Integer intRezagoEducativo;

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

	public Integer getIntCuantos() {
		return intCuantos;
	}

	public void setIntCuantos(Integer intCuantos) {
		this.intCuantos = intCuantos;
	}

	public Integer getIntMujeres() {
		return intMujeres;
	}

	public void setIntMujeres(Integer intMujeres) {
		this.intMujeres = intMujeres;
	}

	public Integer getIntHombres() {
		return intHombres;
	}

	public void setIntHombres(Integer intHombres) {
		this.intHombres = intHombres;
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

	public Integer getIntRezagoEducativo() {
		return intRezagoEducativo;
	}

	public void setIntRezagoEducativo(Integer intRezagoEducativo) {
		this.intRezagoEducativo = intRezagoEducativo;
	}

}