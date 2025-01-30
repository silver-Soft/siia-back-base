package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtAccesosFisicos {

	@Id
	@Column(name = "IDACCESOFISICOAREA")
	private Integer intIdAccesoFisicoArea;

	@Column(name = "DSACCESOFISICOAREA")
	private String strDsAccesoFisicoArea;

	public Integer getIntIdAccesoFisicoArea() {
		return intIdAccesoFisicoArea;
	}

	public void setIntIdAccesoFisicoArea(Integer intIdAccesoFisicoArea) {
		this.intIdAccesoFisicoArea = intIdAccesoFisicoArea;
	}

	public String getStrDsAccesoFisicoArea() {
		return strDsAccesoFisicoArea;
	}

	public void setStrDsAccesoFisicoArea(String strDsAccesoFisicoArea) {
		this.strDsAccesoFisicoArea = strDsAccesoFisicoArea;
	}

}