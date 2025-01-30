package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtDatosReporteTickets implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1312641595367914461L;
	@Id
	@Column(name = "IDPETICION")
	private Long lngIdPeticion;
	
	@Column(name = "DSPETICION")
	private String strDsPeticion;
	
	@Column(name = "DSSERVICIO")
	private String strDsServicio;
	
	@Column(name = "OBSERVACIONES")
	private String strObservaciones;
	
	@Column(name = "DSTIPOSERVICIO")
	private String strDsTipoServicio;
	
	@Column(name = "SOLICITANTE")
	private String strSolicitante;
	
	@Column(name = "REALIZA")
	private String strRealiza;
	
	@Column(name = "FCPETICION")
	private String strFcPeticion;
	
	@Column(name = "FCLIBERACION")
	private String strFcLiberacion;
	
	@Column(name = "DSEVALUACIONSERVICIO")
	private String strDsEvaluacionServicio;
	
	@Column(name = "DSGRADOSATISFACCION")
	private String strDsGradoSatisfaccion;
	
	@Column(name = "ESCORRESPONDENCIA")
	private Integer intEsCorrespondencia;

	public Long getLngIdPeticion() {
		return lngIdPeticion;
	}

	public void setLngIdPeticion(Long lngIdPeticion) {
		this.lngIdPeticion = lngIdPeticion;
	}

	public String getStrDsPeticion() {
		return strDsPeticion;
	}

	public void setStrDsPeticion(String strDsPeticion) {
		this.strDsPeticion = strDsPeticion;
	}

	public String getStrDsServicio() {
		return strDsServicio;
	}

	public void setStrDsServicio(String strDsServicio) {
		this.strDsServicio = strDsServicio;
	}

	public String getStrObservaciones() {
		return strObservaciones;
	}

	public void setStrObservaciones(String strObservaciones) {
		this.strObservaciones = strObservaciones;
	}

	public String getStrDsTipoServicio() {
		return strDsTipoServicio;
	}

	public void setStrDsTipoServicio(String strDsTipoServicio) {
		this.strDsTipoServicio = strDsTipoServicio;
	}

	public String getStrSolicitante() {
		return strSolicitante;
	}

	public void setStrSolicitante(String strSolicitante) {
		this.strSolicitante = strSolicitante;
	}

	public String getStrRealiza() {
		return strRealiza;
	}

	public void setStrRealiza(String strRealiza) {
		this.strRealiza = strRealiza;
	}

	public String getStrFcPeticion() {
		return strFcPeticion;
	}

	public void setStrFcPeticion(String strFcPeticion) {
		this.strFcPeticion = strFcPeticion;
	}

	public String getStrFcLiberacion() {
		return strFcLiberacion;
	}

	public void setStrFcLiberacion(String strFcLiberacion) {
		this.strFcLiberacion = strFcLiberacion;
	}

	public String getStrDsEvaluacionServicio() {
		return strDsEvaluacionServicio;
	}

	public void setStrDsEvaluacionServicio(String strDsEvaluacionServicio) {
		this.strDsEvaluacionServicio = strDsEvaluacionServicio;
	}

	public String getStrDsGradoSatisfaccion() {
		return strDsGradoSatisfaccion;
	}

	public void setStrDsGradoSatisfaccion(String strDsGradoSatisfaccion) {
		this.strDsGradoSatisfaccion = strDsGradoSatisfaccion;
	}

	public Integer getIntEsCorrespondencia() {
		return intEsCorrespondencia;
	}

	public void setIntEsCorrespondencia(Integer intEsCorrespondencia) {
		this.intEsCorrespondencia = intEsCorrespondencia;
	}
	
	
}
