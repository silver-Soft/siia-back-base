package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RealizarTutoriaTO implements Serializable, Cloneable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -139611273736293624L;
	
	private String strIdPeriodo;
	private String strPeriodo;
	private Long lngIdHistorialLaboral;

	private Integer intTipoTutoria;
	private String strTipoTutoria;
	private String strTutorados;
	private String strIdsTutorados;
	private List<Long> lstTutorados;

	private Date fcTutoria;
	private String strAsunto;
	private String strDescripcion;
	private String strObservacionesPrivadas;

	private String strUsuarioAudit;
	private Date fcAudit;

	private boolean blnPermiteRealizarTutoria;
	private Integer intNumeroTutoria;
	private boolean blnEsProyectoVida;
	private String strMensaje;

	private String strFisica;
	private String strCognitiva;
	private String strAfectiva;
	private String strProductiva;
	private String strSocial;
	private String strEspiritual;
	
	private Integer intIdProgramaCampus;

	public RealizarTutoriaTO() {
		lstTutorados = new ArrayList<Long>();
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public String getStrPeriodo() {
		return strPeriodo;
	}

	public void setStrPeriodo(String strPeriodo) {
		this.strPeriodo = strPeriodo;
	}

	public Long getLngIdHistorialLaboral() {
		return lngIdHistorialLaboral;
	}

	public void setLngIdHistorialLaboral(Long lngIdHistorialLaboral) {
		this.lngIdHistorialLaboral = lngIdHistorialLaboral;
	}

	public Integer getIntTipoTutoria() {
		return intTipoTutoria;
	}

	public void setIntTipoTutoria(Integer intTipoTutoria) {
		this.intTipoTutoria = intTipoTutoria;
	}

	public String getStrTipoTutoria() {
		return strTipoTutoria;
	}

	public void setStrTipoTutoria(String strTipoTutoria) {
		this.strTipoTutoria = strTipoTutoria;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}

	public String getStrObservacionesPrivadas() {
		return strObservacionesPrivadas;
	}

	public void setStrObservacionesPrivadas(String strObservacionesPrivadas) {
		this.strObservacionesPrivadas = strObservacionesPrivadas;
	}

	public String getStrTutorados() {
		return strTutorados;
	}

	public void setStrTutorados(String strTutorados) {
		this.strTutorados = strTutorados;
	}

	public List<Long> getLstTutorados() {
		return lstTutorados;
	}

	public void setLstTutorados(List<Long> lstTutorados) {
		this.lstTutorados = lstTutorados;
	}

	public Date getFcTutoria() {
		return fcTutoria;
	}

	public void setFcTutoria(Date fcTutoria) {
		this.fcTutoria = fcTutoria;
	}

	public String getStrAsunto() {
		return strAsunto;
	}

	public void setStrAsunto(String strAsunto) {
		this.strAsunto = strAsunto;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrIdsTutorados() {
		return strIdsTutorados;
	}

	public void setStrIdsTutorados(String strIdsTutorados) {
		this.strIdsTutorados = strIdsTutorados;
	}

	public boolean isBlnPermiteRealizarTutoria() {
		return blnPermiteRealizarTutoria;
	}

	public void setBlnPermiteRealizarTutoria(boolean blnPermiteRealizarTutoria) {
		this.blnPermiteRealizarTutoria = blnPermiteRealizarTutoria;
	}

	public Integer getIntNumeroTutoria() {
		return intNumeroTutoria;
	}

	public void setIntNumeroTutoria(Integer intNumeroTutoria) {
		this.intNumeroTutoria = intNumeroTutoria;
	}

	public boolean isBlnEsProyectoVida() {
		return blnEsProyectoVida;
	}

	public void setBlnEsProyectoVida(boolean blnEsProyectoVida) {
		this.blnEsProyectoVida = blnEsProyectoVida;
	}

	public String getStrMensaje() {
		return strMensaje;
	}

	public void setStrMensaje(String strMensaje) {
		this.strMensaje = strMensaje;
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

	public String getStrEspiritual() {
		return strEspiritual;
	}

	public void setStrEspiritual(String strEspiritual) {
		this.strEspiritual = strEspiritual;
	}

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
	}
	
	

}
