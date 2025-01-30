package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaAreasConocimiento implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2176546293037776374L;
	
	@Id
	@Column(name = "AREAS")
	private String strArea;

	public String getStrArea() {
		return strArea;
	}

	public void setStrArea(String strArea) {
		this.strArea = strArea;
	}

}
