package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtProgramaAnterior {
	
	@Id
	@Column(name = "IDHISTORIALACADEMICO")
	private Long idHistorialAcademico;
	
	@Column(name = "PROGRAMA")
	private String dsProgramaEducativo;
	
	
	public Long getIdHistorialAcademico() {
		return idHistorialAcademico;
	}
	public void setIdHistorialAcademico(Long idHistorialAcademico) {
		this.idHistorialAcademico = idHistorialAcademico;
	}
	public String getDsProgramaEducativo() {
		return dsProgramaEducativo;
	}
	public void setDsProgramaEducativo(String dsProgramaEducativo) {
		this.dsProgramaEducativo = dsProgramaEducativo;
	}

}
