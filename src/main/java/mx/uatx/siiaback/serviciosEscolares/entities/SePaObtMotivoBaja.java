package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtMotivoBaja implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -257989696454035376L;
	@Id
	@Column(name = "CLMOTIVOBAJA")
	private Integer intClMotivoBaja;
	
	@Column(name = "DSMOTIVOBAJA")
	private String strDsMotivoBaja;
	
	public SePaObtMotivoBaja() {
		super();
	}

	
	public String getStrDsMotivoBaja() {
		return strDsMotivoBaja;
	}

	public void setStrDsMotivoBaja(String strDsMotivoBaja) {
		this.strDsMotivoBaja = strDsMotivoBaja;
	}


	public Integer getIntClMotivoBaja() {
		return intClMotivoBaja;
	}


	public void setIntClMotivoBaja(Integer intClMotivoBaja) {
		this.intClMotivoBaja = intClMotivoBaja;
	}
	

}
