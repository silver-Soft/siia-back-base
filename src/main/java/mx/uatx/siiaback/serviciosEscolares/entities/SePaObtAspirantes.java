package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtAspirantes {
	@Id
	@Column(name = "ID")
	private Integer intId;

	@Column(name = "CONCEPTO")
	private String strConcepto;

	@Column(name = "HOMBRES")
	private Integer intHombres;

	@Column(name = "MUJERES")
	private Integer intMujeres;

	@Column(name = "TOTAL")
	private Integer intTotal;

	public Integer getIntHombres() {
		return intHombres;
	}

	public void setIntHombres(Integer intHombres) {
		this.intHombres = intHombres;
	}

	public Integer getIntMujeres() {
		return intMujeres;
	}

	public void setIntMujeres(Integer intMujeres) {
		this.intMujeres = intMujeres;
	}

	public Integer getIntTotal() {
		return intTotal;
	}

	public void setIntTotal(Integer intTotal) {
		this.intTotal = intTotal;
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrConcepto() {
		return strConcepto;
	}

	public void setStrConcepto(String strConcepto) {
		this.strConcepto = strConcepto;
	}

}