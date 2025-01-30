package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtRendimientoPeriodos implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -252435942086316853L;

	@Id
	@Column(name="ID")
	private Integer intId;
	
	@Column(name="CLPERIODOCURSADO")
	private Integer intClPeriodoCursado;
	
	@Column(name="PROMEDIO")
	private Double dblPromedio;

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public Integer getIntClPeriodoCursado() {
		return intClPeriodoCursado;
	}

	public void setIntClPeriodoCursado(Integer intClPeriodoCursado) {
		this.intClPeriodoCursado = intClPeriodoCursado;
	}

	public Double getDblPromedio() {
		return dblPromedio;
	}

	public void setDblPromedio(Double dblPromedio) {
		this.dblPromedio = dblPromedio;
	}
	
	
}
