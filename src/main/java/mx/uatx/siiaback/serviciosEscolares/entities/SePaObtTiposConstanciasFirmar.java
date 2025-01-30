package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtTiposConstanciasFirmar implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -184036910974705575L;
	@Id
	@Column(name="IDDOCUMENTO")
	private Integer intIdDocumento;
	
	@Column(name="NBDOCUMENTO")
	private String strNbDocumento;

	public Integer getIntIdDocumento() {
		return intIdDocumento;
	}

	public void setIntIdDocumento(Integer intIdDocumento) {
		this.intIdDocumento = intIdDocumento;
	}

	public String getStrNbDocumento() {
		return strNbDocumento;
	}

	public void setStrNbDocumento(String strNbDocumento) {
		this.strNbDocumento = strNbDocumento;
	}
	
	
}
