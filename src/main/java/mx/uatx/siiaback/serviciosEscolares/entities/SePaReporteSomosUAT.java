package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaReporteSomosUAT implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 496184094500684373L;
	
	@Id
	@Column(name = "ID")
	private Integer intId;
	
	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus; 
	
	@Column(name = "PROGRAMACAMPUS")
	private String strDsProgramaCampus;
	
	@Column(name = "IDPERIODO")
	private String strIdPeriodo;

	@Column(name = "DSPERIODOTEMPORADA")
	private String strDsPeriodoTemporada;
	
	@Column(name = "ABANDONO")
	private Integer intAbandono;
	
	@Column(name = "EGRESADO")
	private Integer intEgresado;
	
	@Column(name = "TITULADO")
	private Integer intTitulado;
	
	@Column(name = "MATRICULADO")
	private Integer intMatriculado;
	
	@Column(name = "INTERCAMBIO")
	private Integer intIntercambioVisitante;
	
	@Column(name = "TOTALPERIODO")
	private Integer intTotalPeriodo;
	
	@Column(name = "ORDENNIVEL")
	private Integer intOrdenNivel;
	
	
	

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

	

	public String getStrDsProgramaCampus() {
		return strDsProgramaCampus;
	}

	public void setStrDsProgramaCampus(String strDsProgramaCampus) {
		this.strDsProgramaCampus = strDsProgramaCampus;
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

	public Integer getIntAbandono() {
		return intAbandono;
	}

	public void setIntAbandono(Integer intAbandono) {
		this.intAbandono = intAbandono;
	}

	public Integer getIntEgresado() {
		return intEgresado;
	}

	public void setIntEgresado(Integer intEgresado) {
		this.intEgresado = intEgresado;
	}

	public Integer getIntTitulado() {
		return intTitulado;
	}

	public void setIntTitulado(Integer intTitulado) {
		this.intTitulado = intTitulado;
	}

	public Integer getIntMatriculado() {
		return intMatriculado;
	}

	public void setIntMatriculado(Integer intMatriculado) {
		this.intMatriculado = intMatriculado;
	}

	public Integer getIntIntercambioVisitante() {
		return intIntercambioVisitante;
	}

	public void setIntIntercambioVisitante(Integer intIntercambioVisitante) {
		this.intIntercambioVisitante = intIntercambioVisitante;
	}

	public Integer getIntTotalPeriodo() {
		return intTotalPeriodo;
	}

	public void setIntTotalPeriodo(Integer intTotalPeriodo) {
		this.intTotalPeriodo = intTotalPeriodo;
	}

	public Integer getIntOrdenNivel() {
		return intOrdenNivel;
	}

	public void setIntOrdenNivel(Integer intOrdenNivel) {
		this.intOrdenNivel = intOrdenNivel;
	}
	
	
	
	
	
	
	
	

	
}
