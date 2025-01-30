/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author sistemas10
 */
@Entity
@Table(schema = "SIIUAT", name = "SIDTUSUARIOSACTPAGOS")
public class SiDtUsuariosActPagos implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8403806826984935737L;

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "GENIDUSUARIOACTPAGO", sequenceName = "SIIUAT.IDUSUARIOACTPAGO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENIDUSUARIOACTPAGO")
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

}
