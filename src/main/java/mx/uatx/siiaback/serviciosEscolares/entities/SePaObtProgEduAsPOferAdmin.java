package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtProgEduAsPOferAdmin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4616486868552533140L;
	@Id
	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus;

	@Column(name = "PROGRAMA")
	private String strPrograma;
	
	@Column(name = "ESPOSGRADO")
	private boolean blnEsPosgrado;
	
	public SePaObtProgEduAsPOferAdmin() {
		super();
	}

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
	}

	public String getStrPrograma() {
		return strPrograma;
	}

	public void setStrPrograma(String strPrograma) {
		this.strPrograma = strPrograma;
	}

	public boolean isBlnEsPosgrado() {
		return blnEsPosgrado;
	}

	public void setBlnEsPosgrado(boolean blnEsPosgrado) {
		this.blnEsPosgrado = blnEsPosgrado;
	}
	
	
}
