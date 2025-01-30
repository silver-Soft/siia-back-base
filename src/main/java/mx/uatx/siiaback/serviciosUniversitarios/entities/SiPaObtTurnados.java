package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SiPaObtTurnados implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2367001677657663494L;

	@Id
	@Column(name="IDPETICION")
	private Long lngIdPeticion;
	
	@Column(name="DSCATEGORIA")
	private String strDsCategoria;
	
	@Column(name="DSPETICION")
	private String strDsPeticion;
	
	@Column(name="NMTICKET")
	private Long lngNmTicket;
	
	@Column(name="FCPETICION")
	private Date dtPeticion;
	
	@Column(name="IDPESONAREALIZA")
	private Long lngIdPersonaRealiza;
	
	@Column(name="PERMITEREALIZAR")
	private boolean blnPermiteRealizar; 
	
	@Column(name="PERMITETURNAR")
	private boolean blnPermiteTurnar;
	
	@Column(name="PERMITEDOCUMENTOS")
	private boolean blnPermiteDocumentos; 
	
	@Column(name="CORREOSOLICITA")
	private String strCorreoSolicita;
	
	@Column(name="IDASIGNACIONPETICION")
	private Long lngIdAsignacionPeticion;
	
	@Column(name="IDAREACAMPUS")
	private Integer intIdAreaCampus;
	
	@Column(name="PERSONASOLICITA")
	private String strPersonaSolicita;
	
	@Column(name="CORREO")
	private String strCorreo;
	
	@Column(name="TELEFONO")
	private String strTelefono;

	public Long getLngIdPeticion() {
		return lngIdPeticion;
	}

	public void setLngIdPeticion(Long lngIdPeticion) {
		this.lngIdPeticion = lngIdPeticion;
	}

	public String getStrDsCategoria() {
		return strDsCategoria;
	}

	public void setStrDsCategoria(String strDsCategoria) {
		this.strDsCategoria = strDsCategoria;
	}

	public String getStrDsPeticion() {
		return strDsPeticion;
	}

	public void setStrDsPeticion(String strDsPeticion) {
		this.strDsPeticion = strDsPeticion;
	}

	public Long getLngNmTicket() {
		return lngNmTicket;
	}

	public void setLngNmTicket(Long lngNmTicket) {
		this.lngNmTicket = lngNmTicket;
	}

	public Date getDtPeticion() {
		return dtPeticion;
	}

	public void setDtPeticion(Date dtPeticion) {
		this.dtPeticion = dtPeticion;
	}

	public Long getLngIdPersonaRealiza() {
		return lngIdPersonaRealiza;
	}

	public void setLngIdPersonaRealiza(Long lngIdPersonaRealiza) {
		this.lngIdPersonaRealiza = lngIdPersonaRealiza;
	}

	public boolean isBlnPermiteRealizar() {
		return blnPermiteRealizar;
	}

	public void setBlnPermiteRealizar(boolean blnPermiteRealizar) {
		this.blnPermiteRealizar = blnPermiteRealizar;
	}

	public boolean isBlnPermiteTurnar() {
		return blnPermiteTurnar;
	}

	public void setBlnPermiteTurnar(boolean blnPermiteTurnar) {
		this.blnPermiteTurnar = blnPermiteTurnar;
	}

	public String getStrCorreoSolicita() {
		return strCorreoSolicita;
	}

	public void setStrCorreoSolicita(String strCorreoSolicita) {
		this.strCorreoSolicita = strCorreoSolicita;
	}

	public Long getLngIdAsignacionPeticion() {
		return lngIdAsignacionPeticion;
	}

	public void setLngIdAsignacionPeticion(Long lngIdAsignacionPeticion) {
		this.lngIdAsignacionPeticion = lngIdAsignacionPeticion;
	}

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
	}

	public String getStrPersonaSolicita() {
		return strPersonaSolicita;
	}

	public void setStrPersonaSolicita(String strPersonaSolicita) {
		this.strPersonaSolicita = strPersonaSolicita;
	}

	public String getStrCorreo() {
		return strCorreo;
	}

	public void setStrCorreo(String strCorreo) {
		this.strCorreo = strCorreo;
	}

	public String getStrTelefono() {
		return strTelefono;
	}

	public void setStrTelefono(String strTelefono) {
		this.strTelefono = strTelefono;
	}

	public boolean isBlnPermiteDocumentos() {
		return blnPermiteDocumentos;
	}

	public void setBlnPermiteDocumentos(boolean blnPermiteDocumentos) {
		this.blnPermiteDocumentos = blnPermiteDocumentos;
	}
	
	
}
