package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaEstatusSelectTituloElectronico implements Serializable {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	private String intIdEstatus;
	
	@Column(name = "DESCRIPCION")
	private String strDescripcion;

	public String getIntIdEstatus() {
		return intIdEstatus;
	}

	public void setIntIdEstatus(String intIdEstatus) {
		this.intIdEstatus = intIdEstatus;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}
	
	
	


}
