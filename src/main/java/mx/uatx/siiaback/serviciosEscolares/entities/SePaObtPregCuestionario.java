package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtPregCuestionario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6648510411662247877L;

	@Id
	@Column(name = "DSPREGUNTA")
	private String strDsPregunta;

	@Column(name = "IDSECCIONPREGUNTA")
	private Integer intIdSeccionPregunta;

	@Column(name = "CLTIPOPREGUNTA")
	private Integer intClTipoPregunta;

	public String getStrDsPregunta() {
		return strDsPregunta;
	}

	public void setStrDsPregunta(String strDsPregunta) {
		this.strDsPregunta = strDsPregunta;
	}

	public Integer getIntIdSeccionPregunta() {
		return intIdSeccionPregunta;
	}

	public void setIntIdSeccionPregunta(Integer intIdSeccionPregunta) {
		this.intIdSeccionPregunta = intIdSeccionPregunta;
	}

	public Integer getIntClTipoPregunta() {
		return intClTipoPregunta;
	}

	public void setIntClTipoPregunta(Integer intClTipoPregunta) {
		this.intClTipoPregunta = intClTipoPregunta;
	}

}