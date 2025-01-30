package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaLenguaIndigena implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5253045597308950362L;

	@Id
	@Column(name = "IDLENGUAINDIGENA")
	private Integer intIdLenguaIndigena;

	@Column(name = "NBLENGUAINDIGENA")
	private String strNbLenguaIndigena;

	public SiPaLenguaIndigena() {
		super();
	}

	public Integer getIntIdLenguaIndigena() {
		return intIdLenguaIndigena;
	}

	public void setIntIdLenguaIndigena(Integer intIdLenguaIndigena) {
		this.intIdLenguaIndigena = intIdLenguaIndigena;
	}

	public String getStrNbLenguaIndigena() {
		return strNbLenguaIndigena;
	}

	public void setStrNbLenguaIndigena(String strNbLenguaIndigena) {
		this.strNbLenguaIndigena = strNbLenguaIndigena;
	}

}
