package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtPeriodosCursadosMateria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2221993135016347114L;
	@Id
	@Column(name="CLPERIODOCURSADO")
	private Integer intClPeriodoCursado;
	
	@Column(name="DSPERIODOCURSADO")
	private String strDsPeriodoCursado;

	public Integer getIntClPeriodoCursado() {
		return intClPeriodoCursado;
	}

	public void setIntClPeriodoCursado(Integer intClPeriodoCursado) {
		this.intClPeriodoCursado = intClPeriodoCursado;
	}

	public String getStrDsPeriodoCursado() {
		return strDsPeriodoCursado;
	}

	public void setStrDsPeriodoCursado(String strDsPeriodoCursado) {
		this.strDsPeriodoCursado = strDsPeriodoCursado;
	}
	
	
}
