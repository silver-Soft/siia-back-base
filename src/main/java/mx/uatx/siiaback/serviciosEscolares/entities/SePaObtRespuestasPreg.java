package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtRespuestasPreg implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8105741398634140682L;

	@Id
	@Column(name = "IDRESPUESTA")
	private Integer intIdRespuesta;

	@Column(name = "DSRESPUESTA")
	private String strDsRespuesta;

	@Column(name = "RESPUESTAS")
	private Integer intRespuestas;

	public String getStrDsRespuesta() {
		return strDsRespuesta;
	}

	public void setStrDsRespuesta(String strDsRespuesta) {
		this.strDsRespuesta = strDsRespuesta;
	}

	public Integer getIntRespuestas() {
		return intRespuestas;
	}

	public void setIntRespuestas(Integer intRespuestas) {
		this.intRespuestas = intRespuestas;
	}

	public Integer getIntIdRespuesta() {
		return intIdRespuesta;
	}

	public void setIntIdRespuesta(Integer intIdRespuesta) {
		this.intIdRespuesta = intIdRespuesta;
	}

}