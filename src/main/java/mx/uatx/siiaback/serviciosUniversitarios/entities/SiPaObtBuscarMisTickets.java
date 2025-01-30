package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtBuscarMisTickets {
	
	@Id
	@Column(name = "IDPETICION")
	private Integer intIdPeticion;
	
	@Column(name = "NMTICKET")
	private String strNmTicket;
	
	@Column(name = "DSPETICION")
	private String strDescripcion;
	
	@Column(name = "SERVICIO")
	private String strServicio;
	
	@Column(name = "OBSERVACIONES")
	private String strObservaciones;
	
	@Column(name = "SOLICITANTE")
	private String strSolicitante;
	
	@Column(name = "FCPETICION")
	private Date fcPeticion;
	
	@Column(name = "FCLIBERACION")
	private Date fcLiberacion;
	
	@Column(name = "DSEVALUACIONSERVICIO")
	private String strDsEvaluacionServicio;
	
	@Column(name = "DSGRADOSATISFACCION")
	private String strDsGradoSatisfaccion;

	public Integer getIntIdPeticion() {
		return intIdPeticion;
	}

	public void setIntIdPeticion(Integer intIdPeticion) {
		this.intIdPeticion = intIdPeticion;
	}

	public String getStrNmTicket() {
		return strNmTicket;
	}

	public void setStrNmTicket(String strNmTicket) {
		this.strNmTicket = strNmTicket;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}

	public String getStrServicio() {
		return strServicio;
	}

	public void setStrServicio(String strServicio) {
		this.strServicio = strServicio;
	}

	public String getStrObservaciones() {
		return strObservaciones;
	}

	public void setStrObservaciones(String strObservaciones) {
		this.strObservaciones = strObservaciones;
	}

	public String getStrSolicitante() {
		return strSolicitante;
	}

	public void setStrSolicitante(String strSolicitante) {
		this.strSolicitante = strSolicitante;
	}

	public Date getFcPeticion() {
		return fcPeticion;
	}

	public void setFcPeticion(Date fcPeticion) {
		this.fcPeticion = fcPeticion;
	}

	public Date getFcLiberacion() {
		return fcLiberacion;
	}

	public void setFcLiberacion(Date fcLiberacion) {
		this.fcLiberacion = fcLiberacion;
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
	
	
}
