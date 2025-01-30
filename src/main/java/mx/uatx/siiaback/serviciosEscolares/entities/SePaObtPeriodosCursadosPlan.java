package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtPeriodosCursadosPlan implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6707150139696660363L;

	@Id
	@Column(name = "CLPERIODOCURSADO")
	private Long lngClPeriodoCursado;

	@Column(name = "DSPERIODOCURSADO")
	private String strPeriodoCursado;

	@Column(name = "ABREVIATURAPERIODOCURSADO")
	private String strAbreviaturaPeriodoCursado;

	public Long getLngClPeriodoCursado() {
		return lngClPeriodoCursado;
	}

	public void setLngClPeriodoCursado(Long lngClPeriodoCursado) {
		this.lngClPeriodoCursado = lngClPeriodoCursado;
	}

	public String getStrPeriodoCursado() {
		return strPeriodoCursado;
	}

	public void setStrPeriodoCursado(String strPeriodoCursado) {
		this.strPeriodoCursado = strPeriodoCursado;
	}

	public String getStrAbreviaturaPeriodoCursado() {
		return strAbreviaturaPeriodoCursado;
	}

	public void setStrAbreviaturaPeriodoCursado(String strAbreviaturaPeriodoCursado) {
		this.strAbreviaturaPeriodoCursado = strAbreviaturaPeriodoCursado;
	}

}
