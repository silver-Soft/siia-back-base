package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDtProyectoVida implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3854482850107776461L;
	
	
	
	@Id
	@Column(name = "ID")
	private Integer intId;
	
	@Column(name = "DSPERIODOTEMPORADA")
	private String strPeriodoTemporada;
	
	@Column(name = "NBTUTOR")
	private String strNbTutor;
	
	@Column(name = "ESPIRITUAL")
	private String strEspiritual;
	
	@Column(name = "SOCIAL")
	private String strSocial;
	
	@Column(name = "PRODUCTIVA")
	private String strProductiva;
	
	@Column(name = "AFECTIVA")
	private String strAfectiva;
	
	@Column(name = "COGNITIVA")
	private String strCongnitiva;
	
	@Column(name = "FISICA")
	private String strFisica;
	
	
	public SePaDtProyectoVida() {
		super();
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
