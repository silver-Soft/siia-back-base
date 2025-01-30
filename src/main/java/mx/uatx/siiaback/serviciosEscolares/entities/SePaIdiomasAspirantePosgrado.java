package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaIdiomasAspirantePosgrado implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4476344406905933724L;

	@Id
	@Column(name = "ID_IDIOMA")
	private Integer intIdIdioma;

	@Column(name = "NOMBRE_IDIOMA")
	private String strNombreIdioma;

	public Integer getIntIdIdioma() {
		return intIdIdioma;
	}

	public void setIntIdIdioma(Integer intIdIdioma) {
		this.intIdIdioma = intIdIdioma;
	}

	public String getStrNombreIdioma() {
		return strNombreIdioma;
	}

	public void setStrNombreIdioma(String strNombreIdioma) {
		this.strNombreIdioma = strNombreIdioma;
	}

}
