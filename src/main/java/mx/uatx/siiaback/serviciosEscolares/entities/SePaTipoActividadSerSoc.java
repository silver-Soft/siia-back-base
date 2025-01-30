package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaTipoActividadSerSoc implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1863478087387892831L;
	
	@Id
	@Column(name = "TIPOACTIVIDAD")
	private String strTipoActividad;

	public String getStrTipoActividad() {
		return strTipoActividad;
	}

	public void setStrTipoActividad(String strTipoActividad) {
		this.strTipoActividad = strTipoActividad;
	}

}
