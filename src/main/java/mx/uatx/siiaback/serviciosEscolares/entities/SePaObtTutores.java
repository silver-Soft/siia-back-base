package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtTutores {

	public SePaObtTutores() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "IDPLANTILLAEMPLEADO")
	private Integer intIdPlantillaEmpleado;

	@Column(name = "NBTUTOR")
	private String strNbTutor;

	@Column(name = "IDHISTORIALLABORAL")
	private Integer intIdHistorialLaboral;

	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus;

	@Column(name = "NBPROGRAMACAMPUS")
	private String strNbPrograma;

	@Column(name = "IDPERIODO")
	private String strClPeriodo;

	@Column(name = "TIENETUTORADOS")
	private Integer intTieneTutorados;

	@Column(name = "TIENEOFICIO")
	private Integer intTieneOficio;

	@Column(name = "TIENEEVALUACION")
	private Integer intTieneEvaluacion;

	@Column(name = "IDPERSONA")
	private Integer intIdPersona;
	
	@Column(name = "DSESTADOCIVIL")
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
