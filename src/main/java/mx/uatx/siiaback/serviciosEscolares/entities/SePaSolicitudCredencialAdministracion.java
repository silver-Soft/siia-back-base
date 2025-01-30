package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaSolicitudCredencialAdministracion {

	
	@Id
    @Column(name = "IDCREDENCIALPERSONA")
	private Integer intIdCredencialPersona;
	
	@Column(name = "IDCREDENCIAL")
	private Integer intIdCredencial;
	
	@Column(name = "LOGIN")
	private String strLogin;
	
	@Column(name = "NBPERSONA")
	private String strNbPersona;
	
	@Column(name = "APPATERNO")
	private String strApPaterno;
	
	@Column(name = "APMATERNO")
	private String strApMaterno;
	
	@Column(name = "DSSTCREDENCIAL")
	private String strEstatus;
	
	@Column(name = "FCSOLICITUD")
	private Date fcSolicitud;
	
	@Column(name = "FCIMPRESION")
	private Date fcImpresion;
	
	@Column(name = "PERMITEIMPRIMIR")
	private Boolean blnPermiterImprimir;
	

	
	public SePaSolicitudCredencialAdministracion() {
		super();
		
	}
	
	
	

	public Integer getIntIdCredencialPersona() {
		return intIdCredencialPersona;
	}

	public void setIntIdCredencialPersona(Integer intIdCredencialPersona) {
		this.intIdCredencialPersona = intIdCredencialPersona;
	}

	public Integer getIntIdCredencial() {
		return intIdCredencial;
	}

	public void setIntIdCredencial(Integer intIdCredencial) {
		this.intIdCredencial = intIdCredencial;
	}

	public String getStrLogin() {
		return strLogin;
	}

	public void setStrLogin(String strLogin) {
		this.strLogin = strLogin;
	}

	public String getStrNbPersona() {
		return strNbPersona;
	}

	public void setStrNbPersona(String strNbPersona) {
		this.strNbPersona = strNbPersona;
	}

	public String getStrApPaterno() {
		return strApPaterno;
	}

	public void setStrApPaterno(String strApPaterno) {
		this.strApPaterno = strApPaterno;
	}

	public String getStrApMaterno() {
		return strApMaterno;
	}

	public void setStrApMaterno(String strApMaterno) {
		this.strApMaterno = strApMaterno;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	public Date getFcImpresion() {
		return fcImpresion;
	}

	public void setFcImpresion(Date fcImpresion) {
		this.fcImpresion = fcImpresion;
	}

	public Boolean getBlnPermiterImprimir() {
		return blnPermiterImprimir;
	}

	public void setBlnPermiterImprimir(Boolean blnPermiterImprimir) {
		this.blnPermiterImprimir = blnPermiterImprimir;
	}
	
	
}
