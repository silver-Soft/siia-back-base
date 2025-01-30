package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaCorreosUsuariosDepYRecTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4255203095379120034L;

	@Id
	@Column(name = "CORREO")
	private String strCorreo;

	@Column(name = "MENSAJE")
	private String strMensaje;

	public String getStrCorreo() {
		return strCorreo;
	}

	public void setStrCorreo(String strCorreo) {
		this.strCorreo = strCorreo;
	}

	public String getStrMensaje() {
		return strMensaje;
	}

	public void setStrMensaje(String strMensaje) {
		this.strMensaje = strMensaje;
	}

}
