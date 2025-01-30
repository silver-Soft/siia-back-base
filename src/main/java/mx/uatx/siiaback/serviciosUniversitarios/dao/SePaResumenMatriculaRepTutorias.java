package mx.uatx.siiaback.serviciosUniversitarios.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaResumenMatriculaRepTutorias {
	
	@Id
	@Column(name= "ID")
	private Integer intId;
	
	@Column(name= "PROGRAMACAMPUS")
	private String strProgramaCampus;
	
	@Column(name= "MATRICULA")
	private Integer intMatricula;
	
	@Column(name= "MATRICULATUTORADA")
	private Integer intMatriculaTutorada;
	
	@Column(name= "MATRICULATUTOR")
	private Integer intMatriculaTutor;
	
	
	

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrProgramaCampus() {
		return strProgramaCampus;
	}

	public void setStrProgramaCampus(String strProgramaCampus) {
		this.strProgramaCampus = strProgramaCampus;
	}

	public Integer getIntMatricula() {
		return intMatricula;
	}

	public void setIntMatricula(Integer intMatricula) {
		this.intMatricula = intMatricula;
	}

	public Integer getIntMatriculaTutorada() {
		return intMatriculaTutorada;
	}

	public void setIntMatriculaTutorada(Integer intMatriculaTutorada) {
		this.intMatriculaTutorada = intMatriculaTutorada;
	}

	public Integer getIntMatriculaTutor() {
		return intMatriculaTutor;
	}

	public void setIntMatriculaTutor(Integer intMatriculaTutor) {
		this.intMatriculaTutor = intMatriculaTutor;
	}
	
	
	

}
