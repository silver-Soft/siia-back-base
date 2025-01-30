package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.util.ArrayList;
import java.util.List;

public class DatosOficioAsignacionDTO {

	private List<TutoradoTO> lstTutorados = new ArrayList<TutoradoTO>();

	private String strNbProgramaCampus;

	private String strDsPeriodoTemporada;

	private String strNbResponsableTutores;

	private String strRutaServidorImagenes;

	private String strNbTutor;

	private Integer intNoTutorados;

	private String strPeriodo;

	private String strFechaConstancia;

	public DatosOficioAsignacionDTO() {

	}

	public List<TutoradoTO> getLstTutorados() {
		return lstTutorados;
	}

	public void setLstTutorados(List<TutoradoTO> lstTutorados) {
		this.lstTutorados = lstTutorados;
	}

	public String getStrNbProgramaCampus() {
		return strNbProgramaCampus;
	}

	public void setStrNbProgramaCampus(String strNbProgramaCampus) {
		this.strNbProgramaCampus = strNbProgramaCampus;
	}

	public String getStrDsPeriodoTemporada() {
		return strDsPeriodoTemporada;
	}

	public void setStrDsPeriodoTemporada(String strDsPeriodoTemporada) {
		this.strDsPeriodoTemporada = strDsPeriodoTemporada;
	}

	public String getStrNbResponsableTutores() {
		return strNbResponsableTutores;
	}

	public void setStrNbResponsableTutores(String strNbResponsableTutores) {
		this.strNbResponsableTutores = strNbResponsableTutores;
	}

	public String getStrRutaServidorImagenes() {
		return strRutaServidorImagenes;
	}

	public void setStrRutaServidorImagenes(String strRutaServidorImagenes) {
		this.strRutaServidorImagenes = strRutaServidorImagenes;
	}

	public String getStrNbTutor() {
		return strNbTutor;
	}

	public void setStrNbTutor(String strNbTutor) {
		this.strNbTutor = strNbTutor;
	}

	public Integer getIntNoTutorados() {
		return intNoTutorados;
	}

	public void setIntNoTutorados(Integer intNoTutorados) {
		this.intNoTutorados = intNoTutorados;
	}

	public String getStrPeriodo() {
		return strPeriodo;
	}

	public void setStrPeriodo(String strPeriodo) {
		this.strPeriodo = strPeriodo;
	}

	public String getStrFechaConstancia() {
		return strFechaConstancia;
	}

	public void setStrFechaConstancia(String strFechaConstancia) {
		this.strFechaConstancia = strFechaConstancia;
	}

}
