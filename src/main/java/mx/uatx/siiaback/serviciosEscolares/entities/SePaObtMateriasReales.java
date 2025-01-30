package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtMateriasReales implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5753215925958434758L;

	@Id
	@Column(name = "IDMATERIAREAL")
	private Integer intIdMateriaReal;

	@Column(name = "DSMATERIA")
	private String strMateria;

	@Column(name = "MATERIACOMPLETA")
	private String strMateriaCompleta;

	@Column(name = "DSOPCIONTERMINAL")
	private String strOpcionTerminal;

	public Integer getIntIdMateriaReal() {
		return intIdMateriaReal;
	}

	public void setIntIdMateriaReal(Integer intIdMateriaReal) {
		this.intIdMateriaReal = intIdMateriaReal;
	}

	public String getStrMateria() {
		return strMateria;
	}

	public void setStrMateria(String strMateria) {
		this.strMateria = strMateria;
	}

	public String getStrMateriaCompleta() {
		return strMateriaCompleta;
	}

	public void setStrMateriaCompleta(String strMateriaCompleta) {
		this.strMateriaCompleta = strMateriaCompleta;
	}

	public String getStrOpcionTerminal() {
		return strOpcionTerminal;
	}

	public void setStrOpcionTerminal(String strOpcionTerminal) {
		this.strOpcionTerminal = strOpcionTerminal;
	}

}
