package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

public class ResumenMatriculaRepTutoriasTO {

	private Integer intId;

	private String strProgramaCampus;

	private Integer intMatricula;

	private Integer intMatriculaTutorada;

	private Integer intMatriculaTutor;

	public ResumenMatriculaRepTutoriasTO() {
		super();
	}

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
