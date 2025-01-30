package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaAreas implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1571341316830866556L;

	@Id
	@Column(name = "CLAREA")
	private Integer intClArea;

	@Column(name = "NBAREA")
	private String strNbArea;

	public SePaAreas() {
		super();
	}

	public Integer getIntClArea() {
		return intClArea;
	}

	public void setIntClArea(Integer intClArea) {
		this.intClArea = intClArea;
	}

	public String getStrNbArea() {
		return strNbArea;
	}

	public void setStrNbArea(String strNbArea) {
		this.strNbArea = strNbArea;
	}

	

}
