package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SePaPreguntasCuestionarioTutoriaID implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5391204115523864660L;

	@Column(name = "IDSECCIONPREGUNTA")
	private Long lngIdSeccionPregunta;

	@Column(name = "DESCRIPCIONSECCION")
	private String strDescripcionSeccion;

	@Column(name = "IDPREGUNTA")
	private Long lngIdPregunta;

	@Column(name = "CLTIPOPREGUNTA")
	private Integer intCveTipoPregunta;

	@Column(name = "DSPREGUNTA")
	private String strDescripcionPregunta;

	@Column(name = "IDGRUPORESPUESTAPREG")
	private Long lngIdGrupoRespuesta;

	@Column(name = "CLESTATUS")
	private Integer intCveEstatus;

	@Column(name = "NMORDENPREG")
	private Integer intOrdenPregunta;

	@Column(name = "IDAXGRUPORESPUESTA")
	private Long lngIdAxGrupoRespuesta;

	@Column(name = "IDRESPUESTA")
	private Long lngIdRespuesta;

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

	public Long getLngIdGrupoRespuesta() {
		return lngIdGrupoRespuesta;
	}

	public void setLngIdGrupoRespuesta(Long lngIdGrupoRespuesta) {
		this.lngIdGrupoRespuesta = lngIdGrupoRespuesta;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((intCveEstatus == null) ? 0 : intCveEstatus.hashCode());
		result = prime * result + ((intCveTipoPregunta == null) ? 0 : intCveTipoPregunta.hashCode());
		result = prime * result + ((lngIdAxGrupoRespuesta == null) ? 0 : lngIdAxGrupoRespuesta.hashCode());
		result = prime * result + ((intOrdenPregunta == null) ? 0 : intOrdenPregunta.hashCode());
		result = prime * result + ((lngIdGrupoRespuesta == null) ? 0 : lngIdGrupoRespuesta.hashCode());
		result = prime * result + ((lngIdPregunta == null) ? 0 : lngIdPregunta.hashCode());
		result = prime * result + ((lngIdRespuesta == null) ? 0 : lngIdRespuesta.hashCode());
		result = prime * result + ((lngIdSeccionPregunta == null) ? 0 : lngIdSeccionPregunta.hashCode());
		result = prime * result + ((strDescripcionPregunta == null) ? 0 : strDescripcionPregunta.hashCode());
		result = prime * result + ((strDescripcionSeccion == null) ? 0 : strDescripcionSeccion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SePaPreguntasCuestionarioTutoriaID))
			return false;
		SePaPreguntasCuestionarioTutoriaID other = (SePaPreguntasCuestionarioTutoriaID) obj;
		if (intCveEstatus == null) {
			if (other.intCveEstatus != null)
				return false;
		} else if (!intCveEstatus.equals(other.intCveEstatus))
			return false;
		if (intCveTipoPregunta == null) {
			if (other.intCveTipoPregunta != null)
				return false;
		} else if (!intCveTipoPregunta.equals(other.intCveTipoPregunta))
			return false;
		if (lngIdAxGrupoRespuesta == null) {
			if (other.lngIdAxGrupoRespuesta != null)
				return false;
		} else if (!lngIdAxGrupoRespuesta.equals(other.lngIdAxGrupoRespuesta))
			return false;
		if (intOrdenPregunta == null) {
			if (other.intOrdenPregunta != null)
				return false;
		} else if (!intOrdenPregunta.equals(other.intOrdenPregunta))
			return false;
		if (lngIdGrupoRespuesta == null) {
			if (other.lngIdGrupoRespuesta != null)
				return false;
		} else if (!lngIdGrupoRespuesta.equals(other.lngIdGrupoRespuesta))
			return false;
		if (lngIdPregunta == null) {
			if (other.lngIdPregunta != null)
				return false;
		} else if (!lngIdPregunta.equals(other.lngIdPregunta))
			return false;
		if (lngIdRespuesta == null) {
			if (other.lngIdRespuesta != null)
				return false;
		} else if (!lngIdRespuesta.equals(other.lngIdRespuesta))
			return false;
		if (lngIdSeccionPregunta == null) {
			if (other.lngIdSeccionPregunta != null)
				return false;
		} else if (!lngIdSeccionPregunta.equals(other.lngIdSeccionPregunta))
			return false;
		if (strDescripcionPregunta == null) {
			if (other.strDescripcionPregunta != null)
				return false;
		} else if (!strDescripcionPregunta.equals(other.strDescripcionPregunta))
			return false;
		if (strDescripcionSeccion == null) {
			if (other.strDescripcionSeccion != null)
				return false;
		} else if (!strDescripcionSeccion.equals(other.strDescripcionSeccion))
			return false;
		return true;
	}

}
