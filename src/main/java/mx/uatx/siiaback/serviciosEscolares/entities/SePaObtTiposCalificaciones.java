package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtTiposCalificaciones implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8466626722642453720L;

	@Id
	@Column(name = "CLCALIFICACION")
	private Integer intIdCalificacion;

	@Column(name = "DSCALIFICACION")
	private String strCalificacion;

	@Column(name = "ABREVIATURACALIFICACION")
	private String strAbreviaturaCalificacion;

	public Integer getIntIdCalificacion() {
		return intIdCalificacion;
	}

	public void setIntIdCalificacion(Integer intIdCalificacion) {
		this.intIdCalificacion = intIdCalificacion;
	}

	public String getStrCalificacion() {
		return strCalificacion;
	}

	public void setStrCalificacion(String strCalificacion) {
		this.strCalificacion = strCalificacion;
	}

	public String getStrAbreviaturaCalificacion() {
		return strAbreviaturaCalificacion;
	}

	public void setStrAbreviaturaCalificacion(String strAbreviaturaCalificacion) {
		this.strAbreviaturaCalificacion = strAbreviaturaCalificacion;
	}

}