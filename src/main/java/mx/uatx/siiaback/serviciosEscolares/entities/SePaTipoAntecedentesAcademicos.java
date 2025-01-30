package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaTipoAntecedentesAcademicos implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1447107155830021797L;
	
	@Id
	@Column(name = "TIPOANTECEDENTE")
	private String strTipoAntecedente;

	public String getStrTipoAntecedente() {
		return strTipoAntecedente;
	}

	public void setStrTipoAntecedente(String strTipoAntecedente) {
		this.strTipoAntecedente = strTipoAntecedente;
	}

}
