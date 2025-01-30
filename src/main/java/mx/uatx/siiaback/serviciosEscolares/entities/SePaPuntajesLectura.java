package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaPuntajesLectura implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6536018313019094473L;

	@Id
	@Column(name = "PUNTAJES")
	private String strPuntajes;

	public String getStrPuntajes() {
		return strPuntajes;
	}

	public void setStrPuntajes(String strPuntajes) {
		this.strPuntajes = strPuntajes;
	}

}
