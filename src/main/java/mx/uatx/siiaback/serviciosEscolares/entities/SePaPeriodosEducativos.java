package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaPeriodosEducativos implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1711200245585966938L;
	
	@Id
	@Column(name = "IDPER")
	private String strIdPeriodo;
	@Column(name = "CLSTPER")
	private Integer intIdEstatusPeriodo;
	@Column(name = "CLTIPOPER")
	private Integer intIdTipoPeriodo;
	@Column(name = "DSPERMES")
	private String strDsPeriodoMes;
	@Column(name = "DSPERTEMP")
	private String strDsPeriodoTemporada;
	@Column(name = "DSPERSEP")
	private String strDsPeriodoSep;
	@Column(name = "FCINICIO")
	private Date fcInicio;
	@Column(name = "FCFINAL")
	private Date fcFinal;
	@Column(name = "NMSEMANAS")
	private Integer intNmSemanas;
	@Column(name = "CLTIPOCICLO")
	private Integer intIdTipoCiclo;
	@Column(name = "FCAUDIT")
	private Date fcAudit;
	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;
	@Column(name = "NMORDEN")
	private Integer intNmOrden;

	public SePaPeriodosEducativos() {
		super();
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public Integer getIntIdEstatusPeriodo() {
		return intIdEstatusPeriodo;
	}

	public void setIntIdEstatusPeriodo(Integer intIdEstatusPeriodo) {
		this.intIdEstatusPeriodo = intIdEstatusPeriodo;
	}

	public Integer getIntIdTipoPeriodo() {
		return intIdTipoPeriodo;
	}

	public void setIntIdTipoPeriodo(Integer intIdTipoPeriodo) {
		this.intIdTipoPeriodo = intIdTipoPeriodo;
	}

	public String getStrDsPeriodoMes() {
		return strDsPeriodoMes;
	}

	public void setStrDsPeriodoMes(String strDsPeriodoMes) {
		this.strDsPeriodoMes = strDsPeriodoMes;
	}

	public String getStrDsPeriodoTemporada() {
		return strDsPeriodoTemporada;
	}

	public void setStrDsPeriodoTemporada(String strDsPeriodoTemporada) {
		this.strDsPeriodoTemporada = strDsPeriodoTemporada;
	}

	public String getStrDsPeriodoSep() {
		return strDsPeriodoSep;
	}

	public void setStrDsPeriodoSep(String strDsPeriodoSep) {
		this.strDsPeriodoSep = strDsPeriodoSep;
	}

	public Date getFcInicio() {
		return fcInicio;
	}

	public void setFcInicio(Date fcInicio) {
		this.fcInicio = fcInicio;
	}

	public Date getFcFinal() {
		return fcFinal;
	}

	public void setFcFinal(Date fcFinal) {
		this.fcFinal = fcFinal;
	}

	public Integer getIntNmSemanas() {
		return intNmSemanas;
	}

	public void setIntNmSemanas(Integer intNmSemanas) {
		this.intNmSemanas = intNmSemanas;
	}

	public Integer getIntIdTipoCiclo() {
		return intIdTipoCiclo;
	}

	public void setIntIdTipoCiclo(Integer intIdTipoCiclo) {
		this.intIdTipoCiclo = intIdTipoCiclo;
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

	public Integer getIntNmOrden() {
		return intNmOrden;
	}

	public void setIntNmOrden(Integer intNmOrden) {
		this.intNmOrden = intNmOrden;
	}

}
