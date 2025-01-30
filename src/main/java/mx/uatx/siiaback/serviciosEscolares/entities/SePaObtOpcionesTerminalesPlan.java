package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtOpcionesTerminalesPlan implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6126766400154610301L;
	@Id
	@Column(name="IDOPCIONTERMINAL")
	private Integer intIdOpcionTerminal;
	
	@Column(name="DSOPCIONTERMINAL")
	private String strDsOpcionTerminal;

	public Integer getIntIdOpcionTerminal() {
		return intIdOpcionTerminal;
	}

	public void setIntIdOpcionTerminal(Integer intIdOpcionTerminal) {
		this.intIdOpcionTerminal = intIdOpcionTerminal;
	}

	public String getStrDsOpcionTerminal() {
		return strDsOpcionTerminal;
	}

	public void setStrDsOpcionTerminal(String strDsOpcionTerminal) {
		this.strDsOpcionTerminal = strDsOpcionTerminal;
	}
	
	
}
