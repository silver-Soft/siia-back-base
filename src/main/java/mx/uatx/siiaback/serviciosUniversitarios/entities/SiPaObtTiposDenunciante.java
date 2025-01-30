package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtTiposDenunciante implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4941323047410392060L;
	@Id
	@Column(name = "ID")
	private String strId;

	@Column(name = "DESCRIPCION")
	private String strDescripcion;
	
	public SiPaObtTiposDenunciante() {
		super();
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
