package mx.uatx.siiaback.serviciosUniversitarios.dto;

import java.io.Serializable;

import mx.uatx.siiaback.serviciosUniversitarios.entities.SiPaEstatus;

public class EstatusTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5948517295468062818L;

	private Integer intIdEstatus;
	private String strDsEstatus;
	private String strDsBooleano;

	public EstatusTO() {
		super();
	}

	public EstatusTO(final SiPaEstatus estat) {
		super();
		intIdEstatus = estat.getIntIdEstatus();
		strDsEstatus = estat.getStrDsEstatus();
		strDsBooleano = estat.getStrDsBooleano();
	}

	public Integer getIntIdEstatus() {
		return intIdEstatus;
	}

	public void setIntIdEstatus(Integer intIdEstatus) {
		this.intIdEstatus = intIdEstatus;
	}

	public String getStrDsEstatus() {
		return strDsEstatus;
	}

	public void setStrDsEstatus(String strDsEstatus) {
		this.strDsEstatus = strDsEstatus;
	}

	public String getStrDsBooleano() {
		return strDsBooleano;
	}

	public void setStrDsBooleano(String strDsBooleano) {
		this.strDsBooleano = strDsBooleano;
	}

}
