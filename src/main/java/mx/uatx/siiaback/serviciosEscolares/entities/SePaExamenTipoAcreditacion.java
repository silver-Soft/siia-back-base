package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaExamenTipoAcreditacion implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8473803625934436557L;

	@Id
	@Column(name = "CLTIPOACREDITACION")
	private Integer intIdTipoAcreditacion;

	@Column(name = "DSTIPOACREDITACION")
	private String strDsTipoAcreditacion;

	public String getStrDsTipoAcreditacion() {
		return strDsTipoAcreditacion;
	}

	public void setStrDsTipoAcreditacion(String strDsTipoAcreditacion) {
		this.strDsTipoAcreditacion = strDsTipoAcreditacion;
	}

	public Integer getIntIdTipoAcreditacion() {
		return intIdTipoAcreditacion;
	}

	public void setIntIdTipoAcreditacion(Integer intIdTipoAcreditacion) {
		this.intIdTipoAcreditacion = intIdTipoAcreditacion;
	}

}
