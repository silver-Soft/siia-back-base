package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaEstadoCivil implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2257282870203658439L;

	@Id
	@Column(name = "CLESTADOCIVIL")
	private Integer intIdEstadoCivil;

	@Column(name = "DSESTADOCIVIL")
	private String strDsEstadoCivil;

	public SiPaEstadoCivil() {
		super();
	}

	public Integer getIntIdEstadoCivil() {
		return intIdEstadoCivil;
	}

	public void setIntIdEstadoCivil(Integer intIdEstadoCivil) {
		this.intIdEstadoCivil = intIdEstadoCivil;
	}

	public String getStrDsEstadoCivil() {
		return strDsEstadoCivil;
	}

	public void setStrDsEstadoCivil(String strDsEstadoCivil) {
		this.strDsEstadoCivil = strDsEstadoCivil;
	}

}
