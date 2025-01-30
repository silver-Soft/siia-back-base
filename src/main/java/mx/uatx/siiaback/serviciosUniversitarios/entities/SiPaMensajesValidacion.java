package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaMensajesValidacion implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2029927699797316130L;

	@Id
	@Column(name = "MENSAJE")
	private String strMensaje;

	@Column(name = "VALIDO")
	private Boolean blnValido;

	@Column(name = "VALIDACION")
	private String strValidacion;

	public SiPaMensajesValidacion() {
		super();
	}

	public Boolean getBlnValido() {
		return blnValido;
	}

	public void setBlnValido(Boolean blnValido) {
		this.blnValido = blnValido;
	}

	public String getStrMensaje() {
		return strMensaje;
	}

	public void setStrMensaje(String strMensaje) {
		this.strMensaje = strMensaje;
	}

	public String getStrValidacion() {
		return strValidacion;
	}

	public void setStrValidacion(String strValidacion) {
		this.strValidacion = strValidacion;
	}

}
