package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaEncEvaluacionTutorado implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4190475886745547150L;
	
	
	
	@Column(name = "DSCUESTIONARIO")
	private String strCuestionario;
	
	@Column(name = "NBTUTOR")
	private String strNombreTutor;
	
	@Column(name = "CONTESTADOS")
	private Integer intContestados;
	
	@Column(name = "NOCONTESTADOS")
	private Integer intNoContestados;
	
	@Column(name = "NMPREGUNTAS")
	private Integer intNoPreguntas;
	
	@Column(name = "PROGRAMACAMPUS")
	private String strProgramaCampus;
	
	@Id
	@Column(name = "DSPERIODO")
	private String strDsPeriodo;
	
	
	public SePaEncEvaluacionTutorado(){
		super();
	}



	public String getStrCuestionario() {
		return strCuestionario;
	}


	public void setStrCuestionario(String strCuestionario) {
		this.strCuestionario = strCuestionario;
	}


	public String getStrNombreTutor() {
		return strNombreTutor;
	}


	public void setStrNombreTutor(String strNombreTutor) {
		this.strNombreTutor = strNombreTutor;
	}


	public Integer getIntContestados() {
		return intContestados;
	}


	public void setIntContestados(Integer intContestados) {
		this.intContestados = intContestados;
	}


	public Integer getIntNoContestados() {
		return intNoContestados;
	}


	public void setIntNoContestados(Integer intNoContestados) {
		this.intNoContestados = intNoContestados;
	}


	public Integer getIntNoPreguntas() {
		return intNoPreguntas;
	}


	public void setIntNoPreguntas(Integer intNoPreguntas) {
		this.intNoPreguntas = intNoPreguntas;
	}


	public String getStrProgramaCampus() {
		return strProgramaCampus;
	}


	public void setStrProgramaCampus(String strProgramaCampus) {
		this.strProgramaCampus = strProgramaCampus;
	}


	public String getStrDsPeriodo() {
		return strDsPeriodo;
	}


	public void setStrDsPeriodo(String strDsPeriodo) {
		this.strDsPeriodo = strDsPeriodo;
	}
	
	
	
	
	
}
