package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SiPaObtFuncionesPadre implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -32364231519212751L;
	@Id
	@Column(name = "IDFUNCION")
	private Integer intIdFuncion;
	
	@Column(name = "DSFUNCION")
	private String strDsFuncion;
	
	public SiPaObtFuncionesPadre() {
		super();
	}

	

	public Integer getIntIdFuncion() {
		return intIdFuncion;
	}



	public void setIntIdFuncion(Integer intIdFuncion) {
		this.intIdFuncion = intIdFuncion;
	}



	public String getStrDsFuncion() {
		return strDsFuncion;
	}

	public void setStrDsFuncion(String strDsFuncion) {
		this.strDsFuncion = strDsFuncion;
	}
	
	
}
