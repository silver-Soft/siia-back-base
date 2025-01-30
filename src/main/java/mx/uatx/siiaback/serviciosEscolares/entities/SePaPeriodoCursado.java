package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaPeriodoCursado implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3966764011014475874L;

	@Id
	@Column(name = "CLPERIODOCURSADO")
	private Integer intIdPeriodoCursado;

	@Column(name = "DSPERIODOCURSADO")
	private String strDsPeriodoCursado;

	@Column(name = "ABREVIATURAPERIODOCURSADO")
	private String strAbrevPeriodoCursado;

	public SePaPeriodoCursado() {
		super();
	}

	public Integer getIntIdPeriodoCursado() {
		return intIdPeriodoCursado;
	}

	public void setIntIdPeriodoCursado(Integer intIdPeriodoCursado) {
		this.intIdPeriodoCursado = intIdPeriodoCursado;
	}

	public String getStrDsPeriodoCursado() {
		return strDsPeriodoCursado;
	}

	public void setStrDsPeriodoCursado(String strDsPeriodoCursado) {
		this.strDsPeriodoCursado = strDsPeriodoCursado;
	}

	public String getStrAbrevPeriodoCursado() {
		return strAbrevPeriodoCursado;
	}

	public void setStrAbrevPeriodoCursado(String strAbrevPeriodoCursado) {
		this.strAbrevPeriodoCursado = strAbrevPeriodoCursado;
	}

}
