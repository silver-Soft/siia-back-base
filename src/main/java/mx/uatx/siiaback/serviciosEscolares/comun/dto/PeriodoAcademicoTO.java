package mx.uatx.siiaback.serviciosEscolares.comun.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.BeanUtils;

import mx.uatx.siiaback.serviciosEscolares.entities.SePaObtPeriodosDocente;
import mx.uatx.siiaback.serviciosEscolares.entities.SePaPeriodosEducativos;

public class PeriodoAcademicoTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4615306394467334396L;
	
	private String strIdPeriodo;
	private String strDsPeriodoTemporada;
	private Date fcInicio;
	private Date fcFinal;

	/**
	 * Default constructor
	 */
	public PeriodoAcademicoTO() {
	}

	public PeriodoAcademicoTO(String strIdPeriodo, String strDsPeriodoTemporada) {
		super();
		this.strIdPeriodo = strIdPeriodo;
		this.strDsPeriodoTemporada = strDsPeriodoTemporada;
	}



	public PeriodoAcademicoTO(final SePaPeriodosEducativos entidad) {
		BeanUtils.copyProperties(entidad, this);
	}
	
	public PeriodoAcademicoTO(final SePaObtPeriodosDocente entidad) {
		BeanUtils.copyProperties(entidad, this);
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
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

	public String getStrDsPeriodoTemporada() {
		return strDsPeriodoTemporada;
	}

	public void setStrDsPeriodoTemporada(String strDsPeriodoTemporada) {
		this.strDsPeriodoTemporada = strDsPeriodoTemporada;
	}

}