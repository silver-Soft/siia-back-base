/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaReporteComplejoDeportivoUsuarios implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7435798727318976772L;

	@Id
	@Column(name = "IDUSUARIOACTPAGO")
	private Long lngIdUsuarioActPago;
	
	@Column(name = "IDUSUARIOACTDEPYREC")
	private Long lngIdUsuario;

	@Column(name = "NOMBRE")
	private String strNbUsuario;

	@Column(name = "DSTIPOACTDEPYREC")
	private String strDsTipoActDepYRec;

	@Column(name = "FOLIOPAGO")
	private String strFolioPago;

	@Column(name = "FCPAGO")
	private Date fcPago;

	@Column(name = "FCINICIO")
	private Date fcInicio;

	@Column(name = "FCFIN")
	private Date fcFin;

	@Column(name = "MNPAGO")
	private Double nmPago;

	public Long getLngIdUsuario() {
		return lngIdUsuario;
	}

	public void setLngIdUsuario(Long lngIdUsuario) {
		this.lngIdUsuario = lngIdUsuario;
	}

	public String getStrNbUsuario() {
		return strNbUsuario;
	}

	public void setStrNbUsuario(String strNbUsuario) {
		this.strNbUsuario = strNbUsuario;
	}

	public String getStrDsTipoActDepYRec() {
		return strDsTipoActDepYRec;
	}

	public void setStrDsTipoActDepYRec(String strDsTipoActDepYRec) {
		this.strDsTipoActDepYRec = strDsTipoActDepYRec;
	}

	public String getStrFolioPago() {
		return strFolioPago;
	}

	public void setStrFolioPago(String strFolioPago) {
		this.strFolioPago = strFolioPago;
	}

	public Date getFcPago() {
		return fcPago;
	}

	public void setFcPago(Date fcPago) {
		this.fcPago = fcPago;
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

	public Double getNmPago() {
		return nmPago;
	}

	public void setNmPago(Double nmPago) {
		this.nmPago = nmPago;
	}

}
