package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaEstatusPracticasProfesionales implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4680757352326212310L;

	@Id
	@Column(name = "ESTATUS")
	private String strEstatus;

	public SePaEstatusPracticasProfesionales(){
		super();
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}
	
	
}
