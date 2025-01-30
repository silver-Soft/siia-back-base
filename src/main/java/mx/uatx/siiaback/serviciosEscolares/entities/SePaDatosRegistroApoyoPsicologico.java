package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosRegistroApoyoPsicologico {

	@Id
	@Column(name = "IDHISTORIALACADEMICO")
	private Integer intIdHistorialAcademico;

	@Column(name = "NBPERSONA")
	private String strNombre;
	
	@Column(name = "APPATERNO")
	private String strApPaterno;
	
	@Column(name = "APMATERNO")
	private String strApMaterno;

	@Column(name = "FCNACIMIENTO")
	private Date dteFcNacimiento;

	@Column(name = "LUGARNACIMIENTO")
	private String strLugarNacimiento;

	@Column(name = "DSESTADOCIVIL")
	private String strEstadoCivil;

	@Column(name = "NBCALLE")
	private String strCalle;

	@Column(name = "NBASENTAMIENTO")
	private String strColonia;

	@Column(name = "CODIGOPOSTAL")
	private String strCodigoPostal;

	@Column(name = "TELEFONO")
	private String strTelefono;
	
	

	@Column(name = "ESTADORESIDENCIA")
	private String strEstadoResidencia;

	@Column(name = "MUNICIPIORESIDENCIA")
	private String strMunicipioResidencia;

	@Column(name = "PAISRESIDENCIA")
	private String strPais;

	@Column(name = "DSCORREO")
	private String strCorreoElectronico;

	@Column(name = "SERVICIOMEDICO")
	private String strServicioMedico;

	@Column(name = "NOMBREPADRE")
	private String strNombreTutor;
	
	@Column(name = "PATERNOPADRE")
	private String strApPaternoTutor;

	@Column(name = "MATERNOPADRE")
	private String strApMaternoTutor;
	
	
	
	@Column(name = "NOMBREMADRE")
	private String strNombreTutora;
	
	@Column(name = "PATERNOMADRE")
	private String strApPaternoTutora;

	@Column(name = "MATERNOMADRE")
	private String strApMaternoTutora;
	
	@Column(name = "TELEFONOCELULAR")
	private String strTelefonoCelular;
	
	@Column(name = "PROGRAMAEDUCATIVO")
	private String strProgramaEducativo;

	@Column(name = "MATRICULA")
	private String strMatricula;
	
	@Column(name = "SEMESTRE")
	private String strSemestre;
	
	@Column(name = "ESREGULAR")
	private String strEsRegular;
	
	@Column(name = "MATERIASACUMULADAS")
	private String strMateriasAcumuladas;
	
	@Column(name = "RESPONSABLETUTORIAS")
	private String strResponsableTutorias;
	
	@Column(name = "FECHACANALIZO")
	private Date fcaudit;
	
	
	public SePaDatosRegistroApoyoPsicologico() {
		super();
	}

	
	
	public Integer getIntIdHistorialAcademico() {
		return intIdHistorialAcademico;
	}

	public void setIntIdHistorialAcademico(Integer intIdHistorialAcademico) {
		this.intIdHistorialAcademico = intIdHistorialAcademico;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public Date getDteFcNacimiento() {
		return dteFcNacimiento;
	}

	public void setDteFcNacimiento(Date dteFcNacimiento) {
		this.dteFcNacimiento = dteFcNacimiento;
	}

	public String getStrLugarNacimiento() {
		return strLugarNacimiento;
	}

	public void setStrLugarNacimiento(String strLugarNacimiento) {
		this.strLugarNacimiento = strLugarNacimiento;
	}

	public String getStrEstadoCivil() {
		return strEstadoCivil;
	}

	public void setStrEstadoCivil(String strEstadoCivil) {
		this.strEstadoCivil = strEstadoCivil;
	}

	public String getStrCalle() {
		return strCalle;
	}

	public void setStrCalle(String strCalle) {
		this.strCalle = strCalle;
	}

	public String getStrColonia() {
		return strColonia;
	}

	public void setStrColonia(String strColonia) {
		this.strColonia = strColonia;
	}

	public String getStrCodigoPostal() {
		return strCodigoPostal;
	}

	public void setStrCodigoPostal(String strCodigoPostal) {
		this.strCodigoPostal = strCodigoPostal;
	}

	public String getStrTelefono() {
		return strTelefono;
	}

	public void setStrTelefono(String strTelefono) {
		this.strTelefono = strTelefono;
	}

	public String getStrEstadoResidencia() {
		return strEstadoResidencia;
	}

	public void setStrEstadoResidencia(String strEstadoResidencia) {
		this.strEstadoResidencia = strEstadoResidencia;
	}

	public String getStrMunicipioResidencia() {
		return strMunicipioResidencia;
	}

	public void setStrMunicipioResidencia(String strMunicipioResidencia) {
		this.strMunicipioResidencia = strMunicipioResidencia;
	}

	public String getStrPais() {
		return strPais;
	}

	public void setStrPais(String strPais) {
		this.strPais = strPais;
	}

	public String getStrCorreoElectronico() {
		return strCorreoElectronico;
	}

	public void setStrCorreoElectronico(String strCorreoElectronico) {
		this.strCorreoElectronico = strCorreoElectronico;
	}

	public String getStrServicioMedico() {
		return strServicioMedico;
	}

	public void setStrServicioMedico(String strServicioMedico) {
		this.strServicioMedico = strServicioMedico;
	}

	public String getStrNombreTutor() {
		return strNombreTutor;
	}

	public void setStrNombreTutor(String strNombreTutor) {
		this.strNombreTutor = strNombreTutor;
	}



	public String getStrApPaternoTutor() {
		return strApPaternoTutor;
	}



	public void setStrApPaternoTutor(String strApPaternoTutor) {
		this.strApPaternoTutor = strApPaternoTutor;
	}



	public String getStrApMaternoTutor() {
		return strApMaternoTutor;
	}



	public void setStrApMaternoTutor(String strApMaternoTutor) {
		this.strApMaternoTutor = strApMaternoTutor;
	}



	public String getStrNombreTutora() {
		return strNombreTutora;
	}



	public void setStrNombreTutora(String strNombreTutora) {
		this.strNombreTutora = strNombreTutora;
	}



	public String getStrApPaternoTutora() {
		return strApPaternoTutora;
	}



	public void setStrApPaternoTutora(String strApPaternoTutora) {
		this.strApPaternoTutora = strApPaternoTutora;
	}



	public String getStrApMaternoTutora() {
		return strApMaternoTutora;
	}



	public void setStrApMaternoTutora(String strApMaternoTutora) {
		this.strApMaternoTutora = strApMaternoTutora;
	}



	public String getStrTelefonoCelular() {
		return strTelefonoCelular;
	}



	public void setStrTelefonoCelular(String strTelefonoCelular) {
		this.strTelefonoCelular = strTelefonoCelular;
	}



	public String getStrProgramaEducativo() {
		return strProgramaEducativo;
	}



	public void setStrProgramaEducativo(String strProgramaEducativo) {
		this.strProgramaEducativo = strProgramaEducativo;
	}



	public String getStrMatricula() {
		return strMatricula;
	}



	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}



	public String getStrSemestre() {
		return strSemestre;
	}



	public void setStrSemestre(String strSemestre) {
		this.strSemestre = strSemestre;
	}



	public String getStrEsRegular() {
		return strEsRegular;
	}



	public void setStrEsRegular(String strEsRegular) {
		this.strEsRegular = strEsRegular;
	}



	public String getStrMateriasAcumuladas() {
		return strMateriasAcumuladas;
	}



	public void setStrMateriasAcumuladas(String strMateriasAcumuladas) {
		this.strMateriasAcumuladas = strMateriasAcumuladas;
	}



	public String getStrResponsableTutorias() {
		return strResponsableTutorias;
	}



	public void setStrResponsableTutorias(String strResponsableTutorias) {
		this.strResponsableTutorias = strResponsableTutorias;
	}



	public Date getFcaudit() {
		return fcaudit;
	}



	public void setFcaudit(Date fcaudit) {
		this.fcaudit = fcaudit;
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
	
	
	
	
	
	

}
