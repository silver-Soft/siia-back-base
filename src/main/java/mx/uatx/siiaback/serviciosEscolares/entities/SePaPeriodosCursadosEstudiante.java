package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaPeriodosCursadosEstudiante {
	
	@Id
	@Column(name = "IDALUMNOPERIODO")
	private Long idAlumnoPeriodo;
	
	@Column(name = "DSPERIODOMES")
	private String dsPeriodo;
	
	@Column(name = "NBPERIODOCURSADO")
	private String grado;
	
	@Column(name = "FCSOLICITUD")
	private Date fcReinscripcion;

	public Long getIdAlumnoPeriodo() {
		return idAlumnoPeriodo;
	}

	public void setIdAlumnoPeriodo(Long idAlumnoPeriodo) {
		this.idAlumnoPeriodo = idAlumnoPeriodo;
	}

	public String getDsPeriodo() {
		return dsPeriodo;
	}

	public void setDsPeriodo(String dsPeriodo) {
		this.dsPeriodo = dsPeriodo;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public Date getFcReinscripcion() {
		return fcReinscripcion;
	}

	public void setFcReinscripcion(Date fcReinscripcion) {
		this.fcReinscripcion = fcReinscripcion;
	}

}
