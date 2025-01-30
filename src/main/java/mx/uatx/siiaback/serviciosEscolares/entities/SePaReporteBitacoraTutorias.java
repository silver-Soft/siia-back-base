package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class SePaReporteBitacoraTutorias {
	
	
	@Id
	@Column(name = "ID")
	private Integer id;
		
	@Column(name = "LOGIN")
	private String strLogin;
	
	@Column(name = "NOMBRE")
	private String strNOMBRE;
	
	@Column(name = "DSTIPOTUTORIA")
	private String strDsTipoTutoria;
	
	@Column(name = "DSASUNTO")
	private String strDsAsunto;
	
	@Column(name = "DSRESUMEN")
	private String strDsResumen;
	
	@Column(name = "DSOBSERVACION")
	private String strDsObservacion;
	
	@Column(name = "DSESTATUSTUTORIA")
	private String strDsEstatus;
	
	@Column(name = "FCTUTORIA")
	private Date fcTutoria;
	
	@Column(name = "NMTUTORIA")
	private Integer intNmTutoria;
	
	@Column(name = "ESPIRITUAL")
	private String strEspiritual;
	
	@Column(name = "SOCIAL")
	private String strSocial;
	
	@Column(name = "PRODUCTIVA")
	private String strProductiva;
	
	@Column(name = "AFECTIVA")
	private String strAfectiva;
	
	@Column(name = "COGNITIVA")
	private String strCognitiva;
	
	@Column(name = "FISICA")
	private String strFisica;
	
	@Column(name = "NOMBRETUTOR")
	private String strNbTutor;
	
	
	
	

	public SePaReporteBitacoraTutorias() {
		super();
	}

	public String getStrLogin() {
		return strLogin;
	}

	public void setStrLogin(String strLogin) {
		this.strLogin = strLogin;
	}

	public String getStrNOMBRE() {
		return strNOMBRE;
	}

	public void setStrNOMBRE(String strNOMBRE) {
		this.strNOMBRE = strNOMBRE;
	}

	public String getStrDsTipoTutoria() {
		return strDsTipoTutoria;
	}

	public void setStrDsTipoTutoria(String strDsTipoTutoria) {
		this.strDsTipoTutoria = strDsTipoTutoria;
	}

	public String getStrDsAsunto() {
		return strDsAsunto;
	}

	public void setStrDsAsunto(String strDsAsunto) {
		this.strDsAsunto = strDsAsunto;
	}

	public String getStrDsResumen() {
		return strDsResumen;
	}

	public void setStrDsResumen(String strDsResumen) {
		this.strDsResumen = strDsResumen;
	}

	public String getStrDsObservacion() {
		return strDsObservacion;
	}

	public void setStrDsObservacion(String strDsObservacion) {
		this.strDsObservacion = strDsObservacion;
	}

	public String getStrDsEstatus() {
		return strDsEstatus;
	}

	public void setStrDsEstatus(String strDsEstatus) {
		this.strDsEstatus = strDsEstatus;
	}

	public Date getFcTutoria() {
		return fcTutoria;
	}

	public void setFcTutoria(Date fcTutoria) {
		this.fcTutoria = fcTutoria;
	}

	public Integer getIntNmTutoria() {
		return intNmTutoria;
	}

	public void setIntNmTutoria(Integer intNmTutoria) {
		this.intNmTutoria = intNmTutoria;
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

	public String getStrCognitiva() {
		return strCognitiva;
	}

	public void setStrCognitiva(String strCognitiva) {
		this.strCognitiva = strCognitiva;
	}

	public String getStrFisica() {
		return strFisica;
	}

	public void setStrFisica(String strFisica) {
		this.strFisica = strFisica;
	}

	public String getStrNbTutor() {
		return strNbTutor;
	}

	public void setStrNbTutor(String strNbTutor) {
		this.strNbTutor = strNbTutor;
	}
	
}
