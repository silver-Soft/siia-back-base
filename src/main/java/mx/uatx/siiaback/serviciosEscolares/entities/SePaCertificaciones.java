package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaCertificaciones implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 743224734104997980L;
	
	@Id
	@Column(name = "CERTIFICACIONES")
	private String strCertificacion;

	public String getStrCertificacion() {
		return strCertificacion;
	}

	public void setStrCertificacion(String strCertificacion) {
		this.strCertificacion = strCertificacion;
	}

}
