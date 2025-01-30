package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaEstatus implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4189632152384044646L;

	@Id
	@Column(name = "CLESTATUS")
	private Integer intIdEstatus;

	@Column(name = "DSESTATUS")
	private String strDsEstatus;

	@Column(name = "DSBOOLEANO")
	private String strDsBooleano;

	public SiPaEstatus() {
		super();
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
