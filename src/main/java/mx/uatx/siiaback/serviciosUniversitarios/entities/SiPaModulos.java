package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaModulos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5308145652768161809L;
	@Id
	@Column(name = "IDPROCESO")
	private Integer intIdProceso;
	
	@Column(name = "DSPROCESO")
	private String strDsProceso;
	
	public SiPaModulos(){
		super();
	}

	public Integer getIntIdProceso() {
		return intIdProceso;
	}

	public void setIntIdProceso(Integer intIdProceso) {
		this.intIdProceso = intIdProceso;
	}

	public String getStrDsProceso() {
		return strDsProceso;
	}

	public void setStrDsProceso(String strDsProceso) {
		this.strDsProceso = strDsProceso;
	}
	
}
