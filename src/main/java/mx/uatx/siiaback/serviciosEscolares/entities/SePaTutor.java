package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaTutor implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1571341316830866556L;

	@Id
	@Column(name = "CLPARENTEZCO")
	private Integer intIdParentezco;

	@Column(name = "DSPARENTEZCO")
	private String strDsParentezco;

	public SePaTutor() {
		super();
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
