package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtMateriasPlan implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7969723062562531175L;
	@Id
	@Column(name="IDMATERIA")
	private Integer intIdMateria;
	
	@Column(name="DSMATERIA")
	private String strDsMateria;

	public Integer getIntIdMateria() {
		return intIdMateria;
	}

	public void setIntIdMateria(Integer intIdMateria) {
		this.intIdMateria = intIdMateria;
	}

	public String getStrDsMateria() {
		return strDsMateria;
	}

	public void setStrDsMateria(String strDsMateria) {
		this.strDsMateria = strDsMateria;
	}
	
	
}
