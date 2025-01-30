package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDatosReporteProgramas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4681453057874752658L;
	
	@Id
	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus;
	
	@Column(name = "PROGRAMA")
	private String strPrograma;
	
	@Column(name = "NIVEL")
	private String strNivel;
	
	@Column(name = "MODALIDAD")
	private String strModalidad;
	
	@Column(name = "FCREGISTRO")
	private Date fcRegistro;
	
	@Column(name = "FCINICIO")
	private Date fcInicio;
	
	@Column(name = "FCTERMINO")
	private Date fcTermino;
	
	@Column(name = "FCBAJA")
	private Date fcBaja;
	
	@Column(name = "VIGENTE")
	private String strVigente;
	
	@Column(name = "ESTATUS")
	private String strEstatus;
	
	@Column(name = "AREA")
	private String strArea;

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
	}

	public String getStrPrograma() {
		return strPrograma;
	}

	public void setStrPrograma(String strPrograma) {
		this.strPrograma = strPrograma;
	}

	public String getStrNivel() {
		return strNivel;
	}

	public void setStrNivel(String strNivel) {
		this.strNivel = strNivel;
	}

	public String getStrModalidad() {
		return strModalidad;
	}

	public void setStrModalidad(String strModalidad) {
		this.strModalidad = strModalidad;
	}

	public Date getFcRegistro() {
		return fcRegistro;
	}

	public void setFcRegistro(Date fcRegistro) {
		this.fcRegistro = fcRegistro;
	}

	public Date getFcInicio() {
		return fcInicio;
	}

	public void setFcInicio(Date fcInicio) {
		this.fcInicio = fcInicio;
	}

	public Date getFcTermino() {
		return fcTermino;
	}

	public void setFcTermino(Date fcTermino) {
		this.fcTermino = fcTermino;
	}

	public Date getFcBaja() {
		return fcBaja;
	}

	public void setFcBaja(Date fcBaja) {
		this.fcBaja = fcBaja;
	}

	public String getStrVigente() {
		return strVigente;
	}

	public void setStrVigente(String strVigente) {
		this.strVigente = strVigente;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public String getStrArea() {
		return strArea;
	}

	public void setStrArea(String strArea) {
		this.strArea = strArea;
	}
	
}
