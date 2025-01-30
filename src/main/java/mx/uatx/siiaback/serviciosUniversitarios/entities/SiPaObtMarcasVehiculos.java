package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtMarcasVehiculos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8412844375201425604L;
	@Id
	@Column(name = "ID")
	private Integer intId;

	@Column(name = "DESCRIPCION")
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
