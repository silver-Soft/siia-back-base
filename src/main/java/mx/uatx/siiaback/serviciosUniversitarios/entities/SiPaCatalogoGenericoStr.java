package mx.uatx.siiaback.serviciosUniversitarios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaCatalogoGenericoStr {
	
	@Id
	@Column(name = "ID")
	private String strIdCatalogo;
	
	@Column(name = "DESCRIPCION")
	private String strDescripcion;

	public String getStrIdCatalogo() {
		return strIdCatalogo;
	}

	public void setStrIdCatalogo(String strIdCatalogo) {
		this.strIdCatalogo = strIdCatalogo;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}
	
	

}
