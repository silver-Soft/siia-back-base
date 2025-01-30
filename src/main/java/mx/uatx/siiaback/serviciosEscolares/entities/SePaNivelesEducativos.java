package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaNivelesEducativos implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3922404919084439105L;

	@Id
	@Column(name = "CLNIVEL")
	private Integer intIdNivelEducativo;

	@Column(name = "NIVELEDUCATIVO")
	private String strNivelEducativo;

	public Integer getIntIdNivelEducativo() {
		return intIdNivelEducativo;
	}

	public void setIntIdNivelEducativo(Integer intIdNivelEducativo) {
		this.intIdNivelEducativo = intIdNivelEducativo;
	}

	public String getStrNivelEducativo() {
		return strNivelEducativo;
	}

	public void setStrNivelEducativo(String strNivelEducativo) {
		this.strNivelEducativo = strNivelEducativo;
	}

}
