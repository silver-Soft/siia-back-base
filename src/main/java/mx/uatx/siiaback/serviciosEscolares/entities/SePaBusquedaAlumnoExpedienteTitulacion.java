package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class SePaBusquedaAlumnoExpedienteTitulacion {
	
	@Id
	@Column(name="IDHISTORIALACADEMICO")
	private Integer idHistorialAcademico;
	
	@Column(name="MATRICULA")
	private String strMatricula;
	
	@Column(name="NBPERSONA")
	private String strNombre;
	
	
	@Column(name="APPATERNO")
	private String strApPaterno;
	
	
	@Column(name="APMATERNO")
	private String strApMaterno;
	
	
	@Column(name="PROGRAMACAMPUS")
	private String strProgramaCampus;
	
	

	public Integer getIdHistorialAcademico() {
		return idHistorialAcademico;
	}

	public void setIdHistorialAcademico(Integer idHistorialAcademico) {
		this.idHistorialAcademico = idHistorialAcademico;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
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

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrProgramaCampus() {
		return strProgramaCampus;
	}

	public void setStrProgramaCampus(String strProgramaCampus) {
		this.strProgramaCampus = strProgramaCampus;
	}
	
	

}
