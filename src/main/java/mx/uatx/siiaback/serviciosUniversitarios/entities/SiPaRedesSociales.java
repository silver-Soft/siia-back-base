package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaRedesSociales implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5019000655170880229L;
	
	@Id
	@Column(name = "REDSOCIAL")
	private String strRedSocial;

	public SiPaRedesSociales() {
		super();
	}

	public String getStrRedSocial() {
		return strRedSocial;
	}

	public void setStrRedSocial(String strRedSocial) {
		this.strRedSocial = strRedSocial;
	}

}
