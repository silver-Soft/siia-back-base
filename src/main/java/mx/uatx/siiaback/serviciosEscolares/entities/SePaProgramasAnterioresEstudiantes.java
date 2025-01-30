package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaProgramasAnterioresEstudiantes {
	
	@Id
	@Column(name = "IDPROGRAMACAMPUS")
	private Long idProgramaCampus;
	
	@Column(name = "IDPROGRAMAEDUCATIVO")
	private Long idProgramaEducativo;
	
	@Column(name = "DSPROGRAMAEDUCATIVO")
	private String dsProgramaEducativo;
	
	public Long getIdProgramaCampus() {
		return idProgramaCampus;
	}
	public void setIdProgramaCampus(Long idProgramaCampus) {
		this.idProgramaCampus = idProgramaCampus;
	}
	public Long getIdProgramaEducativo() {
		return idProgramaEducativo;
	}
	public void setIdProgramaEducativo(Long idProgramaEducativo) {
		this.idProgramaEducativo = idProgramaEducativo;
	}
	public String getDsProgramaEducativo() {
		return dsProgramaEducativo;
	}
	public void setDsProgramaEducativo(String dsProgramaEducativo) {
		this.dsProgramaEducativo = dsProgramaEducativo;
	}

}
