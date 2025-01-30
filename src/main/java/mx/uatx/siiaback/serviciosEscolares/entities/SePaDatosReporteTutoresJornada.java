package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosReporteTutoresJornada {
	
	@Id
	@Column(name="ID")
	private Integer id;
	
	@Column(name="NBAREA")
	private String strNbArea;
	
	@Column(name="DSCAMPUS")
	private String strDsCampus;
	
	@Column(name="PROGEDU")
	private String strProgramaEducativo;
	
	@Column(name="TUTORES")
	private Integer intTotTutores;
	
	@Column(name="TUTTC")
	private Integer intTotTutoresTc;
	
	@Column(name="TUTMT")
	private Integer intTotTutoresMt;
	
	@Column(name="TUTHC")
	private Integer intTotTutoresHc;
	
	

	public SePaDatosReporteTutoresJornada() {
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
