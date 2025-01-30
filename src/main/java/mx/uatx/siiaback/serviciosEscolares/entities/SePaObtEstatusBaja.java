package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtEstatusBaja implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2045133660270598074L;
	@Id
	@Column(name = "CLESTATUSBAJA")
	private String strClEstatusBaja;
	
	@Column(name = "DSESTATUSBAJA")
	private String strDsEstatusBaja;
	
	public SePaObtEstatusBaja() {
		super();
	}

	public String getStrClEstatusBaja() {
		return strClEstatusBaja;
	}

	public void setStrClEstatusBaja(String strClEstatusBaja) {
		this.strClEstatusBaja = strClEstatusBaja;
	}

	public String getStrDsEstatusBaja() {
		return strDsEstatusBaja;
	}

	public void setStrDsEstatusBaja(String strDsEstatusBaja) {
		this.strDsEstatusBaja = strDsEstatusBaja;
	}
	
}
