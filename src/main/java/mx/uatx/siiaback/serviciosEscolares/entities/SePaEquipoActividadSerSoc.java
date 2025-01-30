package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaEquipoActividadSerSoc implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 671425628147584368L;
	
	@Id
	@Column(name = "EQUIPO")
	private String strEquipoActividad;

	public String getStrEquipoActividad() {
		return strEquipoActividad;
	}

	public void setStrEquipoActividad(String strEquipoActividad) {
		this.strEquipoActividad = strEquipoActividad;
	}

}
