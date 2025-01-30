package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaReporteTutoresTutorias {
	
	@Id
	@Column(name="ID")
	private Integer intId;
	
	@Column(name="NBAREA")
	private String strNbArea;
	
	@Column(name="DSCAMPUS")
	private String strCampus;
	
	@Column(name="PROGEDU")
	private String strProgramaEducativo;
	
	@Column(name="NOMBRE")
	private String strNbTutor;
	
	@Column(name="CATEGORIA")
	private String strCategoria;
	
	@Column(name="JORNADA")
	private String strJornada;

	public SePaReporteTutoresTutorias() {
		super();
	
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrNbArea() {
		return strNbArea;
	}

	public void setStrNbArea(String strNbArea) {
		this.strNbArea = strNbArea;
	}

	public String getStrCampus() {
		return strCampus;
	}

	public void setStrCampus(String strCampus) {
		this.strCampus = strCampus;
	}

	public String getStrProgramaEducativo() {
		return strProgramaEducativo;
	}

	public void setStrProgramaEducativo(String strProgramaEducativo) {
		this.strProgramaEducativo = strProgramaEducativo;
	}

	public String getStrNbTutor() {
		return strNbTutor;
	}

	public void setStrNbTutor(String strNbTutor) {
		this.strNbTutor = strNbTutor;
	}

	public String getStrCategoria() {
		return strCategoria;
	}

	public void setStrCategoria(String strCategoria) {
		this.strCategoria = strCategoria;
	}

	public String getStrJornada() {
		return strJornada;
	}

	public void setStrJornada(String strJornada) {
		this.strJornada = strJornada;
	}

	
	
	
	

}
