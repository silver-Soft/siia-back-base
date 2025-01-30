package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtTiposAreas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7771991917682709429L;

	@Id
	@Column(name = "IDTIPOAREA")
	private Integer intIdTipoArea;

	@Column(name = "DSTIPOAREA")
	private String strDsTipoArea;

	public Integer getIntIdTipoArea() {
		return intIdTipoArea;
	}

	public void setIntIdTipoArea(Integer intIdTipoArea) {
		this.intIdTipoArea = intIdTipoArea;
	}

	public String getStrDsTipoArea() {
		return strDsTipoArea;
	}

	public void setStrDsTipoArea(String strDsTipoArea) {
		this.strDsTipoArea = strDsTipoArea;
	}

}