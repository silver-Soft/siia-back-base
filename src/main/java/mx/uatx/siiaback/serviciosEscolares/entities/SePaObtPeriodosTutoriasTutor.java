package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtPeriodosTutoriasTutor implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 623651679765382819L;

	@Id
	@Column(name = "IDPERIODO")
	private String strIdPeriodo;

	@Column(name = "DSPERIODOTEMPORADA")
	private String strPeriodo;

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public String getStrPeriodo() {
		return strPeriodo;
	}

	public void setStrPeriodo(String strPeriodo) {
		this.strPeriodo = strPeriodo;
	}

}
