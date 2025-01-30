package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtRendimientoAsignatura implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8918769865366423261L;
	@Id
	@Column(name="ID")
	private Integer intId;
	
	@Column(name="DSMATERIA")
	private String strDsMateria;
	
	@Column(name="PROMEDIO")
	private Double dblPromedio;

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrDsMateria() {
		return strDsMateria;
	}

	public void setStrDsMateria(String strDsMateria) {
		this.strDsMateria = strDsMateria;
	}

	public Double getDblPromedio() {
		return dblPromedio;
	}

	public void setDblPromedio(Double dblPromedio) {
		this.dblPromedio = dblPromedio;
	}	
	
}
