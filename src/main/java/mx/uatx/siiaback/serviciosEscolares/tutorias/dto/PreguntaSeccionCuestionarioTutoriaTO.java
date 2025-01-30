package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;

import mx.uatx.siiaback.serviciosEscolares.entities.SeMsRespuestasCuestionarios;
import mx.uatx.siiaback.serviciosEscolares.entities.SePaPreguntasCuestionarioTutoria;

public class PreguntaSeccionCuestionarioTutoriaTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4371030249629435192L;

	private Long lngIdRespuestaCuestionario;
	private Long lngIdSeccionPregunta;
	private String strDescripcionSeccion;
	private Long lngIdPregunta;
	private Integer intCveTipoPregunta;
	private String strDescripcionPregunta;
	private Long lngIdRespuestaPregunta;
	private Integer intCveEstatus;
	private Integer intOrdenPregunta;

	private Map<Long, RespuestaCuestionarioTutoriaTO> hasRespuestas;
	private List<RespuestaCuestionarioTutoriaTO> lstRespuestas;

	public PreguntaSeccionCuestionarioTutoriaTO(final SePaPreguntasCuestionarioTutoria it) {
		super();
		BeanUtils.copyProperties(it.getId(), this);
		this.lngIdRespuestaCuestionario = it.getLngIdRespuestaCuestionario();
		this.lngIdRespuestaPregunta = it.getLngIdRespuestaPregunta();		
		hasRespuestas = new LinkedHashMap<Long, RespuestaCuestionarioTutoriaTO>();
	}

	public void cambiarMapAlist() {
		if (hasRespuestas != null) {
			lstRespuestas = new ArrayList<RespuestaCuestionarioTutoriaTO>(hasRespuestas.values());
			hasRespuestas = null;
		}
	}
	
	public SeMsRespuestasCuestionarios obtenerEntidad(final CuestionarioTutoriaTO cuestionario) {
		final SeMsRespuestasCuestionarios entidad = new SeMsRespuestasCuestionarios();
		entidad.setFcAudit(new Date());
		entidad.setLngIdCuestionarioPersona(cuestionario.getLngIdCuestionarioPersona());
		entidad.setLngIdRespuestaCuestionario(lngIdRespuestaCuestionario);
		entidad.setLngIdSeccionPregunta(lngIdSeccionPregunta);
		entidad.setLngIdRespuestaPregunta(lngIdRespuestaPregunta);
		entidad.setStrUsuarioAudit(cuestionario.getStrUsuarioLog());	
		
		return entidad;
	}

	public Long getLngIdSeccionPregunta() {
		return lngIdSeccionPregunta;
	}

	public void setLngIdSeccionPregunta(Long lngIdSeccionPregunta) {
		this.lngIdSeccionPregunta = lngIdSeccionPregunta;
	}

	public String getStrDescripcionSeccion() {
		return strDescripcionSeccion;
	}

	public void setStrDescripcionSeccion(String strDescripcionSeccion) {
		this.strDescripcionSeccion = strDescripcionSeccion;
	}

	public Long getLngIdPregunta() {
		return lngIdPregunta;
	}

	public void setLngIdPregunta(Long lngIdPregunta) {
		this.lngIdPregunta = lngIdPregunta;
	}

	public Integer getIntCveTipoPregunta() {
		return intCveTipoPregunta;
	}

	public void setIntCveTipoPregunta(Integer intCveTipoPregunta) {
		this.intCveTipoPregunta = intCveTipoPregunta;
	}

	public String getStrDescripcionPregunta() {
		return strDescripcionPregunta;
	}

	public void setStrDescripcionPregunta(String strDescripcionPregunta) {
		this.strDescripcionPregunta = strDescripcionPregunta;
	}

	public Integer getIntCveEstatus() {
		return intCveEstatus;
	}

	public void setIntCveEstatus(Integer intCveEstatus) {
		this.intCveEstatus = intCveEstatus;
	}

	public Integer getIntOrdenPregunta() {
		return intOrdenPregunta;
	}

	public void setIntOrdenPregunta(Integer intOrdenPregunta) {
		this.intOrdenPregunta = intOrdenPregunta;
	}

	public Map<Long, RespuestaCuestionarioTutoriaTO> getHasRespuestas() {
		return hasRespuestas;
	}

	public void setHasRespuestas(Map<Long, RespuestaCuestionarioTutoriaTO> hasRespuestas) {
		this.hasRespuestas = hasRespuestas;
	}

	public Long getLngIdRespuestaPregunta() {
		return lngIdRespuestaPregunta;
	}

	public void setLngIdRespuestaPregunta(Long lngIdRespuestaPregunta) {
		this.lngIdRespuestaPregunta = lngIdRespuestaPregunta;
	}

	public List<RespuestaCuestionarioTutoriaTO> getLstRespuestas() {
		return lstRespuestas;
	}

	public void setLstRespuestas(List<RespuestaCuestionarioTutoriaTO> lstRespuestas) {
		this.lstRespuestas = lstRespuestas;
	}

	public Long getLngIdRespuestaCuestionario() {
		return lngIdRespuestaCuestionario;
	}

	public void setLngIdRespuestaCuestionario(Long lngIdRespuestaCuestionario) {
		this.lngIdRespuestaCuestionario = lngIdRespuestaCuestionario;
	}

}