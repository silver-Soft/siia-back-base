package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtEstatusCuestionarios {
	
	@Id
	@Column(name = "CLESTATUSCUESTIONARIO")
	private String clEstatusCuestionario;
	
	@Column(name = "DSESTATUSCUESTIONARIO")
	private String dsEstatusCuestionario;

	public String getClEstatusCuestionario() {
		return clEstatusCuestionario;
	}

	public void setClEstatusCuestionario(String clEstatusCuestionario) {
		this.clEstatusCuestionario = clEstatusCuestionario;
	}

	public String getDsEstatusCuestionario() {
		return dsEstatusCuestionario;
	}

	public void setDsEstatusCuestionario(String dsEstatusCuestionario) {
		this.dsEstatusCuestionario = dsEstatusCuestionario;
	}

}
