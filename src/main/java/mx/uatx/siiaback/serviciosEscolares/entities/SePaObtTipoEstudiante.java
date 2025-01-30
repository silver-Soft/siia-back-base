package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtTipoEstudiante implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2732748460540651086L;
	@Id
	@Column(name="ID")
	private Integer intId;
	
	@Column(name="DESCRIPCION")
	private String strDescripcion;

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}
	
	
}
