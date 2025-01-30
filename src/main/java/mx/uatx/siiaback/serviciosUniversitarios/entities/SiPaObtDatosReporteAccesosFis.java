package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtDatosReporteAccesosFis implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2134244784125677564L;
	@Id
	@Column(name = "IDACCESOFISICOAREA")
	private Integer intIdAccesoFisicoArea;
	
	@Column(name = "FCREGISTROACCESO")
	private String strFcRegistroAcceso;
	
	@Column(name = "HORA")
	private String strHora;
	
	@Column(name = "NOMBRE")
	private String strNombre;
	
	@Column(name = "TIPOPERSONA")
	private String strTipoPersona;
	
	@Column(name = "TIPOACCESO")
	private String strTipoAcceso;
	
	@Column(name = "DSACCESOFISICOAREA")
	private String strDsAccesoFisicoArea;

	public Integer getIntIdAccesoFisicoArea() {
		return intIdAccesoFisicoArea;
	}

	public void setIntIdAccesoFisicoArea(Integer intIdAccesoFisicoArea) {
		this.intIdAccesoFisicoArea = intIdAccesoFisicoArea;
	}

	

	public String getStrFcRegistroAcceso() {
		return strFcRegistroAcceso;
	}

	public void setStrFcRegistroAcceso(String strFcRegistroAcceso) {
		this.strFcRegistroAcceso = strFcRegistroAcceso;
	}

	public String getStrHora() {
		return strHora;
	}

	public void setStrHora(String strHora) {
		this.strHora = strHora;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrTipoPersona() {
		return strTipoPersona;
	}

	public void setStrTipoPersona(String strTipoPersona) {
		this.strTipoPersona = strTipoPersona;
	}

	public String getStrTipoAcceso() {
		return strTipoAcceso;
	}

	public void setStrTipoAcceso(String strTipoAcceso) {
		this.strTipoAcceso = strTipoAcceso;
	}

	public String getStrDsAccesoFisicoArea() {
		return strDsAccesoFisicoArea;
	}

	public void setStrDsAccesoFisicoArea(String strDsAccesoFisicoArea) {
		this.strDsAccesoFisicoArea = strDsAccesoFisicoArea;
	}
	
	
	
}
