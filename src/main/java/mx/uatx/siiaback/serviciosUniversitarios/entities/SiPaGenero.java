package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaGenero implements Serializable {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7448343570528405038L;

	@Id
	@Column(name = "CLGENERO")
	private Integer intCveGenero;

	@Column(name = "DSGENERO")
	private String strDsGenero;

	@Column(name = "DSGENEROANIMAL")
	private String strDsGeneroAnimal;

	public SiPaGenero() {
		super();
	}

	public Integer getIntCveGenero() {
		return intCveGenero;
	}

	public void setIntCveGenero(Integer intCveGenero) {
		this.intCveGenero = intCveGenero;
	}

	public String getStrDsGenero() {
		return strDsGenero;
	}

	public void setStrDsGenero(String strDsGenero) {
		this.strDsGenero = strDsGenero;
	}

	public String getStrDsGeneroAnimal() {
		return strDsGeneroAnimal;
	}

	public void setStrDsGeneroAnimal(String strDsGeneroAnimal) {
		this.strDsGeneroAnimal = strDsGeneroAnimal;
	}

}
