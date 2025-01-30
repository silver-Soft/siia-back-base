package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtTiposGenero implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3241892761122530632L;
	@Id
	@Column(name = "ID")
	private Integer intId;

	@Column(name = "DESCRIPCION")
	private String strDescripcion;
	
	public SiPaObtTiposGenero() {
		super();
	}

	
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
