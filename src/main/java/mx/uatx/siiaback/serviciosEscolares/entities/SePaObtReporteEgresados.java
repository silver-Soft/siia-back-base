package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtReporteEgresados {

	@Id
	@Column(name = "ID")
	private Integer intId;

	@Column(name = "COORDINADOR")
	private String strCoordinador;

	@Column(name = "DIRECTOR")
	private String strDirector;

	@Column(name = "PROGRAMA")
	private String strPrograma;

	@Column(name = "FACULTAD")
	private String strFacultad;

	@Column(name = "CAMPUS")
	private String strCampus;

	@Column(name = "NIVEL")
	private String strNivel;

	@Column(name = "FECHAINICIO")
	private Date fcFechaInicio;

	@Column(name = "FECHAFIN")
	private Date fcFechaFin;

	@Column(name = "PERIODO")
	private String strIdPeriodo;

	public String getStrCoordinador() {
		return strCoordinador;
	}

	public void setStrCoordinador(String strCoordinador) {
		this.strCoordinador = strCoordinador;
	}

	public String getStrDirector() {
		return strDirector;
	}

	public void setStrDirector(String strDirector) {
		this.strDirector = strDirector;
	}

	public String getStrPrograma() {
		return strPrograma;
	}

	public void setStrPrograma(String strPrograma) {
		this.strPrograma = strPrograma;
	}

	public String getStrFacultad() {
		return strFacultad;
	}

	public void setStrFacultad(String strFacultad) {
		this.strFacultad = strFacultad;
	}

	public String getStrCampus() {
		return strCampus;
	}

	public void setStrCampus(String strCampus) {
		this.strCampus = strCampus;
	}

	public String getStrNivel() {
		return strNivel;
	}

	public void setStrNivel(String strNivel) {
		this.strNivel = strNivel;
	}

	public Date getFcFechaInicio() {
		return fcFechaInicio;
	}

	public void setFcFechaInicio(Date fcFechaInicio) {
		this.fcFechaInicio = fcFechaInicio;
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public Date getFcFechaFin() {
		return fcFechaFin;
	}

	public void setFcFechaFin(Date fcFechaFin) {
		this.fcFechaFin = fcFechaFin;
	}

}