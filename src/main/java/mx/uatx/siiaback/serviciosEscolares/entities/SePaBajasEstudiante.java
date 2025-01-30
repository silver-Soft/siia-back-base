package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaBajasEstudiante {
	
	@Id
	@Column(name = "IDBAJA")
	private Long idBaja;
	
	@Column(name = "DSPERIODOMES")
	private String dsPeriodo;
	
	@Column(name = "DSESTATUSBAJA")
	private String estatus;
	
	@Column(name = "DSTIPOBAJA")
	private String dsTipo;
	
	@Column(name = "FCSOLICITUD")
	private String fcSolicitada;
	
	@Column(name = "FCAUTORIZACION")
	private String fcAutorizada;
	
	@Column(name = "DSOBSERVACIONES")
	private String observaciones;

	public Long getIdBaja() {
		return idBaja;
	}

	public void setIdBaja(Long idBaja) {
		this.idBaja = idBaja;
	}

	public String getDsPeriodo() {
		return dsPeriodo;
	}

	public void setDsPeriodo(String dsPeriodo) {
		this.dsPeriodo = dsPeriodo;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getDsTipo() {
		return dsTipo;
	}

	public void setDsTipo(String dsTipo) {
		this.dsTipo = dsTipo;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getFcSolicitada() {
		return fcSolicitada;
	}

	public void setFcSolicitada(String fcSolicitada) {
		this.fcSolicitada = fcSolicitada;
	}

	public String getFcAutorizada() {
		return fcAutorizada;
	}

	public void setFcAutorizada(String fcAutorizada) {
		this.fcAutorizada = fcAutorizada;
	}

}
