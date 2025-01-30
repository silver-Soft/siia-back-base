package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaPeriodosReinscripcion implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7296260263289865127L;

	@Id
	@Column(name = "IDPERIODO")
	private String strIdPeriodo;

	@Column(name = "DSPERIODOTEMPORADA")
	private String strDsPeriodoTemporada;

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public String getStrDsPeriodoTemporada() {
		return strDsPeriodoTemporada;
	}

	public void setStrDsPeriodoTemporada(String strDsPeriodoTemporada) {
		this.strDsPeriodoTemporada = strDsPeriodoTemporada;
	}

}
