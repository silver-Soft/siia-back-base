package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosCuestionarioSerSoc {
	
	@Id
	@Column(name = "IDCUESTIONARIOSOLSERSOC")
	private Long idCuestionarioSolSerSoc;
	
	@Column(name = "MATRICULA")
	private String matricula;
	
	@Column(name = "NBESTUDIANTE")
	private String nbEstudiante;
	
	public Long getIdCuestionarioSolSerSoc() {
		return idCuestionarioSolSerSoc;
	}
	public void setIdCuestionarioSolSerSoc(Long idCuestionarioSolSerSoc) {
		this.idCuestionarioSolSerSoc = idCuestionarioSolSerSoc;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNbEstudiante() {
		return nbEstudiante;
	}
	public void setNbEstudiante(String nbEstudiante) {
		this.nbEstudiante = nbEstudiante;
	}

}
