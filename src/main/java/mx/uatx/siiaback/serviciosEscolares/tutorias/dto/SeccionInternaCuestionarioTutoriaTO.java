package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SeccionInternaCuestionarioTutoriaTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2965801383727603410L;
	
	private String strDescripcion;
	private Map<Long, PreguntaSeccionCuestionarioTutoriaTO> hasPreguntasSeccion;
	private List<PreguntaSeccionCuestionarioTutoriaTO> lstPreguntasSeccion;

	public SeccionInternaCuestionarioTutoriaTO(final String strDescripcion) {
		this.strDescripcion = strDescripcion;
		hasPreguntasSeccion = new LinkedHashMap<Long, PreguntaSeccionCuestionarioTutoriaTO>();
	}

	public void cambiarMapAlist() {
		if (hasPreguntasSeccion != null) {
			lstPreguntasSeccion = new ArrayList<PreguntaSeccionCuestionarioTutoriaTO>(hasPreguntasSeccion.values());
			hasPreguntasSeccion = null;
			
			for (PreguntaSeccionCuestionarioTutoriaTO it : lstPreguntasSeccion) {
				it.cambiarMapAlist();
			}
		}
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}

	public Map<Long, PreguntaSeccionCuestionarioTutoriaTO> getHasPreguntasSeccion() {
		return hasPreguntasSeccion;
	}

	public void setHasPreguntasSeccion(Map<Long, PreguntaSeccionCuestionarioTutoriaTO> hasPreguntasSeccion) {
		this.hasPreguntasSeccion = hasPreguntasSeccion;
	}

	public List<PreguntaSeccionCuestionarioTutoriaTO> getLstPreguntasSeccion() {
		return lstPreguntasSeccion;
	}

	public void setLstPreguntasSeccion(List<PreguntaSeccionCuestionarioTutoriaTO> lstPreguntasSeccion) {
		this.lstPreguntasSeccion = lstPreguntasSeccion;
	}

}