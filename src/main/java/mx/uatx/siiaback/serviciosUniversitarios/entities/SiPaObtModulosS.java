package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SiPaObtModulosS implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3386169836918318352L;

	@Id
	@Column(name="ID")
	private String strId;
	
	@Column(name="DESCRIPCION")
	private String strDescripcion;

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
