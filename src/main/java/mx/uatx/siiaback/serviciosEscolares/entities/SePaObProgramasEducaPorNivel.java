package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObProgramasEducaPorNivel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1761415025109466146L;
	@Id
	@Column(name="IDPROGRAMAEDUCATIVO")
	private Integer intIdProgramaEducativo;
	
	@Column(name="DSPROGRAMAEDUCATIVO")
	private String strDsProgramaEducativo;

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
