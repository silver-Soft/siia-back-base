package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaEstatusComplejo implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 192645802333788641L;

	@Id
	@Column(name = "ESTATUS")
	private String strEstatus;

	@Column(name = "DESCRIPCION")
	private String strDescripcion;

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}
}
