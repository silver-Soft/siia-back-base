package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SiPaObtTiposUbicaciones {
	@Id
	@Column(name = "ID")
	private String strId;
	
	@Column(name = "DESCRIPCION")
	private String strDescripcion;
	
	public SiPaObtTiposUbicaciones() {
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
