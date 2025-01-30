package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosEvaluacionDocente implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2455120346007994945L;

	@Id
	@Column(name = "CLDIMENSIONED")
	private Integer intIdDimensionED;

	@Column(name = "DSDIMENSIONED")
	private String strDimensionED;

	@Column(name = "NMOBTENIDO")
	private Long lngNmObtenido;

	@Column(name = "NMOPTIMO")
	private Long lngNmOptimo;
	
	

	public SePaDatosEvaluacionDocente() {
		super();
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

}
