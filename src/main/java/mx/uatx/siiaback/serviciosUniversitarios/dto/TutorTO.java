package mx.uatx.siiaback.serviciosUniversitarios.dto;

import java.io.Serializable;

import mx.uatx.siiaback.serviciosEscolares.entities.SePaTutor;

public class TutorTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7628974094523848982L;

	private Integer intIdParentezco;
	private String strDsParentezco;

	public TutorTO() {
		super();
	}

	public TutorTO(final SePaTutor pa) {
		super();
		intIdParentezco = pa.getIntIdParentezco();
		strDsParentezco = pa.getStrDsParentezco();
	}

	public Integer getIntIdParentezco() {
		return intIdParentezco;
	}

	public void setIntIdParentezco(Integer intIdParentezco) {
		this.intIdParentezco = intIdParentezco;
	}

	public String getStrDsParentezco() {
		return strDsParentezco;
	}

	public void setStrDsParentezco(String strDsParentezco) {
		this.strDsParentezco = strDsParentezco;
	}

}
