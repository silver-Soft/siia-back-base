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
public class SePaPreguntasEvaluacionDocente implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3324101688898846419L;

	@Id
	@Column(name = "NUMERO")
	private Integer intNumeroResgistro;

	@Column(name = "IDPREGUNTA_ED")
	private Long lngIdPreguntaED;

	@Column(name = "DSPREGUNTA_ED")
	private String strPreguntaED;

	@Column(name = "IDGRUPO_ED")
	private Integer intIdGrupoED;

	@Column(name = "CLDIMENSION_ED")
	private Integer intClDimensionED;

	@Column(name = "DSDIMENSION_ED")
	private String strClDimensionED;

	@Column(name = "PESO")
	private Integer intPeso;

	@Column(name = "IDRESPUESTA_ED")
	private Long lngIdRespuestaED;

	@Column(name = "DSRESPUESTA_ED")
	private String strDsRespuestaED;

	@Column(name = "NMPUNTOS")
	private Integer intNmPuntos;

	@Column(name = "NMOPTIMO")
	private Integer intNmOptimo;

	public Integer getIntNumeroResgistro() {
		return intNumeroResgistro;
	}

	public void setIntNumeroResgistro(Integer intNumeroResgistro) {
		this.intNumeroResgistro = intNumeroResgistro;
	}

	public Long getLngIdPreguntaED() {
		return lngIdPreguntaED;
	}

	public void setLngIdPreguntaED(Long lngIdPreguntaED) {
		this.lngIdPreguntaED = lngIdPreguntaED;
	}

	public String getStrPreguntaED() {
		return strPreguntaED;
	}

	public void setStrPreguntaED(String strPreguntaED) {
		this.strPreguntaED = strPreguntaED;
	}

	public Integer getIntIdGrupoED() {
		return intIdGrupoED;
	}

	public void setIntIdGrupoED(Integer intIdGrupoED) {
		this.intIdGrupoED = intIdGrupoED;
	}

	public Integer getIntClDimensionED() {
		return intClDimensionED;
	}

	public void setIntClDimensionED(Integer intClDimensionED) {
		this.intClDimensionED = intClDimensionED;
	}

	public String getStrClDimensionED() {
		return strClDimensionED;
	}

	public void setStrClDimensionED(String strClDimensionED) {
		this.strClDimensionED = strClDimensionED;
	}

	public Integer getIntPeso() {
		return intPeso;
	}

	public void setIntPeso(Integer intPeso) {
		this.intPeso = intPeso;
	}

	public Long getLngIdRespuestaED() {
		return lngIdRespuestaED;
	}

	public void setLngIdRespuestaED(Long lngIdRespuestaED) {
		this.lngIdRespuestaED = lngIdRespuestaED;
	}

	public String getStrDsRespuestaED() {
		return strDsRespuestaED;
	}

	public void setStrDsRespuestaED(String strDsRespuestaED) {
		this.strDsRespuestaED = strDsRespuestaED;
	}

	public Integer getIntNmPuntos() {
		return intNmPuntos;
	}

	public void setIntNmPuntos(Integer intNmPuntos) {
		this.intNmPuntos = intNmPuntos;
	}

	public Integer getIntNmOptimo() {
		return intNmOptimo;
	}

	public void setIntNmOptimo(Integer intNmOptimo) {
		this.intNmOptimo = intNmOptimo;
	}

}
