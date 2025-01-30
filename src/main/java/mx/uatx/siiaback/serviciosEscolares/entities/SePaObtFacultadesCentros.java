package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtFacultadesCentros implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5670682246662192786L;

	@Id
	@Column(name = "IDAREACAMPUS")
	private Integer intIdAreaCampus;
	
	@Column(name = "NBAREACAMPUS")
	private String strNbAreaCampus;

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
	}

	public String getStrNbAreaCampus() {
		return strNbAreaCampus;
	}

	public void setStrNbAreaCampus(String strNbAreaCampus) {
		this.strNbAreaCampus = strNbAreaCampus;
	}
	
}
