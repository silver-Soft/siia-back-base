package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtEstatusOfertas implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4307235378892878625L;

	@Id
	@Column(name = "CLESTATUSOFERTA")
	private String strClEstatus;

	@Column(name = "DSESTATUSOFERTA")
	private String strEstatus;

	public String getStrClEstatus() {
		return strClEstatus;
	}

	public void setStrClEstatus(String strClEstatus) {
		this.strClEstatus = strClEstatus;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

}
