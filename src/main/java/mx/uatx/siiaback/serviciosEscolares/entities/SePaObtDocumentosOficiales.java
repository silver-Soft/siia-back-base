package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDocumentosOficiales implements Serializable {

	/**
	 * serialVersionUID	
	 */
	private static final long serialVersionUID = 4118872676927715291L;

	@Id
	@Column(name = "IDDOCUMENTO")
	private Integer intIdDocumento;

	@Column(name = "NBDOCUMENTO")
	private String strNombreDocumento;

	public Integer getIntIdDocumento() {
		return intIdDocumento;
	}

	public void setIntIdDocumento(Integer intIdDocumento) {
		this.intIdDocumento = intIdDocumento;
	}

	public String getStrNombreDocumento() {
		return strNombreDocumento;
	}

	public void setStrNombreDocumento(String strNombreDocumento) {
		this.strNombreDocumento = strNombreDocumento;
	}

}
