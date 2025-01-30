package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtTipoBaja implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7213291813949918024L;
	@Id
	@Column(name = "CLTIPOBAJA")
	private String strClTipoBaja;
	
	@Column(name = "DSTIPOBAJA")
	private String strDsTipoBaja;
	
	public SePaObtTipoBaja() {
		super();
	}

	public String getStrClTipoBaja() {
		return strClTipoBaja;
	}

	public void setStrClTipoBaja(String strClTipoBaja) {
		this.strClTipoBaja = strClTipoBaja;
	}

	public String getStrDsTipoBaja() {
		return strDsTipoBaja;
	}

	public void setStrDsTipoBaja(String strDsTipoBaja) {
		this.strDsTipoBaja = strDsTipoBaja;
	}
	
	
}
