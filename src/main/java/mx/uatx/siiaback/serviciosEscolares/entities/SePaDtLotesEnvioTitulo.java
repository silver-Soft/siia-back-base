package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class SePaDtLotesEnvioTitulo {
	
	@Id
	@Column(name = "IDTITULO")
	private Integer intIdTitulo;
	
	@Column(name = "NUMEROTITULO")
	private Integer intNoTitulo;
	
	@Column(name = "NOMBRE")
	private String strNombre;
	
	@Column(name = "MATRICULA")
	private String strMatricula;
    
	@Column(name = "PROGRAMACAMPUS")
	private String strProgramaCampus;
	
	@Column(name = "ESTATUSPROFESIONES")
	private String strEstatusProfesiones;
    
	@Column(name = "DSESTATUSPROFESIONES")
	private String strDsEstatusProfesiones;
    
	@Column(name = "FCEXPEDICION")
    private Date fechaInicio;

	@Column(name = "FCENVIOPROFESIONES")
    private Date fechaEnvioProfesiones;
	
	

	public Integer getIntIdTitulo() {
		return intIdTitulo;
	}

	public void setIntIdTitulo(Integer intIdTitulo) {
		this.intIdTitulo = intIdTitulo;
	}

	public Integer getIntNoTitulo() {
		return intNoTitulo;
	}

	public void setIntNoTitulo(Integer intNoTitulo) {
		this.intNoTitulo = intNoTitulo;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
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

	public String getStrEstatusProfesiones() {
		return strEstatusProfesiones;
	}

	public void setStrEstatusProfesiones(String strEstatusProfesiones) {
		this.strEstatusProfesiones = strEstatusProfesiones;
	}

	public String getStrDsEstatusProfesiones() {
		return strDsEstatusProfesiones;
	}

	public void setStrDsEstatusProfesiones(String strDsEstatusProfesiones) {
		this.strDsEstatusProfesiones = strDsEstatusProfesiones;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaEnvioProfesiones() {
		return fechaEnvioProfesiones;
	}

	public void setFechaEnvioProfesiones(Date fechaEnvioProfesiones) {
		this.fechaEnvioProfesiones = fechaEnvioProfesiones;
	}

	
}
