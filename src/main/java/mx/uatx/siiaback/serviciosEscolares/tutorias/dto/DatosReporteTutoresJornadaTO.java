package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

public class DatosReporteTutoresJornadaTO {

	private Integer id;

	private String strNbArea;

	private String strDsCampus;

	private String strProgramaEducativo;

	private Integer intTotTutores;

	private Integer intTotTutoresTc;

	private Integer intTotTutoresMt;

	private Integer intTotTutoresHc;

	public DatosReporteTutoresJornadaTO() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStrNbArea() {
		return strNbArea;
	}

	public void setStrNbArea(String strNbArea) {
		this.strNbArea = strNbArea;
	}

	public String getStrDsCampus() {
		return strDsCampus;
	}

	public void setStrDsCampus(String strDsCampus) {
		this.strDsCampus = strDsCampus;
	}

	public String getStrProgramaEducativo() {
		return strProgramaEducativo;
	}

	public void setStrProgramaEducativo(String strProgramaEducativo) {
		this.strProgramaEducativo = strProgramaEducativo;
	}

	public Integer getIntTotTutores() {
		return intTotTutores;
	}

	public void setIntTotTutores(Integer intTotTutores) {
		this.intTotTutores = intTotTutores;
	}

	public Integer getIntTotTutoresTc() {
		return intTotTutoresTc;
	}

	public void setIntTotTutoresTc(Integer intTotTutoresTc) {
		this.intTotTutoresTc = intTotTutoresTc;
	}

	public Integer getIntTotTutoresMt() {
		return intTotTutoresMt;
	}

	public void setIntTotTutoresMt(Integer intTotTutoresMt) {
		this.intTotTutoresMt = intTotTutoresMt;
	}

	public Integer getIntTotTutoresHc() {
		return intTotTutoresHc;
	}

	public void setIntTotTutoresHc(Integer intTotTutoresHc) {
		this.intTotTutoresHc = intTotTutoresHc;
	}

}
