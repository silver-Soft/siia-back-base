package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtEstatusPlan implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8305387623359579939L;

	@Id
	@Column(name="IDSTPLAN")
	private Integer intIdStPlan;
	
	@Column(name="DSSTPLAN")
	private String strDsStPlan;

	public Integer getIntIdStPlan() {
		return intIdStPlan;
	}

	public void setIntIdStPlan(Integer intIdStPlan) {
		this.intIdStPlan = intIdStPlan;
	}

	public String getStrDsStPlan() {
		return strDsStPlan;
	}

	public void setStrDsStPlan(String strDsStPlan) {
		this.strDsStPlan = strDsStPlan;
	}
	
	
}
