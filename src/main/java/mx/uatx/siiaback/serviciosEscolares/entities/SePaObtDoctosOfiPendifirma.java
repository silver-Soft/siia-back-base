package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDoctosOfiPendifirma implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3433618046121168089L;

	@Id
	@Column(name = "ID")
	private Integer intIdEstatusDocumento;

	@Column(name = "ESTATUS")
	private String strNombreDocumento;

	public Integer getIntIdEstatusDocumento() {
		return intIdEstatusDocumento;
	}

	public void setIntIdEstatusDocumento(Integer intIdEstatusDocumento) {
		this.intIdEstatusDocumento = intIdEstatusDocumento;
	}

	public String getStrNombreDocumento() {
		return strNombreDocumento;
	}

	public void setStrNombreDocumento(String strNombreDocumento) {
		this.strNombreDocumento = strNombreDocumento;
	}

}
