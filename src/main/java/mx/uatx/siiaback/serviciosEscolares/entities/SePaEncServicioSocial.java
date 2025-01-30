package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaEncServicioSocial {
	
	@Id
	@Column(name = "DSCUESTIONARIO")
	private String strCuestionario;
	
	@Column(name = "FECHAS")
	private String strFechas;
	
	
	public SePaEncServicioSocial() {
		super();
	}


	public String getStrCuestionario() {
		return strCuestionario;
	}


	public void setStrCuestionario(String strCuestionario) {
		this.strCuestionario = strCuestionario;
	}


	public String getStrFechas() {
		return strFechas;
	}


	public void setStrFechas(String strFechas) {
		this.strFechas = strFechas;
	}

}
