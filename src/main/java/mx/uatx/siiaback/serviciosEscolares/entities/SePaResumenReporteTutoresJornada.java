package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaResumenReporteTutoresJornada {

	@Id
	@Column(name="ID")
	private Integer intId;
	
	@Column(name="NBAREA")
	private String strNbArea;
	
	@Column(name="TUTORES")
	private Integer noTutores;
	
	@Column(name="TUTMT")
	private Integer noTutoresMt;
	
	@Column(name="TUTHC")
	private Integer noTutoresHc;
	
	@Column(name="TUTTC")
	private Integer noTutoresTc;
	
	
	
	public SePaResumenReporteTutoresJornada() {
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

	public Integer getNoTutores() {
		return noTutores;
	}

	public void setNoTutores(Integer noTutores) {
		this.noTutores = noTutores;
	}

	public Integer getNoTutoresMt() {
		return noTutoresMt;
	}

	public void setNoTutoresMt(Integer noTutoresMt) {
		this.noTutoresMt = noTutoresMt;
	}

	public Integer getNoTutoresHc() {
		return noTutoresHc;
	}

	public void setNoTutoresHc(Integer noTutoresHc) {
		this.noTutoresHc = noTutoresHc;
	}



	public Integer getNoTutoresTc() {
		return noTutoresTc;
	}



	public void setNoTutoresTc(Integer noTutoresTc) {
		this.noTutoresTc = noTutoresTc;
	}
	
	
	
}
