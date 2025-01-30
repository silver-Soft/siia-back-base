package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosGeneralesReporteTutorias {

	@Id
	@Column(name = "ID")
	private Long lngId;

	@Column(name = "PERIODO")
	private String strPeriodo;

	@Column(name = "PROGRAMACAMPUS")
	private String strProgramaCampus;

	@Column(name = "RESPONSABLE")
	private String strResponsable;
	
	@Column(name = "MATRICULATOTAL")
	private Integer intMatriculaTotal;

	public Long getLngId() {
		return lngId;
	}

	public void setLngId(Long lngId) {
		this.lngId = lngId;
	}

	public String getStrPeriodo() {
		return strPeriodo;
	}

	public void setStrPeriodo(String strPeriodo) {
		this.strPeriodo = strPeriodo;
	}

	public String getStrProgramaCampus() {
		return strProgramaCampus;
	}

	public void setStrProgramaCampus(String strProgramaCampus) {
		this.strProgramaCampus = strProgramaCampus;
	}

	public String getStrResponsable() {
		return strResponsable;
	}

	public void setStrResponsable(String strResponsable) {
		this.strResponsable = strResponsable;
	}

	public Integer getIntMatriculaTotal() {
		return intMatriculaTotal;
	}

	public void setIntMatriculaTotal(Integer intMatriculaTotal) {
		this.intMatriculaTotal = intMatriculaTotal;
	}
	
	

}
