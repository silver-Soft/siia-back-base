package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaRegimenEscuelas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6819222761140463854L;
	
	@Id
	@Column(name = "CLREGIMEN")
	private Integer intClRegimen;

	@Column(name = "DSREGIMEN")
	private String strDsRegimen;

	public Integer getIntClRegimen() {
		return intClRegimen;
	}

	public void setIntClRegimen(Integer intClRegimen) {
		this.intClRegimen = intClRegimen;
	}

	public String getStrDsRegimen() {
		return strDsRegimen;
	}

	public void setStrDsRegimen(String strDsRegimen) {
		this.strDsRegimen = strDsRegimen;
	}
	
	
}
