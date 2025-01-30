package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtProgramaEdu implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3182940313257581485L;
	
	@Id
	@Column(name = "IDPROGRAMAEDUCATIVO")
	private Integer intIdProgramaEducativo;	
	
	@Column(name = "DSPROGRAMAEDUCATIVO")
	private String strDsProgramaEducativo;
	
	public SePaObtProgramaEdu() {
		super();
	}

	public Integer getIntIdProgramaEducativo() {
		return intIdProgramaEducativo;
	}

	public void setIntIdProgramaEducativo(Integer intIdProgramaEducativo) {
		this.intIdProgramaEducativo = intIdProgramaEducativo;
	}

	public String getStrDsProgramaEducativo() {
		return strDsProgramaEducativo;
	}

	public void setStrDsProgramaEducativo(String strDsProgramaEducativo) {
		this.strDsProgramaEducativo = strDsProgramaEducativo;
	}

	
}
