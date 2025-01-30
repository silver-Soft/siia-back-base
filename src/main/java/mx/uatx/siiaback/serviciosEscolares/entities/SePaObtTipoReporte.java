package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtTipoReporte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3631353655179868942L;

	@Id
	@Column(name = "ID")
	private Integer intId;

	@Column(name = "DSRESPUESTA")
	private String strDsRespuesta;

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrDsRespuesta() {
		return strDsRespuesta;
	}

	public void setStrDsRespuesta(String strDsRespuesta) {
		this.strDsRespuesta = strDsRespuesta;
	}

}