package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaDiscapacidad implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6139251087264005080L;

	@Id
	@Column(name = "IDTIPODISCAPACIDAD")
	private Integer intIdTipoDiscapacidad;

	@Column(name = "NBDISCAPACIDAD")
	private String strNbDiscapacidad;

	public SiPaDiscapacidad() {
		super();
	}

	public Integer getIntIdTipoDiscapacidad() {
		return intIdTipoDiscapacidad;
	}

	public void setIntIdTipoDiscapacidad(Integer intIdTipoDiscapacidad) {
		this.intIdTipoDiscapacidad = intIdTipoDiscapacidad;
	}

	public String getStrNbDiscapacidad() {
		return strNbDiscapacidad;
	}

	public void setStrNbDiscapacidad(String strNbDiscapacidad) {
		this.strNbDiscapacidad = strNbDiscapacidad;
	}

}
