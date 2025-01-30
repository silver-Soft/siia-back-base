/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author sistemas10
 */
@Entity
public class SePaFirmasConstanciaServicio implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2015928709512240478L;

	@Id
	@Column(name = "ID")
	private Long lngIdSolicitud;

	@Column(name = "CADENAORIGINALSELLADO")
	private String strCadenaOriginalSellado;

	@Column(name = "FIRMAJEFEPRACPRO")
	private String strFirmaJefeSerSoc;

	@Column(name = "FIRMASECEXTENSION")
	private String strSecretarioExtension;

	@Column(name = "SELLO")
	private String strSello;
	
	@Column(name = "CQR")
	private String strQR;

	public Long getLngIdSolicitud() {
		return lngIdSolicitud;
	}

	public void setLngIdSolicitud(Long lngIdSolicitud) {
		this.lngIdSolicitud = lngIdSolicitud;
	}

	public String getStrCadenaOriginalSellado() {
		return strCadenaOriginalSellado;
	}

	public void setStrCadenaOriginalSellado(String strCadenaOriginalSellado) {
		this.strCadenaOriginalSellado = strCadenaOriginalSellado;
	}

	public String getStrFirmaJefeSerSoc() {
		return strFirmaJefeSerSoc;
	}

	public void setStrFirmaJefeSerSoc(String strFirmaJefeSerSoc) {
		this.strFirmaJefeSerSoc = strFirmaJefeSerSoc;
	}

	public String getStrSecretarioExtension() {
		return strSecretarioExtension;
	}

	public void setStrSecretarioExtension(String strSecretarioExtension) {
		this.strSecretarioExtension = strSecretarioExtension;
	}

	public String getStrSello() {
		return strSello;
	}

	public void setStrSello(String strSello) {
		this.strSello = strSello;
	}

	public String getStrQR() {
		return strQR;
	}

	public void setStrQR(String strQR) {
		this.strQR = strQR;
	}
	
	

}
