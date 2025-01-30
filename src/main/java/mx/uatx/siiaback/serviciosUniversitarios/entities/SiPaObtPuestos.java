package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtPuestos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3552426926328839658L;

	@Id
	@Column(name = "IDPUESTO")
	private Integer intIdPuesto;

	@Column(name = "NBPUESTO")
	private String strNbPuesto;

	public Integer getIntIdPuesto() {
		return intIdPuesto;
	}

	public void setIntIdPuesto(Integer intIdPuesto) {
		this.intIdPuesto = intIdPuesto;
	}

	public String getStrNbPuesto() {
		return strNbPuesto;
	}

	public void setStrNbPuesto(String strNbPuesto) {
		this.strNbPuesto = strNbPuesto;
	}

}