package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaTipoLeccion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1629257212243891870L;
	@Id
	@Column(name = "IDTIPOLECCION")
	private Integer intIdTipoLeccion;
	
	@Column(name = "DESCRIPCION")
	private String strDescripcion;
	
	public SiPaTipoLeccion(){
		super();
	}

	public Integer getIntIdTipoLeccion() {
		return intIdTipoLeccion;
	}

	public void setIntIdTipoLeccion(Integer intIdTipoLeccion) {
		this.intIdTipoLeccion = intIdTipoLeccion;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDscripcion) {
		this.strDescripcion = strDscripcion;
	}
	
}
