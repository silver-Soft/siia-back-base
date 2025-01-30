package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaCumplimientoTutoriasGeneral {
	
	
	@Id
	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intId;
	
	@Column(name = "PROGRAMACAMPUS")
	private String strProgramaCampus;
	
	@Column(name = "TUTORADOS")
	private Integer intNoTutorado;

	@Column(name = "REQUERIDAS")
	private Integer intTotalTutorias;

	@Column(name = "REGISTRADAS")
	private Integer intRegistradas;

	@Column(name = "FIRMADAS")
	private Integer intFirmadas;
	
	@Column(name = "PORCENTAJE_FIRMADAS")
	private String strPrctCumplimiento;

	@Column(name = "PORCENTAJE_REGISTRADAS")
	private String strPrctregistrado;
	
	@Column(name = "PRCTFIRMADAS")
	private Integer intPrctCumplimiento;

	@Column(name = "PRCTREGISTRADAS")
	private Integer intPrctRegistrado;

	
	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrProgramaCampus() {
		return strProgramaCampus;
	}

	public void setStrProgramaCampus(String strProgramaCampus) {
		this.strProgramaCampus = strProgramaCampus;
	}

	public Integer getIntNoTutorado() {
		return intNoTutorado;
	}

	public void setIntNoTutorado(Integer intNoTutorado) {
		this.intNoTutorado = intNoTutorado;
	}

	public Integer getIntTotalTutorias() {
		return intTotalTutorias;
	}

	public void setIntTotalTutorias(Integer intTotalTutorias) {
		this.intTotalTutorias = intTotalTutorias;
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

	
	

}
