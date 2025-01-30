package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaAnioCertificacion implements Serializable {

	/**
	 * intAnioCertificacion
	 */
	private static final long serialVersionUID = 7151561501469700005L;
	
	@Id
	@Column(name = "ANIO")
	private Integer intAnioCertificacion;

	public Integer getIntAnioCertificacion() {
		return intAnioCertificacion;
	}

	public void setIntAnioCertificacion(Integer intAnioCertificacion) {
		this.intAnioCertificacion = intAnioCertificacion;
	}

}
