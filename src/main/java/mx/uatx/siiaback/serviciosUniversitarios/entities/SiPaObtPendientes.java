package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtPendientes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6936690814578635997L;
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
	
	@Column(name="HORA")
	private String strHora;
	
	@Column(name="PERMITEATENDER")
	private boolean blnPermiteAtender;
	
	@Column(name="IDAREACAMPUS")
	private Integer intIdAreaCampus;

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

	public boolean isBlnPermiteAtender() {
		return blnPermiteAtender;
	}

	public void setBlnPermiteAtender(boolean blnPermiteAtender) {
		this.blnPermiteAtender = blnPermiteAtender;
	}

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
	}

	public String getStrHora() {
		return strHora;
	}

	public void setStrHora(String strHora) {
		this.strHora = strHora;
	}
	
	
}
