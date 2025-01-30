package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaAseguradoras implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2700243795204616968L;
	
	@Id
	@Column(name = "ASEGURADORAS")
	private String strAseguradora;

	public String getStrAseguradora() {
		return strAseguradora;
	}

	public void setStrAseguradora(String strAseguradora) {
		this.strAseguradora = strAseguradora;
	}

}
