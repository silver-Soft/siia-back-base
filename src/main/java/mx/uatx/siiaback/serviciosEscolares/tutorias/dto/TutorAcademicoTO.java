package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import javax.persistence.Column;

public class TutorAcademicoTO {

	public TutorAcademicoTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Integer intIdPlantillaEmpleado;
	private String strNbTutor;
	private Integer intIdHistorialLaboral;
	private Integer intIdProgramaCampus;
	private String strNbPrograma;
	private String strClPeriodo;
	private Integer intTieneTutorados;
	private Integer intTieneOficio;
	private Integer intTieneEvaluacion;
	private String strPeriodoTutorias;
	private Boolean blnSeleccionado;
	
	private Integer intIdPersona;
	
	private String strEstadocivil;

	public Integer getIntIdPlantillaEmpleado() {
		return intIdPlantillaEmpleado;
	}

	public void setIntIdPlantillaEmpleado(Integer intIdPlantillaEmpleado) {
		this.intIdPlantillaEmpleado = intIdPlantillaEmpleado;
	}

	public String getStrNbTutor() {
		return strNbTutor;
	}

	public void setStrNbTutor(String strNbTutor) {
		this.strNbTutor = strNbTutor;
	}

	public Integer getIntIdHistorialLaboral() {
		return intIdHistorialLaboral;
	}

	public void setIntIdHistorialLaboral(Integer intIdHistorialLaboral) {
		this.intIdHistorialLaboral = intIdHistorialLaboral;
	}

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
	}

	public String getStrNbPrograma() {
		return strNbPrograma;
	}

	public void setStrNbPrograma(String strNbPrograma) {
		this.strNbPrograma = strNbPrograma;
	}

	public String getStrClPeriodo() {
		return strClPeriodo;
	}

	public void setStrClPeriodo(String strClPeriodo) {
		this.strClPeriodo = strClPeriodo;
	}

	public Integer getIntTieneTutorados() {
		return intTieneTutorados;
	}

	public void setIntTieneTutorados(Integer intTieneTutorados) {
		this.intTieneTutorados = intTieneTutorados;
	}

	public Integer getIntTieneOficio() {
		return intTieneOficio;
	}

	public void setIntTieneOficio(Integer intTieneOficio) {
		this.intTieneOficio = intTieneOficio;
	}

	public Integer getIntTieneEvaluacion() {
		return intTieneEvaluacion;
	}

	public void setIntTieneEvaluacion(Integer intTieneEvaluacion) {
		this.intTieneEvaluacion = intTieneEvaluacion;
	}

	public String getStrPeriodoTutorias() {
		return strPeriodoTutorias;
	}

	public void setStrPeriodoTutorias(String strPeriodoTutorias) {
		this.strPeriodoTutorias = strPeriodoTutorias;
	}

	public Boolean getBlnSeleccionado() {
		return blnSeleccionado;
	}

	public void setBlnSeleccionado(Boolean blnSeleccionado) {
		this.blnSeleccionado = blnSeleccionado;
	}

	public Integer getIntIdPersona() {
		return intIdPersona;
	}

	public void setIntIdPersona(Integer intIdPersona) {
		this.intIdPersona = intIdPersona;
	}

	public String getStrEstadocivil() {
		return strEstadocivil;
	}

	public void setStrEstadocivil(String strEstadocivil) {
		this.strEstadocivil = strEstadocivil;
	}
	
	

	

}
