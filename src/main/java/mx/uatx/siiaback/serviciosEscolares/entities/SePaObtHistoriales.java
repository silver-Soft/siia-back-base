package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtHistoriales {
	
	@Id
	@Column(name = "IDHISTORIALACADEMICO")
	private Long idHistorial;
	
	@Column(name = "MATRICULA")
	private String matricula;
	
	@Column(name = "DSPROGRAMAEDUCATIVO")
	private String dsProgramaEducativo;
	
	@Column(name = "DSCAMPUS")
	private String dsCampus;
	
	@Column(name = "NBPLANESTUDIO")
	private String nbPlanEstudio;
	
	@Column(name = "DSESTATUSHISTACAD")
	private String dsEstatusHistAcad;
	
	@Column(name = "IDCOMPLEMENTARIOIMSS")
	private Long idComplementarioImss;
	
	@Column(name = "PERMITEAGREGAR")
	private Integer permiteAgregar;
	
	public Long getIdHistorial() {
		return idHistorial;
	}
	public void setIdHistorial(Long idHistorial) {
		this.idHistorial = idHistorial;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getDsProgramaEducativo() {
		return dsProgramaEducativo;
	}
	public void setDsProgramaEducativo(String dsProgramaEducativo) {
		this.dsProgramaEducativo = dsProgramaEducativo;
	}
	public String getDsCampus() {
		return dsCampus;
	}
	public void setDsCampus(String dsCampus) {
		this.dsCampus = dsCampus;
	}
	public String getNbPlanEstudio() {
		return nbPlanEstudio;
	}
	public void setNbPlanEstudio(String nbPlanEstudio) {
		this.nbPlanEstudio = nbPlanEstudio;
	}
	public String getDsEstatusHistAcad() {
		return dsEstatusHistAcad;
	}
	public void setDsEstatusHistAcad(String dsEstatusHistAcad) {
		this.dsEstatusHistAcad = dsEstatusHistAcad;
	}
	public Integer getPermiteAgregar() {
		return permiteAgregar;
	}
	public void setPermiteAgregar(Integer permiteAgregar) {
		this.permiteAgregar = permiteAgregar;
	}
	public Long getIdComplementarioImss() {
		return idComplementarioImss;
	}
	public void setIdComplementarioImss(Long idComplementarioImss) {
		this.idComplementarioImss = idComplementarioImss;
	}

}
