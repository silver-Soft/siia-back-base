package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDatosReporteGeneral {

	@Id
	@Column(name = "ID")
	private Integer intId;

	@Column(name = "CONTESTARON")
	private Integer intContestaron;

	@Column(name = "NCONTESTARON")
	private Integer intNContestaron;

	@Column(name = "DSPERIODO")
	private String strDsPeriodo;

	@Column(name = "DSPROGRAMA")
	private String strDsPrograma;

	@Column(name = "DSAREA")
	private String strDsArea;

	@Column(name = "DSCUESTIONARIO")
	private String strDsCuestionario;

	@Column(name = "NMPREGUNTAS")
	private Integer intNmPreguntas;

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public Integer getIntContestaron() {
		return intContestaron;
	}

	public void setIntContestaron(Integer intContestaron) {
		this.intContestaron = intContestaron;
	}

	public Integer getIntNContestaron() {
		return intNContestaron;
	}

	public void setIntNContestaron(Integer intNContestaron) {
		this.intNContestaron = intNContestaron;
	}

	public String getStrDsPeriodo() {
		return strDsPeriodo;
	}

	public void setStrDsPeriodo(String strDsPeriodo) {
		this.strDsPeriodo = strDsPeriodo;
	}

	public String getStrDsPrograma() {
		return strDsPrograma;
	}

	public void setStrDsPrograma(String strDsPrograma) {
		this.strDsPrograma = strDsPrograma;
	}

	public String getStrDsArea() {
		return strDsArea;
	}

	public void setStrDsArea(String strDsArea) {
		this.strDsArea = strDsArea;
	}

	public String getStrDsCuestionario() {
		return strDsCuestionario;
	}

	public void setStrDsCuestionario(String strDsCuestionario) {
		this.strDsCuestionario = strDsCuestionario;
	}

	public Integer getIntNmPreguntas() {
		return intNmPreguntas;
	}

	public void setIntNmPreguntas(Integer intNmPreguntas) {
		this.intNmPreguntas = intNmPreguntas;
	}

}