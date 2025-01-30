package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtRespReporteGeneral {

	@Id
	@Column(name = "ID")
	private Integer intId;
	
	@Column(name = "IDPREGUNTA")
	private Integer intIdPregunta;

	@Column(name = "DSPREGUNTA")
	private String strDsPregunta;

	@Column(name = "IDRESPUESTA")
	private Integer intIdRespuesta;

	@Column(name = "DSRESPUESTA")
	private String strDsRespuesta;

	@Column(name = "CONT")
	private Integer intCont;
	
	@Column(name = "PORCENTAJE")
	private Double dblPorcentaje;

	public Integer getIntIdPregunta() {
		return intIdPregunta;
	}

	public void setIntIdPregunta(Integer intIdPregunta) {
		this.intIdPregunta = intIdPregunta;
	}

	public String getStrDsPregunta() {
		return strDsPregunta;
	}

	public void setStrDsPregunta(String strDsPregunta) {
		this.strDsPregunta = strDsPregunta;
	}

	public Integer getIntIdRespuesta() {
		return intIdRespuesta;
	}

	public void setIntIdRespuesta(Integer intIdRespuesta) {
		this.intIdRespuesta = intIdRespuesta;
	}

	public String getStrDsRespuesta() {
		return strDsRespuesta;
	}

	public void setStrDsRespuesta(String strDsRespuesta) {
		this.strDsRespuesta = strDsRespuesta;
	}

	public Integer getIntCont() {
		return intCont;
	}

	public void setIntCont(Integer intCont) {
		this.intCont = intCont;
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public Double getDblPorcentaje() {
		return dblPorcentaje;
	}

	public void setDblPorcentaje(Double dblPorcentaje) {
		this.dblPorcentaje = dblPorcentaje;
	}

}