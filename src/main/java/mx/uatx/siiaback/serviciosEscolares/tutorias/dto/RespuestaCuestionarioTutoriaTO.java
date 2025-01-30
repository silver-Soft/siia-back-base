package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.io.Serializable;

import mx.uatx.siiaback.serviciosEscolares.entities.SePaPreguntasCuestionarioTutoria;

public class RespuestaCuestionarioTutoriaTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4804304624393135241L;

	private Long lngIdRespuesta;
	private Long lngIdAxGrupoRespuesta;
	private String strDescripcionRespuesta;

	public RespuestaCuestionarioTutoriaTO(final SePaPreguntasCuestionarioTutoria entidad) {
		super();
		this.lngIdRespuesta = entidad.getId().getLngIdRespuesta();
		this.lngIdAxGrupoRespuesta = entidad.getId().getLngIdAxGrupoRespuesta();
		this.strDescripcionRespuesta = entidad.getStrDescripcionRespuesta();
	}

	public Long getLngIdAxGrupoRespuesta() {
		return lngIdAxGrupoRespuesta;
	}

	public void setLngIdAxGrupoRespuesta(Long lngIdAxGrupoRespuesta) {
		this.lngIdAxGrupoRespuesta = lngIdAxGrupoRespuesta;
	}

	public Long getLngIdRespuesta() {
		return lngIdRespuesta;
	}

	public void setLngIdRespuesta(Long lngIdRespuesta) {
		this.lngIdRespuesta = lngIdRespuesta;
	}

	public String getStrDescripcionRespuesta() {
		return strDescripcionRespuesta;
	}

	public void setStrDescripcionRespuesta(String strDescripcionRespuesta) {
		this.strDescripcionRespuesta = strDescripcionRespuesta;
	}

}