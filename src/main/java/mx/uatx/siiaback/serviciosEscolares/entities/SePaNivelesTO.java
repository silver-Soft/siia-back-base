package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaNivelesTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5385371816300055498L;

	@Id
	@Column(name = "NIVELES")
	private String strNivel;

	public String getStrNivel() {
		return strNivel;
	}

	public void setStrNivel(String strNivel) {
		this.strNivel = strNivel;
	}

}
