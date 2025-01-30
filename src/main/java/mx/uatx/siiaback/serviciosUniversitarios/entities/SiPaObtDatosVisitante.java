package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtDatosVisitante implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 365114583149493051L;
	@Id
	@Column(name = "IDVISITANTE", length = 9)
	private Long lngIdVisitante;

	@Column(name = "NBVISITANTE", length = 80)
	private String strNbVisitante;

	@Column(name = "CADENAQR")
	private String strCadenaQr;

	@Column(name = "CORREO")
	private String strCorreo;

	@Column(name = "TIPO")
	private String strDsTipo;

	public Long getLngIdVisitante() {
		return lngIdVisitante;
	}

	public void setLngIdVisitante(Long lngIdVisitante) {
		this.lngIdVisitante = lngIdVisitante;
	}

	public String getStrNbVisitante() {
		return strNbVisitante;
	}

	public void setStrNbVisitante(String strNbVisitante) {
		this.strNbVisitante = strNbVisitante;
	}

	public String getStrCadenaQr() {
		return strCadenaQr;
	}

	public void setStrCadenaQr(String strCadenaQr) {
		this.strCadenaQr = strCadenaQr;
	}

	public String getStrCorreo() {
		return strCorreo;
	}

	public void setStrCorreo(String strCorreo) {
		this.strCorreo = strCorreo;
	}

	public String getStrDsTipo() {
		return strDsTipo;
	}

	public void setStrDsTipo(String strDsTipo) {
		this.strDsTipo = strDsTipo;
	}

}