package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaEvaluacionTutorado implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4190475886745547150L;
	
	@Id
	@Column(name = "ID")
	private Integer intId;
	
	@Column(name = "IDPREGUNTA")
	private Integer intIdPregunta;
	
	@Column(name = "DSPREGUNTA")
	private String strPregunta;
	
	@Column(name = "DSRESPUESTA")
	private String strRespuesta;
	@Column(name = "CONT")
	private Integer intContador;
	
	
	public SePaEvaluacionTutorado(){
		super();
	}


	public Integer getIntId() {
		return intId;
	}


	public void setIntId(Integer intId) {
		this.intId = intId;
	}


	public Integer getIntIdPregunta() {
		return intIdPregunta;
	}


	public void setIntIdPregunta(Integer intIdPregunta) {
		this.intIdPregunta = intIdPregunta;
	}


	public String getStrPregunta() {
		return strPregunta;
	}


	public void setStrPregunta(String strPregunta) {
		this.strPregunta = strPregunta;
	}


	public String getStrRespuesta() {
		return strRespuesta;
	}


	public void setStrRespuesta(String strRespuesta) {
		this.strRespuesta = strRespuesta;
	}


	public Integer getIntContador() {
		return intContador;
	}


	public void setIntContador(Integer intContador) {
		this.intContador = intContador;
	}

	
}
