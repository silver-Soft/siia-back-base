package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtEstatusAcreditado implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8400164910594456052L;

	@Id
	@Column(name = "CLESTATUSACREDITADO")
	private Integer intClEstatusAcreditado;
	
	@Column(name = "DSESTATUSACREDITADO")
	private String strDsEstatusAcreditado;

	public Integer getIntClEstatusAcreditado() {
		return intClEstatusAcreditado;
	}

	public void setIntClEstatusAcreditado(Integer intClEstatusAcreditado) {
		this.intClEstatusAcreditado = intClEstatusAcreditado;
	}

	public String getStrDsEstatusAcreditado() {
		return strDsEstatusAcreditado;
	}

	public void setStrDsEstatusAcreditado(String strDsEstatusAcreditado) {
		this.strDsEstatusAcreditado = strDsEstatusAcreditado;
	}
	
}
