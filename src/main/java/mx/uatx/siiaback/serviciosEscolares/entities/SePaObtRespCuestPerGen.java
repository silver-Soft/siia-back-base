package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtRespCuestPerGen implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1513580896602084478L;

	@Id
	@Column(name = "ID")
	private Long lngId;

	@Column(name = "DESCRIPCION")
	private String strDescripcion;

	@Column(name = "DSPREGUNTA")
	private String strPregunta;

	@Column(name = "DSRESPUESTATEXTO")
	private String strRespuestaTexto;

	public Long getLngId() {
		return lngId;
	}

	public void setLngId(Long lngId) {
		this.lngId = lngId;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}

	public String getStrPregunta() {
		return strPregunta;
	}

	public void setStrPregunta(String strPregunta) {
		this.strPregunta = strPregunta;
	}

	public String getStrRespuestaTexto() {
		return strRespuestaTexto;
	}

	public void setStrRespuestaTexto(String strRespuestaTexto) {
		this.strRespuestaTexto = strRespuestaTexto;
	}

}
