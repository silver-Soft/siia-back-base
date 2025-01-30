package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtProgramasCampusSinPermiso implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1774282042742073729L;
	@Id
	@Column(name="IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus;
	
	@Column(name="DSPROGRAMACAMPUS")
	private String strDsProgramaCampus;

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
	}

	public String getStrDsProgramaCampus() {
		return strDsProgramaCampus;
	}

	public void setStrDsProgramaCampus(String strDsProgramaCampus) {
		this.strDsProgramaCampus = strDsProgramaCampus;
	}
	
	
}
