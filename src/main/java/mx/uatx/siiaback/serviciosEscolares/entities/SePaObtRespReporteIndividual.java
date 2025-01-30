package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtRespReporteIndividual {

	@Id
	@Column(name = "IDPREGUNTA")
	private Integer intIdPregunta;

	@Column(name = "IDSECCION")
	private Integer intIdSeccion;

	@Column(name = "DESCRIPCION")
	private String strDescripcion;

	@Column(name = "DSPREGUNTA")
	private String strDsPregunta;

	@Column(name = "IDRESPUESTA")
	private Integer intIdRespuesta;

	@Column(name = "DSRESPUESTA")
	private String strDsRespuesta;

	@Column(name = "CLTIPOPREGUNTA")
	private Integer intClTipoPregunta;

	@Column(name = "DSRESPUESTATEXTO")
	private String strDsRespuestaTexto;

	public Integer getIntIdSeccion() {
		return intIdSeccion;
	}

	public void setIntIdSeccion(Integer intIdSeccion) {
		this.intIdSeccion = intIdSeccion;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}

	public Integer getIntIdPregunta() {
		return intIdPregunta;
	}

	public void setIntIdPregunta(Integer intIdPregunta) {
		this.intIdPregunta = intIdPregunta;
	}

	public String getStrDsPregunta() {
		return strDsPregunta;
	}

	public void setStrDsPregunta(String strDsPregunta) {
		this.strDsPregunta = strDsPregunta;
	}

	public Integer getIntIdRespuesta() {
		return intIdRespuesta;
	}

	public void setIntIdRespuesta(Integer intIdRespuesta) {
		this.intIdRespuesta = intIdRespuesta;
	}

	public String getStrDsRespuesta() {
		return strDsRespuesta;
	}

	public void setStrDsRespuesta(String strDsRespuesta) {
		this.strDsRespuesta = strDsRespuesta;
	}

	public Integer getIntClTipoPregunta() {
		return intClTipoPregunta;
	}

	public void setIntClTipoPregunta(Integer intClTipoPregunta) {
		this.intClTipoPregunta = intClTipoPregunta;
	}

	public String getStrDsRespuestaTexto() {
		return strDsRespuestaTexto;
	}

	public void setStrDsRespuestaTexto(String strDsRespuestaTexto) {
		this.strDsRespuestaTexto = strDsRespuestaTexto;
	}

}