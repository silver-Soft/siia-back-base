package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtTiposReportes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2191866471012123645L;

	@Id
	@Column(name = "ID")
	private Integer intId;

	@Column(name = "TIPO")
	private String strTipo;

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrTipo() {
		return strTipo;
	}

	public void setStrTipo(String strTipo) {
		this.strTipo = strTipo;
	}

}