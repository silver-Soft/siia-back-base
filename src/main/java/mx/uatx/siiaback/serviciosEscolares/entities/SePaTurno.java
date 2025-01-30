package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaTurno implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5452918771675821149L;

	@Id
	@Column(name = "CLTURNOS")
	private String strIdTurno;

	@Column(name = "DSTURNOS")
	private String strDsTurno;

	public SePaTurno() {
		super();
	}

	public String getStrIdTurno() {
		return strIdTurno;
	}

	public void setStrIdTurno(String strIdTurno) {
		this.strIdTurno = strIdTurno;
	}

	public String getStrDsTurno() {
		return strDsTurno;
	}

	public void setStrDsTurno(String strDsTurno) {
		this.strDsTurno = strDsTurno;
	}

}
