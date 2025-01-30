package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtModelosPlan implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8890577716336255950L;
	@Id
	@Column(name="IDMODELO")
	private Integer intIdModelo;
	
	@Column(name="DSMODELO")
	private String strDsModelo;

	public Integer getIntIdModelo() {
		return intIdModelo;
	}

	public void setIntIdModelo(Integer intIdModelo) {
		this.intIdModelo = intIdModelo;
	}

	public String getStrDsModelo() {
		return strDsModelo;
	}

	public void setStrDsModelo(String strDsModelo) {
		this.strDsModelo = strDsModelo;
	}
	
	
}
