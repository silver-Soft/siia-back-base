package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtAniosDeclaracionPersona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8387565872182307186L;
	
	@Id
	@Column(name = "IDPERIODO")
	private String strIdPeriodo;

	public SiPaObtAniosDeclaracionPersona() {
		super();
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}
	
	
}
