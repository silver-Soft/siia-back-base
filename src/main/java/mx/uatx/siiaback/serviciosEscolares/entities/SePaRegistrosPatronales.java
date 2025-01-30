package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaRegistrosPatronales implements Serializable {
	
	@Id
	@Column(name = "ID")
	private String idRegistro;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	public SePaRegistrosPatronales() {
		super();
	}

	public String getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(String idRegistro) {
		this.idRegistro = idRegistro;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	

}
