package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDatosReporteIndividual {

	@Id
	@Column(name = "ID")
	private Integer intId;

	@Column(name = "DSCUESTIONARIO")
	private String strDsCuestionario;

	@Column(name = "DSPERIODO")
	private String strDsPeriodo;

	@Column(name = "NBPERSONA")
	private String strNbPersona;

	@Column(name = "NMPREGUNTAS")
	private Integer intNmPreguntas;

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrDsCuestionario() {
		return strDsCuestionario;
	}

	public void setStrDsCuestionario(String strDsCuestionario) {
		this.strDsCuestionario = strDsCuestionario;
	}

	public String getStrDsPeriodo() {
		return strDsPeriodo;
	}

	public void setStrDsPeriodo(String strDsPeriodo) {
		this.strDsPeriodo = strDsPeriodo;
	}

	public String getStrNbPersona() {
		return strNbPersona;
	}

	public void setStrNbPersona(String strNbPersona) {
		this.strNbPersona = strNbPersona;
	}

	public Integer getIntNmPreguntas() {
		return intNmPreguntas;
	}

	public void setIntNmPreguntas(Integer intNmPreguntas) {
		this.intNmPreguntas = intNmPreguntas;
	}

}
