package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtCifrasGeneral implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3213207117347880458L;
	@Id
	@Column(name = "PENDIENTES_TOTAL")
	private Integer intPendientesTotal;
	
	@Column(name = "REALIZADOS_TOTAL")
	private Integer intRealizadosTotal;
	
	@Column(name = "PENDIENTES_ANIO")
	private Integer intPendientesAnio;
	
	@Column(name = "REALIZADOS_ANIO")
	private Integer intRealizadosAnio;
	
	@Column(name = "PENDIENTES_MES")
	private Integer intPendientesMes;
	
	@Column(name = "REALIZADOS_MES")
	private Integer intRealizadosMes;
	
	@Column(name = "PENDIENTES_DIA")
	private Integer intPendientesDia;
	
	@Column(name = "REALIZADOS_DIA")
	private Integer intRealizadosDia;

	public SiPaObtCifrasGeneral() {
		super();
	}
	
	public Integer getIntPendientesAnio() {
		return intPendientesAnio;
	}

	public void setIntPendientesAnio(Integer intPendientesAnio) {
		this.intPendientesAnio = intPendientesAnio;
	}

	public Integer getIntRealizadosAnio() {
		return intRealizadosAnio;
	}

	public void setIntRealizadosAnio(Integer intRealizadosAnio) {
		this.intRealizadosAnio = intRealizadosAnio;
	}

	public Integer getIntPendientesMes() {
		return intPendientesMes;
	}

	public void setIntPendientesMes(Integer intPendientesMes) {
		this.intPendientesMes = intPendientesMes;
	}

	public Integer getIntRealizadosMes() {
		return intRealizadosMes;
	}

	public void setIntRealizadosMes(Integer intRealizadosMes) {
		this.intRealizadosMes = intRealizadosMes;
	}

	public Integer getIntPendientesDia() {
		return intPendientesDia;
	}

	public void setIntPendientesDia(Integer intPendientesDia) {
		this.intPendientesDia = intPendientesDia;
	}

	public Integer getIntRealizadosDia() {
		return intRealizadosDia;
	}

	public void setIntRealizadosDia(Integer intRealizadosDia) {
		this.intRealizadosDia = intRealizadosDia;
	}

	public Integer getIntPendientesTotal() {
		return intPendientesTotal;
	}

	public void setIntPendientesTotal(Integer intPendientesTotal) {
		this.intPendientesTotal = intPendientesTotal;
	}

	public Integer getIntRealizadosTotal() {
		return intRealizadosTotal;
	}

	public void setIntRealizadosTotal(Integer intRealizadosTotal) {
		this.intRealizadosTotal = intRealizadosTotal;
	}
	
	
}
