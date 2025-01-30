package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaPermisosAperturaActas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5874707598796988834L;
	@Id
	@Column(name = "IDPERMISOACTA")
	private Long lngIdPermisoActa;
	
	@Column(name = "IDPERSONA")
	private Long lngIdPersona;
	
	@Column(name = "LOGIN")
	private String strLogin ;
	
	@Column(name = "NBPERSONA")
	private String strNbPersona;
	
	@Column(name = "APPATERNO")
	private String strApPaterno;
	
	@Column(name = "APMATERNO")
	private String strApMaterno;
	
	@Column(name = "IDPERIODO")
	private String strIdPeriodo;
	
	@Column(name = "DSPERIODOTEMPORADA")
	private String strDsPeriodoTemporada;
	
	@Column(name = "FCINICIO")
	private Date fcInicio;
	
	@Column(name = "FCFIN")
	private Date fcFin;
	
	public SePaPermisosAperturaActas() {
		super();
	}

	public Long getLngIdPermisoActa() {
		return lngIdPermisoActa;
	}

	public void setLngIdPermisoActa(Long lngIdPermisoActa) {
		this.lngIdPermisoActa = lngIdPermisoActa;
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

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public String getStrDsPeriodoTemporada() {
		return strDsPeriodoTemporada;
	}

	public void setStrDsPeriodoTemporada(String strDsPeriodoTemporada) {
		this.strDsPeriodoTemporada = strDsPeriodoTemporada;
	}

	public Date getFcInicio() {
		return fcInicio;
	}

	public void setFcInicio(Date fcInicio) {
		this.fcInicio = fcInicio;
	}

	public Date getFcFin() {
		return fcFin;
	}

	public void setFcFin(Date fcFin) {
		this.fcFin = fcFin;
	}

	public Long getLngIdPersona() {
		return lngIdPersona;
	}

	public void setLngIdPersona(Long lngIdPersona) {
		this.lngIdPersona = lngIdPersona;
	}
	
	
}
