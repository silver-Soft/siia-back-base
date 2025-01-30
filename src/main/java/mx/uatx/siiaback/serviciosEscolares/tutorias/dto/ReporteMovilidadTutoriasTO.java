package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

public class ReporteMovilidadTutoriasTO extends ReporteResponsablesTutoriasTO {

	private Integer intId;

	private String strMatricula;

	private String strNbAlumno;

	private String strDsGentilicio;

	public ReporteMovilidadTutoriasTO() {
		super();
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrNbAlumno() {
		return strNbAlumno;
	}

	public void setStrNbAlumno(String strNbAlumno) {
		this.strNbAlumno = strNbAlumno;
	}

	public String getStrDsGentilicio() {
		return strDsGentilicio;
	}

	public void setStrDsGentilicio(String strDsGentilicio) {
		this.strDsGentilicio = strDsGentilicio;
	}

}
