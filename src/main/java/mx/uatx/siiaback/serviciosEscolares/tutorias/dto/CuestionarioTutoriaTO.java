package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.io.Serializable;
import java.util.List;

public class CuestionarioTutoriaTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6693103092726242276L;

	private String strUsuarioLog;
	private Long lngIdCuestionarioPersona;
	private List<SeccionCuestionarioTutoriaTO> lstSecciones;

	public CuestionarioTutoriaTO(final List<SeccionCuestionarioTutoriaTO> lstSecciones,
			final Long lngIdCuestionarioPersona) {
		super();
		this.lstSecciones = lstSecciones;
		this.lngIdCuestionarioPersona = lngIdCuestionarioPersona;
	}

	public List<SeccionCuestionarioTutoriaTO> getLstSecciones() {
		return lstSecciones;
	}

	public void setLstSecciones(List<SeccionCuestionarioTutoriaTO> lstSecciones) {
		this.lstSecciones = lstSecciones;
	}

	public String getStrUsuarioLog() {
		return strUsuarioLog;
	}

	public void setStrUsuarioLog(String strUsuarioLog) {
		this.strUsuarioLog = strUsuarioLog;
	}

	public Long getLngIdCuestionarioPersona() {
		return lngIdCuestionarioPersona;
	}

	public void setLngIdCuestionarioPersona(Long lngIdCuestionarioPersona) {
		this.lngIdCuestionarioPersona = lngIdCuestionarioPersona;
	}

}