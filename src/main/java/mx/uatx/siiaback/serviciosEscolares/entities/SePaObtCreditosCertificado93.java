package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtCreditosCertificado93 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 874681355015380322L;

	@Id
	@Column(name = "PROMEDIO")
	private Double dlPromedio;
	
	@Column(name = "PROMEDIO_LETRA")
	private String strPromedioLetra;
	
	@Column(name = "MAT_APROBADAS")
	private Integer intMatAprobadas;
	
	@Column(name = "MAT_LETRA")
	private String strMatLetra;
	
	@Column(name = "CREDITOS")
	private String strCreditos;
	
	@Column(name = "PLAN")
	private String strPlan;
	
	@Column(name = "PERIODO")
	private String strPeriodo;

	public Double getDlPromedio() {
		return dlPromedio;
	}

	public void setDlPromedio(Double dlPromedio) {
		this.dlPromedio = dlPromedio;
	}

	public String getStrPromedioLetra() {
		return strPromedioLetra;
	}

	public void setStrPromedioLetra(String strPromedioLetra) {
		this.strPromedioLetra = strPromedioLetra;
	}

	public Integer getIntMatAprobadas() {
		return intMatAprobadas;
	}

	public void setIntMatAprobadas(Integer intMatAprobadas) {
		this.intMatAprobadas = intMatAprobadas;
	}

	public String getStrMatLetra() {
		return strMatLetra;
	}

	public void setStrMatLetra(String strMatLetra) {
		this.strMatLetra = strMatLetra;
	}

	public String getStrCreditos() {
		return strCreditos;
	}

	public void setStrCreditos(String strCreditos) {
		this.strCreditos = strCreditos;
	}

	public String getStrPlan() {
		return strPlan;
	}

	public void setStrPlan(String strPlan) {
		this.strPlan = strPlan;
	}

	public String getStrPeriodo() {
		return strPeriodo;
	}

	public void setStrPeriodo(String strPeriodo) {
		this.strPeriodo = strPeriodo;
	}
	
}
