package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;

import mx.uatx.siiaback.serviciosEscolares.entities.SePaSeccionesCuestionarioTutoria;

public class SeccionCuestionarioTutoriaTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7392393496887837874L;
	
	private Long lngIdSeccionEntrevista;
	private String strDescripcion;
	private Map<String, SeccionInternaCuestionarioTutoriaTO> hasSeccionesInternas;
	private List<SeccionInternaCuestionarioTutoriaTO> lstSeccionesInternas;

	public SeccionCuestionarioTutoriaTO(final SePaSeccionesCuestionarioTutoria entidad) {
		BeanUtils.copyProperties(entidad, this);
	}

	public void cambiarMapAlist() {
		if (hasSeccionesInternas != null) {
			lstSeccionesInternas = new ArrayList<SeccionInternaCuestionarioTutoriaTO>(hasSeccionesInternas.values());
			hasSeccionesInternas = null;
			
			for (SeccionInternaCuestionarioTutoriaTO sec : lstSeccionesInternas) {
				sec.cambiarMapAlist();
			}
		}
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}

	public Map<String, SeccionInternaCuestionarioTutoriaTO> getHasSeccionesInternas() {
		return hasSeccionesInternas;
	}

	public void setHasSeccionesInternas(Map<String, SeccionInternaCuestionarioTutoriaTO> hasSeccionesInternas) {
		this.hasSeccionesInternas = hasSeccionesInternas;
	}

	public Long getLngIdSeccionEntrevista() {
		return lngIdSeccionEntrevista;
	}

	public void setLngIdSeccionEntrevista(Long lngIdSeccionEntrevista) {
		this.lngIdSeccionEntrevista = lngIdSeccionEntrevista;
	}

	public List<SeccionInternaCuestionarioTutoriaTO> getLstSeccionesInternas() {
		return lstSeccionesInternas;
	}

	public void setLstSeccionesInternas(List<SeccionInternaCuestionarioTutoriaTO> lstSeccionesInternas) {
		this.lstSeccionesInternas = lstSeccionesInternas;
	}

}