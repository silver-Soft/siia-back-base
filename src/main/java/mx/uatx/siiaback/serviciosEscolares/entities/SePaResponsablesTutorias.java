package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaResponsablesTutorias {
	
	
	@Id
	@Column(name = "ID_PLANTILLAEMPLEADO")
	private Integer intId;
	
	@Column(name = "NBPERSONA")
	private String strNbPersona;
	
	@Column(name = "APPATERNO")
	private String strApPaterno;
	
	@Column(name = "APMATERNO")
	private String strApMaterno;
	
	@Column(name = "TUTORADOS")
	private Integer intNoTutorado;
	
	@Column(name = "UNO")
	private Integer intNoUna;
	
	@Column(name = "DOS")
	private Integer intNoDos;
	
	@Column(name = "TRES")
	private Integer intNoTres;
	
	@Column(name = "MASTRES")
	private Integer intMasTres;
	
	@Column(name = "TOTAL_TUTORIAS")
	private Integer intTotalTutorias;
	
	@Column(name = "SINFIRMAR")
	private Integer intSinFirmar;

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrNbPersona() {
		return strNbPersona;
	}

	public void setStrNbPersona(String strNbPersona) {
		this.strNbPersona = strNbPersona;
	}

	public String getStrApPaterno() {
		return strApPaterno;
	}

	public void setStrApPaterno(String strApPaterno) {
		this.strApPaterno = strApPaterno;
	}

	public String getStrApMaterno() {
		return strApMaterno;
	}

	public void setStrApMaterno(String strApMaterno) {
		this.strApMaterno = strApMaterno;
	}

	public Integer getIntNoTutorado() {
		return intNoTutorado;
	}

	public void setIntNoTutorado(Integer intNoTutorado) {
		this.intNoTutorado = intNoTutorado;
	}

	public Integer getIntNoUna() {
		return intNoUna;
	}

	public void setIntNoUna(Integer intNoUna) {
		this.intNoUna = intNoUna;
	}

	public Integer getIntNoDos() {
		return intNoDos;
	}

	public void setIntNoDos(Integer intNoDos) {
		this.intNoDos = intNoDos;
	}

	public Integer getIntNoTres() {
		return intNoTres;
	}

	public void setIntNoTres(Integer intNoTres) {
		this.intNoTres = intNoTres;
	}

	public Integer getIntMasTres() {
		return intMasTres;
	}

	public void setIntMasTres(Integer intMasTres) {
		this.intMasTres = intMasTres;
	}

	public Integer getIntTotalTutorias() {
		return intTotalTutorias;
	}

	public void setIntTotalTutorias(Integer intTotalTutorias) {
		this.intTotalTutorias = intTotalTutorias;
	}

	public Integer getIntSinFirmar() {
		return intSinFirmar;
	}

	public void setIntSinFirmar(Integer intSinFirmar) {
		this.intSinFirmar = intSinFirmar;
	}
	
	
	
	
}
