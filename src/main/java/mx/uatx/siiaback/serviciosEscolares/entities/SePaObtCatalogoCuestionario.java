package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtCatalogoCuestionario {
	
	@Id
	@Column(name = "IDCUESTIONARIO")
	private Integer idCuestionario;
	
	@Column(name = "DSCUESTIONARIO")
	private String dsCuestionario;
	
	public Integer getIdCuestionario() {
		return idCuestionario;
	}
	public void setIdCuestionario(Integer idCuestionario) {
		this.idCuestionario = idCuestionario;
	}
	public String getDsCuestionario() {
		return dsCuestionario;
	}
	public void setDsCuestionario(String dsCuestionario) {
		this.dsCuestionario = dsCuestionario;
	}
	
	

}
