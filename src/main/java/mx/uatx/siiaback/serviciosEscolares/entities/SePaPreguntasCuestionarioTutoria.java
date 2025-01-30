package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class SePaPreguntasCuestionarioTutoria implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1411406705250315551L;

	@EmbeddedId
	private SePaPreguntasCuestionarioTutoriaID id;

	@Column(name = "DSRESPUESTA")
	private String strDescripcionRespuesta;

	@Column(name = "IDRESPUESTACUESTIONARIO")
	private Long lngIdRespuestaCuestionario;

	@Column(name = "IDAXGRUPORESCONTEST")
	private Long lngIdRespuestaPregunta;

	public String getStrDescripcionRespuesta() {
		return strDescripcionRespuesta;
	}

	public void setStrDescripcionRespuesta(String strDescripcionRespuesta) {
		this.strDescripcionRespuesta = strDescripcionRespuesta;
	}

	public SePaPreguntasCuestionarioTutoriaID getId() {
		return id;
	}

	public void setId(SePaPreguntasCuestionarioTutoriaID id) {
		this.id = id;
	}

	public Long getLngIdRespuestaCuestionario() {
		return lngIdRespuestaCuestionario;
	}

	public void setLngIdRespuestaCuestionario(Long lngIdRespuestaCuestionario) {
		this.lngIdRespuestaCuestionario = lngIdRespuestaCuestionario;
	}

	public Long getLngIdRespuestaPregunta() {
		return lngIdRespuestaPregunta;
	}

	public void setLngIdRespuestaPregunta(Long lngIdRespuestaPregunta) {
		this.lngIdRespuestaPregunta = lngIdRespuestaPregunta;
	}

}
