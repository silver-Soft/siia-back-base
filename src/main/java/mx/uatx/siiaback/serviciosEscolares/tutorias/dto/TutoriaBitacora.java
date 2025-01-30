package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.BeanUtils;

import mx.uatx.siiaback.serviciosEscolares.entities.SePaObtBitacoraTutoriasTutor;
import mx.uatx.siiaback.serviciosUniversitarios.helper.FechaHelper;

public class TutoriaBitacora implements Serializable, Cloneable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6319921166600552388L;

	private Long lngIdTutoriaAx;
	private String strTipoTutoria;
	private String strAsunto;
	private String strResumen;
	private String strObservacion;
	private String strEstatusTutoria;
	private Date fcTutoria;
	private String strFcTutoria;
	private String strHora;
	private Integer intNmTutoria;
	private Boolean blnTieneProyecto;
	private String strFisica;
	private String strCognitiva;
	private String strAfectiva;
	private String strEspiritual;
	private String strProductiva;
	private String strSocial;
	private Boolean blnPermiteEliminar;

	public TutoriaBitacora(final SePaObtBitacoraTutoriasTutor entidad, final FechaHelper fcHelp) {
		BeanUtils.copyProperties(entidad, this);
		this.strFcTutoria = fcHelp.formatearFecha(entidad.getFcTutoria());
	}

	public Long getLngIdTutoriaAx() {
		return lngIdTutoriaAx;
	}

	public void setLngIdTutoriaAx(Long lngIdTutoriaAx) {
		this.lngIdTutoriaAx = lngIdTutoriaAx;
	}

	public String getStrTipoTutoria() {
		return strTipoTutoria;
	}

	public void setStrTipoTutoria(String strTipoTutoria) {
		this.strTipoTutoria = strTipoTutoria;
	}

	public String getStrAsunto() {
		return strAsunto;
	}

	public void setStrAsunto(String strAsunto) {
		this.strAsunto = strAsunto;
	}

	public String getStrResumen() {
		return strResumen;
	}

	public void setStrResumen(String strResumen) {
		this.strResumen = strResumen;
	}

	public String getStrObservacion() {
		return strObservacion;
	}

	public void setStrObservacion(String strObservacion) {
		this.strObservacion = strObservacion;
	}

	public String getStrEstatusTutoria() {
		return strEstatusTutoria;
	}

	public void setStrEstatusTutoria(String strEstatusTutoria) {
		this.strEstatusTutoria = strEstatusTutoria;
	}

	public Date getFcTutoria() {
		return fcTutoria;
	}

	public void setFcTutoria(Date fcTutoria) {
		this.fcTutoria = fcTutoria;
	}

	public String getStrHora() {
		return strHora;
	}

	public void setStrHora(String strHora) {
		this.strHora = strHora;
	}

	public Integer getIntNmTutoria() {
		return intNmTutoria;
	}

	public void setIntNmTutoria(Integer intNmTutoria) {
		this.intNmTutoria = intNmTutoria;
	}

	public Boolean getBlnTieneProyecto() {
		return blnTieneProyecto;
	}

	public void setBlnTieneProyecto(Boolean blnTieneProyecto) {
		this.blnTieneProyecto = blnTieneProyecto;
	}

	public String getStrFisica() {
		return strFisica;
	}

	public void setStrFisica(String strFisica) {
		this.strFisica = strFisica;
	}

	public String getStrCognitiva() {
		return strCognitiva;
	}

	public void setStrCognitiva(String strCognitiva) {
		this.strCognitiva = strCognitiva;
	}

	public String getStrAfectiva() {
		return strAfectiva;
	}

	public void setStrAfectiva(String strAfectiva) {
		this.strAfectiva = strAfectiva;
	}

	public String getStrEspiritual() {
		return strEspiritual;
	}

	public void setStrEspiritual(String strEspiritual) {
		this.strEspiritual = strEspiritual;
	}

	public String getStrProductiva() {
		return strProductiva;
	}

	public void setStrProductiva(String strProductiva) {
		this.strProductiva = strProductiva;
	}

	public String getStrSocial() {
		return strSocial;
	}

	public void setStrSocial(String strSocial) {
		this.strSocial = strSocial;
	}

	public Boolean getBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(Boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}

	public String getStrFcTutoria() {
		return strFcTutoria;
	}

	public void setStrFcTutoria(String strFcTutoria) {
		this.strFcTutoria = strFcTutoria;
	}

}
