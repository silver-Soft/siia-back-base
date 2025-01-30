package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaEstatusSeguro implements Serializable {
	
	@Id
	@Column(name = "ID")
	private Integer idEstatus;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	public SePaEstatusSeguro() {
		super();
	}

	public Integer getIdEstatus() {
		return idEstatus;
	}

	public void setIdEstatus(Integer idEstatus) {
		this.idEstatus = idEstatus;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
