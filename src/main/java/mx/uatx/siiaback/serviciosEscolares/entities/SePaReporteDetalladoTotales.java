package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaReporteDetalladoTotales {
	
	@Id
	@Column(name = "ID")
	private Integer intId;

	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus;

	@Column(name = "PROGRAMACAMPUS")
	private String strProgramaCampus;

	@Column(name = "IDPERIODO")
	private String strIdPeriodo;

	@Column(name = "DSPERIODOTEMPORADA")
	private String strDsPeriodoTemporada;

	@Column(name = "ABANDONO")
	private Integer intIdAbandono;

	@Column(name = "EGRESADO")
	private Integer intIdEgresado;

	@Column(name = "TITULADO")
	private Integer intIdTitulado;

	@Column(name = "MATRICULADO")
	private Integer intMatriculado;

	@Column(name = "INTERCAMBIO")
	private Integer intIntercambio;

	@Column(name = "TOTALPERIODO")
	private Integer intTotal;

	@Column(name = "ORDEN")
	private Integer intIdOrden;

	public SePaReporteDetalladoTotales() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
	}

	public String getStrProgramaCampus() {
		return strProgramaCampus;
	}

	public void setStrProgramaCampus(String strProgramaCampus) {
		this.strProgramaCampus = strProgramaCampus;
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

	public Integer getIntIdAbandono() {
		return intIdAbandono;
	}

	public void setIntIdAbandono(Integer intIdAbandono) {
		this.intIdAbandono = intIdAbandono;
	}

	public Integer getIntIdEgresado() {
		return intIdEgresado;
	}

	public void setIntIdEgresado(Integer intIdEgresado) {
		this.intIdEgresado = intIdEgresado;
	}

	public Integer getIntIdTitulado() {
		return intIdTitulado;
	}

	public void setIntIdTitulado(Integer intIdTitulado) {
		this.intIdTitulado = intIdTitulado;
	}

	public Integer getIntMatriculado() {
		return intMatriculado;
	}

	public void setIntMatriculado(Integer intMatriculado) {
		this.intMatriculado = intMatriculado;
	}

	public Integer getIntIntercambio() {
		return intIntercambio;
	}

	public void setIntIntercambio(Integer intIntercambio) {
		this.intIntercambio = intIntercambio;
	}

	public Integer getIntTotal() {
		return intTotal;
	}

	public void setIntTotal(Integer intTotal) {
		this.intTotal = intTotal;
	}

	public Integer getIntIdOrden() {
		return intIdOrden;
	}

	public void setIntIdOrden(Integer intIdOrden) {
		this.intIdOrden = intIdOrden;
	}

}
