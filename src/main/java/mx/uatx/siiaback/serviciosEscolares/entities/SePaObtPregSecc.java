/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author sistemas10
 */
@Entity
public class SePaObtPregSecc implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3324101688898846419L;

	@Id
	@Column(name = "ROWNUM")
	private Long lngIdRowNum;

	@Column(name = "IDSECCIONPREGUNTA")
	private Long lngIdSeccionPregunta;

	@Column(name = "CLTIPOPREGUNTA")
	private Integer intClTipoPregunta;

	@Column(name = "DSPREGUNTA")
	private String strDsPregunta;

	@Column(name = "IDAXGRUPORESPUESTA")
	private Long lngIdGrupoRespuesta;

	@Column(name = "DSRESPUESTA")
	private String strDsRespuesta;

	@Column(name = "PREGUNTATIENEDEPENDENCIA")
	private Boolean blnPreguntaTieneDependencia;

	@Column(name = "PREGUNTAACTIVAINICIAL")
	private Boolean blnPreguntaActiva;

	@Column(name = "PREGUNTASDEPENDIENTES")
	private String strPreguntasDependientes;

	@Column(name = "ESREQUERIDO")
	private Boolean blnEsRequerido;

	public Long getLngIdRowNum() {
		return lngIdRowNum;
	}

	public void setLngIdRowNum(Long lngIdRowNum) {
		this.lngIdRowNum = lngIdRowNum;
	}

	public Long getLngIdSeccionPregunta() {
		return lngIdSeccionPregunta;
	}

	public void setLngIdSeccionPregunta(Long lngIdSeccionPregunta) {
		this.lngIdSeccionPregunta = lngIdSeccionPregunta;
	}

	public Integer getIntClTipoPregunta() {
		return intClTipoPregunta;
	}

	public void setIntClTipoPregunta(Integer intClTipoPregunta) {
		this.intClTipoPregunta = intClTipoPregunta;
	}

	public String getStrDsPregunta() {
		return strDsPregunta;
	}

	public void setStrDsPregunta(String strDsPregunta) {
		this.strDsPregunta = strDsPregunta;
	}

	public Long getLngIdGrupoRespuesta() {
		return lngIdGrupoRespuesta;
	}

	public void setLngIdGrupoRespuesta(Long lngIdGrupoRespuesta) {
		this.lngIdGrupoRespuesta = lngIdGrupoRespuesta;
	}

	public String getStrDsRespuesta() {
		return strDsRespuesta;
	}

	public void setStrDsRespuesta(String strDsRespuesta) {
		this.strDsRespuesta = strDsRespuesta;
	}

	public Boolean getBlnPreguntaTieneDependencia() {
		return blnPreguntaTieneDependencia;
	}

	public void setBlnPreguntaTieneDependencia(Boolean blnPreguntaTieneDependencia) {
		this.blnPreguntaTieneDependencia = blnPreguntaTieneDependencia;
	}

	public String getStrPreguntasDependientes() {
		return strPreguntasDependientes;
	}

	public void setStrPreguntasDependientes(String strPreguntasDependientes) {
		this.strPreguntasDependientes = strPreguntasDependientes;
	}

	public Boolean getBlnEsRequerido() {
		return blnEsRequerido;
	}

	public void setBlnEsRequerido(Boolean blnEsRequerido) {
		this.blnEsRequerido = blnEsRequerido;
	}

	public Boolean getBlnPreguntaActiva() {
		return blnPreguntaActiva;
	}

	public void setBlnPreguntaActiva(Boolean blnPreguntaActiva) {
		this.blnPreguntaActiva = blnPreguntaActiva;
	}

}
