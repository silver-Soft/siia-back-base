package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;

import mx.uatx.siiaback.serviciosEscolares.entities.SePaDatosEvaluacionDocente;

public class DatosEvaluacionDocenteTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2455120346007994945L;

	private Integer intIdDimensionED;
	private String strDimensionED;
	private Long lngNmObtenido;
	private Long lngNmOptimo;
	private Integer lngTotalDocentes;
	private Long totalObtenido;
	private Long totalOptimo;

	public DatosEvaluacionDocenteTO() {
		super();
	}

	public DatosEvaluacionDocenteTO(SePaDatosEvaluacionDocente entidad, Integer total) {
		BeanUtils.copyProperties(entidad, this);

		this.lngTotalDocentes = total;
	}

	public Integer getIntIdDimensionED() {
		return intIdDimensionED;
	}

	public void setIntIdDimensionED(Integer intIdDimensionED) {
		this.intIdDimensionED = intIdDimensionED;
	}

	public String getStrDimensionED() {
		return strDimensionED;
	}

	public void setStrDimensionED(String strDimensionED) {
		this.strDimensionED = strDimensionED;
	}

	public Long getLngNmObtenido() {
		return lngNmObtenido;
	}

	public void setLngNmObtenido(Long lngNmObtenido) {
		this.lngNmObtenido = lngNmObtenido;
	}

	public Long getLngNmOptimo() {
		return lngNmOptimo;
	}

	public void setLngNmOptimo(Long lngNmOptimo) {
		this.lngNmOptimo = lngNmOptimo;
	}

	public Integer getLngTotalDocentes() {
		return lngTotalDocentes;
	}

	public void setLngTotalDocentes(Integer lngTotalDocentes) {
		this.lngTotalDocentes = lngTotalDocentes;
	}

	public Long getTotalObtenido() {
		return totalObtenido;
	}

	public void setTotalObtenido(Long totalObtenido) {
		this.totalObtenido = totalObtenido;
	}

	public Long getTotalOptimo() {
		return totalOptimo;
	}

	public void setTotalOptimo(Long totalOptimo) {
		this.totalOptimo = totalOptimo;
	}

}
