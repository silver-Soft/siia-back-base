package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosResultadosExamenAdmision {
	
	@Id
	@Column(name = "IDSOLICITUDINGRESO")
	private Long idSolicitudIngreso;
	
	@Column(name = "DSAREACONOCIMIENTO")
	private String dsAreaConocimiento;

	@Column(name = "PUNTUACION")
	private Long puntuacion;

	@Column(name = "PUNTUACIONMAXIMA")
	private Long puntiacionMaxima;

	@Column(name = "PORCENTAJE")
	private Integer porcentaje;

	public Long getIdSolicitudIngreso() {
		return idSolicitudIngreso;
	}

	public void setIdSolicitudIngreso(Long idSolicitudIngreso) {
		this.idSolicitudIngreso = idSolicitudIngreso;
	}

	public String getDsAreaConocimiento() {
		return dsAreaConocimiento;
	}

	public void setDsAreaConocimiento(String dsAreaConocimiento) {
		this.dsAreaConocimiento = dsAreaConocimiento;
	}

	public Long getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(Long puntuacion) {
		this.puntuacion = puntuacion;
	}

	public Long getPuntiacionMaxima() {
		return puntiacionMaxima;
	}

	public void setPuntiacionMaxima(Long puntiacionMaxima) {
		this.puntiacionMaxima = puntiacionMaxima;
	}

	public Integer getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(Integer porcentaje) {
		this.porcentaje = porcentaje;
	}


}
