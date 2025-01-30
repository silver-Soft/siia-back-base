package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaTipoSeguroTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8054288671423436743L;
	
	@Id
	@Column(name = "TIPOSEGURO")
	private String strTipoSeguro;

	public String getStrTipoSeguro() {
		return strTipoSeguro;
	}

	public void setStrTipoSeguro(String strTipoSeguro) {
		this.strTipoSeguro = strTipoSeguro;
	}

}
