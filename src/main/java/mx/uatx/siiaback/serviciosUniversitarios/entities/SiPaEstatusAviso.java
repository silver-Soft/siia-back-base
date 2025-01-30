package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaEstatusAviso implements Serializable {
	@Id
	@Column(name = "CLESTATUSAVISO")
	private String strClEstatusAviso;

	@Column(name = "DSESTATUSAVISO")
	private String strDsEstatusAviso;
	
	public SiPaEstatusAviso() {
		super();
	}

	public String getStrClEstatusAviso() {
		return strClEstatusAviso;
	}

	public void setStrClEstatusAviso(String strClEstatusAviso) {
		this.strClEstatusAviso = strClEstatusAviso;
	}

	public String getStrDsEstatusAviso() {
		return strDsEstatusAviso;
	}

	public void setStrDsEstatusAviso(String strDsEstatusAviso) {
		this.strDsEstatusAviso = strDsEstatusAviso;
	}
}