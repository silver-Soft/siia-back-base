package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtAreasPorTipoCampus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7583337523952521472L;

	@Id
	@Column(name = "CLAREA")
	private Integer intClArea;

	@Column(name = "NBAREA")
	private String strNbArea;

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