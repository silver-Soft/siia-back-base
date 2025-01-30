package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;

import mx.uatx.siiaback.serviciosEscolares.entities.SePaReporteCuestionarioEntrevistaInicial;

public class ReporteCuestionarioEntrevistaInicialTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2484173533394461561L;

	private String strDescripcionSeccion;
	private String strDescripcionPregunta;
	private String strDescripcionRespuesta;

	public ReporteCuestionarioEntrevistaInicialTO(final SePaReporteCuestionarioEntrevistaInicial entidad) {
		BeanUtils.copyProperties(entidad, this);
	}

	public String getStrDescripcionSeccion() {
		return strDescripcionSeccion;
	}

	public void setStrDescripcionSeccion(String strDescripcionSeccion) {
		this.strDescripcionSeccion = strDescripcionSeccion;
	}

	public String getStrDescripcionPregunta() {
		return strDescripcionPregunta;
	}

	public void setStrDescripcionPregunta(String strDescripcionPregunta) {
		this.strDescripcionPregunta = strDescripcionPregunta;
	}

	public String getStrDescripcionRespuesta() {
		return strDescripcionRespuesta;
	}

	public void setStrDescripcionRespuesta(String strDescripcionRespuesta) {
		this.strDescripcionRespuesta = strDescripcionRespuesta;
	}
}