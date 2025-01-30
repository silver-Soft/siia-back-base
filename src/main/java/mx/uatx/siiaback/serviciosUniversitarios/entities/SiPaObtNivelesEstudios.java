package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtNivelesEstudios implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 61249393519874311L;
	@Id
	@Column(name = "ORDEN")
	private Integer intOrden;
	
	@Column(name = "ID")
	private String strId;

	@Column(name = "DESCRIPCION")
	private String strDescripcion;
	

	public Integer getIntOrden() {
		return intOrden;
	}

	public void setIntOrden(Integer intOrden) {
		this.intOrden = intOrden;
	}

	public String getStrId() {
		return strId;
	}

	public void setStrId(String strId) {
		this.strId = strId;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}
	

}
