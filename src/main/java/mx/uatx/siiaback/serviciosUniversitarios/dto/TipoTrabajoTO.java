package mx.uatx.siiaback.serviciosUniversitarios.dto;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;

import mx.uatx.siiaback.serviciosUniversitarios.entities.SiPaTipoTrabajo;

public class TipoTrabajoTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8157422406729918192L;
	
	private Integer intIdTipoTrabajo;
	private String strDsTipoTrabajo;
	
	public TipoTrabajoTO(final SiPaTipoTrabajo entidad) {
		BeanUtils.copyProperties(entidad, this);
	}

	public Integer getIntIdTipoTrabajo() {
		return intIdTipoTrabajo;
	}

	public void setIntIdTipoTrabajo(Integer intIdTipoTrabajo) {
		this.intIdTipoTrabajo = intIdTipoTrabajo;
	}

	public String getStrDsTipoTrabajo() {
		return strDsTipoTrabajo;
	}

	public void setStrDsTipoTrabajo(String strDsTipoTrabajo) {
		this.strDsTipoTrabajo = strDsTipoTrabajo;
	}
}
