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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class SiPaPagoUsuarioDepYRec implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4906204894237008890L;

	@Id
	@Column(name = "IDUSUARIOACTPAGO")
	private Long lngIdUsuarioActPago;

	@Column(name = "IDUSUARIOACTDEPYREC")
	private Long lngIdUsuarioActDepYRec;

	@Column(name = "IDTIPOACTDEPYREC")
	private Integer intIdTipoActDepYRec;

	@Column(name = "TIPOPAGO")
	private String strTipoPago;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT", length = 30)
	private String strUsuarioAudit;

	@Column(name = "USUARIOREGISTRO")
	private String strUsuarioRegistro;

	@Column(name = "FOLIOPAGO")
	private String strFolioPago;

	@Column(name = "FCPAGO")
	@Temporal(TemporalType.DATE)
	private Date fcPago;

	@Column(name = "FCINICIO")
	@Temporal(TemporalType.DATE)
	private Date fcInicio;

	@Column(name = "FCFIN")
	@Temporal(TemporalType.DATE)
	private Date fcFin;

	@Column(name = "MNPAGO")
	private Double montoPago;

	@Column(name = "DSTIPOACTDEPYREC")
	private String strDsTipoActDepYRec;

	public Long getLngIdUsuarioActPago() {
		return lngIdUsuarioActPago;
	}

	public void setLngIdUsuarioActPago(Long lngIdUsuarioActPago) {
		this.lngIdUsuarioActPago = lngIdUsuarioActPago;
	}

	public Long getLngIdUsuarioActDepYRec() {
		return lngIdUsuarioActDepYRec;
	}

	public void setLngIdUsuarioActDepYRec(Long lngIdUsuarioActDepYRec) {
		this.lngIdUsuarioActDepYRec = lngIdUsuarioActDepYRec;
	}

	public Integer getIntIdTipoActDepYRec() {
		return intIdTipoActDepYRec;
	}

	public void setIntIdTipoActDepYRec(Integer intIdTipoActDepYRec) {
		this.intIdTipoActDepYRec = intIdTipoActDepYRec;
	}

	public String getStrTipoPago() {
		return strTipoPago;
	}

	public void setStrTipoPago(String strTipoPago) {
		this.strTipoPago = strTipoPago;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public String getStrUsuarioRegistro() {
		return strUsuarioRegistro;
	}

	public void setStrUsuarioRegistro(String strUsuarioRegistro) {
		this.strUsuarioRegistro = strUsuarioRegistro;
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

	public Double getMontoPago() {
		return montoPago;
	}

	public void setMontoPago(Double montoPago) {
		this.montoPago = montoPago;
	}

	public String getStrDsTipoActDepYRec() {
		return strDsTipoActDepYRec;
	}

	public void setStrDsTipoActDepYRec(String strDsTipoActDepYRec) {
		this.strDsTipoActDepYRec = strDsTipoActDepYRec;
	}

}
