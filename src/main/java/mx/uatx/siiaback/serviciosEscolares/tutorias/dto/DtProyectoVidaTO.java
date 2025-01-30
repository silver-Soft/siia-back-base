package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;

import mx.uatx.siiaback.serviciosEscolares.entities.SePaDtProyectoVida;

public class DtProyectoVidaTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3854482850107776461L;
	
	private Integer intId;
	
	private String strPeriodoTemporada;
	
	private String strNbTutor;
	
	private String strEspiritual;
	
	private String strSocial;

	private String strProductiva;
	
	private String strAfectiva;
	
	private String strCongnitiva;
	
	private String strFisica;
	
	
	public DtProyectoVidaTO() {
		super();
	}
	
	public DtProyectoVidaTO(final SePaDtProyectoVida entidad) {
		BeanUtils.copyProperties(entidad, this);
	}
	


	public Integer getIntId() {
		return intId;
	}


	public void setIntId(Integer intId) {
		this.intId = intId;
	}


	public String getStrPeriodoTemporada() {
		return strPeriodoTemporada;
	}


	public void setStrPeriodoTemporada(String strPeriodoTemporada) {
		this.strPeriodoTemporada = strPeriodoTemporada;
	}


	public String getStrNbTutor() {
		return strNbTutor;
	}


	public void setStrNbTutor(String strNbTutor) {
		this.strNbTutor = strNbTutor;
	}


	public String getStrEspiritual() {
		return strEspiritual;
	}


	public void setStrEspiritual(String strEspiritual) {
		this.strEspiritual = strEspiritual;
	}


	public String getStrSocial() {
		return strSocial;
	}


	public void setStrSocial(String strSocial) {
		this.strSocial = strSocial;
	}


	public String getStrProductiva() {
		return strProductiva;
	}


	public void setStrProductiva(String strProductiva) {
		this.strProductiva = strProductiva;
	}


	public String getStrAfectiva() {
		return strAfectiva;
	}


	public void setStrAfectiva(String strAfectiva) {
		this.strAfectiva = strAfectiva;
	}


	public String getStrCongnitiva() {
		return strCongnitiva;
	}


	public void setStrCongnitiva(String strCongnitiva) {
		this.strCongnitiva = strCongnitiva;
	}


	public String getStrFisica() {
		return strFisica;
	}


	public void setStrFisica(String strFisica) {
		this.strFisica = strFisica;
	}

		
	
}
