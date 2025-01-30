package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaTipoDocencia implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6677144783485928430L;

	@Id
	@Column(name = "CLTIPODOCENCIA")
	private String clTipoDocencia;

	@Column(name = "DSTIPODOCENCIA")
	private String strTipoDocencia;

	public String getClTipoDocencia() {
		return clTipoDocencia;
	}

	public void setClTipoDocencia(String clTipoDocencia) {
		this.clTipoDocencia = clTipoDocencia;
	}

	public String getStrTipoDocencia() {
		return strTipoDocencia;
	}

	public void setStrTipoDocencia(String strTipoDocencia) {
		this.strTipoDocencia = strTipoDocencia;
	}

}
