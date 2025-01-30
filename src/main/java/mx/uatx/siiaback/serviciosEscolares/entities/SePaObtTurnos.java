package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtTurnos implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6677144783485928430L;

	@Id
	@Column(name = "CLTURNOS")
	private String strClTurno;

	@Column(name = "DSTURNOS")
	private String strTurno;

	public String getStrClTurno() {
		return strClTurno;
	}

	public void setStrClTurno(String strClTurno) {
		this.strClTurno = strClTurno;
	}

	public String getStrTurno() {
		return strTurno;
	}

	public void setStrTurno(String strTurno) {
		this.strTurno = strTurno;
	}

}
