package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtTiposPeriodosPlan implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4578159062652613721L;
	@Id
	@Column(name="CLTIPOPERIODO")
	private String strClTipoPeriodo;
	
	@Column(name="DSTIPOPERIODO")
	private String strDsTipoPeriodo;

	public String getStrClTipoPeriodo() {
		return strClTipoPeriodo;
	}

	public void setStrClTipoPeriodo(String strClTipoPeriodo) {
		this.strClTipoPeriodo = strClTipoPeriodo;
	}

	public String getStrDsTipoPeriodo() {
		return strDsTipoPeriodo;
	}

	public void setStrDsTipoPeriodo(String strDsTipoPeriodo) {
		this.strDsTipoPeriodo = strDsTipoPeriodo;
	}
	
	
}
