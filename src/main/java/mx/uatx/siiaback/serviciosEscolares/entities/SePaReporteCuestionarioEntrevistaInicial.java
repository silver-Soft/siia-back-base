package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaReporteCuestionarioEntrevistaInicial implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 496184094500684373L;

	@Column(name = "DESCRIPCIONSECCION")
	private String strDescripcionSeccion;

	@Id
	@Column(name = "DSPREGUNTA")
	private String strDescripcionPregunta;
	
	@Column(name = "DSRESPUESTA")
	private String strDescripcionRespuesta;

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
