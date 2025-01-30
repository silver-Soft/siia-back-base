package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtCuestionarios {
	
	@Id
	@Column(name = "IDCUESTIONARIO")
	private Long idCuestionario;
	
	@Column(name = "DSCUESTIONARIO")
	private String dsCuestionario;
	
	public Long getIdCuestionario() {
		return idCuestionario;
	}
	public void setIdCuestionario(Long idCuestionario) {
		this.idCuestionario = idCuestionario;
	}
	public String getDsCuestionario() {
		return dsCuestionario;
	}
	public void setDsCuestionario(String dsCuestionario) {
		this.dsCuestionario = dsCuestionario;
	}
	
	

}
